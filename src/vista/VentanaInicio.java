package vista;

import javax.swing.JFrame;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;

public class VentanaInicio {

	private JFrame frame;
	private JPanelBackground panelCentro;
	private JButton btnComenzar;
	private JLabel lblNombre;
	private JTextField textFieldNombre;
	private JLabel lblNivel;
	private JComboBox<String> comboBoxNivel;
	private String user;
	private boolean vuelta = false;
	private static Font go3;
	
	public VentanaInicio(String u, boolean b) {
		user = u;
		vuelta = b;
		initialize();
	}
	
	
	private void initialize() {
		go3 = AddFont.createFont();
		frame = new JFrame();
		frame.setBounds(100, 100, 834, 506);
		frame.setTitle("SUDOKU ROYALE MASTER");
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getPanelCentro());
		frame.setLocationRelativeTo(null);
		this.frame.setVisible(true);
	}
	
	public static Font getFuente() {
		return go3;
	}
	
	private JPanelBackground getPanelCentro() {
		if (panelCentro == null) {
			panelCentro = new JPanelBackground();
			panelCentro.setBounds(0, 0, 828, 477);
			panelCentro.setBackground("inicio BJ.jpg");
			GridBagLayout gbl_panelCentro = new GridBagLayout();
			gbl_panelCentro.columnWidths = new int[]{284, 72, 91, 63, 0, 0};
			gbl_panelCentro.rowHeights = new int[]{212, 0, 0, 19, 68, 0};
			gbl_panelCentro.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
			gbl_panelCentro.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			panelCentro.setLayout(gbl_panelCentro);
			GridBagConstraints gbc_lblNombre = new GridBagConstraints();
			gbc_lblNombre.anchor = GridBagConstraints.EAST;
			gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
			gbc_lblNombre.gridx = 1;
			gbc_lblNombre.gridy = 1;
			panelCentro.add(getLblNombre(), gbc_lblNombre);
			GridBagConstraints gbc_textFieldNombre = new GridBagConstraints();
			gbc_textFieldNombre.gridwidth = 2;
			gbc_textFieldNombre.insets = new Insets(0, 0, 5, 5);
			gbc_textFieldNombre.fill = GridBagConstraints.HORIZONTAL;
			gbc_textFieldNombre.gridx = 2;
			gbc_textFieldNombre.gridy = 1;
			panelCentro.add(getTextFieldNombre(), gbc_textFieldNombre);
			GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
			gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
			gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
			gbc_lblNewLabel_1.gridx = 1;
			gbc_lblNewLabel_1.gridy = 2;
			panelCentro.add(getLblNivel(), gbc_lblNewLabel_1);
			GridBagConstraints gbc_comboBoxNivel = new GridBagConstraints();
			gbc_comboBoxNivel.insets = new Insets(0, 0, 5, 5);
			gbc_comboBoxNivel.fill = GridBagConstraints.HORIZONTAL;
			gbc_comboBoxNivel.gridx = 2;
			gbc_comboBoxNivel.gridy = 2;
			panelCentro.add(getComboBoxNivel(), gbc_comboBoxNivel);
			GridBagConstraints gbc_btnComenzar = new GridBagConstraints();
			gbc_btnComenzar.insets = new Insets(0, 0, 0, 5);
			gbc_btnComenzar.gridx = 2;
			gbc_btnComenzar.gridy = 4;
			panelCentro.add(getBtnComenzar(), gbc_btnComenzar);
		}
		return panelCentro;
	}
	private JButton getBtnComenzar() {
		if (btnComenzar == null) {
			btnComenzar = new JButton("Comenzar");
			btnComenzar.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					try {
						if (!textFieldNombre.getText().equals("")) {
							db.DataUsuarios.getData().comprobarUsuario(textFieldNombre.getText());
							int nivel = comboBoxNivel.getSelectedIndex();
							new TableroVista();
							modelo.TableroModelo.getTablero().cargarTablero(++nivel,textFieldNombre.getText());
							frame.dispose();
						} else {
							JOptionPane.showMessageDialog(null, "Tienes que introducir un nombre", "Error Valor", JOptionPane.ERROR_MESSAGE);
						}
					} catch (Exception e2) {
						e2.printStackTrace();
						JOptionPane.showMessageDialog(null, "Para el correcto funcionamiento del programa, introduce la base de datos en C:/TEMP/", "Error en la base de datos", JOptionPane.ERROR_MESSAGE);
					}
					
					
				}
			});
		}
		return btnComenzar;
	}
	private JLabel getLblNombre() {
		if (lblNombre == null) {
			lblNombre = new JLabel("Nombre:");
			lblNombre.setFont(go3);
			lblNombre.setForeground(new Color(234,183,69));
		}
		return lblNombre;
	}
	private JTextField getTextFieldNombre() {
		if (textFieldNombre == null) {
			textFieldNombre = new JTextField();
			textFieldNombre.setColumns(10);
			if (user != null) textFieldNombre.setText(user);
		}
		return textFieldNombre;
	}
	private JLabel getLblNivel() {
		if (lblNivel == null) {
			lblNivel = new JLabel("Nivel:");
			lblNivel.setFont(go3);
			lblNivel.setForeground(new Color(234,183,69));
		}
		return lblNivel;
	}
	private JComboBox<String> getComboBoxNivel() {
		if (comboBoxNivel == null) {
			comboBoxNivel = new JComboBox<String>();
			comboBoxNivel.setModel(new DefaultComboBoxModel<String>(new String[] {"F\u00E1cil", "Medio", "Dif\u00EDcil"}));
		}
		return comboBoxNivel;
	}
}

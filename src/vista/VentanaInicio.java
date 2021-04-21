package vista;

import javax.swing.JFrame;
import java.awt.Color;

import javax.swing.JLabel;
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

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaInicio window = new VentanaInicio();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the application.
	 */
	public VentanaInicio() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	
	private void initialize() {
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
	private JPanelBackground getPanelCentro() {
		if (panelCentro == null) {
			panelCentro = new JPanelBackground();
			panelCentro.setBounds(0, 0, 828, 477);
			panelCentro.setBackground("resources/fondo inicio.jpg");
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
					int nivel = comboBoxNivel.getSelectedIndex();
					TableroVista.getTablero();
					modelo.TableroModelo.getTablero().cargarTablero(++nivel);
					frame.dispose();
				}
			});
		}
		return btnComenzar;
	}
	private JLabel getLblNombre() {
		if (lblNombre == null) {
			lblNombre = new JLabel("Nombre:");
			lblNombre.setFont(new Font("Gang of Three", Font.PLAIN, 20));
			lblNombre.setForeground(new Color(234,183,69));
		}
		return lblNombre;
	}
	private JTextField getTextFieldNombre() {
		if (textFieldNombre == null) {
			textFieldNombre = new JTextField();
			textFieldNombre.setColumns(10);
		}
		return textFieldNombre;
	}
	private JLabel getLblNivel() {
		if (lblNivel == null) {
			lblNivel = new JLabel("Nivel:");
			lblNivel.setFont(new Font("Gang of Three", Font.PLAIN, 20));
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

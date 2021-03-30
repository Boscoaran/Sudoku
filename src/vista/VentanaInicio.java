package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
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

public class VentanaInicio {

	private JFrame frame;
	private JPanel panelNorth;
	private JPanel panelSouth;
	private JPanel panelCentro;
	private JLabel lblNewLabel;
	private JButton btnComenzar;
	private JLabel lblNombre;
	private JTextField textFieldNombre;
	private JLabel lblNewLabel_1;
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
		frame.setBounds(100, 100, 429, 206);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		frame.getContentPane().add(getPanelNorth(), BorderLayout.NORTH);
		frame.getContentPane().add(getPanelSouth(), BorderLayout.SOUTH);
		frame.getContentPane().add(getPanelCentro(), BorderLayout.CENTER);
		frame.setLocationRelativeTo(null);
		this.frame.setVisible(true);
	}

	private JPanel getPanelNorth() {
		if (panelNorth == null) {
			panelNorth = new JPanel();
			panelNorth.add(getLblNewLabel());
		}
		return panelNorth;
	}
	private JPanel getPanelSouth() {
		if (panelSouth == null) {
			panelSouth = new JPanel();
			panelSouth.add(getBtnComenzar());
		}
		return panelSouth;
	}
	private JPanel getPanelCentro() {
		if (panelCentro == null) {
			panelCentro = new JPanel();
			GridBagLayout gbl_panelCentro = new GridBagLayout();
			gbl_panelCentro.columnWidths = new int[]{0, 0, 0, 72, 91, 63, 0, 0};
			gbl_panelCentro.rowHeights = new int[]{0, 0, 0, 0};
			gbl_panelCentro.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			gbl_panelCentro.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
			panelCentro.setLayout(gbl_panelCentro);
			GridBagConstraints gbc_lblNombre = new GridBagConstraints();
			gbc_lblNombre.anchor = GridBagConstraints.EAST;
			gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
			gbc_lblNombre.gridx = 3;
			gbc_lblNombre.gridy = 1;
			panelCentro.add(getLblNombre(), gbc_lblNombre);
			GridBagConstraints gbc_textFieldNombre = new GridBagConstraints();
			gbc_textFieldNombre.gridwidth = 2;
			gbc_textFieldNombre.insets = new Insets(0, 0, 5, 5);
			gbc_textFieldNombre.fill = GridBagConstraints.HORIZONTAL;
			gbc_textFieldNombre.gridx = 4;
			gbc_textFieldNombre.gridy = 1;
			panelCentro.add(getTextFieldNombre(), gbc_textFieldNombre);
			GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
			gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
			gbc_lblNewLabel_1.insets = new Insets(0, 0, 0, 5);
			gbc_lblNewLabel_1.gridx = 3;
			gbc_lblNewLabel_1.gridy = 2;
			panelCentro.add(getLblNewLabel_1(), gbc_lblNewLabel_1);
			GridBagConstraints gbc_comboBoxNivel = new GridBagConstraints();
			gbc_comboBoxNivel.insets = new Insets(0, 0, 0, 5);
			gbc_comboBoxNivel.fill = GridBagConstraints.HORIZONTAL;
			gbc_comboBoxNivel.gridx = 4;
			gbc_comboBoxNivel.gridy = 2;
			panelCentro.add(getComboBoxNivel(), gbc_comboBoxNivel);
		}
		return panelCentro;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("SUDOKU-ROYALE-MASTER");
		}
		return lblNewLabel;
	}
	private JButton getBtnComenzar() {
		if (btnComenzar == null) {
			btnComenzar = new JButton("Comenzar");
			btnComenzar.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					int nivel = comboBoxNivel.getSelectedIndex();
					vista.Tablero y = new vista.Tablero();
					controlador.Tablero.getTablero().cargarTablero(nivel);
					frame.dispose();
				}
			});
		}
		return btnComenzar;
	}
	private JLabel getLblNombre() {
		if (lblNombre == null) {
			lblNombre = new JLabel("Nombre:");
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
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Nivel:");
		}
		return lblNewLabel_1;
	}
	private JComboBox<String> getComboBoxNivel() {
		if (comboBoxNivel == null) {
			comboBoxNivel = new JComboBox<String>();
			comboBoxNivel.setModel(new DefaultComboBoxModel<String>(new String[] {"F\u00E1cil", "Medio", "Dif\u00EDcil"}));
		}
		return comboBoxNivel;
	}
}

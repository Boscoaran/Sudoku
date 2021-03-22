package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.GridBagConstraints;
import java.awt.FlowLayout;
import java.awt.Insets;
import java.awt.event.MouseEvent;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;


import java.awt.Color;
import javax.swing.BoxLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Component;
import java.awt.event.MouseAdapter;

@SuppressWarnings({ "serial", "deprecation" })
public class Tablero extends JFrame implements Observer{

	private JFrame frame;
	private JPanel panelDatos;
	private JPanel panelTablero;
	private Border bordeNormal = new LineBorder(Color.BLACK, 1);
	private Border bordeGrueso = new LineBorder(Color.BLACK, 3);
	private JPanel select = null;
	private JTextField textFieldCandidatos;
	private JLabel lblCandidatos;
	private JLabel lblValor;
	private JTextField textFieldValor;
	private JButton btnModificar;
	private JButton btnAyuda;
	private JPanel panelAyuda;
	private JPanelBackground panelNorth;
	private JPanel panelSouth;
	private JPanel panelWest;
	private JTextPane textPaneAyuda;
	private JPanel panelA11;
	private JPanel panelB12;
	private JPanel panelC13;
	private JPanel panelD21;
	private JPanel panelE22;
	private JPanel panelF23;
	private JPanel panelG31;
	private JPanel panelH32;
	private JPanel panelI33;
	private JPanel panelA_11;
	private JPanel panelA_12;
	private JPanel panelA_13;
	private JPanel panelA_21;
	private JPanel panelA_22;
	private JPanel panelA_23;
	private JPanel panelA_31;
	private JPanel panelA_32;
	private JPanel panelA_33;
	private JPanel panelB_11;
	private JPanel panelB_12;
	private JPanel panelB_13;
	private JPanel panelB_21;
	private JPanel panelB_22;
	private JPanel panelB_23;
	private JPanel panelB_31;
	private JPanel panelB_32;
	private JPanel panelB_33;
	private JPanel panelC_11;
	private JPanel panelC_12;
	private JPanel panelC_13;
	private JPanel panelC_21;
	private JPanel panelC_22;
	private JPanel panelC_23;
	private JPanel panelC_31;
	private JPanel panelC_32;
	private JPanel panelC_33;
	private JPanel panelD_11;
	private JPanel panelD_12;
	private JPanel panelD_13;
	private JPanel panelD_21;
	private JPanel panelD_22;
	private JPanel panelD_23;
	private JPanel panelD_31;
	private JPanel panelD_32;
	private JPanel panelD_33;
	private JPanel panelE_11;
	private JPanel panelE_12;
	private JPanel panelE_13;
	private JPanel panelE_21;
	private JPanel panelE_22;
	private JPanel panelE_23;
	private JPanel panelE_31;
	private JPanel panelE_32;
	private JPanel panelE_33;
	private JPanel panelF_11;
	private JPanel panelF_12;
	private JPanel panelF_13;
	private JPanel panelF_21;
	private JPanel panelF_22;
	private JPanel panelF_23;
	private JPanel panelF_31;
	private JPanel panelF_32;
	private JPanel panelF_33;
	private JPanel panelG_11;
	private JPanel panelG_12;
	private JPanel panelG_13;
	private JPanel panelG_21;
	private JPanel panelG_22;
	private JPanel panelG_23;
	private JPanel panelG_31;
	private JPanel panelG_32;
	private JPanel panelG_33;
	private JPanel panelH_11;
	private JPanel panelH_12;
	private JPanel panelH_13;
	private JPanel panelH_21;
	private JPanel panelH_22;
	private JPanel panelH_23;
	private JPanel panelH_31;
	private JPanel panelH_32;
	private JPanel panelH_33;
	private JPanel panelI_11;
	private JPanel panelI_12;
	private JPanel panelI_13;
	private JPanel panelI_21;
	private JPanel panelI_22;
	private JPanel panelI_23;
	private JPanel panelI_31;
	private JPanel panelI_32;
	private JPanel panelI_33;
	private JPanel panelValor_A11;
	private JLabel lblValor_A11;
	private JPanel panelCandidatos_A11;
	private JLabel lblCandidatos_A11;
	private JPanel panelValor_A12;
	private JPanel panelCandidatos_A12;
	private JLabel lblCandidatos_A12;
	private JLabel lblValor_A12;
	private JPanel panelValor_A13;
	private JLabel lblValor_A13;
	private JPanel panelCandidatos_A13;
	private JLabel lblCandidatos_A13;
	private JPanel panelValor_A21;
	private JLabel lblValor_A21;
	private JPanel panelCandidatos_A21;
	private JLabel lblCandidatos_A21;
	private JPanel panelValor_A22;
	private JLabel lblValor_A22;
	private JPanel panelCandidatos_A22;
	private JLabel lblCandidatos_A22;
	private JPanel panelValor_A23;
	private JLabel lblValor_A23;
	private JPanel panelCandidatos_A23;
	private JLabel lblCandidatos_A23;
	private JPanel panelValor_A31;
	private JLabel lblValor_A31;
	private JPanel panelCandidatos_A31;
	private JLabel lblCandidatos_A31;
	private JPanel panelValor_A32;
	private JLabel lblValor_A32;
	private JPanel panelCandidatos_A32;
	private JLabel lblCandidatos_A32;
	private JPanel panelValor_A33;
	private JLabel lblValor_A33;
	private JPanel panelCandidatos_A33;
	private JLabel lblCandidatos_A33;
	private JPanel panelValor_B11;
	private JLabel lblValor_B11;
	private JPanel panelCandidatos_B11;
	private JLabel lblCandidatos_B11;
	private JPanel panelValor_B12;
	private JLabel lblValor_B12;
	private JPanel panelCandidatos_B12;
	private JLabel lblCandidatos_B12;
	private JPanel panelValor_B13;
	private JLabel lblValor_B13;
	private JPanel panelCandidatos_B13;
	private JLabel lblCandidatos_B13;
	private JPanel panelValor_B21;
	private JLabel lblValor_B21;
	private JPanel panelCandidatos_B21;
	private JLabel lblCandidatos_B21;
	private JPanel panelValor_B22;
	private JLabel lblValor_B22;
	private JPanel panelCandidatos_B22;
	private JLabel lblCandidatos_B22;
	private JPanel panelValor_B23;
	private JLabel lblValor_B23;
	private JPanel panelCandidatos_B23;
	private JLabel lblCandidatos_B23;
	private JPanel panelValor_B31;
	private JLabel lblValor_B31;
	private JPanel panelCandidatos_B31;
	private JLabel lblCandidatos_B31;
	private JPanel panelValor_B32;
	private JLabel lblValor_B32;
	private JPanel panelCandidatos_B32;
	private JLabel lblCandidatos_B32;
	private JPanel panelValor_B33;
	private JLabel lblValor_B33;
	private JPanel panelCandidatos_B33;
	private JLabel lblCandidatos_B33;
	private JPanel panelValor_C12;
	private JLabel lblValor_C12;
	private JPanel panelCandidatos_C12;
	private JLabel lblCandidatos_C12;
	private JPanel panelValor_C11;
	private JLabel lblValor_C11;
	private JPanel panelCandidatos_C11;
	private JLabel lblCandidatos_C11;
	private JPanel panelValor_C13;
	private JLabel lblValor_C13;
	private JPanel panelCandidatos_C13;
	private JLabel lblCandidatos_C13;
	private JPanel panelValor_C21;
	private JLabel lblValor_C21;
	private JPanel panelCandidatos_C21;
	private JLabel lblCandidatos_C21;
	private JPanel panelValor_C22;
	private JLabel lblValor_C22;
	private JPanel panelCandidatos_C22;
	private JLabel lblCandidatos_C22;
	private JPanel panelValor_C23;
	private JLabel lblValor_C23;
	private JPanel panelCandidatos_C23;
	private JLabel lblCandidatos_C23;
	private JPanel panelValor_C31;
	private JLabel lblValor_C31;
	private JPanel panelCandidatos_C31;
	private JLabel lblCandidatos_C31;
	private JPanel panelValor_C32;
	private JLabel lblValor_C32;
	private JPanel panelCandidatos_C32;
	private JLabel lblCandidatos_C32;
	private JPanel panelValor_C33;
	private JLabel lblValor_C33;
	private JPanel panelCandidatos_C33;
	private JLabel lblCandidatos_C33;
	private JLabel lblTitulo;
	private JLabel lblNombres;
	private JPanel panelValor_D11;
	private JLabel lblValor_D11;
	private JPanel panelCandidatos_D11;
	private JLabel lblCandidatos_D11;
	private JPanel panelValor_D12;
	private JLabel lblValor_D12;
	private JPanel panelCandidatos_D12;
	private JLabel lblCandidatos_D12;
	private JPanel panelValor_D13;
	private JLabel lblValor_D13;
	private JPanel panelCandidatos_D13;
	private JLabel lblCandidatos_D13;
	private JPanel panelValor_D21;
	private JLabel lblValor_D21;
	private JPanel panelCandidatos_D21;
	private JLabel lblCandidatos_D21;
	private JPanel panelValor_D22;
	private JLabel lblValor_D22;
	private JPanel panelCandidatos_D22;
	private JLabel lblCandidatos_D22;
	private JPanel panelValor_D23;
	private JLabel lblValor_D23;
	private JPanel panelCandidatos_D23;
	private JLabel lblCandidatos_D23;
	private JPanel panelValor_D31;
	private JLabel lblValor_D31;
	private JPanel panelCandidatos_D31;
	private JLabel lblCandidatos_D31;
	private JPanel panelValor_D32;
	private JLabel lblValor_D32;
	private JPanel panelCandidatos_D32;
	private JLabel lblCandidatos_D32;
	private JPanel panelValor_D33;
	private JLabel lblValor_D33;
	private JPanel panelCandidatos_D33;
	private JLabel lblCandidatos_D33;
	private JPanel panelValor_E11;
	private JLabel lblValor_E11;
	private JPanel panelCandidatos_E11;
	private JLabel lblCandidatos_E11;
	private JPanel panelValor_E12;
	private JLabel lblValor_E12;
	private JPanel panelCandidatos_E12;
	private JLabel lblCandidatos_E12;
	private JPanel panelValor_E13;
	private JLabel lblValor_E13;
	private JPanel panelCandidatos_E13;
	private JLabel lblCandidatos_E13;
	private JPanel panelValor_E21;
	private JLabel lblValor_E21;
	private JPanel panelCandidatos_E21;
	private JLabel lblCandidatos_E21;
	private JPanel panelValor_E22;
	private JLabel lblValor_E22;
	private JPanel panelCandidatos_E22;
	private JLabel lblCandidatos_E22;
	private JPanel panelValor_E23;
	private JLabel lblValor_E23;
	private JPanel panelCandidatos_E23;
	private JLabel lblCandidatos_E23;
	private JPanel panelValor_E31;
	private JLabel lblValor_E31;
	private JPanel panelCandidatos_E31;
	private JLabel lblCandidatos_E31;
	private JPanel panelValor_E32;
	private JLabel lblValor_E32;
	private JPanel panelCandidatos_E32;
	private JLabel lblCandidatos_E32;
	private JPanel panelValor_E33;
	private JLabel lblValor_E33;
	private JPanel panelCandidatos_E33;
	private JLabel lblCandidatos_E33;
	private JPanel panelValor_F11;
	private JLabel lblValor_F11;
	private JPanel panelCandidatos_F11;
	private JLabel lblCandidatos_F11;
	private JPanel panelValor_F12;
	private JLabel lblValor_F12;
	private JPanel panelCandidatos_F12;
	private JLabel lblCandidatos_F12;
	private JPanel panelValor_F13;
	private JLabel lblValor_F13;
	private JPanel panelCandidatos_F13;
	private JLabel lblCandidatos_F13;
	private JPanel panelValor_F21;
	private JLabel lblValor_F21;
	private JPanel panelCandidatos_F21;
	private JLabel lblCandidatos_F21;
	private JPanel panelValor_F22;
	private JLabel lblValor_F22;
	private JPanel panelCandidatos_F22;
	private JLabel lblCandidatos_F22;
	private JPanel panelValor_F23;
	private JLabel lblValor_F23;
	private JPanel panelCandidatos_F23;
	private JLabel lblCandidatos_F23;
	private JPanel panelValor_F31;
	private JLabel lblValor_F31;
	private JPanel panelCandidatos_F31;
	private JLabel lblCandidatos_F31;
	private JPanel panelValor_F32;
	private JLabel lblValor_F32;
	private JPanel panelCandidatos_F32;
	private JLabel lblCandidatos_F32;
	private JPanel panelValor_F33;
	private JLabel lblValor_F33;
	private JPanel panelCandidatos_F33;
	private JLabel lblCandidatos_F33;
	private JPanel panelValor_G11;
	private JLabel lblValor_G11;
	private JPanel panelCandidatos_G11;
	private JLabel lblCandidatos_G11;
	private JPanel panelValor_G12;
	private JLabel lblValor_G12;
	private JPanel panelCandidatos_G12;
	private JLabel lblCandidatos_G12;
	private JPanel panelValor_G13;
	private JLabel lblValor_G13;
	private JPanel panelCandidatos_G13;
	private JLabel lblCandidatos_G13;
	private JPanel panelValor_G21;
	private JLabel lblValor_G21;
	private JPanel panelCandidatos_G21;
	private JLabel lblCandidatos_G21;
	private JPanel panelValor_G22;
	private JLabel lblValor_G22;
	private JPanel panelCandidatos_G22;
	private JLabel lblCandidatos_G22;
	private JPanel panelValor_G23;
	private JLabel lblValor_G23;
	private JPanel panelCandidatos_G23;
	private JLabel lblCandidatos_G23;
	private JPanel panelValor_G31;
	private JLabel lblValor_G31;
	private JPanel panelCandidatos_G31;
	private JLabel lblCandidatos_G31;
	private JPanel panelValor_G32;
	private JLabel lblValor_G32;
	private JPanel panelCandidatos_G32;
	private JLabel lblCandidatos_G32;
	private JPanel panelValor_G33;
	private JLabel lblValor_G33;
	private JPanel panelCandidatos_G33;
	private JLabel lblCandidatos_G33;
	private JPanel panelValor_H11;
	private JLabel lblValor_H11;
	private JPanel panelCandidatos_H11;
	private JLabel lblCandidatos_H11;
	private JPanel panelValor_H12;
	private JLabel lblValor_H12;
	private JPanel panelCandidatos_H12;
	private JLabel lblCandidatos_H12;
	private JPanel panelValor_H13;
	private JLabel lblValor_H13;
	private JPanel panelCandidatos_H13;
	private JLabel lblCandidatos_H13;
	private JPanel panelValor_H21;
	private JLabel lblValor_H21;
	private JPanel panelCandidatos_H21;
	private JLabel lblCandidatos_H21;
	private JPanel panelValor_H22;
	private JLabel lblValor_H22;
	private JPanel panelCandidatos_H22;
	private JLabel lblCandidatos_H22;
	private JPanel panelValor_H23;
	private JLabel lblValor_H23;
	private JPanel panelCandidatos_H23;
	private JLabel lblCandidatos_H23;
	private JPanel panelValor_H31;
	private JLabel lblValor_H31;
	private JPanel panelCandidatos_H31;
	private JLabel lblCandidatos_H31;
	private JPanel panelValor_H32;
	private JLabel lblValor_H32;
	private JPanel panelCandidatos_H32;
	private JLabel lblCandidatos_H32;
	private JPanel panelValor_H33;
	private JLabel lblValor_H33;
	private JPanel panelCandidatos_H33;
	private JLabel lblCandidatos_H33;
	private JPanel panelValor_I11;
	private JLabel lblValor_I11;
	private JPanel panelCandidatos_I11;
	private JLabel lblCandidatos_I11;
	private JPanel panelValor_I12;
	private JLabel lblValor_I12;
	private JPanel panelCandidatos_I12;
	private JLabel lblCandidatos_I12;
	private JPanel panelValor_I13;
	private JLabel lblValor_I13;
	private JPanel panelCandidatos_I13;
	private JLabel lblCandidatos_I13;
	private JPanel panelValor_I21;
	private JLabel lblValor_I21;
	private JPanel panelCandidatos_I21;
	private JLabel lblCandidatos_I21;
	private JPanel panelValor_I22;
	private JLabel lblValor_I22;
	private JPanel panelCandidatos_I22;
	private JLabel lblCandidatos_I22;
	private JPanel panelValor_I23;
	private JLabel lblValor_I23;
	private JPanel panelCandidatos_I23;
	private JLabel lblCandidatos_I23;
	private JPanel panelValor_I31;
	private JLabel lblValor_I31;
	private JPanel panelCandidatos_I31;
	private JLabel lblCandidatos_I31;
	private JPanel panelValor_I32;
	private JLabel lblValor_I32;
	private JPanel panelCandidatos_I32;
	private JLabel lblCandidatos_I32;
	private JPanel panelValor_I33;
	private JLabel lblValor_I33;
	private JPanel panelCandidatos_I33;
	private JLabel lblCandidatos_I33;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tablero window = new Tablero();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Tablero() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 939, 733);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		frame.getContentPane().add(getPanelWest(), BorderLayout.WEST);
		frame.getContentPane().add(getPanelSouth(), BorderLayout.SOUTH);
		frame.getContentPane().add(getPanelDatos(), BorderLayout.EAST);
		frame.getContentPane().add(getPanelTablero(), BorderLayout.CENTER);
		frame.getContentPane().add(getPanelNorth(), BorderLayout.NORTH);
	}

	private JPanel getPanelDatos() {
		if (panelDatos == null) {
			panelDatos = new JPanel();
			panelDatos.setBackground(new Color(255, 0, 51));
			GridBagLayout gbl_panelDatos = new GridBagLayout();
			gbl_panelDatos.columnWidths = new int[]{18, 0, 117, 0, 0};
			gbl_panelDatos.rowHeights = new int[]{20, 0, 0, 0, 0, 0, 0, 0, 0, 11, 0};
			gbl_panelDatos.columnWeights = new double[]{0.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
			gbl_panelDatos.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
			panelDatos.setLayout(gbl_panelDatos);
			GridBagConstraints gbc_lblCandidatos = new GridBagConstraints();
			gbc_lblCandidatos.anchor = GridBagConstraints.EAST;
			gbc_lblCandidatos.insets = new Insets(0, 0, 5, 5);
			gbc_lblCandidatos.gridx = 1;
			gbc_lblCandidatos.gridy = 2;
			panelDatos.add(getLblCandidatos(), gbc_lblCandidatos);
			GridBagConstraints gbc_textFieldCandidatos = new GridBagConstraints();
			gbc_textFieldCandidatos.insets = new Insets(0, 0, 5, 5);
			gbc_textFieldCandidatos.anchor = GridBagConstraints.NORTHWEST;
			gbc_textFieldCandidatos.gridx = 2;
			gbc_textFieldCandidatos.gridy = 2;
			panelDatos.add(getTextFieldCandidatos(), gbc_textFieldCandidatos);
			GridBagConstraints gbc_lblValor = new GridBagConstraints();
			gbc_lblValor.anchor = GridBagConstraints.ABOVE_BASELINE_TRAILING;
			gbc_lblValor.insets = new Insets(0, 0, 5, 5);
			gbc_lblValor.gridx = 1;
			gbc_lblValor.gridy = 4;
			panelDatos.add(getLblValor(), gbc_lblValor);
			GridBagConstraints gbc_textFieldValor = new GridBagConstraints();
			gbc_textFieldValor.anchor = GridBagConstraints.WEST;
			gbc_textFieldValor.insets = new Insets(0, 0, 5, 5);
			gbc_textFieldValor.gridx = 2;
			gbc_textFieldValor.gridy = 4;
			panelDatos.add(getTextFieldValor(), gbc_textFieldValor);
			GridBagConstraints gbc_btnModificar = new GridBagConstraints();
			gbc_btnModificar.insets = new Insets(0, 0, 5, 5);
			gbc_btnModificar.gridx = 1;
			gbc_btnModificar.gridy = 6;
			panelDatos.add(getBtnModificar(), gbc_btnModificar);
			GridBagConstraints gbc_btnAyuda = new GridBagConstraints();
			gbc_btnAyuda.insets = new Insets(0, 0, 5, 5);
			gbc_btnAyuda.gridx = 2;
			gbc_btnAyuda.gridy = 6;
			panelDatos.add(getBtnAyuda(), gbc_btnAyuda);
			GridBagConstraints gbc_panelAyuda = new GridBagConstraints();
			gbc_panelAyuda.insets = new Insets(0, 0, 5, 5);
			gbc_panelAyuda.gridwidth = 2;
			gbc_panelAyuda.fill = GridBagConstraints.BOTH;
			gbc_panelAyuda.gridx = 1;
			gbc_panelAyuda.gridy = 8;
			panelDatos.add(getPanelAyuda(), gbc_panelAyuda);
		}
		return panelDatos;
	}	
	private JLabel getLblTitulo() {
		if (lblTitulo == null) {
			lblTitulo = new JLabel("SUDOKU-ROYALE-MASTER");
			lblTitulo.setForeground(Color.WHITE);
			lblTitulo.setFont(new Font("Kamikaze 3D Gradient", Font.PLAIN, 40));
			lblTitulo.setAlignmentX(Component.CENTER_ALIGNMENT);
			lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		}
		return lblTitulo;
	}
	private JLabel getLblNombres() {
		if (lblNombres == null) {
			lblNombres = new JLabel("Vicente Ayarza - I\u00F1igo Landeta - Joel Bra - Bosco Aranguren - Diego Marta");
			lblNombres.setForeground(Color.WHITE);
			lblNombres.setFont(new Font("Gang of Three", Font.PLAIN, 20));
			lblNombres.setHorizontalAlignment(SwingConstants.CENTER);
		}
		return lblNombres;
	}
	private JTextField getTextFieldCandidatos() {
		if (textFieldCandidatos == null) {
			textFieldCandidatos = new JTextField();
			textFieldCandidatos.setColumns(10);
		}
		return textFieldCandidatos;
	}
	private JLabel getLblCandidatos() {
		if (lblCandidatos == null) {
			lblCandidatos = new JLabel("Candidatos:");
			lblCandidatos.setFont(new Font("Gang of Three", Font.PLAIN, 15));
			lblCandidatos.setForeground(Color.WHITE);
		}
		return lblCandidatos;
	}
	private JLabel getLblValor() {
		if (lblValor == null) {
			lblValor = new JLabel("Valor:");
			lblValor.setFont(new Font("Gang of Three", Font.PLAIN, 15));
			lblValor.setForeground(Color.WHITE);
		}
		return lblValor;
	}
	private JTextField getTextFieldValor() {
		if (textFieldValor == null) {
			textFieldValor = new JTextField();
			textFieldValor.setColumns(10);
		}
		return textFieldValor;
	}
	private JButton getBtnModificar() {
		if (btnModificar == null) {
			btnModificar = new JButton("Modificar");
			btnModificar.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 11));
			btnModificar.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if (select!=null) {
						for (Component x1: select.getComponents()) {
							for (Component x2: ((JPanel) x1).getComponents()) {
								if (((JLabel) x2).getFont().equals(new Font("Tahoma", Font.PLAIN, 20))){
									((JLabel) x2).setText(textFieldValor.getText());
								} else {
									((JLabel) x2).setText(textFieldCandidatos.getText());
								}
							}
						}
						textFieldCandidatos.setText("");
						textFieldValor.setText("");
						select.setBorder(bordeNormal);
						select=null;
					}
				}
			});
		}
		return btnModificar;
	}
	private JButton getBtnAyuda() {
		if (btnAyuda == null) {
			btnAyuda = new JButton("Ayuda");
		}
		return btnAyuda;
	}
	private JPanel getPanelAyuda() {
		if (panelAyuda == null) {
			panelAyuda = new JPanel();
			panelAyuda.setLayout(new BoxLayout(panelAyuda, BoxLayout.X_AXIS));
			panelAyuda.add(getTextPaneAyuda());
		}
		return panelAyuda;
	}
	private JPanelBackground getPanelNorth() {
		if (panelNorth == null) {
			panelNorth = new JPanelBackground();
			panelNorth.setBackground("C:\\Users\\bosco\\Desktop\\39605wide.jpg");
			GridBagLayout gbl_panelNorth = new GridBagLayout();
			gbl_panelNorth.columnWidths = new int[]{923, 0};
			gbl_panelNorth.rowHeights = new int[]{21, 14, 0, 10, 0};
			gbl_panelNorth.columnWeights = new double[]{0.0, Double.MIN_VALUE};
			gbl_panelNorth.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			panelNorth.setLayout(gbl_panelNorth);
			GridBagConstraints gbc_lblTitulo = new GridBagConstraints();
			gbc_lblTitulo.fill = GridBagConstraints.BOTH;
			gbc_lblTitulo.insets = new Insets(0, 0, 5, 0);
			gbc_lblTitulo.gridx = 0;
			gbc_lblTitulo.gridy = 1;
			panelNorth.add(getLblTitulo(), gbc_lblTitulo);
			GridBagConstraints gbc_lblNombres = new GridBagConstraints();
			gbc_lblNombres.insets = new Insets(0, 0, 5, 0);
			gbc_lblNombres.fill = GridBagConstraints.BOTH;
			gbc_lblNombres.gridx = 0;
			gbc_lblNombres.gridy = 2;
			panelNorth.add(getLblNombres(), gbc_lblNombres);
		}
		return panelNorth;
	}
	private JPanel getPanelSouth() {
		if (panelSouth == null) {
			panelSouth = new JPanel();
			panelSouth.setBackground(new Color(255, 0, 51));
		}
		return panelSouth;
	}
	private JPanel getPanelWest() {
		if (panelWest == null) {
			panelWest = new JPanel();
			panelWest.setBackground(new Color(255, 0, 51));
		}
		return panelWest;
	}
	private JTextPane getTextPaneAyuda() {
		if (textPaneAyuda == null) {
			textPaneAyuda = new JTextPane();
		}
		return textPaneAyuda;
	}
	private JPanel getPanelTablero() {
		if (panelTablero == null) {
			panelTablero = new JPanel();
			panelTablero.setBorder(null);
			panelTablero.setLayout(new GridLayout(3, 3, 0, 0));
			panelTablero.add(getPanelA11());
			panelTablero.add(getPanelB12());
			panelTablero.add(getPanelC13());
			panelTablero.add(getPanelD21());
			panelTablero.add(getPanelE22());
			panelTablero.add(getPanelF23());
			panelTablero.add(getPanelG31());
			panelTablero.add(getPanelH32());
			panelTablero.add(getPanelI33());
		}
		return panelTablero;
	}
	private JPanel getPanelA11() {
		if (panelA11 == null) {
			panelA11 = new JPanel();
			panelA11.setBorder(new LineBorder(Color.BLACK, 2));
			panelA11.setLayout(new GridLayout(3, 3, 0, 0));
			panelA11.add(getPanelA_11());
			panelA11.add(getPanelA_12());
			panelA11.add(getPanelA_13());
			panelA11.add(getPanelA_21());
			panelA11.add(getPanelA_22());
			panelA11.add(getPanelA_23());
			panelA11.add(getPanelA_31());
			panelA11.add(getPanelA_32());
			panelA11.add(getPanelA_33());
		}
		return panelA11;
	}
	private JPanel getPanelB12() {
		if (panelB12 == null) {
			panelB12 = new JPanel();
			panelB12.setBorder(new LineBorder(Color.BLACK, 2));
			panelB12.setLayout(new GridLayout(3, 3, 0, 0));
			panelB12.add(getPanelB_11());
			panelB12.add(getPanelB_12());
			panelB12.add(getPanelB_13());
			panelB12.add(getPanelB_21());
			panelB12.add(getPanelB_22());
			panelB12.add(getPanelB_23());
			panelB12.add(getPanelB_31());
			panelB12.add(getPanelB_32());
			panelB12.add(getPanelB_33());
		}
		return panelB12;
	}
	private JPanel getPanelC13() {
		if (panelC13 == null) {
			panelC13 = new JPanel();
			panelC13.setBorder(new LineBorder(Color.BLACK, 2));
			panelC13.setLayout(new GridLayout(3, 3, 0, 0));
			panelC13.add(getPanelC_11());
			panelC13.add(getPanelC_12());
			panelC13.add(getPanelC_13());
			panelC13.add(getPanelC_21());
			panelC13.add(getPanelC_22());
			panelC13.add(getPanelC_23());
			panelC13.add(getPanelC_31());
			panelC13.add(getPanelC_32());
			panelC13.add(getPanelC_33());
		}
		return panelC13;
	}
	private JPanel getPanelD21() {
		if (panelD21 == null) {
			panelD21 = new JPanel();
			panelD21.setBorder(new LineBorder(Color.BLACK, 2));
			panelD21.setLayout(new GridLayout(3, 3, 0, 0));
			panelD21.add(getPanelD_11());
			panelD21.add(getPanelD_12());
			panelD21.add(getPanelD_13());
			panelD21.add(getPanelD_21());
			panelD21.add(getPanelD_22());
			panelD21.add(getPanelD_23());
			panelD21.add(getPanelD_31());
			panelD21.add(getPanelD_32());
			panelD21.add(getPanelD_33());
		}
		return panelD21;
	}
	private JPanel getPanelE22() {
		if (panelE22 == null) {
			panelE22 = new JPanel();
			panelE22.setBorder(new LineBorder(Color.BLACK, 2));
			panelE22.setLayout(new GridLayout(3, 3, 0, 0));
			panelE22.add(getPanelE_11());
			panelE22.add(getPanelE_12());
			panelE22.add(getPanelE_13());
			panelE22.add(getPanelE_21());
			panelE22.add(getPanelE_22());
			panelE22.add(getPanelE_23());
			panelE22.add(getPanelE_31());
			panelE22.add(getPanelE_32());
			panelE22.add(getPanelE_33());
		}
		return panelE22;
	}
	private JPanel getPanelF23() {
		if (panelF23 == null) {
			panelF23 = new JPanel();
			panelF23.setBorder(new LineBorder(Color.BLACK, 2));
			panelF23.setLayout(new GridLayout(3, 3, 0, 0));
			panelF23.add(getPanelF_11());
			panelF23.add(getPanelF_12());
			panelF23.add(getPanelF_13());
			panelF23.add(getPanelF_21());
			panelF23.add(getPanelF_22());
			panelF23.add(getPanelF_23());
			panelF23.add(getPanelF_31());
			panelF23.add(getPanelF_32());
			panelF23.add(getPanelF_33());
		}
		return panelF23;
	}
	private JPanel getPanelG31() {
		if (panelG31 == null) {
			panelG31 = new JPanel();
			panelG31.setBorder(new LineBorder(Color.BLACK, 2));
			panelG31.setLayout(new GridLayout(3, 3, 0, 0));
			panelG31.add(getPanelG_11());
			panelG31.add(getPanelG_12());
			panelG31.add(getPanelG_13());
			panelG31.add(getPanelG_21());
			panelG31.add(getPanelG_22());
			panelG31.add(getPanelG_23());
			panelG31.add(getPanelG_31());
			panelG31.add(getPanelG_32());
			panelG31.add(getPanelG_33());
		}
		return panelG31;
	}
	private JPanel getPanelH32() {
		if (panelH32 == null) {
			panelH32 = new JPanel();
			panelH32.setBorder(new LineBorder(Color.BLACK, 2));
			panelH32.setLayout(new GridLayout(3, 3, 0, 0));
			panelH32.add(getPanelH_11());
			panelH32.add(getPanelH_12());
			panelH32.add(getPanelH_13());
			panelH32.add(getPanelH_21());
			panelH32.add(getPanelH_22());
			panelH32.add(getPanelH_23());
			panelH32.add(getPanelH_31());
			panelH32.add(getPanelH_32());
			panelH32.add(getPanelH_33());
		}
		return panelH32;
	}
	private JPanel getPanelI33() {
		if (panelI33 == null) {
			panelI33 = new JPanel();
			panelI33.setBorder(new LineBorder(Color.BLACK, 2));
			panelI33.setLayout(new GridLayout(3, 3, 0, 0));
			panelI33.add(getPanelI_11());
			panelI33.add(getPanelI_12());
			panelI33.add(getPanelI_13());
			panelI33.add(getPanelI_21());
			panelI33.add(getPanelI_22());
			panelI33.add(getPanelI_23());
			panelI33.add(getPanelI_31());
			panelI33.add(getPanelI_32());
			panelI33.add(getPanelI_33());
		}
		return panelI33;
	}
	private JPanel getPanelA_11() {
		if (panelA_11 == null) {
			panelA_11 = new JPanel();
			panelA_11.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e, select);
				}
			});
			panelA_11.setBorder(bordeNormal);
			panelA_11.setLayout(new BorderLayout(0, 0));
			panelA_11.add(getPanelValor_A11(), BorderLayout.CENTER);
			panelA_11.add(getPanelCandidatos_A11(), BorderLayout.NORTH);
		}
		return panelA_11;
	}
	private JPanel getPanelA_12() {
		if (panelA_12 == null) {
			panelA_12 = new JPanel();
			panelA_12.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e, select);
				}
			});
			panelA_12.setBorder(bordeNormal);
			panelA_12.setLayout(new BorderLayout(0, 0));
			panelA_12.add(getPanelValor_A12(), BorderLayout.CENTER);
			panelA_12.add(getPanelCandidatos_A12(), BorderLayout.NORTH);
		}
		return panelA_12;
	}
	private JPanel getPanelA_13() {
		if (panelA_13 == null) {
			panelA_13 = new JPanel();
			panelA_13.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e, select);
				}
			});
			panelA_13.setBorder(bordeNormal);
			panelA_13.setLayout(new BorderLayout(0, 0));
			panelA_13.add(getPanelValor_A13(), BorderLayout.CENTER);
			panelA_13.add(getPanelCandidatos_A13(), BorderLayout.NORTH);
		}
		return panelA_13;
	}
	private JPanel getPanelA_21() {
		if (panelA_21 == null) {
			panelA_21 = new JPanel();
			panelA_21.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e, select);
				}
			});
			panelA_21.setBorder(bordeNormal);
			panelA_21.setLayout(new BorderLayout(0, 0));
			panelA_21.add(getPanelValor_A21(), BorderLayout.CENTER);
			panelA_21.add(getPanelCandidatos_A21(), BorderLayout.NORTH);
		}
		return panelA_21;
	}
	private JPanel getPanelA_22() {
		if (panelA_22 == null) {
			panelA_22 = new JPanel();
			panelA_22.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e, select);
				}
			});
			panelA_22.setBorder(bordeNormal);
			panelA_22.setLayout(new BorderLayout(0, 0));
			panelA_22.add(getPanelValor_A22(), BorderLayout.CENTER);
			panelA_22.add(getPanelCandidatos_A22(), BorderLayout.NORTH);
		}
		return panelA_22;
	}
	private JPanel getPanelA_23() {
		if (panelA_23 == null) {
			panelA_23 = new JPanel();
			panelA_23.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e, select);
				}
			});
			panelA_23.setBorder(bordeNormal);
			panelA_23.setLayout(new BorderLayout(0, 0));
			panelA_23.add(getPanelValor_A23(), BorderLayout.CENTER);
			panelA_23.add(getPanelCandidatos_A23(), BorderLayout.NORTH);
		}
		return panelA_23;
	}
	private JPanel getPanelA_31() {
		if (panelA_31 == null) {
			panelA_31 = new JPanel();
			panelA_31.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e, select);
				}
			});
			panelA_31.setBorder(bordeNormal);
			panelA_31.setLayout(new BorderLayout(0, 0));
			panelA_31.add(getPanelValor_A31(), BorderLayout.CENTER);
			panelA_31.add(getPanelCandidatos_A31(), BorderLayout.NORTH);
		}
		return panelA_31;
	}
	private JPanel getPanelA_32() {
		if (panelA_32 == null) {
			panelA_32 = new JPanel();
			panelA_32.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e, select);
				}
			});
			panelA_32.setBorder(bordeNormal);
			panelA_32.setLayout(new BorderLayout(0, 0));
			panelA_32.add(getPanelValor_A32(), BorderLayout.CENTER);
			panelA_32.add(getPanelCandidatos_A32(), BorderLayout.NORTH);
		}
		return panelA_32;
	}
	private JPanel getPanelA_33() {
		if (panelA_33 == null) {
			panelA_33 = new JPanel();
			panelA_33.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e, select);
				}
			});
			panelA_33.setBorder(bordeNormal);
			panelA_33.setLayout(new BorderLayout(0, 0));
			panelA_33.add(getPanelValor_A33(), BorderLayout.CENTER);
			panelA_33.add(getPanelCandidatos_A33(), BorderLayout.NORTH);
		}
		return panelA_33;
	}
	private JPanel getPanelB_11() {
		if (panelB_11 == null) {
			panelB_11 = new JPanel();
			panelB_11.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e, select);
				}
			});
			panelB_11.setBorder(bordeNormal);
			panelB_11.setLayout(new BorderLayout(0, 0));
			panelB_11.add(getPanelValor_B11(), BorderLayout.CENTER);
			panelB_11.add(getPanelCandidatos_B11(), BorderLayout.NORTH);
		}
		return panelB_11;
	}
	private JPanel getPanelB_12() {
		if (panelB_12 == null) {
			panelB_12 = new JPanel();
			panelB_12.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e, select);
				}
			});
			panelB_12.setBorder(bordeNormal);
			panelB_12.setLayout(new BorderLayout(0, 0));
			panelB_12.add(getPanelValor_B12(), BorderLayout.CENTER);
			panelB_12.add(getPanelCandidatos_B12(), BorderLayout.NORTH);
		}
		return panelB_12;
	}
	private JPanel getPanelB_13() {
		if (panelB_13 == null) {
			panelB_13 = new JPanel();
			panelB_13.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e, select);
				}
			});
			panelB_13.setBorder(bordeNormal);
			panelB_13.setLayout(new BorderLayout(0, 0));
			panelB_13.add(getPanelValor_B13(), BorderLayout.CENTER);
			panelB_13.add(getPanelCandidatos_B13(), BorderLayout.NORTH);
		}
		return panelB_13;
	}
	private JPanel getPanelB_21() {
		if (panelB_21 == null) {
			panelB_21 = new JPanel();
			panelB_21.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e, select);
				}
			});
			panelB_21.setBorder(bordeNormal);
			panelB_21.setLayout(new BorderLayout(0, 0));
			panelB_21.add(getPanelValor_B21(), BorderLayout.CENTER);
			panelB_21.add(getPanelCandidatos_B21(), BorderLayout.NORTH);
		}
		return panelB_21;
	}
	private JPanel getPanelB_22() {
		if (panelB_22 == null) {
			panelB_22 = new JPanel();
			panelB_22.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e, select);
				}
			});
			panelB_22.setBorder(bordeNormal);
			panelB_22.setLayout(new BorderLayout(0, 0));
			panelB_22.add(getPanelValor_B22(), BorderLayout.CENTER);
			panelB_22.add(getPanelCandidatos_B22(), BorderLayout.NORTH);
		}
		return panelB_22;
	}
	private JPanel getPanelB_23() {
		if (panelB_23 == null) {
			panelB_23 = new JPanel();
			panelB_23.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e, select);
				}
			});
			panelB_23.setBorder(bordeNormal);
			panelB_23.setLayout(new BorderLayout(0, 0));
			panelB_23.add(getPanelValor_B23(), BorderLayout.CENTER);
			panelB_23.add(getPanelCandidatos_B23(), BorderLayout.NORTH);
		}
		return panelB_23;
	}
	private JPanel getPanelB_31() {
		if (panelB_31 == null) {
			panelB_31 = new JPanel();
			panelB_31.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e, select);
				}
			});
			panelB_31.setBorder(bordeNormal);
			panelB_31.setLayout(new BorderLayout(0, 0));
			panelB_31.add(getPanelValor_B31(), BorderLayout.CENTER);
			panelB_31.add(getPanelCandidatos_B31(), BorderLayout.NORTH);
		}
		return panelB_31;
	}
	private JPanel getPanelB_32() {
		if (panelB_32 == null) {
			panelB_32 = new JPanel();
			panelB_32.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e, select);
				}
			});
			panelB_32.setBorder(bordeNormal);
			panelB_32.setLayout(new BorderLayout(0, 0));
			panelB_32.add(getPanelValor_B32(), BorderLayout.CENTER);
			panelB_32.add(getPanelCandidatos_B32(), BorderLayout.NORTH);
		}
		return panelB_32;
	}
	private JPanel getPanelB_33() {
		if (panelB_33 == null) {
			panelB_33 = new JPanel();
			panelB_33.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e, select);
				}
			});
			panelB_33.setBorder(bordeNormal);
			panelB_33.setLayout(new BorderLayout(0, 0));
			panelB_33.add(getPanelValor_B33(), BorderLayout.CENTER);
			panelB_33.add(getPanelCandidatos_B33(), BorderLayout.NORTH);
		}
		return panelB_33;
	}
	private JPanel getPanelC_11() {
		if (panelC_11 == null) {
			panelC_11 = new JPanel();
			panelC_11.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e, select);
				}
			});
			panelC_11.setBorder(bordeNormal);
			panelC_11.setLayout(new BorderLayout(0, 0));
			panelC_11.add(getPanelValor_C11(), BorderLayout.CENTER);
			panelC_11.add(getPanelCandidatos_C11(), BorderLayout.NORTH);
		}
		return panelC_11;
	}
	private JPanel getPanelC_12() {
		if (panelC_12 == null) {
			panelC_12 = new JPanel();
			panelC_12.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e, select);
				}
			});
			panelC_12.setBorder(bordeNormal);
			panelC_12.setLayout(new BorderLayout(0, 0));
			panelC_12.add(getPanelValor_C12(), BorderLayout.CENTER);
			panelC_12.add(getPanelCandidatos_C12(), BorderLayout.NORTH);
		}
		return panelC_12;
	}
	private JPanel getPanelC_13() {
		if (panelC_13 == null) {
			panelC_13 = new JPanel();
			panelC_13.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e, select);
				}
			});
			panelC_13.setBorder(bordeNormal);
			panelC_13.setLayout(new BorderLayout(0, 0));
			panelC_13.add(getPanelValor_C13(), BorderLayout.CENTER);
			panelC_13.add(getPanelCandidatos_C13(), BorderLayout.NORTH);
		}
		return panelC_13;
	}
	private JPanel getPanelC_21() {
		if (panelC_21 == null) {
			panelC_21 = new JPanel();
			panelC_21.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e, select);
				}
			});
			panelC_21.setBorder(bordeNormal);
			panelC_21.setLayout(new BorderLayout(0, 0));
			panelC_21.add(getPanelValor_C21(), BorderLayout.CENTER);
			panelC_21.add(getPanelCandidatos_C21(), BorderLayout.NORTH);
		}
		return panelC_21;
	}
	private JPanel getPanelC_22() {
		if (panelC_22 == null) {
			panelC_22 = new JPanel();
			panelC_22.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e, select);
				}
			});
			panelC_22.setBorder(bordeNormal);
			panelC_22.setLayout(new BorderLayout(0, 0));
			panelC_22.add(getPanelValor_C22(), BorderLayout.CENTER);
			panelC_22.add(getPanelCandidatos_C22(), BorderLayout.NORTH);
		}
		return panelC_22;
	}
	private JPanel getPanelC_23() {
		if (panelC_23 == null) {
			panelC_23 = new JPanel();
			panelC_23.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e, select);
				}
			});
			panelC_23.setBorder(bordeNormal);
			panelC_23.setLayout(new BorderLayout(0, 0));
			panelC_23.add(getPanelValor_C23(), BorderLayout.CENTER);
			panelC_23.add(getPanelCandidatos_C23(), BorderLayout.NORTH);
		}
		return panelC_23;
	}
	private JPanel getPanelC_31() {
		if (panelC_31 == null) {
			panelC_31 = new JPanel();
			panelC_31.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e, select);
				}
			});
			panelC_31.setBorder(bordeNormal);
			panelC_31.setLayout(new BorderLayout(0, 0));
			panelC_31.add(getPanelValor_C31(), BorderLayout.CENTER);
			panelC_31.add(getPanelCandidatos_C31(), BorderLayout.NORTH);
		}
		return panelC_31;
	}
	private JPanel getPanelC_32() {
		if (panelC_32 == null) {
			panelC_32 = new JPanel();
			panelC_32.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e, select);
				}
			});
			panelC_32.setBorder(bordeNormal);
			panelC_32.setLayout(new BorderLayout(0, 0));
			panelC_32.add(getPanelValor_C32(), BorderLayout.CENTER);
			panelC_32.add(getPanelCandidatos_C32(), BorderLayout.NORTH);
		}
		return panelC_32;
	}
	private JPanel getPanelC_33() {
		if (panelC_33 == null) {
			panelC_33 = new JPanel();
			panelC_33.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e, select);
				}
			});
			panelC_33.setBorder(bordeNormal);
			panelC_33.setLayout(new BorderLayout(0, 0));
			panelC_33.add(getPanelValor_C33(), BorderLayout.CENTER);
			panelC_33.add(getPanelCandidatos_C33(), BorderLayout.NORTH);
		}
		return panelC_33;
	}
	private JPanel getPanelD_11() {
		if (panelD_11 == null) {
			panelD_11 = new JPanel();
			panelD_11.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e, select);
				}
			});
			panelD_11.setBorder(bordeNormal);
			panelD_11.setLayout(new BorderLayout(0, 0));
			panelD_11.add(getPanelValor_D11(), BorderLayout.CENTER);
			panelD_11.add(getPanelCandidatos_D11(), BorderLayout.NORTH);
		}
		return panelD_11;
	}
	private JPanel getPanelD_12() {
		if (panelD_12 == null) {
			panelD_12 = new JPanel();
			panelD_12.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e, select);
				}
			});
			panelD_12.setBorder(bordeNormal);
			panelD_12.setLayout(new BorderLayout(0, 0));
			panelD_12.add(getPanelValor_D12(), BorderLayout.CENTER);
			panelD_12.add(getPanelCandidatos_D12(), BorderLayout.NORTH);
		}
		return panelD_12;
	}
	private JPanel getPanelD_13() {
		if (panelD_13 == null) {
			panelD_13 = new JPanel();
			panelD_13.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e, select);
				}
			});
			panelD_13.setBorder(bordeNormal);
			panelD_13.setLayout(new BorderLayout(0, 0));
			panelD_13.add(getPanelValor_D13(), BorderLayout.CENTER);
			panelD_13.add(getPanelCandidatos_D13(), BorderLayout.NORTH);
		}
		return panelD_13;
	}
	private JPanel getPanelD_21() {
		if (panelD_21 == null) {
			panelD_21 = new JPanel();
			panelD_21.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e, select);
				}
			});
			panelD_21.setBorder(bordeNormal);
			panelD_21.setLayout(new BorderLayout(0, 0));
			panelD_21.add(getPanelValor_D21(), BorderLayout.CENTER);
			panelD_21.add(getPanelCandidatos_D21(), BorderLayout.NORTH);
		}
		return panelD_21;
	}
	private JPanel getPanelD_22() {
		if (panelD_22 == null) {
			panelD_22 = new JPanel();
			panelD_22.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e, select);
				}
			});
			panelD_22.setBorder(bordeNormal);
			panelD_22.setLayout(new BorderLayout(0, 0));
			panelD_22.add(getPanelValor_D22(), BorderLayout.CENTER);
			panelD_22.add(getPanelCandidatos_D22(), BorderLayout.NORTH);
		}
		return panelD_22;
	}
	private JPanel getPanelD_23() {
		if (panelD_23 == null) {
			panelD_23 = new JPanel();
			panelD_23.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e, select);
				}
			});
			panelD_23.setBorder(bordeNormal);
			panelD_23.setLayout(new BorderLayout(0, 0));
			panelD_23.add(getPanelValor_D23(), BorderLayout.CENTER);
			panelD_23.add(getPanelCandidatos_D23(), BorderLayout.NORTH);
		}
		return panelD_23;
	}
	private JPanel getPanelD_31() {
		if (panelD_31 == null) {
			panelD_31 = new JPanel();
			panelD_31.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e, select);
				}
			});
			panelD_31.setBorder(bordeNormal);
			panelD_31.setLayout(new BorderLayout(0, 0));
			panelD_31.add(getPanelValor_D31(), BorderLayout.CENTER);
			panelD_31.add(getPanelCandidatos_D31(), BorderLayout.NORTH);
		}
		return panelD_31;
	}
	private JPanel getPanelD_32() {
		if (panelD_32 == null) {
			panelD_32 = new JPanel();
			panelD_32.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e, select);
				}
			});
			panelD_32.setBorder(bordeNormal);
			panelD_32.setLayout(new BorderLayout(0, 0));
			panelD_32.add(getPanelValor_D32(), BorderLayout.CENTER);
			panelD_32.add(getPanelCandidatos_D32(), BorderLayout.NORTH);
		}
		return panelD_32;
	}
	private JPanel getPanelD_33() {
		if (panelD_33 == null) {
			panelD_33 = new JPanel();
			panelD_33.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e, select);
				}
			});
			panelD_33.setBorder(bordeNormal);
			panelD_33.setLayout(new BorderLayout(0, 0));
			panelD_33.add(getPanelValor_D33(), BorderLayout.CENTER);
			panelD_33.add(getPanelCandidatos_D33(), BorderLayout.NORTH);
		}
		return panelD_33;
	}
	private JPanel getPanelE_11() {
		if (panelE_11 == null) {
			panelE_11 = new JPanel();
			panelE_11.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e, select);
				}
			});
			panelE_11.setBorder(bordeNormal);
			panelE_11.setLayout(new BorderLayout(0, 0));
			panelE_11.add(getPanelValor_E11(), BorderLayout.CENTER);
			panelE_11.add(getPanelCandidatos_E11(), BorderLayout.NORTH);
		}
		return panelE_11;
	}
	private JPanel getPanelE_12() {
		if (panelE_12 == null) {
			panelE_12 = new JPanel();
			panelE_12.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e, select);
				}
			});
			panelE_12.setBorder(bordeNormal);
			panelE_12.setLayout(new BorderLayout(0, 0));
			panelE_12.add(getPanelValor_E12(), BorderLayout.CENTER);
			panelE_12.add(getPanelCandidatos_E12(), BorderLayout.NORTH);
		}
		return panelE_12;
	}
	private JPanel getPanelE_13() {
		if (panelE_13 == null) {
			panelE_13 = new JPanel();
			panelE_13.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e, select);
				}
			});
			panelE_13.setBorder(bordeNormal);
			panelE_13.setLayout(new BorderLayout(0, 0));
			panelE_13.add(getPanelValor_E13(), BorderLayout.CENTER);
			panelE_13.add(getPanelCandidatos_E13(), BorderLayout.NORTH);
		}
		return panelE_13;
	}
	private JPanel getPanelE_21() {
		if (panelE_21 == null) {
			panelE_21 = new JPanel();
			panelE_21.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e, select);
				}
			});
			panelE_21.setBorder(bordeNormal);
			panelE_21.setLayout(new BorderLayout(0, 0));
			panelE_21.add(getPanelValor_E21(), BorderLayout.CENTER);
			panelE_21.add(getPanelCandidatos_E21(), BorderLayout.NORTH);
		}
		return panelE_21;
	}
	private JPanel getPanelE_22() {
		if (panelE_22 == null) {
			panelE_22 = new JPanel();
			panelE_22.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e, select);
				}
			});
			panelE_22.setBorder(bordeNormal);
			panelE_22.setLayout(new BorderLayout(0, 0));
			panelE_22.add(getPanelValor_E22(), BorderLayout.CENTER);
			panelE_22.add(getPanelCandidatos_E22(), BorderLayout.NORTH);
		}
		return panelE_22;
	}
	private JPanel getPanelE_23() {
		if (panelE_23 == null) {
			panelE_23 = new JPanel();
			panelE_23.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e, select);
				}
			});
			panelE_23.setBorder(bordeNormal);
			panelE_23.setLayout(new BorderLayout(0, 0));
			panelE_23.add(getPanelValor_E23(), BorderLayout.CENTER);
			panelE_23.add(getPanelCandidatos_E23(), BorderLayout.NORTH);
		}
		return panelE_23;
	}
	private JPanel getPanelE_31() {
		if (panelE_31 == null) {
			panelE_31 = new JPanel();
			panelE_31.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e, select);
				}
			});
			panelE_31.setBorder(bordeNormal);
			panelE_31.setLayout(new BorderLayout(0, 0));
			panelE_31.add(getPanelValor_E31(), BorderLayout.CENTER);
			panelE_31.add(getPanelCandidatos_E31(), BorderLayout.NORTH);
		}
		return panelE_31;
	}
	private JPanel getPanelE_32() {
		if (panelE_32 == null) {
			panelE_32 = new JPanel();
			panelE_32.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e, select);
				}
			});
			panelE_32.setBorder(bordeNormal);
			panelE_32.setLayout(new BorderLayout(0, 0));
			panelE_32.add(getPanelValor_E32());
			panelE_32.add(getPanelCandidatos_E32(), BorderLayout.NORTH);
		}
		return panelE_32;
	}
	private JPanel getPanelE_33() {
		if (panelE_33 == null) {
			panelE_33 = new JPanel();
			panelE_33.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e, select);
				}
			});
			panelE_33.setBorder(bordeNormal);
			panelE_33.setLayout(new BorderLayout(0, 0));
			panelE_33.add(getPanelValor_E33(), BorderLayout.CENTER);
			panelE_33.add(getPanelCandidatos_E33(), BorderLayout.NORTH);
		}
		return panelE_33;
	}
	private JPanel getPanelF_11() {
		if (panelF_11 == null) {
			panelF_11 = new JPanel();
			panelF_11.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e, select);
				}
			});
			panelF_11.setBorder(bordeNormal);
			panelF_11.setLayout(new BorderLayout(0, 0));
			panelF_11.add(getPanelValor_E11_1_1(), BorderLayout.CENTER);
			panelF_11.add(getPanelCandidatos_E11_1_1(), BorderLayout.NORTH);
		}
		return panelF_11;
	}
	private JPanel getPanelF_12() {
		if (panelF_12 == null) {
			panelF_12 = new JPanel();
			panelF_12.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e, select);
				}
			});
			panelF_12.setBorder(bordeNormal);
			panelF_12.setLayout(new BorderLayout(0, 0));
			panelF_12.add(getPanelValor_F12(), BorderLayout.CENTER);
			panelF_12.add(getPanelCandidatos_F12(), BorderLayout.NORTH);
		}
		return panelF_12;
	}
	private JPanel getPanelF_13() {
		if (panelF_13 == null) {
			panelF_13 = new JPanel();
			panelF_13.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e, select);
				}
			});
			panelF_13.setBorder(bordeNormal);
			panelF_13.setLayout(new BorderLayout(0, 0));
			panelF_13.add(getPanelValor_F13(), BorderLayout.CENTER);
			panelF_13.add(getPanelCandidatos_F13(), BorderLayout.NORTH);
		}
		return panelF_13;
	}
	private JPanel getPanelF_21() {
		if (panelF_21 == null) {
			panelF_21 = new JPanel();
			panelF_21.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e, select);
				}
			});
			panelF_21.setBorder(bordeNormal);
			panelF_21.setLayout(new BorderLayout(0, 0));
			panelF_21.add(getPanelValor_F21(), BorderLayout.CENTER);
			panelF_21.add(getPanelCandidatos_F21(), BorderLayout.NORTH);
		}
		return panelF_21;
	}
	private JPanel getPanelF_22() {
		if (panelF_22 == null) {
			panelF_22 = new JPanel();
			panelF_22.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e, select);
				}
			});
			panelF_22.setBorder(bordeNormal);
			panelF_22.setLayout(new BorderLayout(0, 0));
			panelF_22.add(getPanelValor_F22(), BorderLayout.CENTER);
			panelF_22.add(getPanelCandidatos_F22(), BorderLayout.NORTH);
		}
		return panelF_22;
	}
	private JPanel getPanelF_23() {
		if (panelF_23 == null) {
			panelF_23 = new JPanel();
			panelF_23.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e, select);
				}
			});
			panelF_23.setBorder(bordeNormal);
			panelF_23.setLayout(new BorderLayout(0, 0));
			panelF_23.add(getPanelValor_F23(), BorderLayout.CENTER);
			panelF_23.add(getPanelCandidatos_F23(), BorderLayout.NORTH);
		}
		return panelF_23;
	}
	private JPanel getPanelF_31() {
		if (panelF_31 == null) {
			panelF_31 = new JPanel();
			panelF_31.setBorder(bordeNormal);
			panelF_31.setLayout(new BorderLayout(0, 0));
			panelF_31.add(getPanelValor_F31(), BorderLayout.CENTER);
			panelF_31.add(getPanelCandidatos_F31(), BorderLayout.NORTH);
		}
		return panelF_31;
	}
	private JPanel getPanelF_32() {
		if (panelF_32 == null) {
			panelF_32 = new JPanel();
			panelF_32.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e, select);
				}
			});
			panelF_32.setBorder(bordeNormal);
			panelF_32.setLayout(new BorderLayout(0, 0));
			panelF_32.add(getPanelValor_F32(), BorderLayout.CENTER);
			panelF_32.add(getPanelCandidatos_F32(), BorderLayout.NORTH);
		}
		return panelF_32;
	}
	private JPanel getPanelF_33() {
		if (panelF_33 == null) {
			panelF_33 = new JPanel();
			panelF_33.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e, select);
				}
			});
			panelF_33.setBorder(bordeNormal);
			panelF_33.setLayout(new BorderLayout(0, 0));
			panelF_33.add(getPanelValor_F33(), BorderLayout.CENTER);
			panelF_33.add(getPanelCandidatos_F33(), BorderLayout.NORTH);
		}
		return panelF_33;
	}
	private JPanel getPanelG_11() {
		if (panelG_11 == null) {
			panelG_11 = new JPanel();
			panelG_11.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e, select);
				}
			});
			panelG_11.setBorder(bordeNormal);
			panelG_11.setLayout(new BorderLayout(0, 0));
			panelG_11.add(getPanelValor_G11(), BorderLayout.CENTER);
			panelG_11.add(getPanelCandidatos_G11(), BorderLayout.NORTH);
		}
		return panelG_11;
	}
	private JPanel getPanelG_12() {
		if (panelG_12 == null) {
			panelG_12 = new JPanel();
			panelG_12.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e, select);
				}
			});
			panelG_12.setBorder(bordeNormal);
			panelG_12.setLayout(new BorderLayout(0, 0));
			panelG_12.add(getPanelValor_G12(), BorderLayout.CENTER);
			panelG_12.add(getPanelCandidatos_G12(), BorderLayout.NORTH);
		}
		return panelG_12;
	}
	private JPanel getPanelG_13() {
		if (panelG_13 == null) {
			panelG_13 = new JPanel();
			panelG_13.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e, select);
				}
			});
			panelG_13.setBorder(bordeNormal);
			panelG_13.setLayout(new BorderLayout(0, 0));
			panelG_13.add(getPanelValor_G13(), BorderLayout.CENTER);
			panelG_13.add(getPanelCandidatos_G13(), BorderLayout.NORTH);
		}
		return panelG_13;
	}
	private JPanel getPanelG_21() {
		if (panelG_21 == null) {
			panelG_21 = new JPanel();
			panelG_21.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e, select);
				}
			});
			panelG_21.setBorder(bordeNormal);
			panelG_21.setLayout(new BorderLayout(0, 0));
			panelG_21.add(getPanelValor_G21(), BorderLayout.CENTER);
			panelG_21.add(getPanelCandidatos_G21(), BorderLayout.NORTH);
		}
		return panelG_21;
	}
	private JPanel getPanelG_22() {
		if (panelG_22 == null) {
			panelG_22 = new JPanel();
			panelG_22.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e, select);
				}
			});
			panelG_22.setBorder(bordeNormal);
			panelG_22.setLayout(new BorderLayout(0, 0));
			panelG_22.add(getPanelValor_G22(), BorderLayout.CENTER);
			panelG_22.add(getPanelCandidatos_G22(), BorderLayout.NORTH);
		}
		return panelG_22;
	}
	private JPanel getPanelG_23() {
		if (panelG_23 == null) {
			panelG_23 = new JPanel();
			panelG_23.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e, select);
				}
			});
			panelG_23.setBorder(bordeNormal);
			panelG_23.setLayout(new BorderLayout(0, 0));
			panelG_23.add(getPanelValor_G23(), BorderLayout.CENTER);
			panelG_23.add(getPanelCandidatos_G23(), BorderLayout.NORTH);
		}
		return panelG_23;
	}
	private JPanel getPanelG_31() {
		if (panelG_31 == null) {
			panelG_31 = new JPanel();
			panelG_31.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e, select);
				}
			});
			panelG_31.setBorder(bordeNormal);
			panelG_31.setLayout(new BorderLayout(0, 0));
			panelG_31.add(getPanelValor_G31(), BorderLayout.CENTER);
			panelG_31.add(getPanelCandidatos_G31(), BorderLayout.NORTH);
		}
		return panelG_31;
	}
	private JPanel getPanelG_32() {
		if (panelG_32 == null) {
			panelG_32 = new JPanel();
			panelG_32.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e, select);
				}
			});
			panelG_32.setBorder(bordeNormal);
			panelG_32.setLayout(new BorderLayout(0, 0));
			panelG_32.add(getPanelValor_G32(), BorderLayout.CENTER);
			panelG_32.add(getPanelCandidatos_G32(), BorderLayout.NORTH);
		}
		return panelG_32;
	}
	private JPanel getPanelG_33() {
		if (panelG_33 == null) {
			panelG_33 = new JPanel();
			panelG_33.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e, select);
				}
			});
			panelG_33.setBorder(bordeNormal);
			panelG_33.setLayout(new BorderLayout(0, 0));
			panelG_33.add(getPanelValor_G33(), BorderLayout.CENTER);
			panelG_33.add(getPanelCandidatos_G33(), BorderLayout.NORTH);
		}
		return panelG_33;
	}
	private JPanel getPanelH_11() {
		if (panelH_11 == null) {
			panelH_11 = new JPanel();
			panelH_11.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e, select);
				}
			});
			panelH_11.setBorder(bordeNormal);
			panelH_11.setLayout(new BorderLayout(0, 0));
			panelH_11.add(getPanelValor_H11(), BorderLayout.CENTER);
			panelH_11.add(getPanelCandidatos_H11(), BorderLayout.NORTH);
		}
		return panelH_11;
	}
	private JPanel getPanelH_12() {
		if (panelH_12 == null) {
			panelH_12 = new JPanel();
			panelH_12.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e, select);
				}
			});
			panelH_12.setBorder(bordeNormal);
			panelH_12.setLayout(new BorderLayout(0, 0));
			panelH_12.add(getPanelValor_H12(), BorderLayout.CENTER);
			panelH_12.add(getPanelCandidatos_H12(), BorderLayout.NORTH);
		}
		return panelH_12;
	}
	private JPanel getPanelH_13() {
		if (panelH_13 == null) {
			panelH_13 = new JPanel();
			panelH_13.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e, select);
				}
			});
			panelH_13.setBorder(bordeNormal);
			panelH_13.setLayout(new BorderLayout(0, 0));
			panelH_13.add(getPanelValor_H13(), BorderLayout.CENTER);
			panelH_13.add(getPanelCandidatos_H13(), BorderLayout.NORTH);
		}
		return panelH_13;
	}
	private JPanel getPanelH_21() {
		if (panelH_21 == null) {
			panelH_21 = new JPanel();
			panelH_21.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e, select);
				}
			});
			panelH_21.setBorder(bordeNormal);
			panelH_21.setLayout(new BorderLayout(0, 0));
			panelH_21.add(getPanelValor_H21(), BorderLayout.CENTER);
			panelH_21.add(getPanelCandidatos_H21(), BorderLayout.NORTH);
		}
		return panelH_21;
	}
	private JPanel getPanelH_22() {
		if (panelH_22 == null) {
			panelH_22 = new JPanel();
			panelH_22.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e, select);
				}
			});
			panelH_22.setBorder(bordeNormal);
			panelH_22.setLayout(new BorderLayout(0, 0));
			panelH_22.add(getPanelValor_H22(), BorderLayout.CENTER);
			panelH_22.add(getPanelCandidatos_H22(), BorderLayout.NORTH);
		}
		return panelH_22;
	}
	private JPanel getPanelH_23() {
		if (panelH_23 == null) {
			panelH_23 = new JPanel();
			panelH_23.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e, select);
				}
			});
			panelH_23.setBorder(bordeNormal);
			panelH_23.setLayout(new BorderLayout(0, 0));
			panelH_23.add(getPanelValor_H23(), BorderLayout.CENTER);
			panelH_23.add(getPanelCandidatos_H23(), BorderLayout.NORTH);
		}
		return panelH_23;
	}
	private JPanel getPanelH_31() {
		if (panelH_31 == null) {
			panelH_31 = new JPanel();
			panelH_31.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e, select);
				}
			});
			panelH_31.setBorder(bordeNormal);
			panelH_31.setLayout(new BorderLayout(0, 0));
			panelH_31.add(getPanelValor_H31(), BorderLayout.CENTER);
			panelH_31.add(getPanelCandidatos_H31(), BorderLayout.NORTH);
		}
		return panelH_31;
	}
	private JPanel getPanelH_32() {
		if (panelH_32 == null) {
			panelH_32 = new JPanel();
			panelH_32.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e, select);
				}
			});
			panelH_32.setBorder(bordeNormal);
			panelH_32.setLayout(new BorderLayout(0, 0));
			panelH_32.add(getPanelValor_H32(), BorderLayout.CENTER);
			panelH_32.add(getPanelCandidatos_H32(), BorderLayout.NORTH);
		}
		return panelH_32;
	}
	private JPanel getPanelH_33() {
		if (panelH_33 == null) {
			panelH_33 = new JPanel();
			panelH_33.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e, select);
				}
			});
			panelH_33.setBorder(bordeNormal);
			panelH_33.setLayout(new BorderLayout(0, 0));
			panelH_33.add(getPanelValor_H33(), BorderLayout.CENTER);
			panelH_33.add(getPanelCandidatos_H33(), BorderLayout.NORTH);
		}
		return panelH_33;
	}
	private JPanel getPanelI_11() {
		if (panelI_11 == null) {
			panelI_11 = new JPanel();
			panelI_11.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e, select);
				}
			});
			panelI_11.setBorder(bordeNormal);
			panelI_11.setLayout(new BorderLayout(0, 0));
			panelI_11.add(getPanelValor_I11(), BorderLayout.CENTER);
			panelI_11.add(getPanelCandidatos_I11(), BorderLayout.NORTH);
		}
		return panelI_11;
	}
	private JPanel getPanelI_12() {
		if (panelI_12 == null) {
			panelI_12 = new JPanel();
			panelI_12.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e, select);
				}
			});
			panelI_12.setBorder(bordeNormal);
			panelI_12.setLayout(new BorderLayout(0, 0));
			panelI_12.add(getPanelValor_I12(), BorderLayout.CENTER);
			panelI_12.add(getPanelCandidatos_I12(), BorderLayout.NORTH);
		}
		return panelI_12;
	}
	private JPanel getPanelI_13() {
		if (panelI_13 == null) {
			panelI_13 = new JPanel();
			panelI_13.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e, select);
				}
			});
			panelI_13.setBorder(bordeNormal);
			panelI_13.setLayout(new BorderLayout(0, 0));
			panelI_13.add(getPanelValor_I13(), BorderLayout.CENTER);
			panelI_13.add(getPanelCandidatos_I13(), BorderLayout.NORTH);
		}
		return panelI_13;
	}
	private JPanel getPanelI_21() {
		if (panelI_21 == null) {
			panelI_21 = new JPanel();
			panelI_21.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e, select);
				}
			});
			panelI_21.setBorder(bordeNormal);
			panelI_21.setLayout(new BorderLayout(0, 0));
			panelI_21.add(getPanelValor_I21(), BorderLayout.CENTER);
			panelI_21.add(getPanelCandidatos_I21(), BorderLayout.NORTH);
		}
		return panelI_21;
	}
	private JPanel getPanelI_22() {
		if (panelI_22 == null) {
			panelI_22 = new JPanel();
			panelI_22.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e, select);
				}
			});
			panelI_22.setBorder(bordeNormal);
			panelI_22.setLayout(new BorderLayout(0, 0));
			panelI_22.add(getPanelValor_I22(), BorderLayout.CENTER);
			panelI_22.add(getPanelCandidatos_I22(), BorderLayout.NORTH);
		}
		return panelI_22;
	}
	private JPanel getPanelI_23() {
		if (panelI_23 == null) {
			panelI_23 = new JPanel();
			panelI_23.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e, select);
				}
			});
			panelI_23.setBorder(bordeNormal);
			panelI_23.setLayout(new BorderLayout(0, 0));
			panelI_23.add(getPanelValor_I23(), BorderLayout.CENTER);
			panelI_23.add(getPanelCandidatos_I23(), BorderLayout.NORTH);
		}
		return panelI_23;
	}
	private JPanel getPanelI_31() {
		if (panelI_31 == null) {
			panelI_31 = new JPanel();
			panelI_31.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e, select);
				}
			});
			panelI_31.setBorder(bordeNormal);
			panelI_31.setLayout(new BorderLayout(0, 0));
			panelI_31.add(getPanelValor_I31(), BorderLayout.CENTER);
			panelI_31.add(getPanelCandidatos_I31(), BorderLayout.NORTH);
		}
		return panelI_31;
	}
	private JPanel getPanelI_32() {
		if (panelI_32 == null) {
			panelI_32 = new JPanel();
			panelI_32.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e, select);
				}
			});
			panelI_32.setBorder(bordeNormal);
			panelI_32.setLayout(new BorderLayout(0, 0));
			panelI_32.add(getPanelValor_I32(), BorderLayout.CENTER);
			panelI_32.add(getPanelCandidatos_I32(), BorderLayout.NORTH);
		}
		return panelI_32;
	}
	private JPanel getPanelI_33() {
		if (panelI_33 == null) {
			panelI_33 = new JPanel();
			panelI_33.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e, select);
				}
			});
			panelI_33.setBorder(bordeNormal);
			panelI_33.setLayout(new BorderLayout(0, 0));
			panelI_33.add(getPanelValor_I33(), BorderLayout.CENTER);
			panelI_33.add(getPanelCandidatos_I33(), BorderLayout.NORTH);
		}
		return panelI_33;
	}
	
	private JPanel getPanelValor_A12() {
		if (panelValor_A12 == null) {
			panelValor_A12 = new JPanel();
			panelValor_A12.add(getLblValor_A12());
		}
		return panelValor_A12;
	}
	private JPanel getPanelCandidatos_A12() {
		if (panelCandidatos_A12 == null) {
			panelCandidatos_A12 = new JPanel();
			panelCandidatos_A12.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panelCandidatos_A12.add(getLblCandidatos_A12());
		}
		return panelCandidatos_A12;
	}
	private JLabel getLblCandidatos_A12() {
		if (lblCandidatos_A12 == null) {
			lblCandidatos_A12 = new JLabel(" ");
			lblCandidatos_A12.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return lblCandidatos_A12;
	}
	private JLabel getLblValor_A12() {
		if (lblValor_A12 == null) {
			lblValor_A12 = new JLabel(" ");
			lblValor_A12.setVerticalAlignment(SwingConstants.BOTTOM);
			lblValor_A12.setHorizontalAlignment(SwingConstants.LEFT);
			lblValor_A12.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor_A12;
	}
	private JPanel getPanelValor_A11() {
		if (panelValor_A11 == null) {
			panelValor_A11 = new JPanel();
			panelValor_A11.add(getLblValor_A11());
		}
		return panelValor_A11;
	}
	private JLabel getLblValor_A11() {
		if (lblValor_A11 == null) {
			lblValor_A11 = new JLabel("");
			lblValor_A11.setVerticalAlignment(SwingConstants.BOTTOM);
			lblValor_A11.setHorizontalAlignment(SwingConstants.LEFT);
			lblValor_A11.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor_A11;
	}
	private JPanel getPanelCandidatos_A11() {
		if (panelCandidatos_A11 == null) {
			panelCandidatos_A11 = new JPanel();
			panelCandidatos_A11.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panelCandidatos_A11.add(getLblCandidatos_A11());
		}
		return panelCandidatos_A11;
	}
	private JLabel getLblCandidatos_A11() {
		if (lblCandidatos_A11 == null) {
			lblCandidatos_A11 = new JLabel(" ");
			lblCandidatos_A11.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return lblCandidatos_A11;
	}
	private JPanel getPanelValor_A13() {
		if (panelValor_A13 == null) {
			panelValor_A13 = new JPanel();
			panelValor_A13.add(getLblValor_A13());
		}
		return panelValor_A13;
	}
	private JLabel getLblValor_A13() {
		if (lblValor_A13 == null) {
			lblValor_A13 = new JLabel(" ");
			lblValor_A13.setVerticalAlignment(SwingConstants.BOTTOM);
			lblValor_A13.setHorizontalAlignment(SwingConstants.LEFT);
			lblValor_A13.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor_A13;
	}
	private JPanel getPanelCandidatos_A13() {
		if (panelCandidatos_A13 == null) {
			panelCandidatos_A13 = new JPanel();
			panelCandidatos_A13.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panelCandidatos_A13.add(getLblCandidatos_A13());
		}
		return panelCandidatos_A13;
	}
	private JLabel getLblCandidatos_A13() {
		if (lblCandidatos_A13 == null) {
			lblCandidatos_A13 = new JLabel(" ");
			lblCandidatos_A13.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return lblCandidatos_A13;
	}
	private JPanel getPanelValor_A21() {
		if (panelValor_A21 == null) {
			panelValor_A21 = new JPanel();
			panelValor_A21.add(getLblValor_A21());
		}
		return panelValor_A21;
	}
	private JLabel getLblValor_A21() {
		if (lblValor_A21 == null) {
			lblValor_A21 = new JLabel(" ");
			lblValor_A21.setVerticalAlignment(SwingConstants.BOTTOM);
			lblValor_A21.setHorizontalAlignment(SwingConstants.LEFT);
			lblValor_A21.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor_A21;
	}
	private JPanel getPanelCandidatos_A21() {
		if (panelCandidatos_A21 == null) {
			panelCandidatos_A21 = new JPanel();
			panelCandidatos_A21.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panelCandidatos_A21.add(getLblCandidatos_A21());
		}
		return panelCandidatos_A21;
	}
	private JLabel getLblCandidatos_A21() {
		if (lblCandidatos_A21 == null) {
			lblCandidatos_A21 = new JLabel(" ");
			lblCandidatos_A21.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return lblCandidatos_A21;
	}
	private JPanel getPanelValor_A22() {
		if (panelValor_A22 == null) {
			panelValor_A22 = new JPanel();
			panelValor_A22.add(getLblValor_A22());
		}
		return panelValor_A22;
	}
	private JLabel getLblValor_A22() {
		if (lblValor_A22 == null) {
			lblValor_A22 = new JLabel(" ");
			lblValor_A22.setVerticalAlignment(SwingConstants.BOTTOM);
			lblValor_A22.setHorizontalAlignment(SwingConstants.LEFT);
			lblValor_A22.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor_A22;
	}
	private JPanel getPanelCandidatos_A22() {
		if (panelCandidatos_A22 == null) {
			panelCandidatos_A22 = new JPanel();
			panelCandidatos_A22.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panelCandidatos_A22.add(getLblCandidatos_A22());
		}
		return panelCandidatos_A22;
	}
	private JLabel getLblCandidatos_A22() {
		if (lblCandidatos_A22 == null) {
			lblCandidatos_A22 = new JLabel(" ");
			lblCandidatos_A22.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return lblCandidatos_A22;
	}
	private JPanel getPanelValor_A23() {
		if (panelValor_A23 == null) {
			panelValor_A23 = new JPanel();
			panelValor_A23.add(getLblValor_A23());
		}
		return panelValor_A23;
	}
	private JLabel getLblValor_A23() {
		if (lblValor_A23 == null) {
			lblValor_A23 = new JLabel(" ");
			lblValor_A23.setVerticalAlignment(SwingConstants.BOTTOM);
			lblValor_A23.setHorizontalAlignment(SwingConstants.LEFT);
			lblValor_A23.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor_A23;
	}
	private JPanel getPanelCandidatos_A23() {
		if (panelCandidatos_A23 == null) {
			panelCandidatos_A23 = new JPanel();
			panelCandidatos_A23.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panelCandidatos_A23.add(getLblCandidatos_A23());
		}
		return panelCandidatos_A23;
	}
	private JLabel getLblCandidatos_A23() {
		if (lblCandidatos_A23 == null) {
			lblCandidatos_A23 = new JLabel(" ");
			lblCandidatos_A23.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return lblCandidatos_A23;
	}
	private JPanel getPanelValor_A31() {
		if (panelValor_A31 == null) {
			panelValor_A31 = new JPanel();
			panelValor_A31.add(getLblValor_A31());
		}
		return panelValor_A31;
	}
	private JLabel getLblValor_A31() {
		if (lblValor_A31 == null) {
			lblValor_A31 = new JLabel(" ");
			lblValor_A31.setVerticalAlignment(SwingConstants.BOTTOM);
			lblValor_A31.setHorizontalAlignment(SwingConstants.LEFT);
			lblValor_A31.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor_A31;
	}
	private JPanel getPanelCandidatos_A31() {
		if (panelCandidatos_A31 == null) {
			panelCandidatos_A31 = new JPanel();
			panelCandidatos_A31.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panelCandidatos_A31.add(getLblCandidatos_A31());
		}
		return panelCandidatos_A31;
	}
	private JLabel getLblCandidatos_A31() {
		if (lblCandidatos_A31 == null) {
			lblCandidatos_A31 = new JLabel(" ");
			lblCandidatos_A31.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return lblCandidatos_A31;
	}
	private JPanel getPanelValor_A32() {
		if (panelValor_A32 == null) {
			panelValor_A32 = new JPanel();
			panelValor_A32.add(getLblValor_A32());
		}
		return panelValor_A32;
	}
	private JLabel getLblValor_A32() {
		if (lblValor_A32 == null) {
			lblValor_A32 = new JLabel(" ");
			lblValor_A32.setVerticalAlignment(SwingConstants.BOTTOM);
			lblValor_A32.setHorizontalAlignment(SwingConstants.LEFT);
			lblValor_A32.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor_A32;
	}
	private JPanel getPanelCandidatos_A32() {
		if (panelCandidatos_A32 == null) {
			panelCandidatos_A32 = new JPanel();
			panelCandidatos_A32.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panelCandidatos_A32.add(getLblCandidatos_A32());
		}
		return panelCandidatos_A32;
	}
	private JLabel getLblCandidatos_A32() {
		if (lblCandidatos_A32 == null) {
			lblCandidatos_A32 = new JLabel(" ");
			lblCandidatos_A32.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return lblCandidatos_A32;
	}
	private JPanel getPanelValor_A33() {
		if (panelValor_A33 == null) {
			panelValor_A33 = new JPanel();
			panelValor_A33.add(getLblValor_A33());
		}
		return panelValor_A33;
	}
	private JLabel getLblValor_A33() {
		if (lblValor_A33 == null) {
			lblValor_A33 = new JLabel(" ");
			lblValor_A33.setVerticalAlignment(SwingConstants.BOTTOM);
			lblValor_A33.setHorizontalAlignment(SwingConstants.LEFT);
			lblValor_A33.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor_A33;
	}
	private JPanel getPanelCandidatos_A33() {
		if (panelCandidatos_A33 == null) {
			panelCandidatos_A33 = new JPanel();
			panelCandidatos_A33.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panelCandidatos_A33.add(getLblCandidatos_A33());
		}
		return panelCandidatos_A33;
	}
	private JLabel getLblCandidatos_A33() {
		if (lblCandidatos_A33 == null) {
			lblCandidatos_A33 = new JLabel(" ");
			lblCandidatos_A33.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return lblCandidatos_A33;
	}
	private JPanel getPanelValor_B11() {
		if (panelValor_B11 == null) {
			panelValor_B11 = new JPanel();
			panelValor_B11.add(getLblValor_B11());
		}
		return panelValor_B11;
	}
	private JLabel getLblValor_B11() {
		if (lblValor_B11 == null) {
			lblValor_B11 = new JLabel(" ");
			lblValor_B11.setVerticalAlignment(SwingConstants.BOTTOM);
			lblValor_B11.setHorizontalAlignment(SwingConstants.LEFT);
			lblValor_B11.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor_B11;
	}
	private JPanel getPanelCandidatos_B11() {
		if (panelCandidatos_B11 == null) {
			panelCandidatos_B11 = new JPanel();
			panelCandidatos_B11.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panelCandidatos_B11.add(getLblCandidatos_B11());
		}
		return panelCandidatos_B11;
	}
	private JLabel getLblCandidatos_B11() {
		if (lblCandidatos_B11 == null) {
			lblCandidatos_B11 = new JLabel(" ");
			lblCandidatos_B11.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return lblCandidatos_B11;
	}
	private JPanel getPanelValor_B12() {
		if (panelValor_B12 == null) {
			panelValor_B12 = new JPanel();
			panelValor_B12.add(getLblValor_B12());
		}
		return panelValor_B12;
	}
	private JLabel getLblValor_B12() {
		if (lblValor_B12 == null) {
			lblValor_B12 = new JLabel(" ");
			lblValor_B12.setVerticalAlignment(SwingConstants.BOTTOM);
			lblValor_B12.setHorizontalAlignment(SwingConstants.LEFT);
			lblValor_B12.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor_B12;
	}
	private JPanel getPanelCandidatos_B12() {
		if (panelCandidatos_B12 == null) {
			panelCandidatos_B12 = new JPanel();
			panelCandidatos_B12.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panelCandidatos_B12.add(getLblCandidatos_B12());
		}
		return panelCandidatos_B12;
	}
	private JLabel getLblCandidatos_B12() {
		if (lblCandidatos_B12 == null) {
			lblCandidatos_B12 = new JLabel(" ");
			lblCandidatos_B12.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return lblCandidatos_B12;
	}
	private JPanel getPanelValor_B13() {
		if (panelValor_B13 == null) {
			panelValor_B13 = new JPanel();
			panelValor_B13.add(getLblValor_B13());
		}
		return panelValor_B13;
	}
	private JLabel getLblValor_B13() {
		if (lblValor_B13 == null) {
			lblValor_B13 = new JLabel(" ");
			lblValor_B13.setVerticalAlignment(SwingConstants.BOTTOM);
			lblValor_B13.setHorizontalAlignment(SwingConstants.LEFT);
			lblValor_B13.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor_B13;
	}
	private JPanel getPanelCandidatos_B13() {
		if (panelCandidatos_B13 == null) {
			panelCandidatos_B13 = new JPanel();
			panelCandidatos_B13.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panelCandidatos_B13.add(getLblCandidatos_B13());
		}
		return panelCandidatos_B13;
	}
	private JLabel getLblCandidatos_B13() {
		if (lblCandidatos_B13 == null) {
			lblCandidatos_B13 = new JLabel(" ");
			lblCandidatos_B13.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return lblCandidatos_B13;
	}
	private JPanel getPanelValor_B21() {
		if (panelValor_B21 == null) {
			panelValor_B21 = new JPanel();
			panelValor_B21.add(getLblValor_B21());
		}
		return panelValor_B21;
	}
	private JLabel getLblValor_B21() {
		if (lblValor_B21 == null) {
			lblValor_B21 = new JLabel(" ");
			lblValor_B21.setVerticalAlignment(SwingConstants.BOTTOM);
			lblValor_B21.setHorizontalAlignment(SwingConstants.LEFT);
			lblValor_B21.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor_B21;
	}
	private JPanel getPanelCandidatos_B21() {
		if (panelCandidatos_B21 == null) {
			panelCandidatos_B21 = new JPanel();
			panelCandidatos_B21.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panelCandidatos_B21.add(getLblCandidatos_B21());
		}
		return panelCandidatos_B21;
	}
	private JLabel getLblCandidatos_B21() {
		if (lblCandidatos_B21 == null) {
			lblCandidatos_B21 = new JLabel(" ");
			lblCandidatos_B21.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return lblCandidatos_B21;
	}
	private JPanel getPanelValor_B22() {
		if (panelValor_B22 == null) {
			panelValor_B22 = new JPanel();
			panelValor_B22.add(getLblValor_B22());
		}
		return panelValor_B22;
	}
	private JLabel getLblValor_B22() {
		if (lblValor_B22 == null) {
			lblValor_B22 = new JLabel(" ");
			lblValor_B22.setVerticalAlignment(SwingConstants.BOTTOM);
			lblValor_B22.setHorizontalAlignment(SwingConstants.LEFT);
			lblValor_B22.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor_B22;
	}
	private JPanel getPanelCandidatos_B22() {
		if (panelCandidatos_B22 == null) {
			panelCandidatos_B22 = new JPanel();
			panelCandidatos_B22.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panelCandidatos_B22.add(getLblCandidatos_B22());
		}
		return panelCandidatos_B22;
	}
	private JLabel getLblCandidatos_B22() {
		if (lblCandidatos_B22 == null) {
			lblCandidatos_B22 = new JLabel(" ");
			lblCandidatos_B22.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return lblCandidatos_B22;
	}
	private JPanel getPanelValor_B23() {
		if (panelValor_B23 == null) {
			panelValor_B23 = new JPanel();
			panelValor_B23.add(getLblValor_B23());
		}
		return panelValor_B23;
	}
	private JLabel getLblValor_B23() {
		if (lblValor_B23 == null) {
			lblValor_B23 = new JLabel(" ");
			lblValor_B23.setVerticalAlignment(SwingConstants.BOTTOM);
			lblValor_B23.setHorizontalAlignment(SwingConstants.LEFT);
			lblValor_B23.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor_B23;
	}
	private JPanel getPanelCandidatos_B23() {
		if (panelCandidatos_B23 == null) {
			panelCandidatos_B23 = new JPanel();
			panelCandidatos_B23.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panelCandidatos_B23.add(getLblCandidatos_B23());
		}
		return panelCandidatos_B23;
	}
	private JLabel getLblCandidatos_B23() {
		if (lblCandidatos_B23 == null) {
			lblCandidatos_B23 = new JLabel(" ");
			lblCandidatos_B23.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return lblCandidatos_B23;
	}
	private JPanel getPanelValor_B31() {
		if (panelValor_B31 == null) {
			panelValor_B31 = new JPanel();
			panelValor_B31.add(getLblValor_B31());
		}
		return panelValor_B31;
	}
	private JLabel getLblValor_B31() {
		if (lblValor_B31 == null) {
			lblValor_B31 = new JLabel(" ");
			lblValor_B31.setVerticalAlignment(SwingConstants.BOTTOM);
			lblValor_B31.setHorizontalAlignment(SwingConstants.LEFT);
			lblValor_B31.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor_B31;
	}
	private JPanel getPanelCandidatos_B31() {
		if (panelCandidatos_B31 == null) {
			panelCandidatos_B31 = new JPanel();
			panelCandidatos_B31.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panelCandidatos_B31.add(getLblCandidatos_B31());
		}
		return panelCandidatos_B31;
	}
	private JLabel getLblCandidatos_B31() {
		if (lblCandidatos_B31 == null) {
			lblCandidatos_B31 = new JLabel(" ");
			lblCandidatos_B31.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return lblCandidatos_B31;
	}
	private JPanel getPanelValor_B32() {
		if (panelValor_B32 == null) {
			panelValor_B32 = new JPanel();
			panelValor_B32.add(getLblValor_B32());
		}
		return panelValor_B32;
	}
	private JLabel getLblValor_B32() {
		if (lblValor_B32 == null) {
			lblValor_B32 = new JLabel(" ");
			lblValor_B32.setVerticalAlignment(SwingConstants.BOTTOM);
			lblValor_B32.setHorizontalAlignment(SwingConstants.LEFT);
			lblValor_B32.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor_B32;
	}
	private JPanel getPanelCandidatos_B32() {
		if (panelCandidatos_B32 == null) {
			panelCandidatos_B32 = new JPanel();
			panelCandidatos_B32.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panelCandidatos_B32.add(getLblCandidatos_B32());
		}
		return panelCandidatos_B32;
	}
	private JLabel getLblCandidatos_B32() {
		if (lblCandidatos_B32 == null) {
			lblCandidatos_B32 = new JLabel(" ");
			lblCandidatos_B32.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return lblCandidatos_B32;
	}
	private JPanel getPanelValor_B33() {
		if (panelValor_B33 == null) {
			panelValor_B33 = new JPanel();
			panelValor_B33.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panelValor_B33.add(getLblValor_B33());
		}
		return panelValor_B33;
	}
	private JLabel getLblValor_B33() {
		if (lblValor_B33 == null) {
			lblValor_B33 = new JLabel("");
			lblValor_B33.setHorizontalAlignment(SwingConstants.LEFT);
			lblValor_B33.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor_B33;
	}
	private JPanel getPanelCandidatos_B33() {
		if (panelCandidatos_B33 == null) {
			panelCandidatos_B33 = new JPanel();
			panelCandidatos_B33.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panelCandidatos_B33.add(getLblCandidatos_B33());
		}
		return panelCandidatos_B33;
	}
	private JLabel getLblCandidatos_B33() {
		if (lblCandidatos_B33 == null) {
			lblCandidatos_B33 = new JLabel(" ");
			lblCandidatos_B33.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return lblCandidatos_B33;
	}
	private JPanel getPanelValor_C12() {
		if (panelValor_C12 == null) {
			panelValor_C12 = new JPanel();
			panelValor_C12.add(getLblValor_C12());
		}
		return panelValor_C12;
	}
	private JLabel getLblValor_C12() {
		if (lblValor_C12 == null) {
			lblValor_C12 = new JLabel(" ");
			lblValor_C12.setVerticalAlignment(SwingConstants.BOTTOM);
			lblValor_C12.setHorizontalAlignment(SwingConstants.LEFT);
			lblValor_C12.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor_C12;
	}
	private JPanel getPanelCandidatos_C12() {
		if (panelCandidatos_C12 == null) {
			panelCandidatos_C12 = new JPanel();
			panelCandidatos_C12.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panelCandidatos_C12.add(getLblCandidatos_C12());
		}
		return panelCandidatos_C12;
	}
	private JLabel getLblCandidatos_C12() {
		if (lblCandidatos_C12 == null) {
			lblCandidatos_C12 = new JLabel(" ");
			lblCandidatos_C12.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return lblCandidatos_C12;
	}
	private JPanel getPanelValor_C11() {
		if (panelValor_C11 == null) {
			panelValor_C11 = new JPanel();
			panelValor_C11.add(getLblValor_C11());
		}
		return panelValor_C11;
	}
	private JLabel getLblValor_C11() {
		if (lblValor_C11 == null) {
			lblValor_C11 = new JLabel(" ");
			lblValor_C11.setVerticalAlignment(SwingConstants.BOTTOM);
			lblValor_C11.setHorizontalAlignment(SwingConstants.LEFT);
			lblValor_C11.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor_C11;
	}
	private JPanel getPanelCandidatos_C11() {
		if (panelCandidatos_C11 == null) {
			panelCandidatos_C11 = new JPanel();
			panelCandidatos_C11.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panelCandidatos_C11.add(getLblCandidatos_C11());
		}
		return panelCandidatos_C11;
	}
	private JLabel getLblCandidatos_C11() {
		if (lblCandidatos_C11 == null) {
			lblCandidatos_C11 = new JLabel(" ");
			lblCandidatos_C11.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return lblCandidatos_C11;
	}
	private JPanel getPanelValor_C13() {
		if (panelValor_C13 == null) {
			panelValor_C13 = new JPanel();
			panelValor_C13.add(getLblValor_C13());
		}
		return panelValor_C13;
	}
	private JLabel getLblValor_C13() {
		if (lblValor_C13 == null) {
			lblValor_C13 = new JLabel(" ");
			lblValor_C13.setVerticalAlignment(SwingConstants.BOTTOM);
			lblValor_C13.setHorizontalAlignment(SwingConstants.LEFT);
			lblValor_C13.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor_C13;
	}
	private JPanel getPanelCandidatos_C13() {
		if (panelCandidatos_C13 == null) {
			panelCandidatos_C13 = new JPanel();
			panelCandidatos_C13.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panelCandidatos_C13.add(getLblCandidatos_C13());
		}
		return panelCandidatos_C13;
	}
	private JLabel getLblCandidatos_C13() {
		if (lblCandidatos_C13 == null) {
			lblCandidatos_C13 = new JLabel(" ");
			lblCandidatos_C13.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return lblCandidatos_C13;
	}
	private JPanel getPanelValor_C21() {
		if (panelValor_C21 == null) {
			panelValor_C21 = new JPanel();
			panelValor_C21.add(getLblValor_C21());
		}
		return panelValor_C21;
	}
	private JLabel getLblValor_C21() {
		if (lblValor_C21 == null) {
			lblValor_C21 = new JLabel(" ");
			lblValor_C21.setVerticalAlignment(SwingConstants.BOTTOM);
			lblValor_C21.setHorizontalAlignment(SwingConstants.LEFT);
			lblValor_C21.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor_C21;
	}
	private JPanel getPanelCandidatos_C21() {
		if (panelCandidatos_C21 == null) {
			panelCandidatos_C21 = new JPanel();
			panelCandidatos_C21.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panelCandidatos_C21.add(getLblCandidatos_C21());
		}
		return panelCandidatos_C21;
	}
	private JLabel getLblCandidatos_C21() {
		if (lblCandidatos_C21 == null) {
			lblCandidatos_C21 = new JLabel(" ");
			lblCandidatos_C21.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return lblCandidatos_C21;
	}
	private JPanel getPanelValor_C22() {
		if (panelValor_C22 == null) {
			panelValor_C22 = new JPanel();
			panelValor_C22.add(getLblValor_C22());
		}
		return panelValor_C22;
	}
	private JLabel getLblValor_C22() {
		if (lblValor_C22 == null) {
			lblValor_C22 = new JLabel(" ");
			lblValor_C22.setVerticalAlignment(SwingConstants.BOTTOM);
			lblValor_C22.setHorizontalAlignment(SwingConstants.LEFT);
			lblValor_C22.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor_C22;
	}
	private JPanel getPanelCandidatos_C22() {
		if (panelCandidatos_C22 == null) {
			panelCandidatos_C22 = new JPanel();
			panelCandidatos_C22.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panelCandidatos_C22.add(getLblCandidatos_C22());
		}
		return panelCandidatos_C22;
	}
	private JLabel getLblCandidatos_C22() {
		if (lblCandidatos_C22 == null) {
			lblCandidatos_C22 = new JLabel(" ");
			lblCandidatos_C22.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return lblCandidatos_C22;
	}
	private JPanel getPanelValor_C23() {
		if (panelValor_C23 == null) {
			panelValor_C23 = new JPanel();
			panelValor_C23.add(getLblValor_C23());
		}
		return panelValor_C23;
	}
	private JLabel getLblValor_C23() {
		if (lblValor_C23 == null) {
			lblValor_C23 = new JLabel(" ");
			lblValor_C23.setVerticalAlignment(SwingConstants.BOTTOM);
			lblValor_C23.setHorizontalAlignment(SwingConstants.LEFT);
			lblValor_C23.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor_C23;
	}
	private JPanel getPanelCandidatos_C23() {
		if (panelCandidatos_C23 == null) {
			panelCandidatos_C23 = new JPanel();
			panelCandidatos_C23.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panelCandidatos_C23.add(getLblCandidatos_C23());
		}
		return panelCandidatos_C23;
	}
	private JLabel getLblCandidatos_C23() {
		if (lblCandidatos_C23 == null) {
			lblCandidatos_C23 = new JLabel(" ");
			lblCandidatos_C23.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return lblCandidatos_C23;
	}
	private JPanel getPanelValor_C31() {
		if (panelValor_C31 == null) {
			panelValor_C31 = new JPanel();
			panelValor_C31.add(getLblValor_C31());
		}
		return panelValor_C31;
	}
	private JLabel getLblValor_C31() {
		if (lblValor_C31 == null) {
			lblValor_C31 = new JLabel(" ");
			lblValor_C31.setVerticalAlignment(SwingConstants.BOTTOM);
			lblValor_C31.setHorizontalAlignment(SwingConstants.LEFT);
			lblValor_C31.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor_C31;
	}
	private JPanel getPanelCandidatos_C31() {
		if (panelCandidatos_C31 == null) {
			panelCandidatos_C31 = new JPanel();
			panelCandidatos_C31.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panelCandidatos_C31.add(getLblCandidatos_C31());
		}
		return panelCandidatos_C31;
	}
	private JLabel getLblCandidatos_C31() {
		if (lblCandidatos_C31 == null) {
			lblCandidatos_C31 = new JLabel(" ");
			lblCandidatos_C31.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return lblCandidatos_C31;
	}
	private JPanel getPanelValor_C32() {
		if (panelValor_C32 == null) {
			panelValor_C32 = new JPanel();
			panelValor_C32.add(getLblValor_C32());
		}
		return panelValor_C32;
	}
	private JLabel getLblValor_C32() {
		if (lblValor_C32 == null) {
			lblValor_C32 = new JLabel(" ");
			lblValor_C32.setVerticalAlignment(SwingConstants.BOTTOM);
			lblValor_C32.setHorizontalAlignment(SwingConstants.LEFT);
			lblValor_C32.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor_C32;
	}
	private JPanel getPanelCandidatos_C32() {
		if (panelCandidatos_C32 == null) {
			panelCandidatos_C32 = new JPanel();
			panelCandidatos_C32.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panelCandidatos_C32.add(getLblCandidatos_C32());
		}
		return panelCandidatos_C32;
	}
	private JLabel getLblCandidatos_C32() {
		if (lblCandidatos_C32 == null) {
			lblCandidatos_C32 = new JLabel(" ");
			lblCandidatos_C32.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return lblCandidatos_C32;
	}
	private JPanel getPanelValor_C33() {
		if (panelValor_C33 == null) {
			panelValor_C33 = new JPanel();
			panelValor_C33.add(getLblValor_C33());
		}
		return panelValor_C33;
	}
	private JLabel getLblValor_C33() {
		if (lblValor_C33 == null) {
			lblValor_C33 = new JLabel(" ");
			lblValor_C33.setVerticalAlignment(SwingConstants.BOTTOM);
			lblValor_C33.setHorizontalAlignment(SwingConstants.LEFT);
			lblValor_C33.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor_C33;
	}
	private JPanel getPanelCandidatos_C33() {
		if (panelCandidatos_C33 == null) {
			panelCandidatos_C33 = new JPanel();
			panelCandidatos_C33.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panelCandidatos_C33.add(getLblCandidatos_C33());
		}
		return panelCandidatos_C33;
	}
	private JLabel getLblCandidatos_C33() {
		if (lblCandidatos_C33 == null) {
			lblCandidatos_C33 = new JLabel(" ");
			lblCandidatos_C33.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return lblCandidatos_C33;
	}

	private JPanel getPanelValor_D11() {
		if (panelValor_D11 == null) {
			panelValor_D11 = new JPanel();
			panelValor_D11.add(getLblValor_D11());
		}
		return panelValor_D11;
	}
	private JLabel getLblValor_D11() {
		if (lblValor_D11 == null) {
			lblValor_D11 = new JLabel(" ");
			lblValor_D11.setVerticalAlignment(SwingConstants.BOTTOM);
			lblValor_D11.setHorizontalAlignment(SwingConstants.LEFT);
			lblValor_D11.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor_D11;
	}
	private JPanel getPanelCandidatos_D11() {
		if (panelCandidatos_D11 == null) {
			panelCandidatos_D11 = new JPanel();
			panelCandidatos_D11.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panelCandidatos_D11.add(getLblCandidatos_D11());
		}
		return panelCandidatos_D11;
	}
	private JLabel getLblCandidatos_D11() {
		if (lblCandidatos_D11 == null) {
			lblCandidatos_D11 = new JLabel(" ");
			lblCandidatos_D11.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return lblCandidatos_D11;
	}
	private JPanel getPanelValor_D12() {
		if (panelValor_D12 == null) {
			panelValor_D12 = new JPanel();
			panelValor_D12.add(getLblValor_D12());
		}
		return panelValor_D12;
	}
	private JLabel getLblValor_D12() {
		if (lblValor_D12 == null) {
			lblValor_D12 = new JLabel(" ");
			lblValor_D12.setVerticalAlignment(SwingConstants.BOTTOM);
			lblValor_D12.setHorizontalAlignment(SwingConstants.LEFT);
			lblValor_D12.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor_D12;
	}
	private JPanel getPanelCandidatos_D12() {
		if (panelCandidatos_D12 == null) {
			panelCandidatos_D12 = new JPanel();
			panelCandidatos_D12.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panelCandidatos_D12.add(getLblCandidatos_D12());
		}
		return panelCandidatos_D12;
	}
	private JLabel getLblCandidatos_D12() {
		if (lblCandidatos_D12 == null) {
			lblCandidatos_D12 = new JLabel(" ");
			lblCandidatos_D12.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return lblCandidatos_D12;
	}
	private JPanel getPanelValor_D13() {
		if (panelValor_D13 == null) {
			panelValor_D13 = new JPanel();
			panelValor_D13.add(getLblValor_D13());
		}
		return panelValor_D13;
	}
	private JLabel getLblValor_D13() {
		if (lblValor_D13 == null) {
			lblValor_D13 = new JLabel(" ");
			lblValor_D13.setVerticalAlignment(SwingConstants.BOTTOM);
			lblValor_D13.setHorizontalAlignment(SwingConstants.LEFT);
			lblValor_D13.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor_D13;
	}
	private JPanel getPanelCandidatos_D13() {
		if (panelCandidatos_D13 == null) {
			panelCandidatos_D13 = new JPanel();
			panelCandidatos_D13.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panelCandidatos_D13.add(getLblCandidatos_D13());
		}
		return panelCandidatos_D13;
	}
	private JLabel getLblCandidatos_D13() {
		if (lblCandidatos_D13 == null) {
			lblCandidatos_D13 = new JLabel(" ");
			lblCandidatos_D13.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return lblCandidatos_D13;
	}
	private JPanel getPanelValor_D21() {
		if (panelValor_D21 == null) {
			panelValor_D21 = new JPanel();
			panelValor_D21.add(getLblValor_D21());
		}
		return panelValor_D21;
	}
	private JLabel getLblValor_D21() {
		if (lblValor_D21 == null) {
			lblValor_D21 = new JLabel(" ");
			lblValor_D21.setVerticalAlignment(SwingConstants.BOTTOM);
			lblValor_D21.setHorizontalAlignment(SwingConstants.LEFT);
			lblValor_D21.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor_D21;
	}
	private JPanel getPanelCandidatos_D21() {
		if (panelCandidatos_D21 == null) {
			panelCandidatos_D21 = new JPanel();
			panelCandidatos_D21.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panelCandidatos_D21.add(getLblCandidatos_D21());
		}
		return panelCandidatos_D21;
	}
	private JLabel getLblCandidatos_D21() {
		if (lblCandidatos_D21 == null) {
			lblCandidatos_D21 = new JLabel(" ");
			lblCandidatos_D21.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return lblCandidatos_D21;
	}
	private JPanel getPanelValor_D22() {
		if (panelValor_D22 == null) {
			panelValor_D22 = new JPanel();
			panelValor_D22.add(getLblValor_D22());
		}
		return panelValor_D22;
	}
	private JLabel getLblValor_D22() {
		if (lblValor_D22 == null) {
			lblValor_D22 = new JLabel(" ");
			lblValor_D22.setVerticalAlignment(SwingConstants.BOTTOM);
			lblValor_D22.setHorizontalAlignment(SwingConstants.LEFT);
			lblValor_D22.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor_D22;
	}
	private JPanel getPanelCandidatos_D22() {
		if (panelCandidatos_D22 == null) {
			panelCandidatos_D22 = new JPanel();
			panelCandidatos_D22.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panelCandidatos_D22.add(getLblCandidatos_D22());
		}
		return panelCandidatos_D22;
	}
	private JLabel getLblCandidatos_D22() {
		if (lblCandidatos_D22 == null) {
			lblCandidatos_D22 = new JLabel(" ");
			lblCandidatos_D22.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return lblCandidatos_D22;
	}
	private JPanel getPanelValor_D23() {
		if (panelValor_D23 == null) {
			panelValor_D23 = new JPanel();
			panelValor_D23.add(getLblValor_D23());
		}
		return panelValor_D23;
	}
	private JLabel getLblValor_D23() {
		if (lblValor_D23 == null) {
			lblValor_D23 = new JLabel(" ");
			lblValor_D23.setVerticalAlignment(SwingConstants.BOTTOM);
			lblValor_D23.setHorizontalAlignment(SwingConstants.LEFT);
			lblValor_D23.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor_D23;
	}
	private JPanel getPanelCandidatos_D23() {
		if (panelCandidatos_D23 == null) {
			panelCandidatos_D23 = new JPanel();
			panelCandidatos_D23.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panelCandidatos_D23.add(getLblCandidatos_D23());
		}
		return panelCandidatos_D23;
	}
	private JLabel getLblCandidatos_D23() {
		if (lblCandidatos_D23 == null) {
			lblCandidatos_D23 = new JLabel(" ");
			lblCandidatos_D23.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return lblCandidatos_D23;
	}
	private JPanel getPanelValor_D31() {
		if (panelValor_D31 == null) {
			panelValor_D31 = new JPanel();
			panelValor_D31.add(getLblValor_D31());
		}
		return panelValor_D31;
	}
	private JLabel getLblValor_D31() {
		if (lblValor_D31 == null) {
			lblValor_D31 = new JLabel(" ");
			lblValor_D31.setVerticalAlignment(SwingConstants.BOTTOM);
			lblValor_D31.setHorizontalAlignment(SwingConstants.LEFT);
			lblValor_D31.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor_D31;
	}
	private JPanel getPanelCandidatos_D31() {
		if (panelCandidatos_D31 == null) {
			panelCandidatos_D31 = new JPanel();
			panelCandidatos_D31.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panelCandidatos_D31.add(getLblCandidatos_D31());
		}
		return panelCandidatos_D31;
	}
	private JLabel getLblCandidatos_D31() {
		if (lblCandidatos_D31 == null) {
			lblCandidatos_D31 = new JLabel(" ");
			lblCandidatos_D31.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return lblCandidatos_D31;
	}
	private JPanel getPanelValor_D32() {
		if (panelValor_D32 == null) {
			panelValor_D32 = new JPanel();
			panelValor_D32.add(getLblValor_D32());
		}
		return panelValor_D32;
	}
	private JLabel getLblValor_D32() {
		if (lblValor_D32 == null) {
			lblValor_D32 = new JLabel(" ");
			lblValor_D32.setVerticalAlignment(SwingConstants.BOTTOM);
			lblValor_D32.setHorizontalAlignment(SwingConstants.LEFT);
			lblValor_D32.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor_D32;
	}
	private JPanel getPanelCandidatos_D32() {
		if (panelCandidatos_D32 == null) {
			panelCandidatos_D32 = new JPanel();
			panelCandidatos_D32.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panelCandidatos_D32.add(getLblCandidatos_D32());
		}
		return panelCandidatos_D32;
	}
	private JLabel getLblCandidatos_D32() {
		if (lblCandidatos_D32 == null) {
			lblCandidatos_D32 = new JLabel(" ");
			lblCandidatos_D32.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return lblCandidatos_D32;
	}
	private JPanel getPanelValor_D33() {
		if (panelValor_D33 == null) {
			panelValor_D33 = new JPanel();
			panelValor_D33.add(getLblValor_D33());
		}
		return panelValor_D33;
	}
	private JLabel getLblValor_D33() {
		if (lblValor_D33 == null) {
			lblValor_D33 = new JLabel(" ");
			lblValor_D33.setVerticalAlignment(SwingConstants.BOTTOM);
			lblValor_D33.setHorizontalAlignment(SwingConstants.LEFT);
			lblValor_D33.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor_D33;
	}
	private JPanel getPanelCandidatos_D33() {
		if (panelCandidatos_D33 == null) {
			panelCandidatos_D33 = new JPanel();
			panelCandidatos_D33.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panelCandidatos_D33.add(getLblCandidatos_D33());
		}
		return panelCandidatos_D33;
	}
	private JLabel getLblCandidatos_D33() {
		if (lblCandidatos_D33 == null) {
			lblCandidatos_D33 = new JLabel(" ");
			lblCandidatos_D33.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return lblCandidatos_D33;
	}
	private JPanel getPanelValor_E11() {
		if (panelValor_E11 == null) {
			panelValor_E11 = new JPanel();
			panelValor_E11.add(getLblValor_E11());
		}
		return panelValor_E11;
	}
	private JLabel getLblValor_E11() {
		if (lblValor_E11 == null) {
			lblValor_E11 = new JLabel(" ");
			lblValor_E11.setVerticalAlignment(SwingConstants.BOTTOM);
			lblValor_E11.setHorizontalAlignment(SwingConstants.LEFT);
			lblValor_E11.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor_E11;
	}
	private JPanel getPanelCandidatos_E11() {
		if (panelCandidatos_E11 == null) {
			panelCandidatos_E11 = new JPanel();
			panelCandidatos_E11.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panelCandidatos_E11.add(getLblCandidatos_E11());
		}
		return panelCandidatos_E11;
	}
	private JLabel getLblCandidatos_E11() {
		if (lblCandidatos_E11 == null) {
			lblCandidatos_E11 = new JLabel(" ");
			lblCandidatos_E11.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return lblCandidatos_E11;
	}
	private JPanel getPanelValor_E12() {
		if (panelValor_E12 == null) {
			panelValor_E12 = new JPanel();
			panelValor_E12.add(getLblValor_E12());
		}
		return panelValor_E12;
	}
	private JLabel getLblValor_E12() {
		if (lblValor_E12 == null) {
			lblValor_E12 = new JLabel(" ");
			lblValor_E12.setVerticalAlignment(SwingConstants.BOTTOM);
			lblValor_E12.setHorizontalAlignment(SwingConstants.LEFT);
			lblValor_E12.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor_E12;
	}
	private JPanel getPanelCandidatos_E12() {
		if (panelCandidatos_E12 == null) {
			panelCandidatos_E12 = new JPanel();
			panelCandidatos_E12.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panelCandidatos_E12.add(getLblCandidatos_E12());
		}
		return panelCandidatos_E12;
	}
	private JLabel getLblCandidatos_E12() {
		if (lblCandidatos_E12 == null) {
			lblCandidatos_E12 = new JLabel(" ");
			lblCandidatos_E12.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return lblCandidatos_E12;
	}
	private JPanel getPanelValor_E13() {
		if (panelValor_E13 == null) {
			panelValor_E13 = new JPanel();
			panelValor_E13.add(getLblValor_E13());
		}
		return panelValor_E13;
	}
	private JLabel getLblValor_E13() {
		if (lblValor_E13 == null) {
			lblValor_E13 = new JLabel(" ");
			lblValor_E13.setVerticalAlignment(SwingConstants.BOTTOM);
			lblValor_E13.setHorizontalAlignment(SwingConstants.LEFT);
			lblValor_E13.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor_E13;
	}
	private JPanel getPanelCandidatos_E13() {
		if (panelCandidatos_E13 == null) {
			panelCandidatos_E13 = new JPanel();
			panelCandidatos_E13.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panelCandidatos_E13.add(getLblCandidatos_E13());
		}
		return panelCandidatos_E13;
	}
	private JLabel getLblCandidatos_E13() {
		if (lblCandidatos_E13 == null) {
			lblCandidatos_E13 = new JLabel(" ");
			lblCandidatos_E13.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return lblCandidatos_E13;
	}
	private JPanel getPanelValor_E21() {
		if (panelValor_E21 == null) {
			panelValor_E21 = new JPanel();
			panelValor_E21.add(getLblValor_E21());
		}
		return panelValor_E21;
	}
	private JLabel getLblValor_E21() {
		if (lblValor_E21 == null) {
			lblValor_E21 = new JLabel(" ");
			lblValor_E21.setVerticalAlignment(SwingConstants.BOTTOM);
			lblValor_E21.setHorizontalAlignment(SwingConstants.LEFT);
			lblValor_E21.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor_E21;
	}
	private JPanel getPanelCandidatos_E21() {
		if (panelCandidatos_E21 == null) {
			panelCandidatos_E21 = new JPanel();
			panelCandidatos_E21.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panelCandidatos_E21.add(getLblCandidatos_E21());
		}
		return panelCandidatos_E21;
	}
	private JLabel getLblCandidatos_E21() {
		if (lblCandidatos_E21 == null) {
			lblCandidatos_E21 = new JLabel(" ");
			lblCandidatos_E21.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return lblCandidatos_E21;
	}
	private JPanel getPanelValor_E22() {
		if (panelValor_E22 == null) {
			panelValor_E22 = new JPanel();
			panelValor_E22.add(getLblValor_E22());
		}
		return panelValor_E22;
	}
	private JLabel getLblValor_E22() {
		if (lblValor_E22 == null) {
			lblValor_E22 = new JLabel("");
			lblValor_E22.setVerticalAlignment(SwingConstants.BOTTOM);
			lblValor_E22.setHorizontalAlignment(SwingConstants.LEFT);
			lblValor_E22.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor_E22;
	}
	private JPanel getPanelCandidatos_E22() {
		if (panelCandidatos_E22 == null) {
			panelCandidatos_E22 = new JPanel();
			panelCandidatos_E22.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panelCandidatos_E22.add(getLblCandidatos_E22());
		}
		return panelCandidatos_E22;
	}
	private JLabel getLblCandidatos_E22() {
		if (lblCandidatos_E22 == null) {
			lblCandidatos_E22 = new JLabel(" ");
			lblCandidatos_E22.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return lblCandidatos_E22;
	}
	private JPanel getPanelValor_E23() {
		if (panelValor_E23 == null) {
			panelValor_E23 = new JPanel();
			panelValor_E23.add(getLblValor_E23());
		}
		return panelValor_E23;
	}
	private JLabel getLblValor_E23() {
		if (lblValor_E23 == null) {
			lblValor_E23 = new JLabel(" ");
			lblValor_E23.setVerticalAlignment(SwingConstants.BOTTOM);
			lblValor_E23.setHorizontalAlignment(SwingConstants.LEFT);
			lblValor_E23.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor_E23;
	}
	private JPanel getPanelCandidatos_E23() {
		if (panelCandidatos_E23 == null) {
			panelCandidatos_E23 = new JPanel();
			panelCandidatos_E23.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panelCandidatos_E23.add(getLblCandidatos_E23());
		}
		return panelCandidatos_E23;
	}
	private JLabel getLblCandidatos_E23() {
		if (lblCandidatos_E23 == null) {
			lblCandidatos_E23 = new JLabel(" ");
			lblCandidatos_E23.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return lblCandidatos_E23;
	}
	private JPanel getPanelValor_E31() {
		if (panelValor_E31 == null) {
			panelValor_E31 = new JPanel();
			panelValor_E31.add(getLblValor_E31());
		}
		return panelValor_E31;
	}
	private JLabel getLblValor_E31() {
		if (lblValor_E31 == null) {
			lblValor_E31 = new JLabel(" ");
			lblValor_E31.setVerticalAlignment(SwingConstants.BOTTOM);
			lblValor_E31.setHorizontalAlignment(SwingConstants.LEFT);
			lblValor_E31.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor_E31;
	}
	private JPanel getPanelCandidatos_E31() {
		if (panelCandidatos_E31 == null) {
			panelCandidatos_E31 = new JPanel();
			panelCandidatos_E31.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panelCandidatos_E31.add(getLblCandidatos_E31());
		}
		return panelCandidatos_E31;
	}
	private JLabel getLblCandidatos_E31() {
		if (lblCandidatos_E31 == null) {
			lblCandidatos_E31 = new JLabel(" ");
			lblCandidatos_E31.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return lblCandidatos_E31;
	}
	private JPanel getPanelValor_E32() {
		if (panelValor_E32 == null) {
			panelValor_E32 = new JPanel();
			panelValor_E32.add(getLblValor_E32());
		}
		return panelValor_E32;
	}
	private JLabel getLblValor_E32() {
		if (lblValor_E32 == null) {
			lblValor_E32 = new JLabel(" ");
			lblValor_E32.setVerticalAlignment(SwingConstants.BOTTOM);
			lblValor_E32.setHorizontalAlignment(SwingConstants.LEFT);
			lblValor_E32.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor_E32;
	}
	private JPanel getPanelCandidatos_E32() {
		if (panelCandidatos_E32 == null) {
			panelCandidatos_E32 = new JPanel();
			panelCandidatos_E32.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panelCandidatos_E32.add(getLblCandidatos_E32());
		}
		return panelCandidatos_E32;
	}
	private JLabel getLblCandidatos_E32() {
		if (lblCandidatos_E32 == null) {
			lblCandidatos_E32 = new JLabel(" ");
			lblCandidatos_E32.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return lblCandidatos_E32;
	}
	private JPanel getPanelValor_E33() {
		if (panelValor_E33 == null) {
			panelValor_E33 = new JPanel();
			panelValor_E33.add(getLblValor_E33());
		}
		return panelValor_E33;
	}
	private JLabel getLblValor_E33() {
		if (lblValor_E33 == null) {
			lblValor_E33 = new JLabel(" ");
			lblValor_E33.setVerticalAlignment(SwingConstants.BOTTOM);
			lblValor_E33.setHorizontalAlignment(SwingConstants.LEFT);
			lblValor_E33.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor_E33;
	}
	private JPanel getPanelCandidatos_E33() {
		if (panelCandidatos_E33 == null) {
			panelCandidatos_E33 = new JPanel();
			panelCandidatos_E33.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panelCandidatos_E33.add(getLblCandidatos_E33());
		}
		return panelCandidatos_E33;
	}
	private JLabel getLblCandidatos_E33() {
		if (lblCandidatos_E33 == null) {
			lblCandidatos_E33 = new JLabel(" ");
			lblCandidatos_E33.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return lblCandidatos_E33;
	}
	private JPanel getPanelValor_E11_1_1() {
		if (panelValor_F11 == null) {
			panelValor_F11 = new JPanel();
			panelValor_F11.add(getLblValor_E11_1_1());
		}
		return panelValor_F11;
	}
	private JLabel getLblValor_E11_1_1() {
		if (lblValor_F11 == null) {
			lblValor_F11 = new JLabel(" ");
			lblValor_F11.setVerticalAlignment(SwingConstants.BOTTOM);
			lblValor_F11.setHorizontalAlignment(SwingConstants.LEFT);
			lblValor_F11.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor_F11;
	}
	private JPanel getPanelCandidatos_E11_1_1() {
		if (panelCandidatos_F11 == null) {
			panelCandidatos_F11 = new JPanel();
			panelCandidatos_F11.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panelCandidatos_F11.add(getLblCandidatos_E11_1_1());
		}
		return panelCandidatos_F11;
	}
	private JLabel getLblCandidatos_E11_1_1() {
		if (lblCandidatos_F11 == null) {
			lblCandidatos_F11 = new JLabel(" ");
			lblCandidatos_F11.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return lblCandidatos_F11;
	}
	private JPanel getPanelValor_F12() {
		if (panelValor_F12 == null) {
			panelValor_F12 = new JPanel();
			panelValor_F12.add(getLblValor_F12());
		}
		return panelValor_F12;
	}
	private JLabel getLblValor_F12() {
		if (lblValor_F12 == null) {
			lblValor_F12 = new JLabel(" ");
			lblValor_F12.setVerticalAlignment(SwingConstants.BOTTOM);
			lblValor_F12.setHorizontalAlignment(SwingConstants.LEFT);
			lblValor_F12.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor_F12;
	}
	private JPanel getPanelCandidatos_F12() {
		if (panelCandidatos_F12 == null) {
			panelCandidatos_F12 = new JPanel();
			panelCandidatos_F12.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panelCandidatos_F12.add(getLblCandidatos_F12());
		}
		return panelCandidatos_F12;
	}
	private JLabel getLblCandidatos_F12() {
		if (lblCandidatos_F12 == null) {
			lblCandidatos_F12 = new JLabel(" ");
			lblCandidatos_F12.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return lblCandidatos_F12;
	}
	private JPanel getPanelValor_F13() {
		if (panelValor_F13 == null) {
			panelValor_F13 = new JPanel();
			panelValor_F13.add(getLblValor_F13());
		}
		return panelValor_F13;
	}
	private JLabel getLblValor_F13() {
		if (lblValor_F13 == null) {
			lblValor_F13 = new JLabel(" ");
			lblValor_F13.setVerticalAlignment(SwingConstants.BOTTOM);
			lblValor_F13.setHorizontalAlignment(SwingConstants.LEFT);
			lblValor_F13.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor_F13;
	}
	private JPanel getPanelCandidatos_F13() {
		if (panelCandidatos_F13 == null) {
			panelCandidatos_F13 = new JPanel();
			panelCandidatos_F13.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panelCandidatos_F13.add(getLblCandidatos_F13());
		}
		return panelCandidatos_F13;
	}
	private JLabel getLblCandidatos_F13() {
		if (lblCandidatos_F13 == null) {
			lblCandidatos_F13 = new JLabel(" ");
			lblCandidatos_F13.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return lblCandidatos_F13;
	}
	private JPanel getPanelValor_F21() {
		if (panelValor_F21 == null) {
			panelValor_F21 = new JPanel();
			panelValor_F21.add(getLblValor_F21());
		}
		return panelValor_F21;
	}
	private JLabel getLblValor_F21() {
		if (lblValor_F21 == null) {
			lblValor_F21 = new JLabel(" ");
			lblValor_F21.setVerticalAlignment(SwingConstants.BOTTOM);
			lblValor_F21.setHorizontalAlignment(SwingConstants.LEFT);
			lblValor_F21.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor_F21;
	}
	private JPanel getPanelCandidatos_F21() {
		if (panelCandidatos_F21 == null) {
			panelCandidatos_F21 = new JPanel();
			panelCandidatos_F21.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panelCandidatos_F21.add(getLblCandidatos_F21());
		}
		return panelCandidatos_F21;
	}
	private JLabel getLblCandidatos_F21() {
		if (lblCandidatos_F21 == null) {
			lblCandidatos_F21 = new JLabel(" ");
			lblCandidatos_F21.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return lblCandidatos_F21;
	}
	private JPanel getPanelValor_F22() {
		if (panelValor_F22 == null) {
			panelValor_F22 = new JPanel();
			panelValor_F22.add(getLblValor_F22());
		}
		return panelValor_F22;
	}
	private JLabel getLblValor_F22() {
		if (lblValor_F22 == null) {
			lblValor_F22 = new JLabel(" ");
			lblValor_F22.setVerticalAlignment(SwingConstants.BOTTOM);
			lblValor_F22.setHorizontalAlignment(SwingConstants.LEFT);
			lblValor_F22.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor_F22;
	}
	private JPanel getPanelCandidatos_F22() {
		if (panelCandidatos_F22 == null) {
			panelCandidatos_F22 = new JPanel();
			panelCandidatos_F22.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panelCandidatos_F22.add(getLblCandidatos_F22());
		}
		return panelCandidatos_F22;
	}
	private JLabel getLblCandidatos_F22() {
		if (lblCandidatos_F22 == null) {
			lblCandidatos_F22 = new JLabel(" ");
			lblCandidatos_F22.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return lblCandidatos_F22;
	}
	private JPanel getPanelValor_F23() {
		if (panelValor_F23 == null) {
			panelValor_F23 = new JPanel();
			panelValor_F23.add(getLblValor_F23());
		}
		return panelValor_F23;
	}
	private JLabel getLblValor_F23() {
		if (lblValor_F23 == null) {
			lblValor_F23 = new JLabel(" ");
			lblValor_F23.setVerticalAlignment(SwingConstants.BOTTOM);
			lblValor_F23.setHorizontalAlignment(SwingConstants.LEFT);
			lblValor_F23.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor_F23;
	}
	private JPanel getPanelCandidatos_F23() {
		if (panelCandidatos_F23 == null) {
			panelCandidatos_F23 = new JPanel();
			panelCandidatos_F23.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panelCandidatos_F23.add(getLblCandidatos_F23());
		}
		return panelCandidatos_F23;
	}
	private JLabel getLblCandidatos_F23() {
		if (lblCandidatos_F23 == null) {
			lblCandidatos_F23 = new JLabel(" ");
			lblCandidatos_F23.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return lblCandidatos_F23;
	}
	private JPanel getPanelValor_F31() {
		if (panelValor_F31 == null) {
			panelValor_F31 = new JPanel();
			panelValor_F31.add(getLblValor_F31());
		}
		return panelValor_F31;
	}
	private JLabel getLblValor_F31() {
		if (lblValor_F31 == null) {
			lblValor_F31 = new JLabel(" ");
			lblValor_F31.setVerticalAlignment(SwingConstants.BOTTOM);
			lblValor_F31.setHorizontalAlignment(SwingConstants.LEFT);
			lblValor_F31.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor_F31;
	}
	private JPanel getPanelCandidatos_F31() {
		if (panelCandidatos_F31 == null) {
			panelCandidatos_F31 = new JPanel();
			panelCandidatos_F31.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panelCandidatos_F31.add(getLblCandidatos_F31());
		}
		return panelCandidatos_F31;
	}
	private JLabel getLblCandidatos_F31() {
		if (lblCandidatos_F31 == null) {
			lblCandidatos_F31 = new JLabel(" ");
			lblCandidatos_F31.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return lblCandidatos_F31;
	}
	private JPanel getPanelValor_F32() {
		if (panelValor_F32 == null) {
			panelValor_F32 = new JPanel();
			panelValor_F32.add(getLblValor_F32());
		}
		return panelValor_F32;
	}
	private JLabel getLblValor_F32() {
		if (lblValor_F32 == null) {
			lblValor_F32 = new JLabel(" ");
			lblValor_F32.setVerticalAlignment(SwingConstants.BOTTOM);
			lblValor_F32.setHorizontalAlignment(SwingConstants.LEFT);
			lblValor_F32.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor_F32;
	}
	private JPanel getPanelCandidatos_F32() {
		if (panelCandidatos_F32 == null) {
			panelCandidatos_F32 = new JPanel();
			panelCandidatos_F32.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panelCandidatos_F32.add(getLblCandidatos_F32());
		}
		return panelCandidatos_F32;
	}
	private JLabel getLblCandidatos_F32() {
		if (lblCandidatos_F32 == null) {
			lblCandidatos_F32 = new JLabel(" ");
			lblCandidatos_F32.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return lblCandidatos_F32;
	}
	private JPanel getPanelValor_F33() {
		if (panelValor_F33 == null) {
			panelValor_F33 = new JPanel();
			panelValor_F33.add(getLblValor_F33());
		}
		return panelValor_F33;
	}
	private JLabel getLblValor_F33() {
		if (lblValor_F33 == null) {
			lblValor_F33 = new JLabel(" ");
			lblValor_F33.setVerticalAlignment(SwingConstants.BOTTOM);
			lblValor_F33.setHorizontalAlignment(SwingConstants.LEFT);
			lblValor_F33.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor_F33;
	}
	private JPanel getPanelCandidatos_F33() {
		if (panelCandidatos_F33 == null) {
			panelCandidatos_F33 = new JPanel();
			panelCandidatos_F33.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panelCandidatos_F33.add(getLblCandidatos_F33());
		}
		return panelCandidatos_F33;
	}
	private JLabel getLblCandidatos_F33() {
		if (lblCandidatos_F33 == null) {
			lblCandidatos_F33 = new JLabel(" ");
			lblCandidatos_F33.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return lblCandidatos_F33;
	}
	private JPanel getPanelValor_G11() {
		if (panelValor_G11 == null) {
			panelValor_G11 = new JPanel();
			panelValor_G11.add(getLblValor_G11());
		}
		return panelValor_G11;
	}
	private JLabel getLblValor_G11() {
		if (lblValor_G11 == null) {
			lblValor_G11 = new JLabel(" ");
			lblValor_G11.setVerticalAlignment(SwingConstants.BOTTOM);
			lblValor_G11.setHorizontalAlignment(SwingConstants.LEFT);
			lblValor_G11.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor_G11;
	}
	private JPanel getPanelCandidatos_G11() {
		if (panelCandidatos_G11 == null) {
			panelCandidatos_G11 = new JPanel();
			panelCandidatos_G11.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panelCandidatos_G11.add(getLblCandidatos_G11());
		}
		return panelCandidatos_G11;
	}
	private JLabel getLblCandidatos_G11() {
		if (lblCandidatos_G11 == null) {
			lblCandidatos_G11 = new JLabel(" ");
			lblCandidatos_G11.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return lblCandidatos_G11;
	}
	private JPanel getPanelValor_G12() {
		if (panelValor_G12 == null) {
			panelValor_G12 = new JPanel();
			panelValor_G12.add(getLblValor_G12());
		}
		return panelValor_G12;
	}
	private JLabel getLblValor_G12() {
		if (lblValor_G12 == null) {
			lblValor_G12 = new JLabel(" ");
			lblValor_G12.setVerticalAlignment(SwingConstants.BOTTOM);
			lblValor_G12.setHorizontalAlignment(SwingConstants.LEFT);
			lblValor_G12.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor_G12;
	}
	private JPanel getPanelCandidatos_G12() {
		if (panelCandidatos_G12 == null) {
			panelCandidatos_G12 = new JPanel();
			panelCandidatos_G12.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panelCandidatos_G12.add(getLblCandidatos_G12());
		}
		return panelCandidatos_G12;
	}
	private JLabel getLblCandidatos_G12() {
		if (lblCandidatos_G12 == null) {
			lblCandidatos_G12 = new JLabel(" ");
			lblCandidatos_G12.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return lblCandidatos_G12;
	}
	private JPanel getPanelValor_G13() {
		if (panelValor_G13 == null) {
			panelValor_G13 = new JPanel();
			panelValor_G13.add(getLblValor_G13());
		}
		return panelValor_G13;
	}
	private JLabel getLblValor_G13() {
		if (lblValor_G13 == null) {
			lblValor_G13 = new JLabel(" ");
			lblValor_G13.setVerticalAlignment(SwingConstants.BOTTOM);
			lblValor_G13.setHorizontalAlignment(SwingConstants.LEFT);
			lblValor_G13.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor_G13;
	}
	private JPanel getPanelCandidatos_G13() {
		if (panelCandidatos_G13 == null) {
			panelCandidatos_G13 = new JPanel();
			panelCandidatos_G13.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panelCandidatos_G13.add(getLblCandidatos_G13());
		}
		return panelCandidatos_G13;
	}
	private JLabel getLblCandidatos_G13() {
		if (lblCandidatos_G13 == null) {
			lblCandidatos_G13 = new JLabel(" ");
			lblCandidatos_G13.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return lblCandidatos_G13;
	}
	private JPanel getPanelValor_G21() {
		if (panelValor_G21 == null) {
			panelValor_G21 = new JPanel();
			panelValor_G21.add(getLblValor_G21());
		}
		return panelValor_G21;
	}
	private JLabel getLblValor_G21() {
		if (lblValor_G21 == null) {
			lblValor_G21 = new JLabel(" ");
			lblValor_G21.setVerticalAlignment(SwingConstants.BOTTOM);
			lblValor_G21.setHorizontalAlignment(SwingConstants.LEFT);
			lblValor_G21.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor_G21;
	}
	private JPanel getPanelCandidatos_G21() {
		if (panelCandidatos_G21 == null) {
			panelCandidatos_G21 = new JPanel();
			panelCandidatos_G21.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panelCandidatos_G21.add(getLblCandidatos_G21());
		}
		return panelCandidatos_G21;
	}
	private JLabel getLblCandidatos_G21() {
		if (lblCandidatos_G21 == null) {
			lblCandidatos_G21 = new JLabel(" ");
			lblCandidatos_G21.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return lblCandidatos_G21;
	}
	private JPanel getPanelValor_G22() {
		if (panelValor_G22 == null) {
			panelValor_G22 = new JPanel();
			panelValor_G22.add(getLblValor_G22());
		}
		return panelValor_G22;
	}
	private JLabel getLblValor_G22() {
		if (lblValor_G22 == null) {
			lblValor_G22 = new JLabel(" ");
			lblValor_G22.setVerticalAlignment(SwingConstants.BOTTOM);
			lblValor_G22.setHorizontalAlignment(SwingConstants.LEFT);
			lblValor_G22.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor_G22;
	}
	private JPanel getPanelCandidatos_G22() {
		if (panelCandidatos_G22 == null) {
			panelCandidatos_G22 = new JPanel();
			panelCandidatos_G22.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panelCandidatos_G22.add(getLblCandidatos_G22());
		}
		return panelCandidatos_G22;
	}
	private JLabel getLblCandidatos_G22() {
		if (lblCandidatos_G22 == null) {
			lblCandidatos_G22 = new JLabel(" ");
			lblCandidatos_G22.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return lblCandidatos_G22;
	}
	private JPanel getPanelValor_G23() {
		if (panelValor_G23 == null) {
			panelValor_G23 = new JPanel();
			panelValor_G23.add(getLblValor_G23());
		}
		return panelValor_G23;
	}
	private JLabel getLblValor_G23() {
		if (lblValor_G23 == null) {
			lblValor_G23 = new JLabel(" ");
			lblValor_G23.setVerticalAlignment(SwingConstants.BOTTOM);
			lblValor_G23.setHorizontalAlignment(SwingConstants.LEFT);
			lblValor_G23.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor_G23;
	}
	private JPanel getPanelCandidatos_G23() {
		if (panelCandidatos_G23 == null) {
			panelCandidatos_G23 = new JPanel();
			panelCandidatos_G23.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panelCandidatos_G23.add(getLblCandidatos_G23());
		}
		return panelCandidatos_G23;
	}
	private JLabel getLblCandidatos_G23() {
		if (lblCandidatos_G23 == null) {
			lblCandidatos_G23 = new JLabel(" ");
			lblCandidatos_G23.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return lblCandidatos_G23;
	}
	private JPanel getPanelValor_G31() {
		if (panelValor_G31 == null) {
			panelValor_G31 = new JPanel();
			panelValor_G31.add(getLblValor_G31());
		}
		return panelValor_G31;
	}
	private JLabel getLblValor_G31() {
		if (lblValor_G31 == null) {
			lblValor_G31 = new JLabel(" ");
			lblValor_G31.setVerticalAlignment(SwingConstants.BOTTOM);
			lblValor_G31.setHorizontalAlignment(SwingConstants.LEFT);
			lblValor_G31.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor_G31;
	}
	private JPanel getPanelCandidatos_G31() {
		if (panelCandidatos_G31 == null) {
			panelCandidatos_G31 = new JPanel();
			panelCandidatos_G31.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panelCandidatos_G31.add(getLblCandidatos_G31());
		}
		return panelCandidatos_G31;
	}
	private JLabel getLblCandidatos_G31() {
		if (lblCandidatos_G31 == null) {
			lblCandidatos_G31 = new JLabel(" ");
			lblCandidatos_G31.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return lblCandidatos_G31;
	}
	private JPanel getPanelValor_G32() {
		if (panelValor_G32 == null) {
			panelValor_G32 = new JPanel();
			panelValor_G32.add(getLblValor_G32());
		}
		return panelValor_G32;
	}
	private JLabel getLblValor_G32() {
		if (lblValor_G32 == null) {
			lblValor_G32 = new JLabel(" ");
			lblValor_G32.setVerticalAlignment(SwingConstants.BOTTOM);
			lblValor_G32.setHorizontalAlignment(SwingConstants.LEFT);
			lblValor_G32.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor_G32;
	}
	private JPanel getPanelCandidatos_G32() {
		if (panelCandidatos_G32 == null) {
			panelCandidatos_G32 = new JPanel();
			panelCandidatos_G32.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panelCandidatos_G32.add(getLblCandidatos_G32());
		}
		return panelCandidatos_G32;
	}
	private JLabel getLblCandidatos_G32() {
		if (lblCandidatos_G32 == null) {
			lblCandidatos_G32 = new JLabel(" ");
			lblCandidatos_G32.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return lblCandidatos_G32;
	}
	private JPanel getPanelValor_G33() {
		if (panelValor_G33 == null) {
			panelValor_G33 = new JPanel();
			panelValor_G33.add(getLblValor_G33());
		}
		return panelValor_G33;
	}
	private JLabel getLblValor_G33() {
		if (lblValor_G33 == null) {
			lblValor_G33 = new JLabel(" ");
			lblValor_G33.setVerticalAlignment(SwingConstants.BOTTOM);
			lblValor_G33.setHorizontalAlignment(SwingConstants.LEFT);
			lblValor_G33.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor_G33;
	}
	private JPanel getPanelCandidatos_G33() {
		if (panelCandidatos_G33 == null) {
			panelCandidatos_G33 = new JPanel();
			panelCandidatos_G33.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panelCandidatos_G33.add(getLblCandidatos_G33());
		}
		return panelCandidatos_G33;
	}
	private JLabel getLblCandidatos_G33() {
		if (lblCandidatos_G33 == null) {
			lblCandidatos_G33 = new JLabel(" ");
			lblCandidatos_G33.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return lblCandidatos_G33;
	}
	private JPanel getPanelValor_H11() {
		if (panelValor_H11 == null) {
			panelValor_H11 = new JPanel();
			panelValor_H11.add(getLblValor_H11());
		}
		return panelValor_H11;
	}
	private JLabel getLblValor_H11() {
		if (lblValor_H11 == null) {
			lblValor_H11 = new JLabel(" ");
			lblValor_H11.setVerticalAlignment(SwingConstants.BOTTOM);
			lblValor_H11.setHorizontalAlignment(SwingConstants.LEFT);
			lblValor_H11.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor_H11;
	}
	private JPanel getPanelCandidatos_H11() {
		if (panelCandidatos_H11 == null) {
			panelCandidatos_H11 = new JPanel();
			panelCandidatos_H11.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panelCandidatos_H11.add(getLblCandidatos_H11());
		}
		return panelCandidatos_H11;
	}
	private JLabel getLblCandidatos_H11() {
		if (lblCandidatos_H11 == null) {
			lblCandidatos_H11 = new JLabel(" ");
			lblCandidatos_H11.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return lblCandidatos_H11;
	}
	private JPanel getPanelValor_H12() {
		if (panelValor_H12 == null) {
			panelValor_H12 = new JPanel();
			panelValor_H12.add(getLblValor_H12());
		}
		return panelValor_H12;
	}
	private JLabel getLblValor_H12() {
		if (lblValor_H12 == null) {
			lblValor_H12 = new JLabel(" ");
			lblValor_H12.setVerticalAlignment(SwingConstants.BOTTOM);
			lblValor_H12.setHorizontalAlignment(SwingConstants.LEFT);
			lblValor_H12.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor_H12;
	}
	private JPanel getPanelCandidatos_H12() {
		if (panelCandidatos_H12 == null) {
			panelCandidatos_H12 = new JPanel();
			panelCandidatos_H12.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panelCandidatos_H12.add(getLblCandidatos_H12());
		}
		return panelCandidatos_H12;
	}
	private JLabel getLblCandidatos_H12() {
		if (lblCandidatos_H12 == null) {
			lblCandidatos_H12 = new JLabel(" ");
			lblCandidatos_H12.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return lblCandidatos_H12;
	}
	private JPanel getPanelValor_H13() {
		if (panelValor_H13 == null) {
			panelValor_H13 = new JPanel();
			panelValor_H13.add(getLblValor_H13());
		}
		return panelValor_H13;
	}
	private JLabel getLblValor_H13() {
		if (lblValor_H13 == null) {
			lblValor_H13 = new JLabel(" ");
			lblValor_H13.setVerticalAlignment(SwingConstants.BOTTOM);
			lblValor_H13.setHorizontalAlignment(SwingConstants.LEFT);
			lblValor_H13.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor_H13;
	}
	private JPanel getPanelCandidatos_H13() {
		if (panelCandidatos_H13 == null) {
			panelCandidatos_H13 = new JPanel();
			panelCandidatos_H13.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panelCandidatos_H13.add(getLblCandidatos_H13());
		}
		return panelCandidatos_H13;
	}
	private JLabel getLblCandidatos_H13() {
		if (lblCandidatos_H13 == null) {
			lblCandidatos_H13 = new JLabel(" ");
			lblCandidatos_H13.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return lblCandidatos_H13;
	}
	private JPanel getPanelValor_H21() {
		if (panelValor_H21 == null) {
			panelValor_H21 = new JPanel();
			panelValor_H21.add(getLblValor_H21());
		}
		return panelValor_H21;
	}
	private JLabel getLblValor_H21() {
		if (lblValor_H21 == null) {
			lblValor_H21 = new JLabel(" ");
			lblValor_H21.setVerticalAlignment(SwingConstants.BOTTOM);
			lblValor_H21.setHorizontalAlignment(SwingConstants.LEFT);
			lblValor_H21.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor_H21;
	}
	private JPanel getPanelCandidatos_H21() {
		if (panelCandidatos_H21 == null) {
			panelCandidatos_H21 = new JPanel();
			panelCandidatos_H21.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panelCandidatos_H21.add(getLblCandidatos_H21());
		}
		return panelCandidatos_H21;
	}
	private JLabel getLblCandidatos_H21() {
		if (lblCandidatos_H21 == null) {
			lblCandidatos_H21 = new JLabel(" ");
			lblCandidatos_H21.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return lblCandidatos_H21;
	}
	private JPanel getPanelValor_H22() {
		if (panelValor_H22 == null) {
			panelValor_H22 = new JPanel();
			panelValor_H22.add(getLblValor_H22());
		}
		return panelValor_H22;
	}
	private JLabel getLblValor_H22() {
		if (lblValor_H22 == null) {
			lblValor_H22 = new JLabel(" ");
			lblValor_H22.setVerticalAlignment(SwingConstants.BOTTOM);
			lblValor_H22.setHorizontalAlignment(SwingConstants.LEFT);
			lblValor_H22.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor_H22;
	}
	private JPanel getPanelCandidatos_H22() {
		if (panelCandidatos_H22 == null) {
			panelCandidatos_H22 = new JPanel();
			panelCandidatos_H22.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panelCandidatos_H22.add(getLblCandidatos_H22());
		}
		return panelCandidatos_H22;
	}
	private JLabel getLblCandidatos_H22() {
		if (lblCandidatos_H22 == null) {
			lblCandidatos_H22 = new JLabel(" ");
			lblCandidatos_H22.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return lblCandidatos_H22;
	}
	private JPanel getPanelValor_H23() {
		if (panelValor_H23 == null) {
			panelValor_H23 = new JPanel();
			panelValor_H23.add(getLblValor_H23());
		}
		return panelValor_H23;
	}
	private JLabel getLblValor_H23() {
		if (lblValor_H23 == null) {
			lblValor_H23 = new JLabel(" ");
			lblValor_H23.setVerticalAlignment(SwingConstants.BOTTOM);
			lblValor_H23.setHorizontalAlignment(SwingConstants.LEFT);
			lblValor_H23.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor_H23;
	}
	private JPanel getPanelCandidatos_H23() {
		if (panelCandidatos_H23 == null) {
			panelCandidatos_H23 = new JPanel();
			panelCandidatos_H23.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panelCandidatos_H23.add(getLblCandidatos_H23());
		}
		return panelCandidatos_H23;
	}
	private JLabel getLblCandidatos_H23() {
		if (lblCandidatos_H23 == null) {
			lblCandidatos_H23 = new JLabel(" ");
			lblCandidatos_H23.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return lblCandidatos_H23;
	}
	private JPanel getPanelValor_H31() {
		if (panelValor_H31 == null) {
			panelValor_H31 = new JPanel();
			panelValor_H31.add(getLblValor_H31());
		}
		return panelValor_H31;
	}
	private JLabel getLblValor_H31() {
		if (lblValor_H31 == null) {
			lblValor_H31 = new JLabel(" ");
			lblValor_H31.setVerticalAlignment(SwingConstants.BOTTOM);
			lblValor_H31.setHorizontalAlignment(SwingConstants.LEFT);
			lblValor_H31.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor_H31;
	}
	private JPanel getPanelCandidatos_H31() {
		if (panelCandidatos_H31 == null) {
			panelCandidatos_H31 = new JPanel();
			panelCandidatos_H31.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panelCandidatos_H31.add(getLblCandidatos_H31());
		}
		return panelCandidatos_H31;
	}
	private JLabel getLblCandidatos_H31() {
		if (lblCandidatos_H31 == null) {
			lblCandidatos_H31 = new JLabel(" ");
			lblCandidatos_H31.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return lblCandidatos_H31;
	}
	private JPanel getPanelValor_H32() {
		if (panelValor_H32 == null) {
			panelValor_H32 = new JPanel();
			panelValor_H32.add(getLblValor_H32());
		}
		return panelValor_H32;
	}
	private JLabel getLblValor_H32() {
		if (lblValor_H32 == null) {
			lblValor_H32 = new JLabel(" ");
			lblValor_H32.setVerticalAlignment(SwingConstants.BOTTOM);
			lblValor_H32.setHorizontalAlignment(SwingConstants.LEFT);
			lblValor_H32.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor_H32;
	}
	private JPanel getPanelCandidatos_H32() {
		if (panelCandidatos_H32 == null) {
			panelCandidatos_H32 = new JPanel();
			panelCandidatos_H32.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panelCandidatos_H32.add(getLblCandidatos_H32());
		}
		return panelCandidatos_H32;
	}
	private JLabel getLblCandidatos_H32() {
		if (lblCandidatos_H32 == null) {
			lblCandidatos_H32 = new JLabel(" ");
			lblCandidatos_H32.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return lblCandidatos_H32;
	}
	private JPanel getPanelValor_H33() {
		if (panelValor_H33 == null) {
			panelValor_H33 = new JPanel();
			panelValor_H33.add(getLblValor_H33());
		}
		return panelValor_H33;
	}
	private JLabel getLblValor_H33() {
		if (lblValor_H33 == null) {
			lblValor_H33 = new JLabel(" ");
			lblValor_H33.setVerticalAlignment(SwingConstants.BOTTOM);
			lblValor_H33.setHorizontalAlignment(SwingConstants.LEFT);
			lblValor_H33.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor_H33;
	}
	private JPanel getPanelCandidatos_H33() {
		if (panelCandidatos_H33 == null) {
			panelCandidatos_H33 = new JPanel();
			panelCandidatos_H33.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panelCandidatos_H33.add(getLblCandidatos_H33());
		}
		return panelCandidatos_H33;
	}
	private JLabel getLblCandidatos_H33() {
		if (lblCandidatos_H33 == null) {
			lblCandidatos_H33 = new JLabel(" ");
			lblCandidatos_H33.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return lblCandidatos_H33;
	}
	private JPanel getPanelValor_I11() {
		if (panelValor_I11 == null) {
			panelValor_I11 = new JPanel();
			panelValor_I11.add(getLblValor_I11());
		}
		return panelValor_I11;
	}
	private JLabel getLblValor_I11() {
		if (lblValor_I11 == null) {
			lblValor_I11 = new JLabel(" ");
			lblValor_I11.setVerticalAlignment(SwingConstants.BOTTOM);
			lblValor_I11.setHorizontalAlignment(SwingConstants.LEFT);
			lblValor_I11.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor_I11;
	}
	private JPanel getPanelCandidatos_I11() {
		if (panelCandidatos_I11 == null) {
			panelCandidatos_I11 = new JPanel();
			panelCandidatos_I11.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panelCandidatos_I11.add(getLblCandidatos_I11());
		}
		return panelCandidatos_I11;
	}
	private JLabel getLblCandidatos_I11() {
		if (lblCandidatos_I11 == null) {
			lblCandidatos_I11 = new JLabel(" ");
			lblCandidatos_I11.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return lblCandidatos_I11;
	}
	private JPanel getPanelValor_I12() {
		if (panelValor_I12 == null) {
			panelValor_I12 = new JPanel();
			panelValor_I12.add(getLblValor_I12());
		}
		return panelValor_I12;
	}
	private JLabel getLblValor_I12() {
		if (lblValor_I12 == null) {
			lblValor_I12 = new JLabel(" ");
			lblValor_I12.setVerticalAlignment(SwingConstants.BOTTOM);
			lblValor_I12.setHorizontalAlignment(SwingConstants.LEFT);
			lblValor_I12.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor_I12;
	}
	private JPanel getPanelCandidatos_I12() {
		if (panelCandidatos_I12 == null) {
			panelCandidatos_I12 = new JPanel();
			panelCandidatos_I12.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panelCandidatos_I12.add(getLblCandidatos_I12());
		}
		return panelCandidatos_I12;
	}
	private JLabel getLblCandidatos_I12() {
		if (lblCandidatos_I12 == null) {
			lblCandidatos_I12 = new JLabel(" ");
			lblCandidatos_I12.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return lblCandidatos_I12;
	}
	private JPanel getPanelValor_I13() {
		if (panelValor_I13 == null) {
			panelValor_I13 = new JPanel();
			panelValor_I13.add(getLblValor_I13());
		}
		return panelValor_I13;
	}
	private JLabel getLblValor_I13() {
		if (lblValor_I13 == null) {
			lblValor_I13 = new JLabel(" ");
			lblValor_I13.setVerticalAlignment(SwingConstants.BOTTOM);
			lblValor_I13.setHorizontalAlignment(SwingConstants.LEFT);
			lblValor_I13.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor_I13;
	}
	private JPanel getPanelCandidatos_I13() {
		if (panelCandidatos_I13 == null) {
			panelCandidatos_I13 = new JPanel();
			panelCandidatos_I13.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panelCandidatos_I13.add(getLblCandidatos_I13());
		}
		return panelCandidatos_I13;
	}
	private JLabel getLblCandidatos_I13() {
		if (lblCandidatos_I13 == null) {
			lblCandidatos_I13 = new JLabel(" ");
			lblCandidatos_I13.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return lblCandidatos_I13;
	}
	private JPanel getPanelValor_I21() {
		if (panelValor_I21 == null) {
			panelValor_I21 = new JPanel();
			panelValor_I21.add(getLblValor_I21());
		}
		return panelValor_I21;
	}
	private JLabel getLblValor_I21() {
		if (lblValor_I21 == null) {
			lblValor_I21 = new JLabel(" ");
			lblValor_I21.setVerticalAlignment(SwingConstants.BOTTOM);
			lblValor_I21.setHorizontalAlignment(SwingConstants.LEFT);
			lblValor_I21.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor_I21;
	}
	private JPanel getPanelCandidatos_I21() {
		if (panelCandidatos_I21 == null) {
			panelCandidatos_I21 = new JPanel();
			panelCandidatos_I21.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panelCandidatos_I21.add(getLblCandidatos_I21());
		}
		return panelCandidatos_I21;
	}
	private JLabel getLblCandidatos_I21() {
		if (lblCandidatos_I21 == null) {
			lblCandidatos_I21 = new JLabel(" ");
			lblCandidatos_I21.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return lblCandidatos_I21;
	}
	private JPanel getPanelValor_I22() {
		if (panelValor_I22 == null) {
			panelValor_I22 = new JPanel();
			panelValor_I22.add(getLblValor_I22());
		}
		return panelValor_I22;
	}
	private JLabel getLblValor_I22() {
		if (lblValor_I22 == null) {
			lblValor_I22 = new JLabel(" ");
			lblValor_I22.setVerticalAlignment(SwingConstants.BOTTOM);
			lblValor_I22.setHorizontalAlignment(SwingConstants.LEFT);
			lblValor_I22.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor_I22;
	}
	private JPanel getPanelCandidatos_I22() {
		if (panelCandidatos_I22 == null) {
			panelCandidatos_I22 = new JPanel();
			panelCandidatos_I22.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panelCandidatos_I22.add(getLblCandidatos_I22());
		}
		return panelCandidatos_I22;
	}
	private JLabel getLblCandidatos_I22() {
		if (lblCandidatos_I22 == null) {
			lblCandidatos_I22 = new JLabel(" ");
			lblCandidatos_I22.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return lblCandidatos_I22;
	}
	private JPanel getPanelValor_I23() {
		if (panelValor_I23 == null) {
			panelValor_I23 = new JPanel();
			panelValor_I23.add(getLblValor_I23());
		}
		return panelValor_I23;
	}
	private JLabel getLblValor_I23() {
		if (lblValor_I23 == null) {
			lblValor_I23 = new JLabel(" ");
			lblValor_I23.setVerticalAlignment(SwingConstants.BOTTOM);
			lblValor_I23.setHorizontalAlignment(SwingConstants.LEFT);
			lblValor_I23.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor_I23;
	}
	private JPanel getPanelCandidatos_I23() {
		if (panelCandidatos_I23 == null) {
			panelCandidatos_I23 = new JPanel();
			panelCandidatos_I23.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panelCandidatos_I23.add(getLblCandidatos_I23());
		}
		return panelCandidatos_I23;
	}
	private JLabel getLblCandidatos_I23() {
		if (lblCandidatos_I23 == null) {
			lblCandidatos_I23 = new JLabel(" ");
			lblCandidatos_I23.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return lblCandidatos_I23;
	}
	private JPanel getPanelValor_I31() {
		if (panelValor_I31 == null) {
			panelValor_I31 = new JPanel();
			panelValor_I31.add(getLblValor_I31());
		}
		return panelValor_I31;
	}
	private JLabel getLblValor_I31() {
		if (lblValor_I31 == null) {
			lblValor_I31 = new JLabel(" ");
			lblValor_I31.setVerticalAlignment(SwingConstants.BOTTOM);
			lblValor_I31.setHorizontalAlignment(SwingConstants.LEFT);
			lblValor_I31.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor_I31;
	}
	private JPanel getPanelCandidatos_I31() {
		if (panelCandidatos_I31 == null) {
			panelCandidatos_I31 = new JPanel();
			panelCandidatos_I31.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panelCandidatos_I31.add(getLblCandidatos_I31());
		}
		return panelCandidatos_I31;
	}
	private JLabel getLblCandidatos_I31() {
		if (lblCandidatos_I31 == null) {
			lblCandidatos_I31 = new JLabel(" ");
			lblCandidatos_I31.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return lblCandidatos_I31;
	}
	private JPanel getPanelValor_I32() {
		if (panelValor_I32 == null) {
			panelValor_I32 = new JPanel();
			panelValor_I32.add(getLblValor_I32());
		}
		return panelValor_I32;
	}
	private JLabel getLblValor_I32() {
		if (lblValor_I32 == null) {
			lblValor_I32 = new JLabel(" ");
			lblValor_I32.setVerticalAlignment(SwingConstants.BOTTOM);
			lblValor_I32.setHorizontalAlignment(SwingConstants.LEFT);
			lblValor_I32.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor_I32;
	}
	private JPanel getPanelCandidatos_I32() {
		if (panelCandidatos_I32 == null) {
			panelCandidatos_I32 = new JPanel();
			panelCandidatos_I32.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panelCandidatos_I32.add(getLblCandidatos_I32());
		}
		return panelCandidatos_I32;
	}
	private JLabel getLblCandidatos_I32() {
		if (lblCandidatos_I32 == null) {
			lblCandidatos_I32 = new JLabel(" ");
			lblCandidatos_I32.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return lblCandidatos_I32;
	}
	private JPanel getPanelValor_I33() {
		if (panelValor_I33 == null) {
			panelValor_I33 = new JPanel();
			panelValor_I33.add(getLblValor_I33());
		}
		return panelValor_I33;
	}
	private JLabel getLblValor_I33() {
		if (lblValor_I33 == null) {
			lblValor_I33 = new JLabel(" ");
			lblValor_I33.setVerticalAlignment(SwingConstants.BOTTOM);
			lblValor_I33.setHorizontalAlignment(SwingConstants.LEFT);
			lblValor_I33.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor_I33;
	}
	private JPanel getPanelCandidatos_I33() {
		if (panelCandidatos_I33 == null) {
			panelCandidatos_I33 = new JPanel();
			panelCandidatos_I33.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panelCandidatos_I33.add(getLblCandidatos_I33());
		}
		return panelCandidatos_I33;
	}
	private JLabel getLblCandidatos_I33() {
		if (lblCandidatos_I33 == null) {
			lblCandidatos_I33 = new JLabel(" ");
			lblCandidatos_I33.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return lblCandidatos_I33;
	}
	public JPanel casillaSelect(MouseEvent event, JPanel select) {
		JPanel seleccionado = (JPanel) event.getSource();
		if (seleccionado.getBorder().equals(bordeNormal) && select==null){
			seleccionado.setBorder(bordeGrueso);
			for (Component x1: seleccionado.getComponents()) {
				if (x1 instanceof JPanel) {
					for (Component x2: ((JPanel) x1).getComponents()) {
						if (x2 instanceof JLabel) {
							if (((JLabel) x2).getFont().equals(new Font("Tahoma", Font.PLAIN, 20))) {
								textFieldValor.setText(((JLabel) x2).getText());
							} else {
								textFieldCandidatos.setText(((JLabel) x2).getText());
							}
						}
					}
				}
			}
			select=seleccionado;
		}else if (seleccionado.getBorder().equals(bordeGrueso) && select!=null) {
			seleccionado.setBorder(bordeNormal);
			textFieldCandidatos.setText("");
			textFieldValor.setText("");
			select=null;
		}
		return(select);
	}

	@Override
	public void update(Observable o, Object arg) {
		controlador.Casilla[][] t = controlador.Tablero.getTablero().getListaCasillas();
		//PanelValor_LetraFilaColumna
		int i = 0;
		while (i < t.length) {
			int j = 0;
			while (j < t[0].length) {
				
			}
		}
		
		
	}
}

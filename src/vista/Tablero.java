package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.MouseEvent;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;


import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import javax.swing.border.EtchedBorder;
import javax.swing.border.MatteBorder;


import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;

@SuppressWarnings({ "serial", "deprecation" })
public class Tablero extends JFrame implements Observer{

	private JFrame frmSudokuRoyaleMaster;
	private JPanelBackground panelDatos;
	private JPanel panelTablero;
	private Border bordeNormal = new LineBorder(Color.BLACK, 1);
	private Border bordeGrueso = new LineBorder(Color.BLUE, 3);
	private JPanel select = null;
	private Border bordeTemp;
	private JTextField textFieldCandidatos;
	private JLabel lblCandidatos;
	private JLabel lblValor;
	private JTextField textFieldValor;
	private JButton btnModificar;
	private JButton btnAyuda;
	private JPanelBackground panelNorth;
	private JPanelBackground panelSouth;
	private JPanelBackground panelWest;
	private JPanel panel1_0;
	private JPanel panelValor;
	private JPanel panelCadidatos;
	private JLabel lblValor1;
	private JLabel lblCandidatos1;
	private JPanel panel1_1;
	private JPanel panelValor_1;
	private JLabel lblValor1_1;
	private JPanel panelCadidatos_1;
	private JLabel lblCandidatos1_1;
	private JPanel panel1_2;
	private JPanel panelValor_2;
	private JLabel lblValor1_2;
	private JPanel panelCadidatos_2;
	private JLabel lblCandidatos1_2;
	private JPanel panel1_3;
	private JPanel panelValor_3;
	private JLabel lblValor1_3;
	private JPanel panelCadidatos_3;
	private JLabel lblCandidatos1_3;
	private JPanel panel1_4;
	private JPanel panelValor_4;
	private JLabel lblValor1_4;
	private JPanel panelCadidatos_4;
	private JLabel lblCandidatos1_4;
	private JPanel panel1_5;
	private JPanel panelValor_5;
	private JLabel lblValor1_5;
	private JPanel panelCadidatos_5;
	private JLabel lblCandidatos1_5;
	private JPanel panel1_6;
	private JPanel panelValor_6;
	private JLabel lblValor1_6;
	private JPanel panelCadidatos_6;
	private JLabel lblCandidatos1_6;
	private JPanel panel1_7;
	private JPanel panelValor_7;
	private JLabel lblValor1_7;
	private JPanel panelCadidatos_7;
	private JLabel lblCandidatos1_7;
	private JPanel panel1_8;
	private JPanel panelValor_8;
	private JLabel lblValor1_8;
	private JPanel panelCadidatos_8;
	private JLabel lblCandidatos1_8;
	private JPanel panel1_9;
	private JPanel panelValor_9;
	private JLabel lblValor1_9;
	private JPanel panelCadidatos_9;
	private JLabel lblCandidatos1_9;
	private JPanel panel1_10;
	private JPanel panelValor_10;
	private JLabel lblValor1_10;
	private JPanel panelCadidatos_10;
	private JLabel lblCandidatos1_10;
	private JPanel panel1_11;
	private JPanel panelValor_11;
	private JLabel lblValor1_11;
	private JPanel panelCadidatos_11;
	private JLabel lblCandidatos1_11;
	private JPanel panel1_12;
	private JPanel panelValor_12;
	private JLabel lblValor1_12;
	private JPanel panelCadidatos_12;
	private JLabel lblCandidatos1_12;
	private JPanel panel1_13;
	private JPanel panelValor_13;
	private JLabel lblValor1_13;
	private JPanel panelCadidatos_13;
	private JLabel lblCandidatos1_13;
	private JPanel panel1_14;
	private JPanel panelValor_14;
	private JLabel lblValor1_14;
	private JPanel panelCadidatos_14;
	private JLabel lblCandidatos1_14;
	private JPanel panel1_15;
	private JPanel panelValor_15;
	private JLabel lblValor1_15;
	private JPanel panelCadidatos_15;
	private JLabel lblCandidatos1_15;
	private JPanel panel1_16;
	private JPanel panelValor_16;
	private JLabel lblValor1_16;
	private JPanel panelCadidatos_16;
	private JLabel lblCandidatos1_16;
	private JPanel panel1_17;
	private JPanel panelValor_17;
	private JLabel lblValor1_17;
	private JPanel panelCadidatos_17;
	private JLabel lblCandidatos1_17;
	private JPanel panel1_18;
	private JPanel panelValor_18;
	private JLabel lblValor1_18;
	private JPanel panelCadidatos_18;
	private JLabel lblCandidatos1_18;
	private JPanel panel1_19;
	private JPanel panelValor_19;
	private JLabel lblValor1_19;
	private JPanel panelCadidatos_19;
	private JLabel lblCandidatos1_19;
	private JPanel panel1_20;
	private JPanel panelValor_20;
	private JLabel lblValor1_20;
	private JPanel panelCadidatos_20;
	private JLabel lblCandidatos1_20;
	private JPanel panel1_21;
	private JPanel panelValor_21;
	private JLabel lblValor1_21;
	private JPanel panelCadidatos_21;
	private JLabel lblCandidatos1_21;
	private JPanel panel1_22;
	private JPanel panelValor_22;
	private JLabel lblValor1_22;
	private JPanel panelCadidatos_22;
	private JLabel lblCandidatos1_22;
	private JPanel panel1_23;
	private JPanel panelValor_23;
	private JLabel lblValor1_23;
	private JPanel panelCadidatos_23;
	private JLabel lblCandidatos1_23;
	private JPanel panel1_24;
	private JPanel panelValor_24;
	private JLabel lblValor1_24;
	private JPanel panelCadidatos_24;
	private JLabel lblCandidatos1_24;
	private JPanel panel1_25;
	private JPanel panelValor_25;
	private JLabel lblValor1_25;
	private JPanel panelCadidatos_25;
	private JLabel lblCandidatos1_25;
	private JPanel panel1_26;
	private JPanel panelValor_26;
	private JLabel lblValor1_26;
	private JPanel panelCadidatos_26;
	private JLabel lblCandidatos1_26;
	private JPanel panel1_27;
	private JPanel panelValor_27;
	private JLabel lblValor1_27;
	private JPanel panelCadidatos_27;
	private JLabel lblCandidatos1_27;
	private JPanel panel1_28;
	private JPanel panelValor_28;
	private JLabel lblValor1_28;
	private JPanel panelCadidatos_28;
	private JLabel lblCandidatos1_28;
	private JPanel panel1_29;
	private JPanel panelValor_29;
	private JLabel lblValor1_29;
	private JPanel panelCadidatos_29;
	private JLabel lblCandidatos1_29;
	private JPanel panel1_30;
	private JPanel panelValor_30;
	private JLabel lblValor1_30;
	private JPanel panelCadidatos_30;
	private JLabel lblCandidatos1_30;
	private JPanel panel1_31;
	private JPanel panelValor_31;
	private JLabel lblValor1_31;
	private JPanel panelCadidatos_31;
	private JLabel lblCandidatos1_31;
	private JPanel panel1_32;
	private JPanel panelValor_32;
	private JLabel lblValor1_32;
	private JPanel panelCadidatos_32;
	private JLabel lblCandidatos1_32;
	private JPanel panel1_33;
	private JPanel panelValor_33;
	private JLabel lblValor1_33;
	private JPanel panelCadidatos_33;
	private JLabel lblCandidatos1_33;
	private JPanel panel1_34;
	private JPanel panelValor_34;
	private JLabel lblValor1_34;
	private JPanel panelCadidatos_34;
	private JLabel lblCandidatos1_34;
	private JPanel panel1_35;
	private JPanel panelValor_35;
	private JLabel lblValor1_35;
	private JPanel panelCadidatos_35;
	private JLabel lblCandidatos1_35;
	private JPanel panel1_36;
	private JPanel panelValor_36;
	private JLabel lblValor1_36;
	private JPanel panelCadidatos_36;
	private JLabel lblCandidatos1_36;
	private JPanel panel1_37;
	private JPanel panelValor_37;
	private JLabel lblValor1_37;
	private JPanel panelCadidatos_37;
	private JLabel lblCandidatos1_37;
	private JPanel panel1_38;
	private JPanel panelValor_38;
	private JLabel lblValor1_38;
	private JPanel panelCadidatos_38;
	private JLabel lblCandidatos1_38;
	private JPanel panel1_39;
	private JPanel panelValor_39;
	private JLabel lblValor1_39;
	private JPanel panelCadidatos_39;
	private JLabel lblCandidatos1_39;
	private JPanel panel1_40;
	private JPanel panelValor_40;
	private JLabel lblValor1_40;
	private JPanel panelCadidatos_40;
	private JLabel lblCandidatos1_40;
	private JPanel panel1_41;
	private JPanel panelValor_41;
	private JLabel lblValor1_41;
	private JPanel panelCadidatos_41;
	private JLabel lblCandidatos1_41;
	private JPanel panel1_42;
	private JPanel panelValor_42;
	private JLabel lblValor1_42;
	private JPanel panelCadidatos_42;
	private JLabel lblCandidatos1_42;
	private JPanel panel1_43;
	private JPanel panelValor_43;
	private JLabel lblValor1_43;
	private JPanel panelCadidatos_43;
	private JLabel lblCandidatos1_43;
	private JPanel panel1_44;
	private JPanel panelValor_44;
	private JLabel lblValor1_44;
	private JPanel panelCadidatos_44;
	private JLabel lblCandidatos1_44;
	private JPanel panel1_45;
	private JPanel panelValor_45;
	private JLabel lblValor1_45;
	private JPanel panelCadidatos_45;
	private JLabel lblCandidatos1_45;
	private JPanel panel1_46;
	private JPanel panelValor_46;
	private JLabel lblValor1_46;
	private JPanel panelCadidatos_46;
	private JLabel lblCandidatos1_46;
	private JPanel panel1_47;
	private JPanel panelValor_47;
	private JLabel lblValor1_47;
	private JPanel panelCadidatos_47;
	private JLabel lblCandidatos1_47;
	private JPanel panel1_48;
	private JPanel panelValor_48;
	private JLabel lblValor1_48;
	private JPanel panelCadidatos_48;
	private JLabel lblCandidatos1_48;
	private JPanel panel1_49;
	private JPanel panelValor_49;
	private JLabel lblValor1_49;
	private JPanel panelCadidatos_49;
	private JLabel lblCandidatos1_49;
	private JPanel panel1_50;
	private JPanel panelValor_50;
	private JLabel lblValor1_50;
	private JPanel panelCadidatos_50;
	private JLabel lblCandidatos1_50;
	private JPanel panel1_51;
	private JPanel panelValor_51;
	private JLabel lblValor1_51;
	private JPanel panelCadidatos_51;
	private JLabel lblCandidatos1_51;
	private JPanel panel1_52;
	private JPanel panelValor_52;
	private JLabel lblValor1_52;
	private JPanel panelCadidatos_52;
	private JLabel lblCandidatos1_52;
	private JPanel panel1_53;
	private JPanel panelValor_53;
	private JLabel lblValor1_53;
	private JPanel panelCadidatos_53;
	private JLabel lblCandidatos1_53;
	private JPanel panel1_54;
	private JPanel panelValor_54;
	private JLabel lblValor1_54;
	private JPanel panelCadidatos_54;
	private JLabel lblCandidatos1_54;
	private JPanel panel1_55;
	private JPanel panelValor_55;
	private JLabel lblValor1_55;
	private JPanel panelCadidatos_55;
	private JLabel lblCandidatos1_55;
	private JPanel panel1_56;
	private JPanel panelValor_56;
	private JLabel lblValor1_56;
	private JPanel panelCadidatos_56;
	private JLabel lblCandidatos1_56;
	private JPanel panel1_57;
	private JPanel panelValor_57;
	private JLabel lblValor1_57;
	private JPanel panelCadidatos_57;
	private JLabel lblCandidatos1_57;
	private JPanel panel1_58;
	private JPanel panelValor_58;
	private JLabel lblValor1_58;
	private JPanel panelCadidatos_58;
	private JLabel lblCandidatos1_58;
	private JPanel panel1_59;
	private JPanel panelValor_59;
	private JLabel lblValor1_59;
	private JPanel panelCadidatos_59;
	private JLabel lblCandidatos1_59;
	private JPanel panel1_60;
	private JPanel panelValor_60;
	private JLabel lblValor1_60;
	private JPanel panelCadidatos_60;
	private JLabel lblCandidatos1_60;
	private JPanel panel1_61;
	private JPanel panelValor_61;
	private JLabel lblValor1_61;
	private JPanel panelCadidatos_61;
	private JLabel lblCandidatos1_61;
	private JPanel panel1_62;
	private JPanel panelValor_62;
	private JLabel lblValor1_62;
	private JPanel panelCadidatos_62;
	private JLabel lblCandidatos1_62;
	private JPanel panel1_63;
	private JPanel panelValor_63;
	private JLabel lblValor1_63;
	private JPanel panelCadidatos_63;
	private JLabel lblCandidatos1_63;
	private JPanel panel1_64;
	private JPanel panelValor_64;
	private JLabel lblValor1_64;
	private JPanel panelCadidatos_64;
	private JLabel lblCandidatos1_64;
	private JPanel panel1_65;
	private JPanel panelValor_65;
	private JLabel lblValor1_65;
	private JPanel panelCadidatos_65;
	private JLabel lblCandidatos1_65;
	private JPanel panel1_66;
	private JPanel panelValor_66;
	private JLabel lblValor1_66;
	private JPanel panelCadidatos_66;
	private JLabel lblCandidatos1_66;
	private JPanel panel1_67;
	private JPanel panelValor_67;
	private JLabel lblValor1_67;
	private JPanel panelCadidatos_67;
	private JLabel lblCandidatos1_67;
	private JPanel panel1_68;
	private JPanel panelValor_68;
	private JLabel lblValor1_68;
	private JPanel panelCadidatos_68;
	private JLabel lblCandidatos1_68;
	private JPanel panel1_69;
	private JPanel panelValor_69;
	private JLabel lblValor1_69;
	private JPanel panelCadidatos_69;
	private JLabel lblCandidatos1_69;
	private JPanel panel1_70;
	private JPanel panelValor_70;
	private JLabel lblValor1_70;
	private JPanel panelCadidatos_70;
	private JLabel lblCandidatos1_70;
	private JPanel panel1_71;
	private JPanel panelValor_71;
	private JLabel lblValor1_71;
	private JPanel panelCadidatos_71;
	private JLabel lblCandidatos1_71;
	private JPanel panel1_72;
	private JPanel panelValor_72;
	private JLabel lblValor1_72;
	private JPanel panelCadidatos_72;
	private JLabel lblCandidatos1_72;
	private JPanel panel1_73;
	private JPanel panelValor_73;
	private JLabel lblValor1_73;
	private JPanel panelCadidatos_73;
	private JLabel lblCandidatos1_73;
	private JPanel panel1_74;
	private JPanel panelValor_74;
	private JLabel lblValor1_74;
	private JPanel panelCadidatos_74;
	private JLabel lblCandidatos1_74;
	private JPanel panel1_75;
	private JPanel panelValor_75;
	private JLabel lblValor1_75;
	private JPanel panelCadidatos_75;
	private JLabel lblCandidatos1_75;
	private JPanel panel1_76;
	private JPanel panelValor_76;
	private JLabel lblValor1_76;
	private JPanel panelCadidatos_76;
	private JLabel lblCandidatos1_76;
	private JPanel panel1_77;
	private JPanel panelValor_77;
	private JLabel lblValor1_77;
	private JPanel panelCadidatos_77;
	private JLabel lblCandidatos1_77;
	private JPanel panel1_78;
	private JPanel panelValor_78;
	private JLabel lblValor1_78;
	private JPanel panelCadidatos_78;
	private JLabel lblCandidatos1_78;
	private JPanel panel1_79;
	private JPanel panelValor_79;
	private JLabel lblValor1_79;
	private JPanel panelCadidatos_79;
	private JLabel lblCandidatos1_79;
	private JPanel panel1_80;
	private JPanel panelValor_80;
	private JLabel lblValor1_80;
	private JPanel panelCadidatos_80;
	private JLabel lblCandidatos1_80;
	private JPanel panel;
	private JLabel lblCrono;
	private JPanel matrizPaneles[][];
	private JButton btnComprobar;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
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
	}*/

	/**
	 * Create the application.
	 */
	public Tablero() {
		matrizPaneles = new JPanel[9][9];
		initialize();
		System.out.println();
		ponerTamañoCandidatos();
		modelo.Tablero.getTablero().addObserver(this);
		
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void ponerTamañoCandidatos() {
		for (Component jP1: panelTablero.getComponents()) {
			for (Component jP2: ((JPanel) jP1).getComponents()) {
				for (Component lbl : ((JPanel) jP2).getComponents()) {
					if (!((JLabel) lbl).getFont().equals(new Font("Tahoma", Font.PLAIN, 20))) {
						((JLabel)lbl).setText(" ");
					}
				}
			}
		};
	}
	
	private void initialize() {
		frmSudokuRoyaleMaster = new JFrame();
		frmSudokuRoyaleMaster.setBackground(Color.BLACK);
		frmSudokuRoyaleMaster.setTitle("SUDOKU ROYALE MASTER");
		frmSudokuRoyaleMaster.setResizable(false);
		frmSudokuRoyaleMaster.setBounds(100, 100, 1000, 800);
		frmSudokuRoyaleMaster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSudokuRoyaleMaster.getContentPane().setLayout(new BorderLayout(0, 0));
		frmSudokuRoyaleMaster.getContentPane().add(getPanelWest(), BorderLayout.WEST);
		frmSudokuRoyaleMaster.getContentPane().add(getPanelSouth(), BorderLayout.SOUTH);
		frmSudokuRoyaleMaster.getContentPane().add(getPanelDatos(), BorderLayout.EAST);
		frmSudokuRoyaleMaster.getContentPane().add(getPanelTablero(), BorderLayout.CENTER);
		frmSudokuRoyaleMaster.getContentPane().add(getPanelNorth(), BorderLayout.NORTH);
		this.anadirAlArray();
		frmSudokuRoyaleMaster.setLocationRelativeTo(null);
		frmSudokuRoyaleMaster.setVisible(true);
	}

	private JPanelBackground getPanelDatos() {
		if (panelDatos == null) {
			panelDatos = new JPanelBackground();
			panelDatos.setBackground("resources/fondo sudoku datos.jpg");
			GridBagLayout gbl_panelDatos = new GridBagLayout();
			gbl_panelDatos.columnWidths = new int[]{18, 0, 117, 0, 0};
			gbl_panelDatos.rowHeights = new int[]{20, 0, 0, 0, 0, 0, 0, 0, 110, 11, 0};
			gbl_panelDatos.columnWeights = new double[]{1.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
			gbl_panelDatos.rowWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
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
			gbc_lblValor.gridy = 3;
			panelDatos.add(getLblValor(), gbc_lblValor);
			GridBagConstraints gbc_textFieldValor = new GridBagConstraints();
			gbc_textFieldValor.anchor = GridBagConstraints.WEST;
			gbc_textFieldValor.insets = new Insets(0, 0, 5, 5);
			gbc_textFieldValor.gridx = 2;
			gbc_textFieldValor.gridy = 3;
			panelDatos.add(getTextFieldValor(), gbc_textFieldValor);
			GridBagConstraints gbc_btnModificar = new GridBagConstraints();
			gbc_btnModificar.insets = new Insets(0, 0, 5, 5);
			gbc_btnModificar.gridx = 2;
			gbc_btnModificar.gridy = 4;
			panelDatos.add(getBtnModificar(), gbc_btnModificar);
			GridBagConstraints gbc_btnComprobar = new GridBagConstraints();
			gbc_btnComprobar.insets = new Insets(0, 0, 5, 5);
			gbc_btnComprobar.gridx = 1;
			gbc_btnComprobar.gridy = 6;
			panelDatos.add(getBtnComprobar(), gbc_btnComprobar);
			GridBagConstraints gbc_btnAyuda = new GridBagConstraints();
			gbc_btnAyuda.insets = new Insets(0, 0, 5, 5);
			gbc_btnAyuda.gridx = 2;
			gbc_btnAyuda.gridy = 6;
			panelDatos.add(getBtnAyuda(), gbc_btnAyuda);
			GridBagConstraints gbc_panel = new GridBagConstraints();
			gbc_panel.gridwidth = 2;
			gbc_panel.insets = new Insets(0, 0, 5, 5);
			gbc_panel.fill = GridBagConstraints.BOTH;
			gbc_panel.gridx = 1;
			gbc_panel.gridy = 8;
			panelDatos.add(getPanel(), gbc_panel);
		}
		return panelDatos;
	}	
	private JTextField getTextFieldCandidatos() {
		if (textFieldCandidatos == null) {
			textFieldCandidatos = new JTextField();
			textFieldCandidatos.setColumns(10);
			textFieldCandidatos.setEnabled(false);
		}
		return textFieldCandidatos;
	}
	private JLabel getLblCandidatos() {
		if (lblCandidatos == null) {
			lblCandidatos = new JLabel("Candidatos:");
			lblCandidatos.setFont(new Font("Gang of Three", Font.PLAIN, 15));
			lblCandidatos.setForeground(new Color(204, 153, 0));
		}
		return lblCandidatos;
	}
	private JLabel getLblValor() {
		if (lblValor == null) {
			lblValor = new JLabel("Valor:");
			lblValor.setFont(new Font("Gang of Three", Font.PLAIN, 15));
			lblValor.setForeground(new Color(204, 153, 0));
		}
		return lblValor;
	}
	private JTextField getTextFieldValor() {
		if (textFieldValor == null) {
			textFieldValor = new JTextField();
			textFieldValor.setColumns(10);
			textFieldValor.setEnabled(false);
		}
		return textFieldValor;
	}
	private JButton getBtnModificar() {
		if (btnModificar == null) {
			btnModificar = new JButton("Modificar");
			btnModificar.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 11));
			btnModificar.setEnabled(false);
			btnModificar.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if (select!=null) {
						for (Component x1: select.getComponents()) {
							for (Component x2: ((JPanel) x1).getComponents()) {
								if (((JLabel) x2).getFont().equals(new Font("Tahoma", Font.PLAIN, 20))){
									String numValor = textFieldValor.getText();
									char[] numValorL = numValor.toCharArray();
									if (numValorL.length>1) {
										JOptionPane.showMessageDialog(null, "Tan solo puede introducir un número", "Error Valor", JOptionPane.ERROR_MESSAGE);
										textFieldValor.setText("");
									}
									else if (numValorL.length!=0 && !Character.isDigit(numValorL[0])) {
										JOptionPane.showMessageDialog(null, "Debe introducir un número", "Error Valor", JOptionPane.ERROR_MESSAGE);
										textFieldValor.setText("");
									}
									else {	
										((JLabel) x2).setText(textFieldValor.getText());
										modelo.Tablero t = modelo.Tablero.getTablero();
										boolean enc = false;
										int i = 0;
										int j = 0;
										while (!enc && i < matrizPaneles.length) {
											j = 0;
											while (!enc && j < matrizPaneles[0].length) {
												if (select.equals(matrizPaneles[i][j])) {
													enc = true;
												}
												j++;
											}
											i++;
										}
										t.setValor(i-1, j-1, ((JLabel) x2).getText());
										} 
									}else {
										String numCandidatos = textFieldCandidatos.getText();
										char[] numCandidatosL = numCandidatos.toCharArray();
										boolean esNum = true;
										for (char c: numCandidatosL)
											if (Character.isAlphabetic(c)) {
												esNum=false;
											}
										if (textFieldCandidatos.getText().equals("")) {
											((JLabel) x2).setText(" ");
										}
										else if (!esNum) {
											JOptionPane.showMessageDialog(null, "Los candidatos deben de ser números", "Error Candidatos",JOptionPane.ERROR_MESSAGE);
										}
										else {
										((JLabel) x2).setText(textFieldCandidatos.getText());
										}
									}
								}
							}
						}
						textFieldCandidatos.setText("");
						textFieldValor.setText("");
						select.setBorder(bordeTemp);
						select=null;
						btnModificar.setEnabled(false);
						textFieldCandidatos.setEnabled(false);
						textFieldValor.setEnabled(false);
					}
			});
		}
		return btnModificar;
	}
	private JButton getBtnAyuda() {
		if (btnAyuda == null) {
			btnAyuda = new JButton("Ayuda");
			btnAyuda.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 11));
		}
		return btnAyuda;
	}
	private JPanelBackground getPanelNorth() {
		if (panelNorth == null) {
			panelNorth = new JPanelBackground();
			panelNorth.setBackground("resources/fondo titulo.jpg");
			GridBagLayout gbl_panelNorth = new GridBagLayout();
			gbl_panelNorth.columnWidths = new int[]{923, 0};
			gbl_panelNorth.rowHeights = new int[]{170, 0};
			gbl_panelNorth.columnWeights = new double[]{0.0, Double.MIN_VALUE};
			gbl_panelNorth.rowWeights = new double[]{0.0, Double.MIN_VALUE};
			panelNorth.setLayout(gbl_panelNorth);
		}
		return panelNorth;
	}
	private JPanelBackground getPanelSouth() {
		if (panelSouth == null) {
			panelSouth = new JPanelBackground();
			panelSouth.setBackground("resources/fondo sudoku south.jpg");
		}
		return panelSouth;
	}
	private JPanelBackground getPanelWest() {
		if (panelWest == null) {
			panelWest = new JPanelBackground();
			panelWest.setBackground("resources/fondo sudoku west.jpg");
		}
		return panelWest;
	}
	//panel principal
	private JPanel getPanelTablero() {
		if (panelTablero == null) {
			panelTablero = new JPanel();
			panelTablero.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
			panelTablero.setLayout(new GridLayout(9, 9, 0, 0));
			panelTablero.add(getPanel1_0());
			panelTablero.add(getPanel1_1());
			panelTablero.add(getPanel1_2());
			panelTablero.add(getPanel1_3());
			panelTablero.add(getPanel1_4());
			panelTablero.add(getPanel1_5());
			panelTablero.add(getPanel1_6());
			panelTablero.add(getPanel1_7());
			panelTablero.add(getPanel1_8());
			panelTablero.add(getPanel1_9());
			panelTablero.add(getPanel1_10());
			panelTablero.add(getPanel1_11());
			panelTablero.add(getPanel1_12());
			panelTablero.add(getPanel1_13());
			panelTablero.add(getPanel1_14());
			panelTablero.add(getPanel1_15());
			panelTablero.add(getPanel1_16());
			panelTablero.add(getPanel1_17());
			panelTablero.add(getPanel1_18());
			panelTablero.add(getPanel1_19());
			panelTablero.add(getPanel1_20());
			panelTablero.add(getPanel1_21());
			panelTablero.add(getPanel1_22());
			panelTablero.add(getPanel1_23());
			panelTablero.add(getPanel1_24());
			panelTablero.add(getPanel1_25());
			panelTablero.add(getPanel1_26());
			panelTablero.add(getPanel1_27());
			panelTablero.add(getPanel1_28());
			panelTablero.add(getPanel1_29());
			panelTablero.add(getPanel1_30());
			panelTablero.add(getPanel1_31());
			panelTablero.add(getPanel1_32());
			panelTablero.add(getPanel1_33());
			panelTablero.add(getPanel1_34());
			panelTablero.add(getPanel1_35());
			panelTablero.add(getPanel1_36());
			panelTablero.add(getPanel1_37());
			panelTablero.add(getPanel1_38());
			panelTablero.add(getPanel1_39());
			panelTablero.add(getPanel1_40());
			panelTablero.add(getPanel1_41());
			panelTablero.add(getPanel1_42());
			panelTablero.add(getPanel1_43());
			panelTablero.add(getPanel1_44());
			panelTablero.add(getPanel1_45());
			panelTablero.add(getPanel1_46());
			panelTablero.add(getPanel1_47());
			panelTablero.add(getPanel1_48());
			panelTablero.add(getPanel1_49());
			panelTablero.add(getPanel1_50());
			panelTablero.add(getPanel1_51());
			panelTablero.add(getPanel1_52());
			panelTablero.add(getPanel1_53());
			panelTablero.add(getPanel1_54());
			panelTablero.add(getPanel1_55());
			panelTablero.add(getPanel1_56());
			panelTablero.add(getPanel1_57());
			panelTablero.add(getPanel1_58());
			panelTablero.add(getPanel1_59());
			panelTablero.add(getPanel1_60());
			panelTablero.add(getPanel1_61());
			panelTablero.add(getPanel1_62());
			panelTablero.add(getPanel1_63());
			panelTablero.add(getPanel1_64());
			panelTablero.add(getPanel1_65());
			panelTablero.add(getPanel1_66());
			panelTablero.add(getPanel1_67());
			panelTablero.add(getPanel1_68());
			panelTablero.add(getPanel1_69());
			panelTablero.add(getPanel1_70());
			panelTablero.add(getPanel1_71());
			panelTablero.add(getPanel1_72());
			panelTablero.add(getPanel1_73());
			panelTablero.add(getPanel1_74());
			panelTablero.add(getPanel1_75());
			panelTablero.add(getPanel1_76());
			panelTablero.add(getPanel1_77());
			panelTablero.add(getPanel1_78());
			panelTablero.add(getPanel1_79());
			panelTablero.add(getPanel1_80());
		}
		return panelTablero;
	}
	public JPanel casillaSelect(MouseEvent event) {
		JPanel seleccionado = (JPanel) event.getSource();
		if (!seleccionado.getBorder().equals(bordeGrueso) && select==null && seleccionado.isEnabled()){
			bordeTemp=seleccionado.getBorder();
			textFieldCandidatos.setEnabled(true);
			textFieldValor.setEnabled(true);
			textFieldValor.requestFocusInWindow();
			btnModificar.setEnabled(true);
			seleccionado.setBorder(bordeGrueso);
			for (Component x1: seleccionado.getComponents()) {
				for (Component x2: ((JPanel) x1).getComponents()) {
					if (((JLabel) x2).getFont().equals(new Font("Tahoma", Font.PLAIN, 20))) {
						textFieldValor.setText(((JLabel) x2).getText());
						
					} else {
						textFieldCandidatos.setText(((JLabel) x2).getText());
					}
				}
			}
			select=seleccionado;
		}else if (seleccionado.getBorder().equals(bordeGrueso) && select!=null) {
			seleccionado.setBorder(bordeTemp);
			textFieldCandidatos.setText("");
			textFieldValor.setText("");
			select=null;
			textFieldCandidatos.setEnabled(false);
			textFieldValor.setEnabled(false);
			btnModificar.setEnabled(false);
		}
		return(select);
	}

	@Override
	public void update(Observable o, Object arg) {
		modelo.Casilla[][] t = modelo.Tablero.getTablero().getListaCasillas();
		
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t[0].length; j++) {
				if (t[i][j].getValor() != 0) {
					((JLabel)((JPanel)matrizPaneles[i][j].getComponent(0)).getComponent(0)).setText(Integer.toString(t[i][j].getValor()));
					((JLabel)((JPanel)matrizPaneles[i][j].getComponent(0)).getComponent(0)).setForeground(Color.RED);
					matrizPaneles[i][j].setEnabled(false);
				}
				
			}
		}
		
		
	}
	private JPanel getPanel1_0() {
		if (panel1_0 == null) {
			panel1_0 = new JPanel();
			panel1_0.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e);
				}
			});
			panel1_0.setBorder(new MatteBorder(4, 4, 1, 1, (Color) new Color(0, 0, 0)));
			panel1_0.setLayout(new BorderLayout(0, 0));
			panel1_0.add(getPanel_1_1(), BorderLayout.CENTER);
			panel1_0.add(getPanelCadidatos(), BorderLayout.NORTH);
		}
		return panel1_0;
	}
	private JPanel getPanel_1_1() {
		if (panelValor == null) {
			panelValor = new JPanel();
			panelValor.add(getLblValor1());
			panelValor.setName("primer panel");
		}
		return panelValor;
	}
	private JPanel getPanelCadidatos() {
		if (panelCadidatos == null) {
			panelCadidatos = new JPanel();
			panelCadidatos.add(getLblCandidatos1());
		}
		return panelCadidatos;
	}
	private JLabel getLblValor1() {
		if (lblValor1 == null) {
			lblValor1 = new JLabel("");
			lblValor1.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblValor1.setName("etiqueta uno");
		}
		return lblValor1;
	}
	private JLabel getLblCandidatos1() {
		if (lblCandidatos1 == null) {
			lblCandidatos1 = new JLabel("");
		}
		return lblCandidatos1;
	}
	private JPanel getPanel1_1() {
		if (panel1_1 == null) {
			panel1_1 = new JPanel();
			panel1_1.setBorder(new MatteBorder(4, 1, 1, 1, (Color) new Color(0, 0, 0)));
			panel1_1.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e);
				}
			});
			panel1_1.setLayout(new BorderLayout(0, 0));
			panel1_1.add(getPanelValor_1(), BorderLayout.CENTER);
			panel1_1.add(getPanelCadidatos_1(), BorderLayout.NORTH);
		}
		return panel1_1;
	}
	private JPanel getPanelValor_1() {
		if (panelValor_1 == null) {
			panelValor_1 = new JPanel();
			panelValor_1.add(getLblValor1_1());
		}
		return panelValor_1;
	}
	private JLabel getLblValor1_1() {
		if (lblValor1_1 == null) {
			lblValor1_1 = new JLabel("");
			lblValor1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor1_1;
	}
	private JPanel getPanelCadidatos_1() {
		if (panelCadidatos_1 == null) {
			panelCadidatos_1 = new JPanel();
			panelCadidatos_1.add(getLblCandidatos1_1());
		}
		return panelCadidatos_1;
	}
	private JLabel getLblCandidatos1_1() {
		if (lblCandidatos1_1 == null) {
			lblCandidatos1_1 = new JLabel("");
		}
		return lblCandidatos1_1;
	}
	private JPanel getPanel1_2() {
		if (panel1_2 == null) {
			panel1_2 = new JPanel();
			panel1_2.setBorder(new MatteBorder(4, 1, 1, 3, (Color) new Color(0, 0, 0)));
			panel1_2.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e);
				}
			});
			panel1_2.setLayout(new BorderLayout(0, 0));
			panel1_2.add(getPanelValor_2(), BorderLayout.CENTER);
			panel1_2.add(getPanelCadidatos_2(), BorderLayout.NORTH);
		}
		return panel1_2;
	}
	private JPanel getPanelValor_2() {
		if (panelValor_2 == null) {
			panelValor_2 = new JPanel();
			panelValor_2.add(getLblValor1_2());
		}
		return panelValor_2;
	}
	private JLabel getLblValor1_2() {
		if (lblValor1_2 == null) {
			lblValor1_2 = new JLabel("");
			lblValor1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor1_2;
	}
	private JPanel getPanelCadidatos_2() {
		if (panelCadidatos_2 == null) {
			panelCadidatos_2 = new JPanel();
			panelCadidatos_2.add(getLblCandidatos1_2());
		}
		return panelCadidatos_2;
	}
	private JLabel getLblCandidatos1_2() {
		if (lblCandidatos1_2 == null) {
			lblCandidatos1_2 = new JLabel("");
		}
		return lblCandidatos1_2;
	}
	private JPanel getPanel1_3() {
		if (panel1_3 == null) {
			panel1_3 = new JPanel();
			panel1_3.setBorder(new MatteBorder(4, 3, 1, 1, (Color) new Color(0, 0, 0)));
			panel1_3.setLayout(new BorderLayout(0, 0));
			panel1_3.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e);
				}
			});
			panel1_3.add(getPanelValor_3(), BorderLayout.CENTER);
			panel1_3.add(getPanelCadidatos_3(), BorderLayout.NORTH);
		}
		return panel1_3;
	}
	private JPanel getPanelValor_3() {
		if (panelValor_3 == null) {
			panelValor_3 = new JPanel();
			panelValor_3.add(getLblValor1_3());
		}
		return panelValor_3;
	}
	private JLabel getLblValor1_3() {
		if (lblValor1_3 == null) {
			lblValor1_3 = new JLabel("");
			lblValor1_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor1_3;
	}
	private JPanel getPanelCadidatos_3() {
		if (panelCadidatos_3 == null) {
			panelCadidatos_3 = new JPanel();
			panelCadidatos_3.add(getLblCandidatos1_3());
		}
		return panelCadidatos_3;
	}
	private JLabel getLblCandidatos1_3() {
		if (lblCandidatos1_3 == null) {
			lblCandidatos1_3 = new JLabel("");
		}
		return lblCandidatos1_3;
	}
	private JPanel getPanel1_4() {
		if (panel1_4 == null) {
			panel1_4 = new JPanel();
			panel1_4.setBorder(new MatteBorder(4, 1, 1, 1, (Color) new Color(0, 0, 0)));
			panel1_4.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e);
				}
			});
			panel1_4.setLayout(new BorderLayout(0, 0));
			panel1_4.add(getPanelValor_4(), BorderLayout.CENTER);
			panel1_4.add(getPanelCadidatos_4(), BorderLayout.NORTH);
		}
		return panel1_4;
	}
	private JPanel getPanelValor_4() {
		if (panelValor_4 == null) {
			panelValor_4 = new JPanel();
			panelValor_4.add(getLblValor1_4());
		}
		return panelValor_4;
	}
	private JLabel getLblValor1_4() {
		if (lblValor1_4 == null) {
			lblValor1_4 = new JLabel("");
			lblValor1_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor1_4;
	}
	private JPanel getPanelCadidatos_4() {
		if (panelCadidatos_4 == null) {
			panelCadidatos_4 = new JPanel();
			panelCadidatos_4.add(getLblCandidatos1_4());
		}
		return panelCadidatos_4;
	}
	private JLabel getLblCandidatos1_4() {
		if (lblCandidatos1_4 == null) {
			lblCandidatos1_4 = new JLabel("");
		}
		return lblCandidatos1_4;
	}
	private JPanel getPanel1_5() {
		if (panel1_5 == null) {
			panel1_5 = new JPanel();
			panel1_5.setBorder(new MatteBorder(4, 1, 1, 3, (Color) new Color(0, 0, 0)));
			panel1_5.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e);
				}
			});
			panel1_5.setLayout(new BorderLayout(0, 0));
			panel1_5.add(getPanelValor_5(), BorderLayout.CENTER);
			panel1_5.add(getPanelCadidatos_5(), BorderLayout.NORTH);
		}
		return panel1_5;
	}
	private JPanel getPanelValor_5() {
		if (panelValor_5 == null) {
			panelValor_5 = new JPanel();
			panelValor_5.add(getLblValor1_5());
		}
		return panelValor_5;
	}
	private JLabel getLblValor1_5() {
		if (lblValor1_5 == null) {
			lblValor1_5 = new JLabel("");
			lblValor1_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor1_5;
	}
	private JPanel getPanelCadidatos_5() {
		if (panelCadidatos_5 == null) {
			panelCadidatos_5 = new JPanel();
			panelCadidatos_5.add(getLblCandidatos1_5());
		}
		return panelCadidatos_5;
	}
	private JLabel getLblCandidatos1_5() {
		if (lblCandidatos1_5 == null) {
			lblCandidatos1_5 = new JLabel("");
		}
		return lblCandidatos1_5;
	}
	private JPanel getPanel1_6() {
		if (panel1_6 == null) {
			panel1_6 = new JPanel();
			panel1_6.setBorder(new MatteBorder(4, 3, 1, 1, (Color) new Color(0, 0, 0)));
			panel1_6.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e);
				}
			});
			panel1_6.setLayout(new BorderLayout(0, 0));
			panel1_6.add(getPanelValor_6(), BorderLayout.CENTER);
			panel1_6.add(getPanelCadidatos_6(), BorderLayout.NORTH);
		}
		return panel1_6;
	}
	private JPanel getPanelValor_6() {
		if (panelValor_6 == null) {
			panelValor_6 = new JPanel();
			panelValor_6.add(getLblValor1_6());
		}
		return panelValor_6;
	}
	private JLabel getLblValor1_6() {
		if (lblValor1_6 == null) {
			lblValor1_6 = new JLabel("");
			lblValor1_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor1_6;
	}
	private JPanel getPanelCadidatos_6() {
		if (panelCadidatos_6 == null) {
			panelCadidatos_6 = new JPanel();
			panelCadidatos_6.add(getLblCandidatos1_6());
		}
		return panelCadidatos_6;
	}
	private JLabel getLblCandidatos1_6() {
		if (lblCandidatos1_6 == null) {
			lblCandidatos1_6 = new JLabel("");
		}
		return lblCandidatos1_6;
	}
	private JPanel getPanel1_7() {
		if (panel1_7 == null) {
			panel1_7 = new JPanel();
			panel1_7.setBorder(new MatteBorder(4, 1, 1, 1, (Color) new Color(0, 0, 0)));
			panel1_7.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e);
				}
			});
			panel1_7.setLayout(new BorderLayout(0, 0));
			panel1_7.add(getPanelValor_7(), BorderLayout.CENTER);
			panel1_7.add(getPanelCadidatos_7(), BorderLayout.NORTH);
		}
		return panel1_7;
	}
	private JPanel getPanelValor_7() {
		if (panelValor_7 == null) {
			panelValor_7 = new JPanel();
			panelValor_7.add(getLblValor1_7());
		}
		return panelValor_7;
	}
	private JLabel getLblValor1_7() {
		if (lblValor1_7 == null) {
			lblValor1_7 = new JLabel("");
			lblValor1_7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor1_7;
	}
	private JPanel getPanelCadidatos_7() {
		if (panelCadidatos_7 == null) {
			panelCadidatos_7 = new JPanel();
			panelCadidatos_7.add(getLblCandidatos1_7());
		}
		return panelCadidatos_7;
	}
	private JLabel getLblCandidatos1_7() {
		if (lblCandidatos1_7 == null) {
			lblCandidatos1_7 = new JLabel("");
		}
		return lblCandidatos1_7;
	}
	private JPanel getPanel1_8() {
		if (panel1_8 == null) {
			panel1_8 = new JPanel();
			panel1_8.setBorder(new MatteBorder(4, 1, 1, 4, (Color) new Color(0, 0, 0)));
			panel1_8.setLayout(new BorderLayout(0, 0));
			panel1_8.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e);
				}
			});
			panel1_8.add(getPanelValor_8(), BorderLayout.CENTER);
			panel1_8.add(getPanelCadidatos_8(), BorderLayout.NORTH);
		}
		return panel1_8;
	}
	private JPanel getPanelValor_8() {
		if (panelValor_8 == null) {
			panelValor_8 = new JPanel();
			panelValor_8.add(getLblValor1_8());
		}
		return panelValor_8;
	}
	private JLabel getLblValor1_8() {
		if (lblValor1_8 == null) {
			lblValor1_8 = new JLabel("");
			lblValor1_8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor1_8;
	}
	private JPanel getPanelCadidatos_8() {
		if (panelCadidatos_8 == null) {
			panelCadidatos_8 = new JPanel();
			panelCadidatos_8.add(getLblCandidatos1_8());
		}
		return panelCadidatos_8;
	}
	private JLabel getLblCandidatos1_8() {
		if (lblCandidatos1_8 == null) {
			lblCandidatos1_8 = new JLabel("");
		}
		return lblCandidatos1_8;
	}
	private JPanel getPanel1_9() {
		if (panel1_9 == null) {
			panel1_9 = new JPanel();
			panel1_9.setBorder(new MatteBorder(1, 4, 1, 1, (Color) new Color(0, 0, 0)));
			panel1_9.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e);
				}
			});
			panel1_9.setLayout(new BorderLayout(0, 0));
			panel1_9.add(getPanelValor_9(), BorderLayout.CENTER);
			panel1_9.add(getPanelCadidatos_9(), BorderLayout.NORTH);
		}
		return panel1_9;
	}
	private JPanel getPanelValor_9() {
		if (panelValor_9 == null) {
			panelValor_9 = new JPanel();
			panelValor_9.add(getLblValor1_9());
		}
		return panelValor_9;
	}
	private JLabel getLblValor1_9() {
		if (lblValor1_9 == null) {
			lblValor1_9 = new JLabel("");
			lblValor1_9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor1_9;
	}
	private JPanel getPanelCadidatos_9() {
		if (panelCadidatos_9 == null) {
			panelCadidatos_9 = new JPanel();
			panelCadidatos_9.add(getLblCandidatos1_9());
		}
		return panelCadidatos_9;
	}
	private JLabel getLblCandidatos1_9() {
		if (lblCandidatos1_9 == null) {
			lblCandidatos1_9 = new JLabel("");
		}
		return lblCandidatos1_9;
	}
	private JPanel getPanel1_10() {
		if (panel1_10 == null) {
			panel1_10 = new JPanel();
			panel1_10.setBorder(bordeNormal);
			panel1_10.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e);
				}
			});
			panel1_10.setLayout(new BorderLayout(0, 0));
			panel1_10.add(getPanelValor_10(), BorderLayout.CENTER);
			panel1_10.add(getPanelCadidatos_10(), BorderLayout.NORTH);
		}
		return panel1_10;
	}
	private JPanel getPanelValor_10() {
		if (panelValor_10 == null) {
			panelValor_10 = new JPanel();
			panelValor_10.add(getLblValor1_10());
		}
		return panelValor_10;
	}
	private JLabel getLblValor1_10() {
		if (lblValor1_10 == null) {
			lblValor1_10 = new JLabel("");
			lblValor1_10.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor1_10;
	}
	private JPanel getPanelCadidatos_10() {
		if (panelCadidatos_10 == null) {
			panelCadidatos_10 = new JPanel();
			panelCadidatos_10.add(getLblCandidatos1_10());
		}
		return panelCadidatos_10;
	}
	private JLabel getLblCandidatos1_10() {
		if (lblCandidatos1_10 == null) {
			lblCandidatos1_10 = new JLabel("");
		}
		return lblCandidatos1_10;
	}
	private JPanel getPanel1_11() {
		if (panel1_11 == null) {
			panel1_11 = new JPanel();
			panel1_11.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e);
				}
			});
			panel1_11.setBorder(new MatteBorder(1, 1, 1, 3, (Color) new Color(0, 0, 0)));
			panel1_11.setLayout(new BorderLayout(0, 0));
			panel1_11.add(getPanelValor_11());
			panel1_11.add(getPanelCadidatos_11(), BorderLayout.NORTH);
		}
		return panel1_11;
	}
	private JPanel getPanelValor_11() {
		if (panelValor_11 == null) {
			panelValor_11 = new JPanel();
			panelValor_11.add(getLblValor1_11());
		}
		return panelValor_11;
	}
	private JLabel getLblValor1_11() {
		if (lblValor1_11 == null) {
			lblValor1_11 = new JLabel("");
			lblValor1_11.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor1_11;
	}
	private JPanel getPanelCadidatos_11() {
		if (panelCadidatos_11 == null) {
			panelCadidatos_11 = new JPanel();
			panelCadidatos_11.add(getLblCandidatos1_11());
		}
		return panelCadidatos_11;
	}
	private JLabel getLblCandidatos1_11() {
		if (lblCandidatos1_11 == null) {
			lblCandidatos1_11 = new JLabel("");
		}
		return lblCandidatos1_11;
	}
	private JPanel getPanel1_12() {
		if (panel1_12 == null) {
			panel1_12 = new JPanel();
			panel1_12.setBorder(new MatteBorder(1, 3, 1, 1, (Color) new Color(0, 0, 0)));
			panel1_12.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e);
				}
			});
			panel1_12.setLayout(new BorderLayout(0, 0));
			panel1_12.add(getPanelValor_12());
			panel1_12.add(getPanelCadidatos_12(), BorderLayout.NORTH);
		}
		return panel1_12;
	}
	private JPanel getPanelValor_12() {
		if (panelValor_12 == null) {
			panelValor_12 = new JPanel();
			panelValor_12.add(getLblValor1_12());
		}
		return panelValor_12;
	}
	private JLabel getLblValor1_12() {
		if (lblValor1_12 == null) {
			lblValor1_12 = new JLabel("");
			lblValor1_12.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor1_12;
	}
	private JPanel getPanelCadidatos_12() {
		if (panelCadidatos_12 == null) {
			panelCadidatos_12 = new JPanel();
			panelCadidatos_12.add(getLblCandidatos1_12());
		}
		return panelCadidatos_12;
	}
	private JLabel getLblCandidatos1_12() {
		if (lblCandidatos1_12 == null) {
			lblCandidatos1_12 = new JLabel("");
		}
		return lblCandidatos1_12;
	}
	private JPanel getPanel1_13() {
		if (panel1_13 == null) {
			panel1_13 = new JPanel();
			panel1_13.setBorder(bordeNormal);
			panel1_13.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e);
				}
			});
			panel1_13.setLayout(new BorderLayout(0, 0));
			panel1_13.add(getPanelValor_13(), BorderLayout.CENTER);
			panel1_13.add(getPanelCadidatos_13(), BorderLayout.NORTH);
		}
		return panel1_13;
	}
	private JPanel getPanelValor_13() {
		if (panelValor_13 == null) {
			panelValor_13 = new JPanel();
			panelValor_13.add(getLblValor1_13());
		}
		return panelValor_13;
	}
	private JLabel getLblValor1_13() {
		if (lblValor1_13 == null) {
			lblValor1_13 = new JLabel("");
			lblValor1_13.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor1_13;
	}
	private JPanel getPanelCadidatos_13() {
		if (panelCadidatos_13 == null) {
			panelCadidatos_13 = new JPanel();
			panelCadidatos_13.add(getLblCandidatos1_13());
		}
		return panelCadidatos_13;
	}
	private JLabel getLblCandidatos1_13() {
		if (lblCandidatos1_13 == null) {
			lblCandidatos1_13 = new JLabel("");
		}
		return lblCandidatos1_13;
	}
	private JPanel getPanel1_14() {
		if (panel1_14 == null) {
			panel1_14 = new JPanel();
			panel1_14.setBorder(new MatteBorder(1, 1, 1, 3, (Color) new Color(0, 0, 0)));
			panel1_14.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e);
				}
			});
			panel1_14.setLayout(new BorderLayout(0, 0));
			panel1_14.add(getPanelValor_14(), BorderLayout.CENTER);
			panel1_14.add(getPanelCadidatos_14(), BorderLayout.NORTH);
		}
		return panel1_14;
	}
	private JPanel getPanelValor_14() {
		if (panelValor_14 == null) {
			panelValor_14 = new JPanel();
			panelValor_14.add(getLblValor1_14());
		}
		return panelValor_14;
	}
	private JLabel getLblValor1_14() {
		if (lblValor1_14 == null) {
			lblValor1_14 = new JLabel("");
			lblValor1_14.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor1_14;
	}
	private JPanel getPanelCadidatos_14() {
		if (panelCadidatos_14 == null) {
			panelCadidatos_14 = new JPanel();
			panelCadidatos_14.add(getLblCandidatos1_14());
		}
		return panelCadidatos_14;
	}
	private JLabel getLblCandidatos1_14() {
		if (lblCandidatos1_14 == null) {
			lblCandidatos1_14 = new JLabel("");
		}
		return lblCandidatos1_14;
	}
	private JPanel getPanel1_15() {
		if (panel1_15 == null) {
			panel1_15 = new JPanel();
			panel1_15.setBorder(new MatteBorder(1, 3, 1, 1, (Color) new Color(0, 0, 0)));
			panel1_15.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e);
				}
			});
			panel1_15.setLayout(new BorderLayout(0, 0));
			panel1_15.add(getPanelValor_15(), BorderLayout.CENTER);
			panel1_15.add(getPanelCadidatos_15(), BorderLayout.NORTH);
		}
		return panel1_15;
	}
	private JPanel getPanelValor_15() {
		if (panelValor_15 == null) {
			panelValor_15 = new JPanel();
			panelValor_15.add(getLblValor1_15());
		}
		return panelValor_15;
	}
	private JLabel getLblValor1_15() {
		if (lblValor1_15 == null) {
			lblValor1_15 = new JLabel("");
			lblValor1_15.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor1_15;
	}
	private JPanel getPanelCadidatos_15() {
		if (panelCadidatos_15 == null) {
			panelCadidatos_15 = new JPanel();
			panelCadidatos_15.add(getLblCandidatos1_15());
		}
		return panelCadidatos_15;
	}
	private JLabel getLblCandidatos1_15() {
		if (lblCandidatos1_15 == null) {
			lblCandidatos1_15 = new JLabel("");
		}
		return lblCandidatos1_15;
	}
	private JPanel getPanel1_16() {
		if (panel1_16 == null) {
			panel1_16 = new JPanel();
			panel1_16.setBorder(bordeNormal);
			panel1_16.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e);
				}
			});
			panel1_16.setLayout(new BorderLayout(0, 0));
			panel1_16.add(getPanelValor_16(), BorderLayout.CENTER);
			panel1_16.add(getPanelCadidatos_16(), BorderLayout.NORTH);
		}
		return panel1_16;
	}
	private JPanel getPanelValor_16() {
		if (panelValor_16 == null) {
			panelValor_16 = new JPanel();
			panelValor_16.add(getLblValor1_16());
		}
		return panelValor_16;
	}
	private JLabel getLblValor1_16() {
		if (lblValor1_16 == null) {
			lblValor1_16 = new JLabel("");
			lblValor1_16.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor1_16;
	}
	private JPanel getPanelCadidatos_16() {
		if (panelCadidatos_16 == null) {
			panelCadidatos_16 = new JPanel();
			panelCadidatos_16.add(getLblCandidatos1_16());
		}
		return panelCadidatos_16;
	}
	private JLabel getLblCandidatos1_16() {
		if (lblCandidatos1_16 == null) {
			lblCandidatos1_16 = new JLabel("");
		}
		return lblCandidatos1_16;
	}
	private JPanel getPanel1_17() {
		if (panel1_17 == null) {
			panel1_17 = new JPanel();
			panel1_17.setBorder(new MatteBorder(1, 1, 1, 4, (Color) new Color(0, 0, 0)));
			panel1_17.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e);
				}
			});
			panel1_17.setLayout(new BorderLayout(0, 0));
			panel1_17.add(getPanelValor_17());
			panel1_17.add(getPanelCadidatos_17(), BorderLayout.NORTH);
		}
		return panel1_17;
	}
	private JPanel getPanelValor_17() {
		if (panelValor_17 == null) {
			panelValor_17 = new JPanel();
			panelValor_17.add(getLblValor1_17());
		}
		return panelValor_17;
	}
	private JLabel getLblValor1_17() {
		if (lblValor1_17 == null) {
			lblValor1_17 = new JLabel("");
			lblValor1_17.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor1_17;
	}
	private JPanel getPanelCadidatos_17() {
		if (panelCadidatos_17 == null) {
			panelCadidatos_17 = new JPanel();
			panelCadidatos_17.add(getLblCandidatos1_17());
		}
		return panelCadidatos_17;
	}
	private JLabel getLblCandidatos1_17() {
		if (lblCandidatos1_17 == null) {
			lblCandidatos1_17 = new JLabel("");
		}
		return lblCandidatos1_17;
	}
	private JPanel getPanel1_18() {
		if (panel1_18 == null) {
			panel1_18 = new JPanel();
			panel1_18.setBorder(new MatteBorder(1, 4, 3, 1, (Color) new Color(0, 0, 0)));
			panel1_18.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e);
				}
			});
			panel1_18.setLayout(new BorderLayout(0, 0));
			panel1_18.add(getPanelValor_18(), BorderLayout.CENTER);
			panel1_18.add(getPanelCadidatos_18(), BorderLayout.NORTH);
		}
		return panel1_18;
	}
	private JPanel getPanelValor_18() {
		if (panelValor_18 == null) {
			panelValor_18 = new JPanel();
			panelValor_18.add(getLblValor1_18());
		}
		return panelValor_18;
	}
	private JLabel getLblValor1_18() {
		if (lblValor1_18 == null) {
			lblValor1_18 = new JLabel("");
			lblValor1_18.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor1_18;
	}
	private JPanel getPanelCadidatos_18() {
		if (panelCadidatos_18 == null) {
			panelCadidatos_18 = new JPanel();
			panelCadidatos_18.add(getLblCandidatos1_18());
		}
		return panelCadidatos_18;
	}
	private JLabel getLblCandidatos1_18() {
		if (lblCandidatos1_18 == null) {
			lblCandidatos1_18 = new JLabel("");
		}
		return lblCandidatos1_18;
	}
	private JPanel getPanel1_19() {
		if (panel1_19 == null) {
			panel1_19 = new JPanel();
			panel1_19.setBorder(new MatteBorder(1, 1, 3, 1, (Color) new Color(0, 0, 0)));
			panel1_19.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e);
				}
			});
			panel1_19.setLayout(new BorderLayout(0, 0));
			panel1_19.add(getPanelValor_19(), BorderLayout.CENTER);
			panel1_19.add(getPanelCadidatos_19(), BorderLayout.NORTH);
		}
		return panel1_19;
	}
	private JPanel getPanelValor_19() {
		if (panelValor_19 == null) {
			panelValor_19 = new JPanel();
			panelValor_19.add(getLblValor1_19());
		}
		return panelValor_19;
	}
	private JLabel getLblValor1_19() {
		if (lblValor1_19 == null) {
			lblValor1_19 = new JLabel("");
			lblValor1_19.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor1_19;
	}
	private JPanel getPanelCadidatos_19() {
		if (panelCadidatos_19 == null) {
			panelCadidatos_19 = new JPanel();
			panelCadidatos_19.add(getLblCandidatos1_19());
		}
		return panelCadidatos_19;
	}
	private JLabel getLblCandidatos1_19() {
		if (lblCandidatos1_19 == null) {
			lblCandidatos1_19 = new JLabel("");
		}
		return lblCandidatos1_19;
	}
	private JPanel getPanel1_20() {
		if (panel1_20 == null) {
			panel1_20 = new JPanel();
			panel1_20.setBorder(new MatteBorder(1, 1, 3, 3, (Color) new Color(0, 0, 0)));
			panel1_20.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e);
				}
			});
			panel1_20.setLayout(new BorderLayout(0, 0));
			panel1_20.add(getPanelValor_20());
			panel1_20.add(getPanelCadidatos_20(), BorderLayout.NORTH);
		}
		return panel1_20;
	}
	private JPanel getPanelValor_20() {
		if (panelValor_20 == null) {
			panelValor_20 = new JPanel();
			panelValor_20.add(getLblValor1_20());
		}
		return panelValor_20;
	}
	private JLabel getLblValor1_20() {
		if (lblValor1_20 == null) {
			lblValor1_20 = new JLabel("");
			lblValor1_20.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor1_20;
	}
	private JPanel getPanelCadidatos_20() {
		if (panelCadidatos_20 == null) {
			panelCadidatos_20 = new JPanel();
			panelCadidatos_20.add(getLblCandidatos1_20());
		}
		return panelCadidatos_20;
	}
	private JLabel getLblCandidatos1_20() {
		if (lblCandidatos1_20 == null) {
			lblCandidatos1_20 = new JLabel("");
		}
		return lblCandidatos1_20;
	}
	private JPanel getPanel1_21() {
		if (panel1_21 == null) {
			panel1_21 = new JPanel();
			panel1_21.setBorder(new MatteBorder(1, 3, 3, 1, (Color) new Color(0, 0, 0)));
			panel1_21.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e);
				}
			});
			panel1_21.setLayout(new BorderLayout(0, 0));
			panel1_21.add(getPanelValor_21(), BorderLayout.CENTER);
			panel1_21.add(getPanelCadidatos_21(), BorderLayout.NORTH);
		}
		return panel1_21;
	}
	private JPanel getPanelValor_21() {
		if (panelValor_21 == null) {
			panelValor_21 = new JPanel();
			panelValor_21.add(getLblValor1_21());
		}
		return panelValor_21;
	}
	private JLabel getLblValor1_21() {
		if (lblValor1_21 == null) {
			lblValor1_21 = new JLabel("");
			lblValor1_21.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor1_21;
	}
	private JPanel getPanelCadidatos_21() {
		if (panelCadidatos_21 == null) {
			panelCadidatos_21 = new JPanel();
			panelCadidatos_21.add(getLblCandidatos1_21());
		}
		return panelCadidatos_21;
	}
	private JLabel getLblCandidatos1_21() {
		if (lblCandidatos1_21 == null) {
			lblCandidatos1_21 = new JLabel("");
		}
		return lblCandidatos1_21;
	}
	private JPanel getPanel1_22() {
		if (panel1_22 == null) {
			panel1_22 = new JPanel();
			panel1_22.setBorder(new MatteBorder(1, 1, 3, 1, (Color) new Color(0, 0, 0)));
			panel1_22.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e);
				}
			});
			panel1_22.setLayout(new BorderLayout(0, 0));
			panel1_22.add(getPanelValor_22(), BorderLayout.CENTER);
			panel1_22.add(getPanelCadidatos_22(), BorderLayout.NORTH);
		}
		return panel1_22;
	}
	private JPanel getPanelValor_22() {
		if (panelValor_22 == null) {
			panelValor_22 = new JPanel();
			panelValor_22.add(getLblValor1_22());
		}
		return panelValor_22;
	}
	private JLabel getLblValor1_22() {
		if (lblValor1_22 == null) {
			lblValor1_22 = new JLabel("");
			lblValor1_22.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor1_22;
	}
	private JPanel getPanelCadidatos_22() {
		if (panelCadidatos_22 == null) {
			panelCadidatos_22 = new JPanel();
			panelCadidatos_22.add(getLblCandidatos1_22());
		}
		return panelCadidatos_22;
	}
	private JLabel getLblCandidatos1_22() {
		if (lblCandidatos1_22 == null) {
			lblCandidatos1_22 = new JLabel("");
		}
		return lblCandidatos1_22;
	}
	private JPanel getPanel1_23() {
		if (panel1_23 == null) {
			panel1_23 = new JPanel();
			panel1_23.setBorder(new MatteBorder(1, 1, 3, 3, (Color) new Color(0, 0, 0)));
			panel1_23.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e);
				}
			});
			panel1_23.setLayout(new BorderLayout(0, 0));
			panel1_23.add(getPanelValor_23(), BorderLayout.CENTER);
			panel1_23.add(getPanelCadidatos_23(), BorderLayout.NORTH);
		}
		return panel1_23;
	}
	private JPanel getPanelValor_23() {
		if (panelValor_23 == null) {
			panelValor_23 = new JPanel();
			panelValor_23.add(getLblValor1_23());
		}
		return panelValor_23;
	}
	private JLabel getLblValor1_23() {
		if (lblValor1_23 == null) {
			lblValor1_23 = new JLabel("");
			lblValor1_23.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor1_23;
	}
	private JPanel getPanelCadidatos_23() {
		if (panelCadidatos_23 == null) {
			panelCadidatos_23 = new JPanel();
			panelCadidatos_23.add(getLblCandidatos1_23());
		}
		return panelCadidatos_23;
	}
	private JLabel getLblCandidatos1_23() {
		if (lblCandidatos1_23 == null) {
			lblCandidatos1_23 = new JLabel("");
		}
		return lblCandidatos1_23;
	}
	private JPanel getPanel1_24() {
		if (panel1_24 == null) {
			panel1_24 = new JPanel();
			panel1_24.setBorder(new MatteBorder(1, 3, 3, 1, (Color) new Color(0, 0, 0)));
			panel1_24.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e);
				}
			});
			panel1_24.setLayout(new BorderLayout(0, 0));
			panel1_24.add(getPanelValor_24(), BorderLayout.CENTER);
			panel1_24.add(getPanelCadidatos_24(), BorderLayout.NORTH);
		}
		return panel1_24;
	}
	private JPanel getPanelValor_24() {
		if (panelValor_24 == null) {
			panelValor_24 = new JPanel();
			panelValor_24.add(getLblValor1_24());
		}
		return panelValor_24;
	}
	private JLabel getLblValor1_24() {
		if (lblValor1_24 == null) {
			lblValor1_24 = new JLabel("");
			lblValor1_24.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor1_24;
	}
	private JPanel getPanelCadidatos_24() {
		if (panelCadidatos_24 == null) {
			panelCadidatos_24 = new JPanel();
			panelCadidatos_24.add(getLblCandidatos1_24());
		}
		return panelCadidatos_24;
	}
	private JLabel getLblCandidatos1_24() {
		if (lblCandidatos1_24 == null) {
			lblCandidatos1_24 = new JLabel("");
		}
		return lblCandidatos1_24;
	}
	private JPanel getPanel1_25() {
		if (panel1_25 == null) {
			panel1_25 = new JPanel();
			panel1_25.setBorder(new MatteBorder(1, 1, 3, 1, (Color) new Color(0, 0, 0)));
			panel1_25.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e);
				}
			});
			panel1_25.setLayout(new BorderLayout(0, 0));
			panel1_25.add(getPanelValor_25(), BorderLayout.CENTER);
			panel1_25.add(getPanelCadidatos_25(), BorderLayout.NORTH);
		}
		return panel1_25;
	}
	private JPanel getPanelValor_25() {
		if (panelValor_25 == null) {
			panelValor_25 = new JPanel();
			panelValor_25.add(getLblValor1_25());
		}
		return panelValor_25;
	}
	private JLabel getLblValor1_25() {
		if (lblValor1_25 == null) {
			lblValor1_25 = new JLabel("");
			lblValor1_25.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor1_25;
	}
	private JPanel getPanelCadidatos_25() {
		if (panelCadidatos_25 == null) {
			panelCadidatos_25 = new JPanel();
			panelCadidatos_25.add(getLblCandidatos1_25());
		}
		return panelCadidatos_25;
	}
	private JLabel getLblCandidatos1_25() {
		if (lblCandidatos1_25 == null) {
			lblCandidatos1_25 = new JLabel("");
		}
		return lblCandidatos1_25;
	}
	private JPanel getPanel1_26() {
		if (panel1_26 == null) {
			panel1_26 = new JPanel();
			panel1_26.setBorder(new MatteBorder(1, 1, 3, 4, (Color) new Color(0, 0, 0)));
			panel1_26.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e);
				}
			});
			panel1_26.setLayout(new BorderLayout(0, 0));
			panel1_26.add(getPanelValor_26(), BorderLayout.CENTER);
			panel1_26.add(getPanelCadidatos_26(), BorderLayout.NORTH);
		}
		return panel1_26;
	}
	private JPanel getPanelValor_26() {
		if (panelValor_26 == null) {
			panelValor_26 = new JPanel();
			panelValor_26.add(getLblValor1_26());
		}
		return panelValor_26;
	}
	private JLabel getLblValor1_26() {
		if (lblValor1_26 == null) {
			lblValor1_26 = new JLabel("");
			lblValor1_26.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor1_26;
	}
	private JPanel getPanelCadidatos_26() {
		if (panelCadidatos_26 == null) {
			panelCadidatos_26 = new JPanel();
			panelCadidatos_26.add(getLblCandidatos1_26());
		}
		return panelCadidatos_26;
	}
	private JLabel getLblCandidatos1_26() {
		if (lblCandidatos1_26 == null) {
			lblCandidatos1_26 = new JLabel("");
		}
		return lblCandidatos1_26;
	}
	private JPanel getPanel1_27() {
		if (panel1_27 == null) {
			panel1_27 = new JPanel();
			panel1_27.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e);
				}
			});
			panel1_27.setBorder(new MatteBorder(3, 4, 1, 1, (Color) new Color(0, 0, 0)));
			panel1_27.setLayout(new BorderLayout(0, 0));
			panel1_27.add(getPanelValor_27(), BorderLayout.CENTER);
			panel1_27.add(getPanelCadidatos_27(), BorderLayout.NORTH);
		}
		return panel1_27;
	}
	private JPanel getPanelValor_27() {
		if (panelValor_27 == null) {
			panelValor_27 = new JPanel();
			panelValor_27.add(getLblValor1_27());
		}
		return panelValor_27;
	}
	private JLabel getLblValor1_27() {
		if (lblValor1_27 == null) {
			lblValor1_27 = new JLabel("");
			lblValor1_27.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor1_27;
	}
	private JPanel getPanelCadidatos_27() {
		if (panelCadidatos_27 == null) {
			panelCadidatos_27 = new JPanel();
			panelCadidatos_27.add(getLblCandidatos1_27());
		}
		return panelCadidatos_27;
	}
	private JLabel getLblCandidatos1_27() {
		if (lblCandidatos1_27 == null) {
			lblCandidatos1_27 = new JLabel("");
		}
		return lblCandidatos1_27;
	}
	private JPanel getPanel1_28() {
		if (panel1_28 == null) {
			panel1_28 = new JPanel();
			panel1_28.setBorder(new MatteBorder(3, 1, 1, 1, (Color) new Color(0, 0, 0)));
			panel1_28.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e);
				}
			});
			panel1_28.setLayout(new BorderLayout(0, 0));
			panel1_28.add(getPanelValor_28(), BorderLayout.CENTER);
			panel1_28.add(getPanelCadidatos_28(), BorderLayout.NORTH);
		}
		return panel1_28;
	}
	private JPanel getPanelValor_28() {
		if (panelValor_28 == null) {
			panelValor_28 = new JPanel();
			panelValor_28.add(getLblValor1_28());
		}
		return panelValor_28;
	}
	private JLabel getLblValor1_28() {
		if (lblValor1_28 == null) {
			lblValor1_28 = new JLabel("");
			lblValor1_28.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor1_28;
	}
	private JPanel getPanelCadidatos_28() {
		if (panelCadidatos_28 == null) {
			panelCadidatos_28 = new JPanel();
			panelCadidatos_28.add(getLblCandidatos1_28());
		}
		return panelCadidatos_28;
	}
	private JLabel getLblCandidatos1_28() {
		if (lblCandidatos1_28 == null) {
			lblCandidatos1_28 = new JLabel("");
		}
		return lblCandidatos1_28;
	}
	private JPanel getPanel1_29() {
		if (panel1_29 == null) {
			panel1_29 = new JPanel();
			panel1_29.setBorder(new MatteBorder(3, 1, 1, 3, (Color) new Color(0, 0, 0)));
			panel1_29.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e);
				}
			});
			panel1_29.setLayout(new BorderLayout(0, 0));
			panel1_29.add(getPanelValor_29(), BorderLayout.CENTER);
			panel1_29.add(getPanelCadidatos_29(), BorderLayout.NORTH);
		}
		return panel1_29;
	}
	private JPanel getPanelValor_29() {
		if (panelValor_29 == null) {
			panelValor_29 = new JPanel();
			panelValor_29.add(getLblValor1_29());
		}
		return panelValor_29;
	}
	private JLabel getLblValor1_29() {
		if (lblValor1_29 == null) {
			lblValor1_29 = new JLabel("");
			lblValor1_29.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor1_29;
	}
	private JPanel getPanelCadidatos_29() {
		if (panelCadidatos_29 == null) {
			panelCadidatos_29 = new JPanel();
			panelCadidatos_29.add(getLblCandidatos1_29());
		}
		return panelCadidatos_29;
	}
	private JLabel getLblCandidatos1_29() {
		if (lblCandidatos1_29 == null) {
			lblCandidatos1_29 = new JLabel("");
		}
		return lblCandidatos1_29;
	}
	private JPanel getPanel1_30() {
		if (panel1_30 == null) {
			panel1_30 = new JPanel();
			panel1_30.setBorder(new MatteBorder(3, 3, 1, 1, (Color) new Color(0, 0, 0)));
			panel1_30.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e);
				}
			});
			panel1_30.setLayout(new BorderLayout(0, 0));
			panel1_30.add(getPanelValor_30(), BorderLayout.CENTER);
			panel1_30.add(getPanelCadidatos_30(), BorderLayout.NORTH);
		}
		return panel1_30;
	}
	private JPanel getPanelValor_30() {
		if (panelValor_30 == null) {
			panelValor_30 = new JPanel();
			panelValor_30.add(getLblValor1_30());
		}
		return panelValor_30;
	}
	private JLabel getLblValor1_30() {
		if (lblValor1_30 == null) {
			lblValor1_30 = new JLabel("");
			lblValor1_30.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor1_30;
	}
	private JPanel getPanelCadidatos_30() {
		if (panelCadidatos_30 == null) {
			panelCadidatos_30 = new JPanel();
			panelCadidatos_30.add(getLblCandidatos1_30());
		}
		return panelCadidatos_30;
	}
	private JLabel getLblCandidatos1_30() {
		if (lblCandidatos1_30 == null) {
			lblCandidatos1_30 = new JLabel("");
		}
		return lblCandidatos1_30;
	}
	private JPanel getPanel1_31() {
		if (panel1_31 == null) {
			panel1_31 = new JPanel();
			panel1_31.setBorder(new MatteBorder(3, 1, 1, 1, (Color) new Color(0, 0, 0)));
			panel1_31.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e);
				}
			});
			panel1_31.setLayout(new BorderLayout(0, 0));
			panel1_31.add(getPanelValor_31(), BorderLayout.CENTER);
			panel1_31.add(getPanelCadidatos_31(), BorderLayout.NORTH);
		}
		return panel1_31;
	}
	private JPanel getPanelValor_31() {
		if (panelValor_31 == null) {
			panelValor_31 = new JPanel();
			panelValor_31.add(getLblValor1_31());
		}
		return panelValor_31;
	}
	private JLabel getLblValor1_31() {
		if (lblValor1_31 == null) {
			lblValor1_31 = new JLabel("");
			lblValor1_31.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor1_31;
	}
	private JPanel getPanelCadidatos_31() {
		if (panelCadidatos_31 == null) {
			panelCadidatos_31 = new JPanel();
			panelCadidatos_31.add(getLblCandidatos1_31());
		}
		return panelCadidatos_31;
	}
	private JLabel getLblCandidatos1_31() {
		if (lblCandidatos1_31 == null) {
			lblCandidatos1_31 = new JLabel("");
		}
		return lblCandidatos1_31;
	}
	private JPanel getPanel1_32() {
		if (panel1_32 == null) {
			panel1_32 = new JPanel();
			panel1_32.setBorder(new MatteBorder(3, 1, 1, 3, (Color) new Color(0, 0, 0)));
			panel1_32.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e);
				}
			});
			panel1_32.setLayout(new BorderLayout(0, 0));
			panel1_32.add(getPanelValor_32(), BorderLayout.CENTER);
			panel1_32.add(getPanelCadidatos_32(), BorderLayout.NORTH);
		}
		return panel1_32;
	}
	private JPanel getPanelValor_32() {
		if (panelValor_32 == null) {
			panelValor_32 = new JPanel();
			panelValor_32.add(getLblValor1_32());
		}
		return panelValor_32;
	}
	private JLabel getLblValor1_32() {
		if (lblValor1_32 == null) {
			lblValor1_32 = new JLabel("");
			lblValor1_32.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor1_32;
	}
	private JPanel getPanelCadidatos_32() {
		if (panelCadidatos_32 == null) {
			panelCadidatos_32 = new JPanel();
			panelCadidatos_32.add(getLblCandidatos1_32());
		}
		return panelCadidatos_32;
	}
	private JLabel getLblCandidatos1_32() {
		if (lblCandidatos1_32 == null) {
			lblCandidatos1_32 = new JLabel("");
		}
		return lblCandidatos1_32;
	}
	private JPanel getPanel1_33() {
		if (panel1_33 == null) {
			panel1_33 = new JPanel();
			panel1_33.setBorder(new MatteBorder(3, 3, 1, 1, (Color) new Color(0, 0, 0)));
			panel1_33.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e);
				}
			});
			panel1_33.setLayout(new BorderLayout(0, 0));
			panel1_33.add(getPanelValor_33(), BorderLayout.CENTER);
			panel1_33.add(getPanelCadidatos_33(), BorderLayout.NORTH);
		}
		return panel1_33;
	}
	private JPanel getPanelValor_33() {
		if (panelValor_33 == null) {
			panelValor_33 = new JPanel();
			panelValor_33.add(getLblValor1_33());
		}
		return panelValor_33;
	}
	private JLabel getLblValor1_33() {
		if (lblValor1_33 == null) {
			lblValor1_33 = new JLabel("");
			lblValor1_33.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor1_33;
	}
	private JPanel getPanelCadidatos_33() {
		if (panelCadidatos_33 == null) {
			panelCadidatos_33 = new JPanel();
			panelCadidatos_33.add(getLblCandidatos1_33());
		}
		return panelCadidatos_33;
	}
	private JLabel getLblCandidatos1_33() {
		if (lblCandidatos1_33 == null) {
			lblCandidatos1_33 = new JLabel("");
		}
		return lblCandidatos1_33;
	}
	private JPanel getPanel1_34() {
		if (panel1_34 == null) {
			panel1_34 = new JPanel();
			panel1_34.setBorder(new MatteBorder(3, 1, 1, 1, (Color) new Color(0, 0, 0)));
			panel1_34.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e);
				}
			});
			panel1_34.setLayout(new BorderLayout(0, 0));
			panel1_34.add(getPanelValor_34(), BorderLayout.CENTER);
			panel1_34.add(getPanelCadidatos_34(), BorderLayout.NORTH);
		}
		return panel1_34;
	}
	private JPanel getPanelValor_34() {
		if (panelValor_34 == null) {
			panelValor_34 = new JPanel();
			panelValor_34.add(getLblValor1_34());
		}
		return panelValor_34;
	}
	private JLabel getLblValor1_34() {
		if (lblValor1_34 == null) {
			lblValor1_34 = new JLabel("");
			lblValor1_34.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor1_34;
	}
	private JPanel getPanelCadidatos_34() {
		if (panelCadidatos_34 == null) {
			panelCadidatos_34 = new JPanel();
			panelCadidatos_34.add(getLblCandidatos1_34());
		}
		return panelCadidatos_34;
	}
	private JLabel getLblCandidatos1_34() {
		if (lblCandidatos1_34 == null) {
			lblCandidatos1_34 = new JLabel("");
		}
		return lblCandidatos1_34;
	}
	private JPanel getPanel1_35() {
		if (panel1_35 == null) {
			panel1_35 = new JPanel();
			panel1_35.setBorder(new MatteBorder(3, 1, 1, 4, (Color) new Color(0, 0, 0)));
			panel1_35.setLayout(new BorderLayout(0, 0));
			panel1_35.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e);
				}
			});
			panel1_35.add(getPanelValor_35(), BorderLayout.CENTER);
			panel1_35.add(getPanelCadidatos_35(), BorderLayout.NORTH);
		}
		return panel1_35;
	}
	private JPanel getPanelValor_35() {
		if (panelValor_35 == null) {
			panelValor_35 = new JPanel();
			panelValor_35.add(getLblValor1_35());
		}
		return panelValor_35;
	}
	private JLabel getLblValor1_35() {
		if (lblValor1_35 == null) {
			lblValor1_35 = new JLabel("");
			lblValor1_35.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor1_35;
	}
	private JPanel getPanelCadidatos_35() {
		if (panelCadidatos_35 == null) {
			panelCadidatos_35 = new JPanel();
			panelCadidatos_35.add(getLblCandidatos1_35());
		}
		return panelCadidatos_35;
	}
	private JLabel getLblCandidatos1_35() {
		if (lblCandidatos1_35 == null) {
			lblCandidatos1_35 = new JLabel("");
		}
		return lblCandidatos1_35;
	}
	private JPanel getPanel1_36() {
		if (panel1_36 == null) {
			panel1_36 = new JPanel();
			panel1_36.setBorder(new MatteBorder(1, 4, 1, 1, (Color) new Color(0, 0, 0)));
			panel1_36.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e);
				}
			});
			panel1_36.setLayout(new BorderLayout(0, 0));
			panel1_36.add(getPanelValor_36(), BorderLayout.CENTER);
			panel1_36.add(getPanelCadidatos_36(), BorderLayout.NORTH);
		}
		return panel1_36;
	}
	private JPanel getPanelValor_36() {
		if (panelValor_36 == null) {
			panelValor_36 = new JPanel();
			panelValor_36.add(getLblValor1_36());
		}
		return panelValor_36;
	}
	private JLabel getLblValor1_36() {
		if (lblValor1_36 == null) {
			lblValor1_36 = new JLabel("");
			lblValor1_36.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor1_36;
	}
	private JPanel getPanelCadidatos_36() {
		if (panelCadidatos_36 == null) {
			panelCadidatos_36 = new JPanel();
			panelCadidatos_36.add(getLblCandidatos1_36());
		}
		return panelCadidatos_36;
	}
	private JLabel getLblCandidatos1_36() {
		if (lblCandidatos1_36 == null) {
			lblCandidatos1_36 = new JLabel("");
		}
		return lblCandidatos1_36;
	}
	private JPanel getPanel1_37() {
		if (panel1_37 == null) {
			panel1_37 = new JPanel();
			panel1_37.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
			panel1_37.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e);
				}
			});
			panel1_37.setLayout(new BorderLayout(0, 0));
			panel1_37.add(getPanelValor_37(), BorderLayout.CENTER);
			panel1_37.add(getPanelCadidatos_37(), BorderLayout.NORTH);
		}
		return panel1_37;
	}
	private JPanel getPanelValor_37() {
		if (panelValor_37 == null) {
			panelValor_37 = new JPanel();
			panelValor_37.add(getLblValor1_37());
		}
		return panelValor_37;
	}
	private JLabel getLblValor1_37() {
		if (lblValor1_37 == null) {
			lblValor1_37 = new JLabel("");
			lblValor1_37.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor1_37;
	}
	private JPanel getPanelCadidatos_37() {
		if (panelCadidatos_37 == null) {
			panelCadidatos_37 = new JPanel();
			panelCadidatos_37.add(getLblCandidatos1_37());
		}
		return panelCadidatos_37;
	}
	private JLabel getLblCandidatos1_37() {
		if (lblCandidatos1_37 == null) {
			lblCandidatos1_37 = new JLabel("");
		}
		return lblCandidatos1_37;
	}
	private JPanel getPanel1_38() {
		if (panel1_38 == null) {
			panel1_38 = new JPanel();
			panel1_38.setBorder(new MatteBorder(1, 1, 1, 3, (Color) new Color(0, 0, 0)));
			panel1_38.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e);
				}
			});
			panel1_38.setLayout(new BorderLayout(0, 0));
			panel1_38.add(getPanelValor_38(), BorderLayout.CENTER);
			panel1_38.add(getPanelCadidatos_38(), BorderLayout.NORTH);
		}
		return panel1_38;
	}
	private JPanel getPanelValor_38() {
		if (panelValor_38 == null) {
			panelValor_38 = new JPanel();
			panelValor_38.add(getLblValor1_38());
		}
		return panelValor_38;
	}
	private JLabel getLblValor1_38() {
		if (lblValor1_38 == null) {
			lblValor1_38 = new JLabel("");
			lblValor1_38.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor1_38;
	}
	private JPanel getPanelCadidatos_38() {
		if (panelCadidatos_38 == null) {
			panelCadidatos_38 = new JPanel();
			panelCadidatos_38.add(getLblCandidatos1_38());
		}
		return panelCadidatos_38;
	}
	private JLabel getLblCandidatos1_38() {
		if (lblCandidatos1_38 == null) {
			lblCandidatos1_38 = new JLabel("");
		}
		return lblCandidatos1_38;
	}
	private JPanel getPanel1_39() {
		if (panel1_39 == null) {
			panel1_39 = new JPanel();
			panel1_39.setBorder(new MatteBorder(1, 3, 1, 1, (Color) new Color(0, 0, 0)));
			panel1_39.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e);
				}
			});
			panel1_39.setLayout(new BorderLayout(0, 0));
			panel1_39.add(getPanelValor_39(), BorderLayout.CENTER);
			panel1_39.add(getPanelCadidatos_39(), BorderLayout.NORTH);
		}
		return panel1_39;
	}
	private JPanel getPanelValor_39() {
		if (panelValor_39 == null) {
			panelValor_39 = new JPanel();
			panelValor_39.add(getLblValor1_39());
		}
		return panelValor_39;
	}
	private JLabel getLblValor1_39() {
		if (lblValor1_39 == null) {
			lblValor1_39 = new JLabel("");
			lblValor1_39.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor1_39;
	}
	private JPanel getPanelCadidatos_39() {
		if (panelCadidatos_39 == null) {
			panelCadidatos_39 = new JPanel();
			panelCadidatos_39.add(getLblCandidatos1_39());
		}
		return panelCadidatos_39;
	}
	private JLabel getLblCandidatos1_39() {
		if (lblCandidatos1_39 == null) {
			lblCandidatos1_39 = new JLabel("");
		}
		return lblCandidatos1_39;
	}
	private JPanel getPanel1_40() {
		if (panel1_40 == null) {
			panel1_40 = new JPanel();
			panel1_40.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
			panel1_40.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e);
				}
			});
			panel1_40.setLayout(new BorderLayout(0, 0));
			panel1_40.add(getPanelValor_40(), BorderLayout.CENTER);
			panel1_40.add(getPanelCadidatos_40(), BorderLayout.NORTH);
		}
		return panel1_40;
	}
	private JPanel getPanelValor_40() {
		if (panelValor_40 == null) {
			panelValor_40 = new JPanel();
			panelValor_40.add(getLblValor1_40());
		}
		return panelValor_40;
	}
	private JLabel getLblValor1_40() {
		if (lblValor1_40 == null) {
			lblValor1_40 = new JLabel("");
			lblValor1_40.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor1_40;
	}
	private JPanel getPanelCadidatos_40() {
		if (panelCadidatos_40 == null) {
			panelCadidatos_40 = new JPanel();
			panelCadidatos_40.add(getLblCandidatos1_40());
		}
		return panelCadidatos_40;
	}
	private JLabel getLblCandidatos1_40() {
		if (lblCandidatos1_40 == null) {
			lblCandidatos1_40 = new JLabel("");
		}
		return lblCandidatos1_40;
	}
	private JPanel getPanel1_41() {
		if (panel1_41 == null) {
			panel1_41 = new JPanel();
			panel1_41.setBorder(new MatteBorder(1, 1, 1, 3, (Color) new Color(0, 0, 0)));
			panel1_41.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e);
				}
			});
			panel1_41.setLayout(new BorderLayout(0, 0));
			panel1_41.add(getPanelValor_41(), BorderLayout.CENTER);
			panel1_41.add(getPanelCadidatos_41(), BorderLayout.NORTH);
		}
		return panel1_41;
	}
	private JPanel getPanelValor_41() {
		if (panelValor_41 == null) {
			panelValor_41 = new JPanel();
			panelValor_41.add(getLblValor1_41());
		}
		return panelValor_41;
	}
	private JLabel getLblValor1_41() {
		if (lblValor1_41 == null) {
			lblValor1_41 = new JLabel("");
			lblValor1_41.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor1_41;
	}
	private JPanel getPanelCadidatos_41() {
		if (panelCadidatos_41 == null) {
			panelCadidatos_41 = new JPanel();
			panelCadidatos_41.add(getLblCandidatos1_41());
		}
		return panelCadidatos_41;
	}
	private JLabel getLblCandidatos1_41() {
		if (lblCandidatos1_41 == null) {
			lblCandidatos1_41 = new JLabel("");
		}
		return lblCandidatos1_41;
	}
	private JPanel getPanel1_42() {
		if (panel1_42 == null) {
			panel1_42 = new JPanel();
			panel1_42.setBorder(new MatteBorder(1, 3, 1, 1, (Color) new Color(0, 0, 0)));
			panel1_42.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e);
				}
			});
			panel1_42.setLayout(new BorderLayout(0, 0));
			panel1_42.add(getPanelValor_42(), BorderLayout.CENTER);
			panel1_42.add(getPanelCadidatos_42(), BorderLayout.NORTH);
		}
		return panel1_42;
	}
	private JPanel getPanelValor_42() {
		if (panelValor_42 == null) {
			panelValor_42 = new JPanel();
			panelValor_42.add(getLblValor1_42());
		}
		return panelValor_42;
	}
	private JLabel getLblValor1_42() {
		if (lblValor1_42 == null) {
			lblValor1_42 = new JLabel("");
			lblValor1_42.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor1_42;
	}
	private JPanel getPanelCadidatos_42() {
		if (panelCadidatos_42 == null) {
			panelCadidatos_42 = new JPanel();
			panelCadidatos_42.add(getLblCandidatos1_42());
		}
		return panelCadidatos_42;
	}
	private JLabel getLblCandidatos1_42() {
		if (lblCandidatos1_42 == null) {
			lblCandidatos1_42 = new JLabel("");
		}
		return lblCandidatos1_42;
	}
	private JPanel getPanel1_43() {
		if (panel1_43 == null) {
			panel1_43 = new JPanel();
			panel1_43.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
			panel1_43.setLayout(new BorderLayout(0, 0));
			panel1_43.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e);
				}
			});
			panel1_43.add(getPanelValor_43(), BorderLayout.CENTER);
			panel1_43.add(getPanelCadidatos_43(), BorderLayout.NORTH);
		}
		return panel1_43;
	}
	private JPanel getPanelValor_43() {
		if (panelValor_43 == null) {
			panelValor_43 = new JPanel();
			panelValor_43.add(getLblValor1_43());
		}
		return panelValor_43;
	}
	private JLabel getLblValor1_43() {
		if (lblValor1_43 == null) {
			lblValor1_43 = new JLabel("");
			lblValor1_43.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor1_43;
	}
	private JPanel getPanelCadidatos_43() {
		if (panelCadidatos_43 == null) {
			panelCadidatos_43 = new JPanel();
			panelCadidatos_43.add(getLblCandidatos1_43());
		}
		return panelCadidatos_43;
	}
	private JLabel getLblCandidatos1_43() {
		if (lblCandidatos1_43 == null) {
			lblCandidatos1_43 = new JLabel("");
		}
		return lblCandidatos1_43;
	}
	private JPanel getPanel1_44() {
		if (panel1_44 == null) {
			panel1_44 = new JPanel();
			panel1_44.setBorder(new MatteBorder(1, 1, 1, 4, (Color) new Color(0, 0, 0)));
			panel1_44.setLayout(new BorderLayout(0, 0));
			panel1_44.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e);
				}
			});
			panel1_44.add(getPanelValor_44(), BorderLayout.CENTER);
			panel1_44.add(getPanelCadidatos_44(), BorderLayout.NORTH);
		}
		return panel1_44;
	}
	private JPanel getPanelValor_44() {
		if (panelValor_44 == null) {
			panelValor_44 = new JPanel();
			panelValor_44.add(getLblValor1_44());
		}
		return panelValor_44;
	}
	private JLabel getLblValor1_44() {
		if (lblValor1_44 == null) {
			lblValor1_44 = new JLabel("");
			lblValor1_44.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor1_44;
	}
	private JPanel getPanelCadidatos_44() {
		if (panelCadidatos_44 == null) {
			panelCadidatos_44 = new JPanel();
			panelCadidatos_44.add(getLblCandidatos1_44());
		}
		return panelCadidatos_44;
	}
	private JLabel getLblCandidatos1_44() {
		if (lblCandidatos1_44 == null) {
			lblCandidatos1_44 = new JLabel("");
		}
		return lblCandidatos1_44;
	}
	private JPanel getPanel1_45() {
		if (panel1_45 == null) {
			panel1_45 = new JPanel();
			panel1_45.setBorder(new MatteBorder(1, 4, 3, 1, (Color) new Color(0, 0, 0)));
			panel1_45.setLayout(new BorderLayout(0, 0));
			panel1_45.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e);
				}
			});
			panel1_45.add(getPanelValor_45(), BorderLayout.CENTER);
			panel1_45.add(getPanelCadidatos_45(), BorderLayout.NORTH);
		}
		return panel1_45;
	}
	private JPanel getPanelValor_45() {
		if (panelValor_45 == null) {
			panelValor_45 = new JPanel();
			panelValor_45.add(getLblValor1_45());
		}
		return panelValor_45;
	}
	private JLabel getLblValor1_45() {
		if (lblValor1_45 == null) {
			lblValor1_45 = new JLabel("");
			lblValor1_45.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor1_45;
	}
	private JPanel getPanelCadidatos_45() {
		if (panelCadidatos_45 == null) {
			panelCadidatos_45 = new JPanel();
			panelCadidatos_45.add(getLblCandidatos1_45());
		}
		return panelCadidatos_45;
	}
	private JLabel getLblCandidatos1_45() {
		if (lblCandidatos1_45 == null) {
			lblCandidatos1_45 = new JLabel("");
		}
		return lblCandidatos1_45;
	}
	private JPanel getPanel1_46() {
		if (panel1_46 == null) {
			panel1_46 = new JPanel();
			panel1_46.setBorder(new MatteBorder(1, 1, 3, 1, (Color) new Color(0, 0, 0)));
			panel1_46.setLayout(new BorderLayout(0, 0));
			panel1_46.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e);
				}
			});
			panel1_46.add(getPanelValor_46(), BorderLayout.CENTER);
			panel1_46.add(getPanelCadidatos_46(), BorderLayout.NORTH);
		}
		return panel1_46;
	}
	private JPanel getPanelValor_46() {
		if (panelValor_46 == null) {
			panelValor_46 = new JPanel();
			panelValor_46.add(getLblValor1_46());
		}
		return panelValor_46;
	}
	private JLabel getLblValor1_46() {
		if (lblValor1_46 == null) {
			lblValor1_46 = new JLabel("");
			lblValor1_46.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor1_46;
	}
	private JPanel getPanelCadidatos_46() {
		if (panelCadidatos_46 == null) {
			panelCadidatos_46 = new JPanel();
			panelCadidatos_46.add(getLblCandidatos1_46());
		}
		return panelCadidatos_46;
	}
	private JLabel getLblCandidatos1_46() {
		if (lblCandidatos1_46 == null) {
			lblCandidatos1_46 = new JLabel("");
		}
		return lblCandidatos1_46;
	}
	private JPanel getPanel1_47() {
		if (panel1_47 == null) {
			panel1_47 = new JPanel();
			panel1_47.setBorder(new MatteBorder(1, 1, 3, 3, (Color) new Color(0, 0, 0)));
			panel1_47.setLayout(new BorderLayout(0, 0));
			panel1_47.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e);
				}
			});
			panel1_47.add(getPanelValor_47(), BorderLayout.CENTER);
			panel1_47.add(getPanelCadidatos_47(), BorderLayout.NORTH);
		}
		return panel1_47;
	}
	private JPanel getPanelValor_47() {
		if (panelValor_47 == null) {
			panelValor_47 = new JPanel();
			panelValor_47.add(getLblValor1_47());
		}
		return panelValor_47;
	}
	private JLabel getLblValor1_47() {
		if (lblValor1_47 == null) {
			lblValor1_47 = new JLabel("");
			lblValor1_47.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor1_47;
	}
	private JPanel getPanelCadidatos_47() {
		if (panelCadidatos_47 == null) {
			panelCadidatos_47 = new JPanel();
			panelCadidatos_47.add(getLblCandidatos1_47());
		}
		return panelCadidatos_47;
	}
	private JLabel getLblCandidatos1_47() {
		if (lblCandidatos1_47 == null) {
			lblCandidatos1_47 = new JLabel("");
		}
		return lblCandidatos1_47;
	}
	private JPanel getPanel1_48() {
		if (panel1_48 == null) {
			panel1_48 = new JPanel();
			panel1_48.setBorder(new MatteBorder(1, 3, 3, 1, (Color) new Color(0, 0, 0)));
			panel1_48.setLayout(new BorderLayout(0, 0));
			panel1_48.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e);
				}
			});
			panel1_48.add(getPanelValor_48(), BorderLayout.CENTER);
			panel1_48.add(getPanelCadidatos_48(), BorderLayout.NORTH);
		}
		return panel1_48;
	}
	private JPanel getPanelValor_48() {
		if (panelValor_48 == null) {
			panelValor_48 = new JPanel();
			panelValor_48.add(getLblValor1_48());
		}
		return panelValor_48;
	}
	private JLabel getLblValor1_48() {
		if (lblValor1_48 == null) {
			lblValor1_48 = new JLabel("");
			lblValor1_48.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor1_48;
	}
	private JPanel getPanelCadidatos_48() {
		if (panelCadidatos_48 == null) {
			panelCadidatos_48 = new JPanel();
			panelCadidatos_48.add(getLblCandidatos1_48());
		}
		return panelCadidatos_48;
	}
	private JLabel getLblCandidatos1_48() {
		if (lblCandidatos1_48 == null) {
			lblCandidatos1_48 = new JLabel("");
		}
		return lblCandidatos1_48;
	}
	private JPanel getPanel1_49() {
		if (panel1_49 == null) {
			panel1_49 = new JPanel();
			panel1_49.setBorder(new MatteBorder(1, 1, 3, 1, (Color) new Color(0, 0, 0)));
			panel1_49.setLayout(new BorderLayout(0, 0));
			panel1_49.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e);
				}
			});
			panel1_49.add(getPanelValor_49(), BorderLayout.CENTER);
			panel1_49.add(getPanelCadidatos_49(), BorderLayout.NORTH);
		}
		return panel1_49;
	}
	private JPanel getPanelValor_49() {
		if (panelValor_49 == null) {
			panelValor_49 = new JPanel();
			panelValor_49.add(getLblValor1_49());
		}
		return panelValor_49;
	}
	private JLabel getLblValor1_49() {
		if (lblValor1_49 == null) {
			lblValor1_49 = new JLabel("");
			lblValor1_49.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor1_49;
	}
	private JPanel getPanelCadidatos_49() {
		if (panelCadidatos_49 == null) {
			panelCadidatos_49 = new JPanel();
			panelCadidatos_49.add(getLblCandidatos1_49());
		}
		return panelCadidatos_49;
	}
	private JLabel getLblCandidatos1_49() {
		if (lblCandidatos1_49 == null) {
			lblCandidatos1_49 = new JLabel("");
		}
		return lblCandidatos1_49;
	}
	private JPanel getPanel1_50() {
		if (panel1_50 == null) {
			panel1_50 = new JPanel();
			panel1_50.setBorder(new MatteBorder(1, 1, 3, 3, (Color) new Color(0, 0, 0)));
			panel1_50.setLayout(new BorderLayout(0, 0));
			panel1_50.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e);
				}
			});
			panel1_50.add(getPanelValor_50(), BorderLayout.CENTER);
			panel1_50.add(getPanelCadidatos_50(), BorderLayout.NORTH);
		}
		return panel1_50;
	}
	private JPanel getPanelValor_50() {
		if (panelValor_50 == null) {
			panelValor_50 = new JPanel();
			panelValor_50.add(getLblValor1_50());
		}
		return panelValor_50;
	}
	private JLabel getLblValor1_50() {
		if (lblValor1_50 == null) {
			lblValor1_50 = new JLabel("");
			lblValor1_50.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor1_50;
	}
	private JPanel getPanelCadidatos_50() {
		if (panelCadidatos_50 == null) {
			panelCadidatos_50 = new JPanel();
			panelCadidatos_50.add(getLblCandidatos1_50());
		}
		return panelCadidatos_50;
	}
	private JLabel getLblCandidatos1_50() {
		if (lblCandidatos1_50 == null) {
			lblCandidatos1_50 = new JLabel("");
		}
		return lblCandidatos1_50;
	}
	private JPanel getPanel1_51() {
		if (panel1_51 == null) {
			panel1_51 = new JPanel();
			panel1_51.setBorder(new MatteBorder(1, 3, 3, 1, (Color) new Color(0, 0, 0)));
			panel1_51.setLayout(new BorderLayout(0, 0));
			panel1_51.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e);
				}
			});
			panel1_51.add(getPanelValor_51(), BorderLayout.CENTER);
			panel1_51.add(getPanelCadidatos_51(), BorderLayout.NORTH);
		}
		return panel1_51;
	}
	private JPanel getPanelValor_51() {
		if (panelValor_51 == null) {
			panelValor_51 = new JPanel();
			panelValor_51.add(getLblValor1_51());
		}
		return panelValor_51;
	}
	private JLabel getLblValor1_51() {
		if (lblValor1_51 == null) {
			lblValor1_51 = new JLabel("");
			lblValor1_51.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor1_51;
	}
	private JPanel getPanelCadidatos_51() {
		if (panelCadidatos_51 == null) {
			panelCadidatos_51 = new JPanel();
			panelCadidatos_51.add(getLblCandidatos1_51());
		}
		return panelCadidatos_51;
	}
	private JLabel getLblCandidatos1_51() {
		if (lblCandidatos1_51 == null) {
			lblCandidatos1_51 = new JLabel("");
		}
		return lblCandidatos1_51;
	}
	private JPanel getPanel1_52() {
		if (panel1_52 == null) {
			panel1_52 = new JPanel();
			panel1_52.setBorder(new MatteBorder(1, 1, 3, 1, (Color) new Color(0, 0, 0)));
			panel1_52.setLayout(new BorderLayout(0, 0));
			panel1_52.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e);
				}
			});
			panel1_52.add(getPanelValor_52(), BorderLayout.CENTER);
			panel1_52.add(getPanelCadidatos_52(), BorderLayout.NORTH);
		}
		return panel1_52;
	}
	private JPanel getPanelValor_52() {
		if (panelValor_52 == null) {
			panelValor_52 = new JPanel();
			panelValor_52.add(getLblValor1_52());
		}
		return panelValor_52;
	}
	private JLabel getLblValor1_52() {
		if (lblValor1_52 == null) {
			lblValor1_52 = new JLabel("");
			lblValor1_52.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor1_52;
	}
	private JPanel getPanelCadidatos_52() {
		if (panelCadidatos_52 == null) {
			panelCadidatos_52 = new JPanel();
			panelCadidatos_52.add(getLblCandidatos1_52());
		}
		return panelCadidatos_52;
	}
	private JLabel getLblCandidatos1_52() {
		if (lblCandidatos1_52 == null) {
			lblCandidatos1_52 = new JLabel("");
		}
		return lblCandidatos1_52;
	}
	private JPanel getPanel1_53() {
		if (panel1_53 == null) {
			panel1_53 = new JPanel();
			panel1_53.setBorder(new MatteBorder(1, 1, 3, 4, (Color) new Color(0, 0, 0)));
			panel1_53.setLayout(new BorderLayout(0, 0));
			panel1_53.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e);
				}
			});
			panel1_53.add(getPanelValor_53(), BorderLayout.CENTER);
			panel1_53.add(getPanelCadidatos_53(), BorderLayout.NORTH);
		}
		return panel1_53;
	}
	private JPanel getPanelValor_53() {
		if (panelValor_53 == null) {
			panelValor_53 = new JPanel();
			panelValor_53.add(getLblValor1_53());
		}
		return panelValor_53;
	}
	private JLabel getLblValor1_53() {
		if (lblValor1_53 == null) {
			lblValor1_53 = new JLabel("");
			lblValor1_53.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor1_53;
	}
	private JPanel getPanelCadidatos_53() {
		if (panelCadidatos_53 == null) {
			panelCadidatos_53 = new JPanel();
			panelCadidatos_53.add(getLblCandidatos1_53());
		}
		return panelCadidatos_53;
	}
	private JLabel getLblCandidatos1_53() {
		if (lblCandidatos1_53 == null) {
			lblCandidatos1_53 = new JLabel("");
		}
		return lblCandidatos1_53;
	}
	private JPanel getPanel1_54() {
		if (panel1_54 == null) {
			panel1_54 = new JPanel();
			panel1_54.setBorder(new MatteBorder(3, 4, 1, 1, (Color) new Color(0, 0, 0)));
			panel1_54.setLayout(new BorderLayout(0, 0));
			panel1_54.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e);
				}
			});
			panel1_54.add(getPanelValor_54(), BorderLayout.CENTER);
			panel1_54.add(getPanelCadidatos_54(), BorderLayout.NORTH);
		}
		return panel1_54;
	}
	private JPanel getPanelValor_54() {
		if (panelValor_54 == null) {
			panelValor_54 = new JPanel();
			panelValor_54.add(getLblValor1_54());
		}
		return panelValor_54;
	}
	private JLabel getLblValor1_54() {
		if (lblValor1_54 == null) {
			lblValor1_54 = new JLabel("");
			lblValor1_54.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor1_54;
	}
	private JPanel getPanelCadidatos_54() {
		if (panelCadidatos_54 == null) {
			panelCadidatos_54 = new JPanel();
			panelCadidatos_54.add(getLblCandidatos1_54());
		}
		return panelCadidatos_54;
	}
	private JLabel getLblCandidatos1_54() {
		if (lblCandidatos1_54 == null) {
			lblCandidatos1_54 = new JLabel("");
		}
		return lblCandidatos1_54;
	}
	private JPanel getPanel1_55() {
		if (panel1_55 == null) {
			panel1_55 = new JPanel();
			panel1_55.setBorder(new MatteBorder(3, 1, 1, 1, (Color) new Color(0, 0, 0)));
			panel1_55.setLayout(new BorderLayout(0, 0));
			panel1_55.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e);
				}
			});
			panel1_55.add(getPanelValor_55(), BorderLayout.CENTER);
			panel1_55.add(getPanelCadidatos_55(), BorderLayout.NORTH);
		}
		return panel1_55;
	}
	private JPanel getPanelValor_55() {
		if (panelValor_55 == null) {
			panelValor_55 = new JPanel();
			panelValor_55.add(getLblValor1_55());
		}
		return panelValor_55;
	}
	private JLabel getLblValor1_55() {
		if (lblValor1_55 == null) {
			lblValor1_55 = new JLabel("");
			lblValor1_55.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor1_55;
	}
	private JPanel getPanelCadidatos_55() {
		if (panelCadidatos_55 == null) {
			panelCadidatos_55 = new JPanel();
			panelCadidatos_55.add(getLblCandidatos1_55());
		}
		return panelCadidatos_55;
	}
	private JLabel getLblCandidatos1_55() {
		if (lblCandidatos1_55 == null) {
			lblCandidatos1_55 = new JLabel("");
		}
		return lblCandidatos1_55;
	}
	private JPanel getPanel1_56() {
		if (panel1_56 == null) {
			panel1_56 = new JPanel();
			panel1_56.setBorder(new MatteBorder(3, 1, 1, 3, (Color) new Color(0, 0, 0)));
			panel1_56.setLayout(new BorderLayout(0, 0));
			panel1_56.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e);
				}
			});
			panel1_56.add(getPanelValor_56(), BorderLayout.CENTER);
			panel1_56.add(getPanelCadidatos_56(), BorderLayout.NORTH);
		}
		return panel1_56;
	}
	private JPanel getPanelValor_56() {
		if (panelValor_56 == null) {
			panelValor_56 = new JPanel();
			panelValor_56.add(getLblValor1_56());
		}
		return panelValor_56;
	}
	private JLabel getLblValor1_56() {
		if (lblValor1_56 == null) {
			lblValor1_56 = new JLabel("");
			lblValor1_56.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor1_56;
	}
	private JPanel getPanelCadidatos_56() {
		if (panelCadidatos_56 == null) {
			panelCadidatos_56 = new JPanel();
			panelCadidatos_56.add(getLblCandidatos1_56());
		}
		return panelCadidatos_56;
	}
	private JLabel getLblCandidatos1_56() {
		if (lblCandidatos1_56 == null) {
			lblCandidatos1_56 = new JLabel("");
		}
		return lblCandidatos1_56;
	}
	private JPanel getPanel1_57() {
		if (panel1_57 == null) {
			panel1_57 = new JPanel();
			panel1_57.setBorder(new MatteBorder(3, 3, 1, 1, (Color) new Color(0, 0, 0)));
			panel1_57.setLayout(new BorderLayout(0, 0));
			panel1_57.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e);
				}
			});
			panel1_57.add(getPanelValor_57(), BorderLayout.CENTER);
			panel1_57.add(getPanelCadidatos_57(), BorderLayout.NORTH);
		}
		return panel1_57;
	}
	private JPanel getPanelValor_57() {
		if (panelValor_57 == null) {
			panelValor_57 = new JPanel();
			panelValor_57.add(getLblValor1_57());
		}
		return panelValor_57;
	}
	private JLabel getLblValor1_57() {
		if (lblValor1_57 == null) {
			lblValor1_57 = new JLabel("");
			lblValor1_57.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor1_57;
	}
	private JPanel getPanelCadidatos_57() {
		if (panelCadidatos_57 == null) {
			panelCadidatos_57 = new JPanel();
			panelCadidatos_57.add(getLblCandidatos1_57());
		}
		return panelCadidatos_57;
	}
	private JLabel getLblCandidatos1_57() {
		if (lblCandidatos1_57 == null) {
			lblCandidatos1_57 = new JLabel("");
		}
		return lblCandidatos1_57;
	}
	private JPanel getPanel1_58() {
		if (panel1_58 == null) {
			panel1_58 = new JPanel();
			panel1_58.setBorder(new MatteBorder(3, 1, 1, 1, (Color) new Color(0, 0, 0)));
			panel1_58.setLayout(new BorderLayout(0, 0));
			panel1_58.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e);
				}
			});
			panel1_58.add(getPanelValor_58(), BorderLayout.CENTER);
			panel1_58.add(getPanelCadidatos_58(), BorderLayout.NORTH);
		}
		return panel1_58;
	}
	private JPanel getPanelValor_58() {
		if (panelValor_58 == null) {
			panelValor_58 = new JPanel();
			panelValor_58.add(getLblValor1_58());
		}
		return panelValor_58;
	}
	private JLabel getLblValor1_58() {
		if (lblValor1_58 == null) {
			lblValor1_58 = new JLabel("");
			lblValor1_58.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor1_58;
	}
	private JPanel getPanelCadidatos_58() {
		if (panelCadidatos_58 == null) {
			panelCadidatos_58 = new JPanel();
			panelCadidatos_58.add(getLblCandidatos1_58());
		}
		return panelCadidatos_58;
	}
	private JLabel getLblCandidatos1_58() {
		if (lblCandidatos1_58 == null) {
			lblCandidatos1_58 = new JLabel("");
		}
		return lblCandidatos1_58;
	}
	private JPanel getPanel1_59() {
		if (panel1_59 == null) {
			panel1_59 = new JPanel();
			panel1_59.setBorder(new MatteBorder(3, 1, 1, 3, (Color) new Color(0, 0, 0)));
			panel1_59.setLayout(new BorderLayout(0, 0));
			panel1_59.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e);
				}
			});
			panel1_59.add(getPanelValor_59(), BorderLayout.CENTER);
			panel1_59.add(getPanelCadidatos_59(), BorderLayout.NORTH);
		}
		return panel1_59;
	}
	private JPanel getPanelValor_59() {
		if (panelValor_59 == null) {
			panelValor_59 = new JPanel();
			panelValor_59.add(getLblValor1_59());
		}
		return panelValor_59;
	}
	private JLabel getLblValor1_59() {
		if (lblValor1_59 == null) {
			lblValor1_59 = new JLabel("");
			lblValor1_59.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor1_59;
	}
	private JPanel getPanelCadidatos_59() {
		if (panelCadidatos_59 == null) {
			panelCadidatos_59 = new JPanel();
			panelCadidatos_59.add(getLblCandidatos1_59());
		}
		return panelCadidatos_59;
	}
	private JLabel getLblCandidatos1_59() {
		if (lblCandidatos1_59 == null) {
			lblCandidatos1_59 = new JLabel("");
		}
		return lblCandidatos1_59;
	}
	private JPanel getPanel1_60() {
		if (panel1_60 == null) {
			panel1_60 = new JPanel();
			panel1_60.setBorder(new MatteBorder(3, 3, 1, 1, (Color) new Color(0, 0, 0)));
			panel1_60.setLayout(new BorderLayout(0, 0));
			panel1_60.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e);
				}
			});
			panel1_60.add(getPanelValor_60(), BorderLayout.CENTER);
			panel1_60.add(getPanelCadidatos_60(), BorderLayout.NORTH);
		}
		return panel1_60;
	}
	private JPanel getPanelValor_60() {
		if (panelValor_60 == null) {
			panelValor_60 = new JPanel();
			panelValor_60.add(getLblValor1_60());
		}
		return panelValor_60;
	}
	private JLabel getLblValor1_60() {
		if (lblValor1_60 == null) {
			lblValor1_60 = new JLabel("");
			lblValor1_60.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor1_60;
	}
	private JPanel getPanelCadidatos_60() {
		if (panelCadidatos_60 == null) {
			panelCadidatos_60 = new JPanel();
			panelCadidatos_60.add(getLblCandidatos1_60());
		}
		return panelCadidatos_60;
	}
	private JLabel getLblCandidatos1_60() {
		if (lblCandidatos1_60 == null) {
			lblCandidatos1_60 = new JLabel("");
		}
		return lblCandidatos1_60;
	}
	private JPanel getPanel1_61() {
		if (panel1_61 == null) {
			panel1_61 = new JPanel();
			panel1_61.setBorder(new MatteBorder(3, 1, 1, 1, (Color) new Color(0, 0, 0)));
			panel1_61.setLayout(new BorderLayout(0, 0));
			panel1_61.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e);
				}
			});
			panel1_61.add(getPanelValor_61(), BorderLayout.CENTER);
			panel1_61.add(getPanelCadidatos_61(), BorderLayout.NORTH);
		}
		return panel1_61;
	}
	private JPanel getPanelValor_61() {
		if (panelValor_61 == null) {
			panelValor_61 = new JPanel();
			panelValor_61.add(getLblValor1_61());
		}
		return panelValor_61;
	}
	private JLabel getLblValor1_61() {
		if (lblValor1_61 == null) {
			lblValor1_61 = new JLabel("");
			lblValor1_61.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor1_61;
	}
	private JPanel getPanelCadidatos_61() {
		if (panelCadidatos_61 == null) {
			panelCadidatos_61 = new JPanel();
			panelCadidatos_61.add(getLblCandidatos1_61());
		}
		return panelCadidatos_61;
	}
	private JLabel getLblCandidatos1_61() {
		if (lblCandidatos1_61 == null) {
			lblCandidatos1_61 = new JLabel("");
		}
		return lblCandidatos1_61;
	}
	private JPanel getPanel1_62() {
		if (panel1_62 == null) {
			panel1_62 = new JPanel();
			panel1_62.setBorder(new MatteBorder(3, 1, 1, 4, (Color) new Color(0, 0, 0)));
			panel1_62.setLayout(new BorderLayout(0, 0));
			panel1_62.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e);
				}
			});
			panel1_62.add(getPanelValor_62());
			panel1_62.add(getPanelCadidatos_62(), BorderLayout.NORTH);
		}
		return panel1_62;
	}
	private JPanel getPanelValor_62() {
		if (panelValor_62 == null) {
			panelValor_62 = new JPanel();
			panelValor_62.add(getLblValor1_62());
		}
		return panelValor_62;
	}
	private JLabel getLblValor1_62() {
		if (lblValor1_62 == null) {
			lblValor1_62 = new JLabel("");
			lblValor1_62.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor1_62;
	}
	private JPanel getPanelCadidatos_62() {
		if (panelCadidatos_62 == null) {
			panelCadidatos_62 = new JPanel();
			panelCadidatos_62.add(getLblCandidatos1_62());
		}
		return panelCadidatos_62;
	}
	private JLabel getLblCandidatos1_62() {
		if (lblCandidatos1_62 == null) {
			lblCandidatos1_62 = new JLabel("");
		}
		return lblCandidatos1_62;
	}
	private JPanel getPanel1_63() {
		if (panel1_63 == null) {
			panel1_63 = new JPanel();
			panel1_63.setBorder(new MatteBorder(1, 4, 1, 1, (Color) new Color(0, 0, 0)));
			panel1_63.setLayout(new BorderLayout(0, 0));
			panel1_63.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e);
				}
			});
			panel1_63.add(getPanelValor_63());
			panel1_63.add(getPanelCadidatos_63(), BorderLayout.NORTH);
		}
		return panel1_63;
	}
	private JPanel getPanelValor_63() {
		if (panelValor_63 == null) {
			panelValor_63 = new JPanel();
			panelValor_63.add(getLblValor1_63());
		}
		return panelValor_63;
	}
	private JLabel getLblValor1_63() {
		if (lblValor1_63 == null) {
			lblValor1_63 = new JLabel("");
			lblValor1_63.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor1_63;
	}
	private JPanel getPanelCadidatos_63() {
		if (panelCadidatos_63 == null) {
			panelCadidatos_63 = new JPanel();
			panelCadidatos_63.add(getLblCandidatos1_63());
		}
		return panelCadidatos_63;
	}
	private JLabel getLblCandidatos1_63() {
		if (lblCandidatos1_63 == null) {
			lblCandidatos1_63 = new JLabel("");
		}
		return lblCandidatos1_63;
	}
	private JPanel getPanel1_64() {
		if (panel1_64 == null) {
			panel1_64 = new JPanel();
			panel1_64.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
			panel1_64.setLayout(new BorderLayout(0, 0));
			panel1_64.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e);
				}
			});
			panel1_64.add(getPanelValor_64());
			panel1_64.add(getPanelCadidatos_64(), BorderLayout.NORTH);
		}
		return panel1_64;
	}
	private JPanel getPanelValor_64() {
		if (panelValor_64 == null) {
			panelValor_64 = new JPanel();
			panelValor_64.add(getLblValor1_64());
		}
		return panelValor_64;
	}
	private JLabel getLblValor1_64() {
		if (lblValor1_64 == null) {
			lblValor1_64 = new JLabel("");
			lblValor1_64.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor1_64;
	}
	private JPanel getPanelCadidatos_64() {
		if (panelCadidatos_64 == null) {
			panelCadidatos_64 = new JPanel();
			panelCadidatos_64.add(getLblCandidatos1_64());
		}
		return panelCadidatos_64;
	}
	private JLabel getLblCandidatos1_64() {
		if (lblCandidatos1_64 == null) {
			lblCandidatos1_64 = new JLabel("");
		}
		return lblCandidatos1_64;
	}
	private JPanel getPanel1_65() {
		if (panel1_65 == null) {
			panel1_65 = new JPanel();
			panel1_65.setBorder(new MatteBorder(1, 1, 1, 3, (Color) new Color(0, 0, 0)));
			panel1_65.setLayout(new BorderLayout(0, 0));
			panel1_65.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e);
				}
			});
			panel1_65.add(getPanelValor_65());
			panel1_65.add(getPanelCadidatos_65(), BorderLayout.NORTH);
		}
		return panel1_65;
	}
	private JPanel getPanelValor_65() {
		if (panelValor_65 == null) {
			panelValor_65 = new JPanel();
			panelValor_65.add(getLblValor1_65());
		}
		return panelValor_65;
	}
	private JLabel getLblValor1_65() {
		if (lblValor1_65 == null) {
			lblValor1_65 = new JLabel("");
			lblValor1_65.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor1_65;
	}
	private JPanel getPanelCadidatos_65() {
		if (panelCadidatos_65 == null) {
			panelCadidatos_65 = new JPanel();
			panelCadidatos_65.add(getLblCandidatos1_65());
		}
		return panelCadidatos_65;
	}
	private JLabel getLblCandidatos1_65() {
		if (lblCandidatos1_65 == null) {
			lblCandidatos1_65 = new JLabel("");
		}
		return lblCandidatos1_65;
	}
	private JPanel getPanel1_66() {
		if (panel1_66 == null) {
			panel1_66 = new JPanel();
			panel1_66.setBorder(new MatteBorder(1, 3, 1, 1, (Color) new Color(0, 0, 0)));
			panel1_66.setLayout(new BorderLayout(0, 0));
			panel1_66.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e);
				}
			});
			panel1_66.add(getPanelValor_66());
			panel1_66.add(getPanelCadidatos_66(), BorderLayout.NORTH);
		}
		return panel1_66;
	}
	private JPanel getPanelValor_66() {
		if (panelValor_66 == null) {
			panelValor_66 = new JPanel();
			panelValor_66.add(getLblValor1_66());
		}
		return panelValor_66;
	}
	private JLabel getLblValor1_66() {
		if (lblValor1_66 == null) {
			lblValor1_66 = new JLabel("");
			lblValor1_66.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor1_66;
	}
	private JPanel getPanelCadidatos_66() {
		if (panelCadidatos_66 == null) {
			panelCadidatos_66 = new JPanel();
			panelCadidatos_66.add(getLblCandidatos1_66());
		}
		return panelCadidatos_66;
	}
	private JLabel getLblCandidatos1_66() {
		if (lblCandidatos1_66 == null) {
			lblCandidatos1_66 = new JLabel("");
		}
		return lblCandidatos1_66;
	}
	private JPanel getPanel1_67() {
		if (panel1_67 == null) {
			panel1_67 = new JPanel();
			panel1_67.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
			panel1_67.setLayout(new BorderLayout(0, 0));
			panel1_67.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e);
				}
			});
			panel1_67.add(getPanelValor_67());
			panel1_67.add(getPanelCadidatos_67(), BorderLayout.NORTH);
		}
		return panel1_67;
	}
	private JPanel getPanelValor_67() {
		if (panelValor_67 == null) {
			panelValor_67 = new JPanel();
			panelValor_67.add(getLblValor1_67());
		}
		return panelValor_67;
	}
	private JLabel getLblValor1_67() {
		if (lblValor1_67 == null) {
			lblValor1_67 = new JLabel("");
			lblValor1_67.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor1_67;
	}
	private JPanel getPanelCadidatos_67() {
		if (panelCadidatos_67 == null) {
			panelCadidatos_67 = new JPanel();
			panelCadidatos_67.add(getLblCandidatos1_67());
		}
		return panelCadidatos_67;
	}
	private JLabel getLblCandidatos1_67() {
		if (lblCandidatos1_67 == null) {
			lblCandidatos1_67 = new JLabel("");
		}
		return lblCandidatos1_67;
	}
	private JPanel getPanel1_68() {
		if (panel1_68 == null) {
			panel1_68 = new JPanel();
			panel1_68.setBorder(new MatteBorder(1, 1, 1, 3, (Color) new Color(0, 0, 0)));
			panel1_68.setLayout(new BorderLayout(0, 0));
			panel1_68.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e);
				}
			});
			panel1_68.add(getPanelValor_68());
			panel1_68.add(getPanelCadidatos_68(), BorderLayout.NORTH);
		}
		return panel1_68;
	}
	private JPanel getPanelValor_68() {
		if (panelValor_68 == null) {
			panelValor_68 = new JPanel();
			panelValor_68.add(getLblValor1_68());
		}
		return panelValor_68;
	}
	private JLabel getLblValor1_68() {
		if (lblValor1_68 == null) {
			lblValor1_68 = new JLabel("");
			lblValor1_68.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor1_68;
	}
	private JPanel getPanelCadidatos_68() {
		if (panelCadidatos_68 == null) {
			panelCadidatos_68 = new JPanel();
			panelCadidatos_68.add(getLblCandidatos1_68());
		}
		return panelCadidatos_68;
	}
	private JLabel getLblCandidatos1_68() {
		if (lblCandidatos1_68 == null) {
			lblCandidatos1_68 = new JLabel("");
		}
		return lblCandidatos1_68;
	}
	private JPanel getPanel1_69() {
		if (panel1_69 == null) {
			panel1_69 = new JPanel();
			panel1_69.setBorder(new MatteBorder(1, 3, 1, 1, (Color) new Color(0, 0, 0)));
			panel1_69.setLayout(new BorderLayout(0, 0));
			panel1_69.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e);
				}
			});
			panel1_69.add(getPanelValor_69());
			panel1_69.add(getPanelCadidatos_69(), BorderLayout.NORTH);
		}
		return panel1_69;
	}
	private JPanel getPanelValor_69() {
		if (panelValor_69 == null) {
			panelValor_69 = new JPanel();
			panelValor_69.add(getLblValor1_69());
		}
		return panelValor_69;
	}
	private JLabel getLblValor1_69() {
		if (lblValor1_69 == null) {
			lblValor1_69 = new JLabel("");
			lblValor1_69.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor1_69;
	}
	private JPanel getPanelCadidatos_69() {
		if (panelCadidatos_69 == null) {
			panelCadidatos_69 = new JPanel();
			panelCadidatos_69.add(getLblCandidatos1_69());
		}
		return panelCadidatos_69;
	}
	private JLabel getLblCandidatos1_69() {
		if (lblCandidatos1_69 == null) {
			lblCandidatos1_69 = new JLabel("");
		}
		return lblCandidatos1_69;
	}
	private JPanel getPanel1_70() {
		if (panel1_70 == null) {
			panel1_70 = new JPanel();
			panel1_70.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
			panel1_70.setLayout(new BorderLayout(0, 0));
			panel1_70.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e);
				}
			});
			panel1_70.add(getPanelValor_70());
			panel1_70.add(getPanelCadidatos_70(), BorderLayout.NORTH);
		}
		return panel1_70;
	}
	private JPanel getPanelValor_70() {
		if (panelValor_70 == null) {
			panelValor_70 = new JPanel();
			panelValor_70.add(getLblValor1_70());
		}
		return panelValor_70;
	}
	private JLabel getLblValor1_70() {
		if (lblValor1_70 == null) {
			lblValor1_70 = new JLabel("");
			lblValor1_70.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor1_70;
	}
	private JPanel getPanelCadidatos_70() {
		if (panelCadidatos_70 == null) {
			panelCadidatos_70 = new JPanel();
			panelCadidatos_70.add(getLblCandidatos1_70());
		}
		return panelCadidatos_70;
	}
	private JLabel getLblCandidatos1_70() {
		if (lblCandidatos1_70 == null) {
			lblCandidatos1_70 = new JLabel("");
		}
		return lblCandidatos1_70;
	}
	private JPanel getPanel1_71() {
		if (panel1_71 == null) {
			panel1_71 = new JPanel();
			panel1_71.setBorder(new MatteBorder(1, 1, 1, 4, (Color) new Color(0, 0, 0)));
			panel1_71.setLayout(new BorderLayout(0, 0));
			panel1_71.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e);
				}
			});
			panel1_71.add(getPanelValor_71());
			panel1_71.add(getPanelCadidatos_71(), BorderLayout.NORTH);
		}
		return panel1_71;
	}
	private JPanel getPanelValor_71() {
		if (panelValor_71 == null) {
			panelValor_71 = new JPanel();
			panelValor_71.add(getLblValor1_71());
		}
		return panelValor_71;
	}
	private JLabel getLblValor1_71() {
		if (lblValor1_71 == null) {
			lblValor1_71 = new JLabel("");
			lblValor1_71.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor1_71;
	}
	private JPanel getPanelCadidatos_71() {
		if (panelCadidatos_71 == null) {
			panelCadidatos_71 = new JPanel();
			panelCadidatos_71.add(getLblCandidatos1_71());
		}
		return panelCadidatos_71;
	}
	private JLabel getLblCandidatos1_71() {
		if (lblCandidatos1_71 == null) {
			lblCandidatos1_71 = new JLabel("");
		}
		return lblCandidatos1_71;
	}
	private JPanel getPanel1_72() {
		if (panel1_72 == null) {
			panel1_72 = new JPanel();
			panel1_72.setBorder(new MatteBorder(1, 4, 4, 1, (Color) new Color(0, 0, 0)));
			panel1_72.setLayout(new BorderLayout(0, 0));
			panel1_72.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e);
				}
			});
			panel1_72.add(getPanelValor_72());
			panel1_72.add(getPanelCadidatos_72(), BorderLayout.NORTH);
		}
		return panel1_72;
	}
	private JPanel getPanelValor_72() {
		if (panelValor_72 == null) {
			panelValor_72 = new JPanel();
			panelValor_72.add(getLblValor1_72());
		}
		return panelValor_72;
	}
	private JLabel getLblValor1_72() {
		if (lblValor1_72 == null) {
			lblValor1_72 = new JLabel("");
			lblValor1_72.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor1_72;
	}
	private JPanel getPanelCadidatos_72() {
		if (panelCadidatos_72 == null) {
			panelCadidatos_72 = new JPanel();
			panelCadidatos_72.add(getLblCandidatos1_72());
		}
		return panelCadidatos_72;
	}
	private JLabel getLblCandidatos1_72() {
		if (lblCandidatos1_72 == null) {
			lblCandidatos1_72 = new JLabel("");
		}
		return lblCandidatos1_72;
	}
	private JPanel getPanel1_73() {
		if (panel1_73 == null) {
			panel1_73 = new JPanel();
			panel1_73.setBorder(new MatteBorder(1, 1, 4, 1, (Color) new Color(0, 0, 0)));
			panel1_73.setLayout(new BorderLayout(0, 0));
			panel1_73.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e);
				}
			});
			panel1_73.add(getPanelValor_73());
			panel1_73.add(getPanelCadidatos_73(), BorderLayout.NORTH);
		}
		return panel1_73;
	}
	private JPanel getPanelValor_73() {
		if (panelValor_73 == null) {
			panelValor_73 = new JPanel();
			panelValor_73.add(getLblValor1_73());
		}
		return panelValor_73;
	}
	private JLabel getLblValor1_73() {
		if (lblValor1_73 == null) {
			lblValor1_73 = new JLabel("");
			lblValor1_73.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor1_73;
	}
	private JPanel getPanelCadidatos_73() {
		if (panelCadidatos_73 == null) {
			panelCadidatos_73 = new JPanel();
			panelCadidatos_73.add(getLblCandidatos1_73());
		}
		return panelCadidatos_73;
	}
	private JLabel getLblCandidatos1_73() {
		if (lblCandidatos1_73 == null) {
			lblCandidatos1_73 = new JLabel("");
		}
		return lblCandidatos1_73;
	}
	private JPanel getPanel1_74() {
		if (panel1_74 == null) {
			panel1_74 = new JPanel();
			panel1_74.setBorder(new MatteBorder(1, 1, 4, 3, (Color) new Color(0, 0, 0)));
			panel1_74.setLayout(new BorderLayout(0, 0));
			panel1_74.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e);
				}
			});
			panel1_74.add(getPanelValor_74());
			panel1_74.add(getPanelCadidatos_74(), BorderLayout.NORTH);
		}
		return panel1_74;
	}
	private JPanel getPanelValor_74() {
		if (panelValor_74 == null) {
			panelValor_74 = new JPanel();
			panelValor_74.add(getLblValor1_74());
		}
		return panelValor_74;
	}
	private JLabel getLblValor1_74() {
		if (lblValor1_74 == null) {
			lblValor1_74 = new JLabel("");
			lblValor1_74.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor1_74;
	}
	private JPanel getPanelCadidatos_74() {
		if (panelCadidatos_74 == null) {
			panelCadidatos_74 = new JPanel();
			panelCadidatos_74.add(getLblCandidatos1_74());
		}
		return panelCadidatos_74;
	}
	private JLabel getLblCandidatos1_74() {
		if (lblCandidatos1_74 == null) {
			lblCandidatos1_74 = new JLabel("");
		}
		return lblCandidatos1_74;
	}
	private JPanel getPanel1_75() {
		if (panel1_75 == null) {
			panel1_75 = new JPanel();
			panel1_75.setBorder(new MatteBorder(1, 3, 4, 1, (Color) new Color(0, 0, 0)));
			panel1_75.setLayout(new BorderLayout(0, 0));
			panel1_75.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e);
				}
			});
			panel1_75.add(getPanelValor_75());
			panel1_75.add(getPanelCadidatos_75(), BorderLayout.NORTH);
		}
		return panel1_75;
	}
	private JPanel getPanelValor_75() {
		if (panelValor_75 == null) {
			panelValor_75 = new JPanel();
			panelValor_75.add(getLblValor1_75());
		}
		return panelValor_75;
	}
	private JLabel getLblValor1_75() {
		if (lblValor1_75 == null) {
			lblValor1_75 = new JLabel("");
			lblValor1_75.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor1_75;
	}
	private JPanel getPanelCadidatos_75() {
		if (panelCadidatos_75 == null) {
			panelCadidatos_75 = new JPanel();
			panelCadidatos_75.add(getLblCandidatos1_75());
		}
		return panelCadidatos_75;
	}
	private JLabel getLblCandidatos1_75() {
		if (lblCandidatos1_75 == null) {
			lblCandidatos1_75 = new JLabel("");
		}
		return lblCandidatos1_75;
	}
	private JPanel getPanel1_76() {
		if (panel1_76 == null) {
			panel1_76 = new JPanel();
			panel1_76.setBorder(new MatteBorder(1, 1, 4, 1, (Color) new Color(0, 0, 0)));
			panel1_76.setLayout(new BorderLayout(0, 0));
			panel1_76.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e);
				}
			});
			panel1_76.add(getPanelValor_76());
			panel1_76.add(getPanelCadidatos_76(), BorderLayout.NORTH);
		}
		return panel1_76;
	}
	private JPanel getPanelValor_76() {
		if (panelValor_76 == null) {
			panelValor_76 = new JPanel();
			panelValor_76.add(getLblValor1_76());
		}
		return panelValor_76;
	}
	private JLabel getLblValor1_76() {
		if (lblValor1_76 == null) {
			lblValor1_76 = new JLabel("");
			lblValor1_76.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor1_76;
	}
	private JPanel getPanelCadidatos_76() {
		if (panelCadidatos_76 == null) {
			panelCadidatos_76 = new JPanel();
			panelCadidatos_76.add(getLblCandidatos1_76());
		}
		return panelCadidatos_76;
	}
	private JLabel getLblCandidatos1_76() {
		if (lblCandidatos1_76 == null) {
			lblCandidatos1_76 = new JLabel("");
		}
		return lblCandidatos1_76;
	}
	private JPanel getPanel1_77() {
		if (panel1_77 == null) {
			panel1_77 = new JPanel();
			panel1_77.setBorder(new MatteBorder(1, 1, 4, 3, (Color) new Color(0, 0, 0)));
			panel1_77.setLayout(new BorderLayout(0, 0));
			panel1_77.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e);
				}
			});
			panel1_77.add(getPanelValor_77());
			panel1_77.add(getPanelCadidatos_77(), BorderLayout.NORTH);
		}
		return panel1_77;
	}
	private JPanel getPanelValor_77() {
		if (panelValor_77 == null) {
			panelValor_77 = new JPanel();
			panelValor_77.add(getLblValor1_77());
		}
		return panelValor_77;
	}
	private JLabel getLblValor1_77() {
		if (lblValor1_77 == null) {
			lblValor1_77 = new JLabel("");
			lblValor1_77.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor1_77;
	}
	private JPanel getPanelCadidatos_77() {
		if (panelCadidatos_77 == null) {
			panelCadidatos_77 = new JPanel();
			panelCadidatos_77.add(getLblCandidatos1_77());
		}
		return panelCadidatos_77;
	}
	private JLabel getLblCandidatos1_77() {
		if (lblCandidatos1_77 == null) {
			lblCandidatos1_77 = new JLabel("");
		}
		return lblCandidatos1_77;
	}
	private JPanel getPanel1_78() {
		if (panel1_78 == null) {
			panel1_78 = new JPanel();
			panel1_78.setBorder(new MatteBorder(1, 3, 4, 1, (Color) new Color(0, 0, 0)));
			panel1_78.setLayout(new BorderLayout(0, 0));
			panel1_78.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e);
				}
			});
			panel1_78.add(getPanelValor_78());
			panel1_78.add(getPanelCadidatos_78(), BorderLayout.NORTH);
		}
		return panel1_78;
	}
	private JPanel getPanelValor_78() {
		if (panelValor_78 == null) {
			panelValor_78 = new JPanel();
			panelValor_78.add(getLblValor1_78());
		}
		return panelValor_78;
	}
	private JLabel getLblValor1_78() {
		if (lblValor1_78 == null) {
			lblValor1_78 = new JLabel("");
			lblValor1_78.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor1_78;
	}
	private JPanel getPanelCadidatos_78() {
		if (panelCadidatos_78 == null) {
			panelCadidatos_78 = new JPanel();
			panelCadidatos_78.add(getLblCandidatos1_78());
		}
		return panelCadidatos_78;
	}
	private JLabel getLblCandidatos1_78() {
		if (lblCandidatos1_78 == null) {
			lblCandidatos1_78 = new JLabel("");
		}
		return lblCandidatos1_78;
	}
	private JPanel getPanel1_79() {
		if (panel1_79 == null) {
			panel1_79 = new JPanel();
			panel1_79.setBorder(new MatteBorder(1, 1, 4, 1, (Color) new Color(0, 0, 0)));
			panel1_79.setLayout(new BorderLayout(0, 0));
			panel1_79.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e);
				}
			});
			panel1_79.add(getPanelValor_79());
			panel1_79.add(getPanelCadidatos_79(), BorderLayout.NORTH);
		}
		return panel1_79;
	}
	private JPanel getPanelValor_79() {
		if (panelValor_79 == null) {
			panelValor_79 = new JPanel();
			panelValor_79.add(getLblValor1_79());
		}
		return panelValor_79;
	}
	private JLabel getLblValor1_79() {
		if (lblValor1_79 == null) {
			lblValor1_79 = new JLabel("");
			lblValor1_79.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor1_79;
	}
	private JPanel getPanelCadidatos_79() {
		if (panelCadidatos_79 == null) {
			panelCadidatos_79 = new JPanel();
			panelCadidatos_79.add(getLblCandidatos1_79());
		}
		return panelCadidatos_79;
	}
	private JLabel getLblCandidatos1_79() {
		if (lblCandidatos1_79 == null) {
			lblCandidatos1_79 = new JLabel("");
		}
		return lblCandidatos1_79;
	}
	private JPanel getPanel1_80() {
		if (panel1_80 == null) {
			panel1_80 = new JPanel();
			panel1_80.setBorder(new MatteBorder(1, 1, 4, 4, (Color) new Color(0, 0, 0)));
			panel1_80.setLayout(new BorderLayout(0, 0));
			panel1_80.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					select=casillaSelect(e);
				}
			});
			panel1_80.add(getPanelValor_80());
			panel1_80.add(getPanelCadidatos_80(), BorderLayout.NORTH);
		}
		return panel1_80;
	}
	private JPanel getPanelValor_80() {
		if (panelValor_80 == null) {
			panelValor_80 = new JPanel();
			panelValor_80.add(getLblValor1_80());
		}
		return panelValor_80;
	}
	private JLabel getLblValor1_80() {
		if (lblValor1_80 == null) {
			lblValor1_80 = new JLabel("");
			lblValor1_80.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblValor1_80;
	}
	private JPanel getPanelCadidatos_80() {
		if (panelCadidatos_80 == null) {
			panelCadidatos_80 = new JPanel();
			panelCadidatos_80.add(getLblCandidatos1_80());
		}
		return panelCadidatos_80;
	}
	private JLabel getLblCandidatos1_80() {
		if (lblCandidatos1_80 == null) {
			lblCandidatos1_80 = new JLabel("");
		}
		return lblCandidatos1_80;
	}
	
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setLayout(new BorderLayout(0, 0));
			panel.add(getLblCrono());
		}
		return panel;
	}
	private JLabel getLblCrono() {
		if (lblCrono == null) {
			lblCrono = new JLabel("00:00");
			lblCrono.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblCrono.setHorizontalAlignment( JLabel.CENTER );

		}
		return lblCrono;	
	}
	
	private void anadirAlArray() {
		int n = 0;
		for (int i = 0; i < matrizPaneles.length; i++) {
			for (int j = 0; j < matrizPaneles[0].length; j++) {
				matrizPaneles[i][j] = devolverPanel(n);
				n++;
			}
		}
	}
	
	private JPanel devolverPanel (int n) {
		switch (n) {
			case 0: return this.panel1_0;
			case 1: return this.panel1_1;
			case 2: return this.panel1_2;
			case 3: return this.panel1_3;
			case 4: return this.panel1_4;
			case 5: return this.panel1_5;
			case 6: return this.panel1_6;
			case 7: return this.panel1_7;
			case 8: return this.panel1_8;
			case 9: return this.panel1_9;
			case 10: return this.panel1_10;
			case 11: return this.panel1_11;
			case 12: return this.panel1_12;
			case 13: return this.panel1_13;
			case 14: return this.panel1_14;
			case 15: return this.panel1_15;
			case 16: return this.panel1_16;
			case 17: return this.panel1_17;
			case 18: return this.panel1_18;
			case 19: return this.panel1_19;
			case 20: return this.panel1_20;
			case 21: return this.panel1_21;
			case 22: return this.panel1_22;
			case 23: return this.panel1_23;
			case 24: return this.panel1_24;
			case 25: return this.panel1_25;
			case 26: return this.panel1_26;
			case 27: return this.panel1_27;
			case 28: return this.panel1_28;
			case 29: return this.panel1_29;
			case 30: return this.panel1_30;
			case 31: return this.panel1_31;
			case 32: return this.panel1_32;
			case 33: return this.panel1_33;
			case 34: return this.panel1_34;
			case 35: return this.panel1_35;
			case 36: return this.panel1_36;
			case 37: return this.panel1_37;
			case 38: return this.panel1_38;
			case 39: return this.panel1_39;
			case 40: return this.panel1_40;
			case 41: return this.panel1_41;
			case 42: return this.panel1_42;
			case 43: return this.panel1_43;
			case 44: return this.panel1_44;
			case 45: return this.panel1_45;
			case 46: return this.panel1_46;
			case 47: return this.panel1_47;
			case 48: return this.panel1_48;
			case 49: return this.panel1_49;
			case 50: return this.panel1_50;
			case 51: return this.panel1_51;
			case 52: return this.panel1_52;
			case 53: return this.panel1_53;
			case 54: return this.panel1_54;
			case 55: return this.panel1_55;
			case 56: return this.panel1_56;
			case 57: return this.panel1_57;
			case 58: return this.panel1_58;
			case 59: return this.panel1_59;
			case 60: return this.panel1_60;
			case 61: return this.panel1_61;
			case 62: return this.panel1_62;
			case 63: return this.panel1_63;
			case 64: return this.panel1_64;
			case 65: return this.panel1_65;
			case 66: return this.panel1_66;
			case 67: return this.panel1_67;
			case 68: return this.panel1_68;
			case 69: return this.panel1_69;
			case 70: return this.panel1_70;
			case 71: return this.panel1_71;
			case 72: return this.panel1_72;
			case 73: return this.panel1_73;
			case 74: return this.panel1_74;
			case 75: return this.panel1_75;
			case 76: return this.panel1_76;
			case 77: return this.panel1_77;
			case 78: return this.panel1_78;
			case 79: return this.panel1_79;
			case 80: return this.panel1_80;	
		}
		return null;
	}
	
	
	private JButton getBtnComprobar() {
		if (btnComprobar == null) {
			btnComprobar = new JButton("Comprobar");
			btnComprobar.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 11));
			btnComprobar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					/*boolean correcto = controlador.Tablero.getTablero().comprobarResultado();
					if (!correcto) {
						 JOptionPane.showMessageDialog(panel, "Lo sentimos, no es correcto", "Error", JOptionPane.ERROR_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(null, "Has completado el sudoku de manera satisfactoria, mis dieses");
					}*/
				}
			});
		}
		return btnComprobar;
	}
}
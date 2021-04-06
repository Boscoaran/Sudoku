package vista;


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
import java.awt.Component;
import java.awt.event.MouseAdapter;
import javax.swing.border.EtchedBorder;


import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings({ "serial", "deprecation" })
public class Tablero extends JFrame implements Observer{

	private JFrame frmSudokuRoyaleMaster;
	private static Tablero mTablero;
	private JPanelBackground panelDatos;
	private JPanel panelTablero;
	//private Border bordeNormal = new LineBorder(Color.BLACK, 1);
	private Border bordeGrueso = new LineBorder(Color.BLUE, 3);
	private JPanel select = null;
	private JTextField textFieldCandidatos;
	private JLabel lblCandidatos;
	private JLabel lblValor;
	private JTextField textFieldValor;
	private JButton btnModificar;
	private JButton btnAyuda;
	private JPanelBackground panelNorth;
	private JPanelBackground panelSouth;
	private JPanelBackground panelWest;
	private JPanel matrizPaneles[][];
	private JButton btnComprobar;
	private Border bordeAct;

	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tablero window = new Tablero();
					window.frmSudokuRoyaleMaster.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/
	
	public static Tablero getTablero() {
		if (mTablero == null) mTablero = new Tablero();
		return mTablero;
	}
	private Tablero() {
		matrizPaneles = new JPanel[9][9];
		initialize();
		System.out.println();
		modelo.Tablero.getTablero().addObserver(this);
		
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
		frmSudokuRoyaleMaster.setLocationRelativeTo(null);
		frmSudokuRoyaleMaster.setVisible(true);
	}

	
	
//////////////////////////PANEL DATOS////////////////////////////////////////////	
	
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
	
	private JButton getBtnComprobar() {
		if (btnComprobar == null) {
			btnComprobar = new JButton("Comprobar");
			btnComprobar.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 11));
			btnComprobar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					modelo.Tablero.getTablero().comprobarResultado();
				}
			});
		}
		return btnComprobar;
	}
	
	private boolean isInteger(String num) { //Metodo para comprobar que es un número
		try {
			Integer.parseInt(num);
			return true;
		} catch(NumberFormatException e) {
			return false;
		}
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
									if ((isInteger(numValor) && numValor.length() > 1) || (isInteger(numValor) && Integer.parseInt(numValor) == 0)) {
										JOptionPane.showMessageDialog(null, "Tan solo puede introducir un número distinto de 0", "Error Valor", JOptionPane.ERROR_MESSAGE);
										textFieldValor.setText("");
										return;
									}
									else if (!isInteger(numValor)) {
										JOptionPane.showMessageDialog(null, "Debe introducir un número", "Error Valor", JOptionPane.ERROR_MESSAGE);
										textFieldValor.setText("");
										return;
									} else {
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
											modelo.Tablero.getTablero().setValor(i-1,j-1,textFieldValor.getText());
										} 
									} else {
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
						select.setBorder(bordeAct);
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
	
	
	
///////////////////////////////////////PANEL TITULO///////////////////////////////////////////////	
	
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
	


///////////////////////////////////PANEL SOUTH////////////////////////////////////////////	
	
	private JPanelBackground getPanelSouth() {
		if (panelSouth == null) {
			panelSouth = new JPanelBackground();
			panelSouth.setBackground("resources/fondo sudoku south.jpg");
		}
		return panelSouth;
	}

	

//////////////////////////////////PANEL WEST///////////////////////////////////////////////	
	
	private JPanelBackground getPanelWest() {
		if (panelWest == null) {
			panelWest = new JPanelBackground();
			panelWest.setBackground("resources/fondo sudoku west.jpg");
		}
		return panelWest;
	}

	
	
////////////////////////////////TABLERO//////////////////////////////////////////////////	
	
	private JPanel getPanelTablero() {
		if (panelTablero == null) {
			panelTablero = new JPanel();
			panelTablero.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
			panelTablero.setLayout(new GridLayout(9, 9, 0, 0));
			for (int i=1; i<10; i++) {
				for (int j=1; j<10; j++) {
					Casilla casilla = new Casilla(i,j);
					JPanel c = casilla.getCasilla();
					panelTablero.add(c);
					matrizPaneles[i-1][j-1] = c;
				}
			}
		}
		return panelTablero;
	}
	
	public JPanel casillaSelect(MouseEvent event) {
		JPanel seleccionado = (JPanel) event.getSource();
		if (!seleccionado.getBorder().equals(bordeGrueso) && select==null && seleccionado.isEnabled()){
			bordeAct=seleccionado.getBorder();
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
		} else if (!seleccionado.getBorder().equals(bordeGrueso) && select != null && seleccionado.isEnabled()) {
			select.setBorder(bordeAct);
			bordeAct = seleccionado.getBorder();
			textFieldCandidatos.setText("");
			textFieldValor.setText("");
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
		} else if (seleccionado.getBorder().equals(bordeGrueso)) {
			select.setBorder(bordeAct);
			bordeAct = null;
			textFieldCandidatos.setText("");
			textFieldValor.setText("");
			select=null;
			textFieldCandidatos.setEnabled(false);
			textFieldValor.setEnabled(false);
			btnModificar.setEnabled(false);
		}
		return(select);
	}

	
	
//////////////////////////////METODOS MODELO-VISTA/////////////////////////////////
	@Override
	public void update(Observable o, Object arg) {
		int[] a = (int[]) arg;
		if (a[0] == 1) {
			if (a[1] == 0) JOptionPane.showMessageDialog(null, "Lo sentimos, no es correcto", "Error", JOptionPane.ERROR_MESSAGE);
			else JOptionPane.showMessageDialog(null, "Has completado el sudoku de manera satisfactoria, mis dieses");
		} else if (a[0] == 0) {
			modelo.Casilla[][] t = modelo.Tablero.getTablero().getListaCasillas();
			for (int i = 0; i < t.length; i++) {
				for (int j = 0; j < t[0].length; j++) {
					if (t[i][j].getValor() != 0) {
						((JLabel)((JPanel)matrizPaneles[i][j].getComponent(1)).getComponent(0)).setText(Integer.toString(t[i][j].getValor()));
						((JLabel)((JPanel)matrizPaneles[i][j].getComponent(1)).getComponent(0)).setForeground(Color.RED);
						matrizPaneles[i][j].setEnabled(false);
					}
				}
			}
		
		} else if (a[0] == 2) {
			((JLabel)((JPanel)matrizPaneles[a[1]][a[2]].getComponent(1)).getComponent(0)).setText(Integer.toString(a[3]));
		}
	}
}

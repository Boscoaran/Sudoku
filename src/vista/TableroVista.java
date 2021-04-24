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
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;


import java.awt.Color;
import java.awt.Font;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import javax.swing.border.EtchedBorder;


import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.ActionEvent;

@SuppressWarnings({ "serial", "deprecation" })
public class TableroVista extends JFrame implements Observer{

	private JFrame frmSudokuRoyaleMaster;
	private static TableroVista mTablero;
	private JPanelBackground panelDatos;
	private JPanel panelTablero;
	private Border bordeGrueso = new LineBorder(Color.BLUE, 5);
	private CasillaVista select = null;
	private JTextField textFieldCandidatos;
	private JLabel lblCandidatos;
	private JLabel lblValor;
	private JTextField textFieldValor;
	private JButton btnModificar;
	private JButton btnAyuda;
	private JPanelBackground panelNorth;
	private JPanelBackground panelSouth;
	private JPanelBackground panelWest;
	private CasillaVista matrizPaneles[][];
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
	
	public static TableroVista getTablero() {
		if (mTablero == null) mTablero = new TableroVista();
		return mTablero;
	}
	private TableroVista() {
		matrizPaneles = new CasillaVista[9][9];
		initialize();
		modelo.TableroModelo.getTablero().addObserver(this);
		
	}
	
		
	private void initialize() {
		frmSudokuRoyaleMaster = new JFrame();
		frmSudokuRoyaleMaster.setBackground(Color.BLACK);
		frmSudokuRoyaleMaster.setTitle("SUDOKU ROYALE MASTER");
		frmSudokuRoyaleMaster.setResizable(true);
		frmSudokuRoyaleMaster.setMinimumSize(new Dimension(800,640));
		frmSudokuRoyaleMaster.setMaximumSize(new Dimension());
		frmSudokuRoyaleMaster.setBounds(100, 100, 1000, 800);
		/*frmSudokuRoyaleMaster.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent e){
				Component tablero = (Component) e.getSource();
				Component[] lCas= TableroVista.getTablero().getComponents(); 
				for (Component cas: lCas) {
					((CasillaVista) cas).tamañoLetra(frmSudokuRoyaleMaster.getWidth());
				}
			}
		});*/
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
			lblCandidatos.setFont(new Font("Gang of Three", Font.PLAIN, 20));
			lblCandidatos.setForeground(new Color(234,183,69));
		}
		return lblCandidatos;
	}
	
	private JLabel getLblValor() {
		if (lblValor == null) {
			lblValor = new JLabel("Valor:");
			lblValor.setFont(new Font("Gang of Three", Font.PLAIN, 20));
			lblValor.setForeground(new Color(234,183,69));
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
					modelo.TableroModelo.getTablero().comprobarResultado();
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
						int cont= 1;
						boolean completed = false;
						while (cont != -1) {
							if (cont == 1) {
								String s = textFieldValor.getText();
								if (compValor(s)) {
									int[] coords = select.getCoords();
									modelo.TableroModelo.getTablero().setValor(coords[0]-1, coords[1]-1, s);
								} else if (s.equals("")) {
									int[] coords = select.getCoords();
									modelo.TableroModelo.getTablero().setValor(coords[0]-1, coords[1]-1, "0");
								}
							} else {
								if (textFieldValor.getText().equals("") || textFieldCandidatos.getText().equals("")) {
									String numCandidatos = textFieldCandidatos.getText();
									if (textFieldCandidatos.getText().equals("")) {
										int[] coords = select.getCoords();
										modelo.TableroModelo.getTablero().setCandidatos(null, coords[0]-1, coords[1]-1);
										completed = true;
									} else if (!compCandidatos(numCandidatos)) {
										int[] coords = select.getCoords();
										modelo.TableroModelo.getTablero().setCandidatos(numCandidatos, coords[0]-1, coords[1]-1);
										completed = true;
									}
								} else {
									if (!((JLabel)((JPanel)select.getComponent(1)).getComponent(0)).getText().equals("") && ((JLabel)((JPanel)select.getComponent(0)).getComponent(0)).getText().equals(" ")) { 
										JOptionPane.showMessageDialog(null, "No se puede introducir candidatos si se ha introducido un valor, por favor, elimina los candidatos", "Error Candidatos", JOptionPane.ERROR_MESSAGE);
									} else {
										((JLabel)((JPanel)select.getComponent(0)).getComponent(0)).setText(" ");
										JOptionPane.showMessageDialog(null, "Se han eliminado los candidatos", "Aviso", JOptionPane.INFORMATION_MESSAGE);
										completed = true;
									}
									
								}	
							}
							cont--;
					}
					if (completed) {
						textFieldCandidatos.setText("");
						textFieldValor.setText("");
						select.setBorder(bordeAct);
						select=null;
						btnModificar.setEnabled(false);
						textFieldCandidatos.setEnabled(false);
						textFieldValor.setEnabled(false);
					}
					}
				}
			});
		}
		return btnModificar;
	}
	
	private boolean compValor(String num) {
		boolean correcto = true;
		if (!num.equals("")) {
			if ((isInteger(num) && num.length() > 1) || (isInteger(num) && Integer.parseInt(num) == 0)) {
				JOptionPane.showMessageDialog(null, "Tan solo puede introducir un número distinto de 0", "Error Valor", JOptionPane.ERROR_MESSAGE);
				textFieldValor.setText("");
				correcto=false;
			}else if (!isInteger(num) && num.length()!=0) {
				JOptionPane.showMessageDialog(null, "Debe introducir un número", "Error Valor", JOptionPane.ERROR_MESSAGE);
				textFieldValor.setText("");
				correcto=false;
			}
		} else {
			correcto = false;
		}
		return correcto;
	}
	
	private boolean compCandidatos(String num) {
		ArrayList<Integer> repes = new ArrayList<>();
		int i = 0;
		boolean repetido = false;
		boolean correcto = true;
		boolean numCero = true;
		while (i<num.length() && correcto) {
			if (num.charAt(i) != ',' && num.charAt(i) != '/' && num.charAt(i) != '-' && num.charAt(i) != ' ') {
				if (!Character.isDigit(num.charAt(i))) {
					correcto = false;
				} else {
					if(Integer.parseInt(num.substring(i,i+1)) < 1) {
						numCero = false;
						correcto = false;
					} else {
						repes.add(Integer.parseInt(num.substring(i,i+1)));
					}

				}
			}
			i++;
		}
		if (correcto) {
			for (int j = 0; j < repes.size(); j++) {
				for (int j2 = 0; j2 < repes.size(); j2++) {
					if(repes.get(j) == repes.get(j2) && j != j2) repetido = true;
				}
			}
			if (repetido) {
				JOptionPane.showMessageDialog(null, "Los candidatos no se pueden repetir", "Error Candidatos",JOptionPane.ERROR_MESSAGE);
			}
		} else if (!correcto && numCero){
			JOptionPane.showMessageDialog(null, "Los candidatos deben de ser números", "Error Candidatos",JOptionPane.ERROR_MESSAGE);
			repetido = true;
		} else if (!correcto && !numCero) {
			JOptionPane.showMessageDialog(null, "Los candidatos no pueden ser 0", "Error Candidatos",JOptionPane.ERROR_MESSAGE);
			repetido = true;
		}
		return repetido;
	}
	
	private JButton getBtnAyuda() {
		if (btnAyuda == null) {
			btnAyuda = new JButton("Ayuda");
			btnAyuda.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 11));
			btnAyuda.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					PanelAyuda p = new PanelAyuda(select);
					/*if (select != null) {
						int[] coords = select.getCoords();
						modelo.TableroModelo.getTablero().calcularCandidatos(--coords[0], --coords[1]);
					} else {
						modelo.TableroModelo.getTablero().calcularCandidatosGlobal();
					}*/
					
					
				}
			});
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
					CasillaVista casilla = new CasillaVista(i,j);
					panelTablero.add(casilla);
					casilla.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							casillaSelect(e);
						}
					});
					
					matrizPaneles[i-1][j-1] = casilla;
				}
			}
		}
		return panelTablero;
	}
	
	public JPanel casillaSelect(MouseEvent event) {
		CasillaVista seleccionado = (CasillaVista) event.getSource();
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
						if (((JLabel)x2).getText().equals(" ")) {
							textFieldCandidatos.setText("");
						}
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
						if (((JLabel)x2).getText().equals(" ")) {
							textFieldCandidatos.setText("");
						}
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
		if (arg instanceof ArrayList<?>) {
			int i = (int) ((ArrayList<?>)((ArrayList<?>) arg).get(1)).get(0);
			int j = (int) ((ArrayList<?>)((ArrayList<?>) arg).get(1)).get(1);
			String s = ((ArrayList<?>) arg).get(0).toString().replace("[", "").replace("]", "");
			if (s.isBlank()) ((JLabel)((JPanel)matrizPaneles[i][j].getComponent(0)).getComponent(0)).setText(" ");
			else {
				((JLabel)((JPanel)matrizPaneles[i][j].getComponent(0)).getComponent(0)).setText(s);
			}
		} else {
			int[] a = (int[]) arg;
			if (a[0] == 1) {
				if (a[1] == 0) JOptionPane.showMessageDialog(null, "Lo sentimos, no es correcto", "Error", JOptionPane.ERROR_MESSAGE);
				else JOptionPane.showMessageDialog(null, "Has completado el sudoku de manera satisfactoria, mis dieses");
			} else if (a[0] == 0) {
				modelo.CasillaModelo[][] t = modelo.TableroModelo.getTablero().getListaCasillas();
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
				if (a[3] == 0) ((JLabel)((JPanel)matrizPaneles[a[1]][a[2]].getComponent(1)).getComponent(0)).setText("");
				else ((JLabel)((JPanel)matrizPaneles[a[1]][a[2]].getComponent(1)).getComponent(0)).setText(Integer.toString(a[3]));
			}
		}
		}
		
}

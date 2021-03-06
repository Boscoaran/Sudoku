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
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import db.DataUsuarios;
import modelo.TableroModelo;

import java.awt.Color;
import java.awt.Font;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;


import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.FlowLayout;

@SuppressWarnings({ "serial", "deprecation" })
public class TableroVista extends JFrame implements Observer{

	private JFrame frmSudokuRoyaleMaster;
	private JPanelBackground panelDatos;
	private JPanelBackground panelTablero;
	private Border bordeGrueso = new LineBorder(new Color(132,178,54), 5);
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
	private JPanel panelTiempo;
	private JLabel lblTiempo;
	private JMenuBar menuBar;
	private JMenu mnPartida;
	private JMenuItem mntmSalir;
	private JMenuItem mntmCandidatos;
	private JMenuItem mntmCandidatosMos;
	private JMenuItem mntmResetCandidatos;
	private JLabel lblGif1;
	private JLabel lblGif2;
	private JLabel lblGif3;
	private JLabel lblGif4;
	private JLabel lblGif5;
	private JLabel lblGif6;
	private boolean mostrarCandidatos = false;
	private static Font go3 = VentanaInicio.getFuente();;
	private JPanel panelAyuda;
	private Dimension tamanioPantalla=Toolkit.getDefaultToolkit().getScreenSize();
	private JLabel lblAyuda1;
	private JLabel lblAyuda2;
	private JLabel lblAyuda3;
	
	public TableroVista() {
		matrizPaneles = new CasillaVista[9][9];
		initialize();
		modelo.TableroModelo.getTablero().addObserver(this);
		
	}
	
		
	private void initialize() {
		frmSudokuRoyaleMaster = new JFrame();
		frmSudokuRoyaleMaster.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent e) {
				Component[] lCas = panelTablero.getComponents();
				for (Component c: lCas) {
					((CasillaVista)c).tamanioLetra(((CasillaVista)c).getHeight(), ((CasillaVista)c).getWidth());
				}
			}
		});
		frmSudokuRoyaleMaster.setBackground(Color.BLACK);
		frmSudokuRoyaleMaster.setTitle("SUDOKU ROYALE MASTER");
		frmSudokuRoyaleMaster.setMinimumSize(new Dimension((int)(tamanioPantalla.width*0.5),(int)(tamanioPantalla.height*0.8)));
		frmSudokuRoyaleMaster.setBounds(0,0,(int)(tamanioPantalla.width*0.6), (int)(tamanioPantalla.height*0.9));
		frmSudokuRoyaleMaster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSudokuRoyaleMaster.getContentPane().setLayout(new BorderLayout(0, 0));
		frmSudokuRoyaleMaster.getContentPane().add(getPanelWest(), BorderLayout.WEST);
		frmSudokuRoyaleMaster.getContentPane().add(getPanelSouth(), BorderLayout.SOUTH);
		frmSudokuRoyaleMaster.getContentPane().add(getPanelDatos(), BorderLayout.EAST);
		frmSudokuRoyaleMaster.getContentPane().add(getPanelTablero(), BorderLayout.CENTER);
		frmSudokuRoyaleMaster.getContentPane().add(getPanelNorth(), BorderLayout.NORTH);
		frmSudokuRoyaleMaster.setLocationRelativeTo(null);
		frmSudokuRoyaleMaster.setJMenuBar(getMenuBar_1());
		frmSudokuRoyaleMaster.setVisible(true);
	}
	
	
	
//////////////////////////PANEL DATOS////////////////////////////////////////////	
	
	
	private JPanelBackground getPanelDatos() {
		if (panelDatos == null) {
			panelDatos = new JPanelBackground();
			panelDatos.setBackground("east BJ.jpg");
			GridBagLayout gbl_panelDatos = new GridBagLayout();
			gbl_panelDatos.columnWidths = new int[]{18, 0, 117, 0, 0};
			gbl_panelDatos.rowHeights = new int[]{20, 0, 0, 0, 0, 0, 0, 0, 110, 11, 0};
			gbl_panelDatos.columnWeights = new double[]{1.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
			gbl_panelDatos.rowWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
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
			panelDatos.add(getPanelTiempo(), gbc_panel);
			GridBagConstraints gbc_panelAyuda = new GridBagConstraints();
			gbc_panelAyuda.fill = GridBagConstraints.BOTH;
			gbc_panelAyuda.gridwidth = 2;
			gbc_panelAyuda.insets = new Insets(0, 0, 0, 5);
			gbc_panelAyuda.gridx = 1;
			gbc_panelAyuda.gridy = 9;
			panelDatos.add(getPanelAyuda(), gbc_panelAyuda);
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
			lblCandidatos.setFont(go3.deriveFont(18f));
			lblCandidatos.setForeground(new Color(234,183,69));
		}
		return lblCandidatos;
	}
	
	private JLabel getLblValor() {
		if (lblValor == null) {
			lblValor = new JLabel("Valor:");
			lblValor.setFont(go3.deriveFont(18f));
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
	
	private JPanel getPanelTiempo() {
		if (panelTiempo == null) {
			panelTiempo = new JPanel();
			panelTiempo.setOpaque(false);
			panelTiempo.setLayout(new BorderLayout(0, 0));
			panelTiempo.add(getLblTiempo());
		}
		return panelTiempo;
	}
	private JLabel getLblTiempo() {
		if (lblTiempo == null) {
			lblTiempo = new JLabel("00:00:00");
			lblTiempo.setForeground(new Color(234,183,69));
			lblTiempo.setFont(go3.deriveFont(50f));
			lblTiempo.setHorizontalAlignment(SwingConstants.CENTER);
		}
		return lblTiempo;
	}
	private boolean isInteger(String num) { //Metodo para comprobar que es un n?mero
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
						boolean completed = false;
						String s = textFieldValor.getText();
						JLabel cas = ((JLabel)((JPanel)select.getComponent(0)).getComponent(0));
						if (compValor(s)) {
							String cand = textFieldCandidatos.getText();
							if ((cand.equals("") && cas.getText().equals(" ")) || (cand.equals("") && !cas.getText().equals(" "))) {
								int[] coords = select.getCoords();
								modelo.TableroModelo.getTablero().setValor(coords[0]-1, coords[1]-1, s);
								modelo.TableroModelo.getTablero().setCandidatos(null, coords[0]-1, coords[1]-1);
								completed = true;
							} else if ((!cand.equals("") && cas.getText().equals(" "))){
								JOptionPane.showMessageDialog(null, "No se pueden introducir candidatos y valor a la vez", "Error", JOptionPane.ERROR_MESSAGE);
							} else if (!cand.equals("") && !cas.getText().equals(" ")) {
								JOptionPane.showMessageDialog(null, "Se han eliminado los candidatos", "Informaci?n", JOptionPane.INFORMATION_MESSAGE);
								int[] coords = select.getCoords();
								modelo.TableroModelo.getTablero().setValor(coords[0]-1, coords[1]-1, s);
								modelo.TableroModelo.getTablero().setCandidatos(null, coords[0]-1, coords[1]-1);
								completed = true;
							}
						} else if (s.equals("")) {
							JLabel casValor = ((JLabel)((JPanel)select.getComponent(1)).getComponent(0));
							String cand = textFieldCandidatos.getText();
							if (casValor.getText().equals("")) {
								if (!cand.equals("") && !compCandidatos(cand)) {
									int[] coords = select.getCoords();
									modelo.TableroModelo.getTablero().setCandidatos(cand, coords[0]-1, coords[1]-1);
									completed = true;
								}
							} else {
								if (!cand.equals("")) {
									int[] coords = select.getCoords();
									modelo.TableroModelo.getTablero().setValor(coords[0]-1, coords[1]-1, "0");
									modelo.TableroModelo.getTablero().setCandidatos(cand, coords[0]-1, coords[1]-1);
									completed = true;
								}
							}
						}
						if (completed) {
							textFieldCandidatos.setText("");
							textFieldValor.setText("");
							select.setBorder(bordeAct);
							select=null;
							btnModificar.setEnabled(false);
							textFieldCandidatos.setEnabled(false);
							textFieldValor.setEnabled(false);
							modelo.TableroModelo.getTablero().calcularCandidatosGlobal(mostrarCandidatos);
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
				JOptionPane.showMessageDialog(null, "Tan solo puede introducir un n?mero distinto de 0", "Error Valor", JOptionPane.ERROR_MESSAGE);
				textFieldValor.setText("");
				correcto=false;
			}else if (!isInteger(num) && num.length()!=0) {
				JOptionPane.showMessageDialog(null, "Debe introducir un n?mero", "Error Valor", JOptionPane.ERROR_MESSAGE);
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
			JOptionPane.showMessageDialog(null, "Los candidatos deben de ser n?meros", "Error Candidatos",JOptionPane.ERROR_MESSAGE);
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
					TableroModelo.getTablero().solicitarAyuda();
				}
			});
		}
		return btnAyuda;
	}
	
	private JPanel getPanelAyuda() {
		if (panelAyuda == null) {
			panelAyuda = new JPanel();
			panelAyuda.setOpaque(false);
			panelAyuda.setLayout(new GridLayout(3, 1, 0, 0));
			panelAyuda.add(getLblAyuda1());
			panelAyuda.add(getLblAyuda2());
			panelAyuda.add(getLblAyuda3());
		}
		return panelAyuda;
	}
	private JLabel getLblAyuda1() {
		if (lblAyuda1 == null) {
			lblAyuda1 = new JLabel(" ");
			lblAyuda1.setHorizontalAlignment(SwingConstants.CENTER);
			lblAyuda1.setFont(go3.deriveFont(25f));
			lblAyuda1.setForeground(new Color(234,183,69));
		}
		return lblAyuda1;
	}
	private JLabel getLblAyuda2() {
		if (lblAyuda2 == null) {
			lblAyuda2 = new JLabel(" ");
			lblAyuda2.setHorizontalAlignment(SwingConstants.CENTER);
			lblAyuda2.setForeground(new Color(234, 183, 69));
			lblAyuda2.setFont(go3.deriveFont(35f));
		}
		return lblAyuda2;
	}
	private JLabel getLblAyuda3() {
		if (lblAyuda3 == null) {
			lblAyuda3 = new JLabel(" ");
			lblAyuda3.setHorizontalAlignment(SwingConstants.CENTER);
			lblAyuda3.setForeground(new Color(234, 183, 69));
			lblAyuda3.setFont(go3.deriveFont(35f));
		}
		return lblAyuda3;
	}

	
///////////////////////////////////////PANEL TITULO///////////////////////////////////////////////	
	
	private JPanelBackground getPanelNorth() {
		if (panelNorth == null) {
			panelNorth = new JPanelBackground();
			panelNorth.setBackground("north BJ.jpg");
			GridBagLayout gbl_panelNorth = new GridBagLayout();
			gbl_panelNorth.columnWidths = new int[]{190, 190, 190, 190, 190, 179, 0};
			gbl_panelNorth.rowHeights = new int[]{180, -18, 0};
			gbl_panelNorth.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
			gbl_panelNorth.rowWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
			panelNorth.setLayout(gbl_panelNorth);
			GridBagConstraints gbc_lblGif1 = new GridBagConstraints();
			gbc_lblGif1.insets = new Insets(0, 0, 5, 5);
			gbc_lblGif1.gridx = 0;
			gbc_lblGif1.gridy = 0;
			panelNorth.add(getLblGif1(), gbc_lblGif1);
			GridBagConstraints gbc_lblGif2 = new GridBagConstraints();
			gbc_lblGif2.insets = new Insets(0, 0, 5, 5);
			gbc_lblGif2.gridx = 1;
			gbc_lblGif2.gridy = 0;
			panelNorth.add(getLblGif2(), gbc_lblGif2);
			GridBagConstraints gbc_lblGif3 = new GridBagConstraints();
			gbc_lblGif3.insets = new Insets(0, 0, 5, 5);
			gbc_lblGif3.gridx = 2;
			gbc_lblGif3.gridy = 0;
			panelNorth.add(getLblGif3(), gbc_lblGif3);
			GridBagConstraints gbc_lblGif4 = new GridBagConstraints();
			gbc_lblGif4.insets = new Insets(0, 0, 5, 5);
			gbc_lblGif4.gridx = 3;
			gbc_lblGif4.gridy = 0;
			panelNorth.add(getLblGif4(), gbc_lblGif4);
			GridBagConstraints gbc_lblGif5 = new GridBagConstraints();
			gbc_lblGif5.insets = new Insets(0, 0, 5, 5);
			gbc_lblGif5.gridx = 4;
			gbc_lblGif5.gridy = 0;
			panelNorth.add(getLblGif5(), gbc_lblGif5);
			GridBagConstraints gbc_lblGif6 = new GridBagConstraints();
			gbc_lblGif6.insets = new Insets(0, 0, 5, 0);
			gbc_lblGif6.gridx = 5;
			gbc_lblGif6.gridy = 0;
			panelNorth.add(getLblGif6(), gbc_lblGif6);
		}
		return panelNorth;
	}
	
	private JLabel getLblGif1() {
		if (lblGif1 == null) {
			lblGif1 = new JLabel("");
			lblGif1.setIcon(new ImageIcon(getClass().getClassLoader().getResource("hojas1.gif")));
		}
		return lblGif1;
	}
	private JLabel getLblGif2() {
		if (lblGif2 == null) {
			lblGif2 = new JLabel("");
			lblGif2.setIcon(new ImageIcon(getClass().getClassLoader().getResource("hojas2.gif")));
		}
		return lblGif2;
	}
	private JLabel getLblGif3() {
		if (lblGif3 == null) {
			lblGif3 = new JLabel("");
			lblGif3.setIcon(new ImageIcon(getClass().getClassLoader().getResource("hojas3.gif")));
		}
		return lblGif3;
	}
	private JLabel getLblGif4() {
		if (lblGif4 == null) {
			lblGif4 = new JLabel("");
			lblGif4.setIcon(new ImageIcon(getClass().getClassLoader().getResource("hojas1.gif")));
		}
		return lblGif4;
	}
	private JLabel getLblGif5() {
		if (lblGif5 == null) {
			lblGif5 = new JLabel("");
			lblGif5.setIcon(new ImageIcon(getClass().getClassLoader().getResource("hojas2.gif")));
		}
		return lblGif5;
	}
	private JLabel getLblGif6() {
		if (lblGif6 == null) {
			lblGif6 = new JLabel("");
			lblGif6.setIcon(new ImageIcon(getClass().getClassLoader().getResource("hojas4.gif")));
		}
		return lblGif6;
	}


///////////////////////////////////PANEL SOUTH////////////////////////////////////////////	
	
	private JPanelBackground getPanelSouth() {
		if (panelSouth == null) {
			panelSouth = new JPanelBackground();
			panelSouth.setBackground("south BJ.jpg");
		}
		return panelSouth;
	}

	

//////////////////////////////////PANEL WEST///////////////////////////////////////////////	
	
	private JPanelBackground getPanelWest() {
		if (panelWest == null) {
			panelWest = new JPanelBackground();
			panelWest.setBackground("west BJ.jpg");
		}
		return panelWest;
	}

	
	
////////////////////////////////TABLERO//////////////////////////////////////////////////	
	
	private JPanelBackground getPanelTablero() {
		if (panelTablero == null) {
			panelTablero = new JPanelBackground();
			panelTablero.setBackground("centre BJ.jpg");
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
			//Llenar el label de los candidatos
			String cand = ((JLabel)((JPanel)seleccionado.getComponent(0)).getComponent(0)).getText();
			if (cand == " ") 
				textFieldCandidatos.setText("");
			else
				textFieldCandidatos.setText(cand);
			//Llenar el label del valor
			textFieldValor.setText(((JLabel)((JPanel)seleccionado.getComponent(1)).getComponent(0)).getText());
			select=seleccionado;
		} else if (!seleccionado.getBorder().equals(bordeGrueso) && select != null && seleccionado.isEnabled()) {
			select.setBorder(bordeAct);
			bordeAct = seleccionado.getBorder();
			textFieldCandidatos.setText("");
			textFieldValor.setText("");
			seleccionado.setBorder(bordeGrueso);
			//Llenar el label de los candidatos
			String cand = ((JLabel)((JPanel)seleccionado.getComponent(0)).getComponent(0)).getText();
			if (cand == " ") 
				textFieldCandidatos.setText("");
			else
				textFieldCandidatos.setText(cand);
			//Llenar el label del valor
			textFieldValor.setText(((JLabel)((JPanel)seleccionado.getComponent(1)).getComponent(0)).getText());
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
			String s = ((ArrayList<?>) arg).get(0).toString().replace("[", "").replace("]", "").replace(",", " ");
			if (s.isBlank()) ((JLabel)((JPanel)matrizPaneles[i][j].getComponent(0)).getComponent(0)).setText(" ");
			else {
				((JLabel)((JPanel)matrizPaneles[i][j].getComponent(0)).getComponent(0)).setText(s);
			}
		}else if (arg instanceof String && ((String) arg).substring(2, 3).equals(":")) {
			this.lblTiempo.setText((String)arg);
		}else if (arg instanceof String && arg.equals("null")) {
			JOptionPane.showMessageDialog(null, "No hay m?s sudokus para ti :(", "L?mite de sudokus alcanzado", JOptionPane.ERROR_MESSAGE);
			frmSudokuRoyaleMaster.dispose();
			Runtime.getRuntime().exit(1);
		}else if (arg instanceof String[] && (((String[])arg)[0]).equals("Estrategia")) {
			lblAyuda1.setText(((String[])arg)[1]);
			lblAyuda2.setText(((String[])arg)[2]);
			lblAyuda3.setText(((String[])arg)[3]);
			
		} else {
 			int[] a = (int[]) arg;
			if (a[0] == 1) {
				if (a[1] == 0) {
					JOptionPane.showMessageDialog(null, "Lo sentimos, no es correcto", "Error", JOptionPane.ERROR_MESSAGE);
					frmSudokuRoyaleMaster.dispose();
					new PanelVictoria(TableroModelo.getTablero().getUser(), false, 0);
					TableroModelo.getTablero().eliminarTablero();
				} else {
					JOptionPane.showMessageDialog(null, "Has completado el sudoku de manera satisfactoria, mis dieses");
					DataUsuarios.getData().anadirRegistro(TableroModelo.getTablero().getUser(), TableroModelo.getTablero().getId(), TableroModelo.getTablero().getDif(), TableroModelo.getTablero().getPuntos());
					frmSudokuRoyaleMaster.dispose();
					new PanelVictoria(TableroModelo.getTablero().getUser(), true, TableroModelo.getTablero().getPuntos());
					TableroModelo.getTablero().eliminarTablero();
				}
			} else if (a[0] == 0) {
				modelo.CasillaModelo[][] t = modelo.TableroModelo.getTablero().getListaCasillas();
				for (int i = 0; i < t.length; i++) {
					for (int j = 0; j < t[0].length; j++) {
						if (t[i][j].getValor() != 0) {
							((JLabel)((JPanel)matrizPaneles[i][j].getComponent(1)).getComponent(0)).setText(Integer.toString(t[i][j].getValor()));
							((JLabel)((JPanel)matrizPaneles[i][j].getComponent(1)).getComponent(0)).setForeground(new Color(142,200,64));
							matrizPaneles[i][j].setEnabled(false);
						}
					}
					TableroModelo.getTablero().calcularCandidatosGlobal(mostrarCandidatos);
				}
			
			} else if (a[0] == 2) {
				if (a[3] == 0) ((JLabel)((JPanel)matrizPaneles[a[1]][a[2]].getComponent(1)).getComponent(0)).setText("");
				else ((JLabel)((JPanel)matrizPaneles[a[1]][a[2]].getComponent(1)).getComponent(0)).setText(Integer.toString(a[3]));
			}
		}
	}
	
//////////////////////////////TOP-BAR MENU////////////////////////////////////////	

	private JMenuBar getMenuBar_1() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.add(getMnPartida());
		}
		return menuBar;
	}
	
	private JMenu getMnPartida() {
		if (mnPartida == null) {
			mnPartida = new JMenu("Opciones");
			mnPartida.add(getMntmCandidatosMos());
			mnPartida.add(getMntmSalir());
		}
		return mnPartida;
	}

	private JMenuItem getMntmSalir() {
		if (mntmSalir == null) {
			mntmSalir = new JMenuItem("Salir");
			mntmSalir.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					frmSudokuRoyaleMaster.dispose();
					Runtime.getRuntime().exit(0);
				}
			});
		}
		return mntmSalir;
	}
	private JMenuItem getMntmOcultarCand() {
		if (mntmCandidatos == null) {
			mntmCandidatos = new JMenuItem("Ocultar candidatos");
			mntmCandidatos.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					Component[] lCasillas = panelTablero.getComponents();
					for (Component cas: lCasillas) {
						((CasillaVista) cas).ocultarCandidatos();
					}
					mnPartida.add(getMntmCandidatosMos());
					mnPartida.remove(getMntmOcultarCand());
					mnPartida.remove(getMntmResetCandidatos());
				}
			});
		}
		return mntmCandidatos;
	}
	private JMenuItem getMntmCandidatosMos() {
		if (mntmCandidatosMos == null) {
			mntmCandidatosMos = new JMenuItem("Mostrar candidatos");
			mntmCandidatosMos.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					mostrarCandidatos = true;
					modelo.TableroModelo.getTablero().calcularCandidatosGlobal(mostrarCandidatos);
					mnPartida.add(getMntmOcultarCand());
					mnPartida.remove(getMntmCandidatosMos());
					mnPartida.add(getMntmResetCandidatos());
					JOptionPane.showMessageDialog(null, "A partir de ahora los candidatos se calcular?n autom?ticamente cada vez que introduzcas un valor, salvo que los cambies t?", "Aviso", JOptionPane.INFORMATION_MESSAGE);
				}
			});
		}
		return mntmCandidatosMos;
	}
	
	private JMenuItem getMntmResetCandidatos() {
		if (mntmResetCandidatos == null) {
			mntmResetCandidatos = new JMenuItem("Resetear candidatos");
			mntmResetCandidatos.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					modelo.TableroModelo.getTablero().resetCandidatos();
					modelo.TableroModelo.getTablero().calcularCandidatosGlobal(mostrarCandidatos);
					JOptionPane.showMessageDialog(null, "Se ha reseteado los candidatos, todos se calcular?n autom?ticamente", "Aviso", JOptionPane.INFORMATION_MESSAGE);
				}
			});
		}
		return mntmResetCandidatos;
	}
	
}

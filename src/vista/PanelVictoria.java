package vista;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class PanelVictoria {

	private JFrame frame;
	private JPanel panelNorth;
	private JLabel lblTitulo;
	private JPanel panelSouth;
	private JButton btnReplay;
	private JButton btnRanking;
	private JButton btnSalir;
	private String user;
	private double puntos;
	private boolean correcto;
	private JPanel panelInfo;
	private JLabel icon;
	private Font go3 = VentanaInicio.getFuente();
	private JLabel lblInfo_1;

	/**
	 * Create the application.
	 */
	public PanelVictoria(String pUser, boolean pCorrecto, double pPuntos) {
		user = pUser;
		correcto = pCorrecto;
		puntos = pPuntos;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 490, 250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getPanelNorth());
		frame.getContentPane().add(getPanelSouth());
		frame.getContentPane().add(getPanelInfo());
		frame.getContentPane().add(getIcon());
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	private JPanel getPanelNorth() {
		if (panelNorth == null) {
			panelNorth = new JPanel();
			panelNorth.setBounds(0, 0, 484, 52);
			panelNorth.add(getLblTitulo());
			panelNorth.setOpaque(false);
		}
		return panelNorth;
	}
	private JLabel getLblTitulo() {
		if (lblTitulo == null) {
			lblTitulo = new JLabel("Enhorabuena, has resuelto el sudoku");
			lblTitulo.setFont(go3);
			lblTitulo.setForeground(new Color(234,183,69));
			if (correcto) {
				lblTitulo.setText("Enhorabuena, has resuelto el Sudoku");
			} else {
				lblTitulo.setText("Haber estudiao");
			}
		}
		return lblTitulo;
	}
	private JPanel getPanelSouth() {
		if (panelSouth == null) {
			panelSouth = new JPanel();
			panelSouth.setBounds(0, 166, 484, 55);
			panelSouth.add(getBtnReplay());
			panelSouth.add(getBtnRanking());
			panelSouth.add(getBtnSalir());
			panelSouth.setOpaque(false);
		}
		return panelSouth;
	}
	private JButton getBtnReplay() {
		if (btnReplay == null) {
			btnReplay = new JButton("Jugar de nuevo");
			btnReplay.addMouseListener(new MouseAdapter() {
				
				@Override
				public void mouseClicked(MouseEvent e) {
					new VentanaInicio(user, true);
				}
			});
		}
		return btnReplay;
	}
	private JButton getBtnRanking() {
		if (btnRanking == null) {
			btnRanking = new JButton("Ranking");
			btnRanking.addMouseListener(new MouseAdapter() {
				
				@Override
				public void mouseClicked(MouseEvent e) {
					new PanelTopJugadores(user, correcto, puntos);
					frame.dispose();
				}
			});
		}
		return btnRanking;
	}
	private JButton getBtnSalir() {
		if (btnSalir == null) {
			btnSalir = new JButton("Salir");
			btnSalir.addMouseListener(new MouseAdapter() {
			
				@Override
				public void mouseClicked(MouseEvent e) {
					frame.dispose();
				}
			});
		}
		return btnSalir;
	}
	private JPanel getPanelInfo() {
		if (panelInfo == null) {
			panelInfo = new JPanel();
			panelInfo.setBounds(0, 34, 484, 134);
			panelInfo.setOpaque(false);
			panelInfo.setLayout(new BorderLayout(0, 0));
			panelInfo.add(getLblInfo_1_1());
		}
		return panelInfo;
	}
	private JLabel getIcon() {
		if (icon == null) {
			icon = new JLabel("");
			icon.setIcon(new ImageIcon(getClass().getClassLoader().getResource("fondo estandar.jpg")));
			icon.setBounds(0, 0, 484, 232);
		}
		return icon;
	}
	private JLabel getLblInfo_1_1() {
		if (lblInfo_1 == null) {
			lblInfo_1 = new JLabel(user +": tu puntuaci\u00F3n es de: "+ puntos);
			lblInfo_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblInfo_1.setForeground(new Color(234, 183, 69));
			lblInfo_1.setFont(go3);
		}
		return lblInfo_1;
	}
}

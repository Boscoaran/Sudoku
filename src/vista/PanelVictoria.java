package vista;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.FlowLayout;
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
	private JLabel lblInfo;
	private JLabel icon;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PanelVictoria window = new PanelVictoria();
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
		frame.setBounds(100, 100, 430, 247);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getPanelNorth());
		frame.getContentPane().add(getPanelSouth());
		frame.getContentPane().add(getPanelInfo());
		frame.getContentPane().add(getIcon());
		frame.setVisible(true);
	}

	private JPanel getPanelNorth() {
		if (panelNorth == null) {
			panelNorth = new JPanel();
			panelNorth.setBounds(0, 0, 414, 34);
			panelNorth.add(getLblTitulo());
			panelNorth.setOpaque(false);
		}
		return panelNorth;
	}
	private JLabel getLblTitulo() {
		if (lblTitulo == null) {
			lblTitulo = new JLabel("Enhorabuena has resuelto el sudoku");
			lblTitulo.setFont(new Font("Gang of Three", Font.PLAIN, 20));
			lblTitulo.setForeground(new Color(234,183,69));
			if (correcto) {
				lblTitulo.setText("Enhorabuena, has resuelto el Sudoku");
			} else {
				lblTitulo.setText("Vaya, no tienes ni idea");
			}
		}
		return lblTitulo;
	}
	private JPanel getPanelSouth() {
		if (panelSouth == null) {
			panelSouth = new JPanel();
			panelSouth.setBounds(0, 168, 414, 40);
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
		}
		return btnReplay;
	}
	private JButton getBtnRanking() {
		if (btnRanking == null) {
			btnRanking = new JButton("Ranking");
		}
		return btnRanking;
	}
	private JButton getBtnSalir() {
		if (btnSalir == null) {
			btnSalir = new JButton("Salir");
		}
		return btnSalir;
	}
	private JPanel getPanelInfo() {
		if (panelInfo == null) {
			panelInfo = new JPanel();
			panelInfo.setBounds(0, 34, 414, 134);
			panelInfo.setLayout(new BorderLayout(0, 0));
			panelInfo.add(getLblInfo());
			panelInfo.setOpaque(false);
		}
		return panelInfo;
	}
	private JLabel getLblInfo() {
		if (lblInfo == null) {
			lblInfo = new JLabel("");
			lblInfo.setHorizontalAlignment(SwingConstants.CENTER);
			lblInfo.setFont(new Font("Gang of Three", Font.PLAIN, 20));
			lblInfo.setForeground(new Color(234,183,69));
			if (correcto) {
				lblInfo.setText(user+", tu puntuación es "+ puntos);
			}
		}
		return lblInfo;
	}
	private JLabel getIcon() {
		if (icon == null) {
			icon = new JLabel("");
			icon.setIcon(new ImageIcon(PanelVictoria.class.getResource("/BJ/fondo estandar 1 resize.jpg")));
			icon.setBounds(0, 0, 414, 208);
		}
		return icon;
	}
}

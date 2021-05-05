package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.SwingConstants;

public class PanelVicDer extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private boolean correcto;
	private String user;
	private double puntos;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PanelVicDer frame = new PanelVicDer(null, false, 0);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public PanelVicDer(String u, boolean cor, double punt) {
		setResizable(false);
		user = u;
		correcto = cor;
		puntos = punt;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 180);
		contentPane = new JPanelBackground();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panelTitulo = new JPanel();
		contentPane.add(panelTitulo, BorderLayout.NORTH);
		panelTitulo.setOpaque(false);
		
		JLabel lblVictoria = new JLabel("");
		if (cor) lblVictoria.setText("Buen trabajo joven padawan");
		else lblVictoria.setText("W A S T E D");
		lblVictoria.setFont(new Font("Gang of Three", Font.PLAIN, 28));
		lblVictoria.setForeground(new Color(234,183,69));
		panelTitulo.add(lblVictoria);
		
		JPanel panelInfo = new JPanel();
		contentPane.add(panelInfo, BorderLayout.CENTER);
		panelInfo.setOpaque(false);
		
		JLabel lblInfo = new JLabel("");
		if (cor) lblInfo.setText(u+ ", tu puntuación es " + punt);
		else lblInfo.setText("");
		lblInfo.setFont(new Font("Gang of Three", Font.PLAIN, 20));
		lblInfo.setForeground(new Color(234,183,69));
		lblInfo.setHorizontalAlignment(SwingConstants.CENTER);
		panelInfo.add(lblInfo);
		
		JPanel panelOpciones = new JPanel();
		contentPane.add(panelOpciones, BorderLayout.SOUTH);
		panelOpciones.setOpaque(false);
		
		JButton btnJugar = new JButton("Jugar de nuevo");
		btnJugar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new VentanaInicio(user,true);
				dispose();
			}
		});
		panelOpciones.add(btnJugar);
		
		JButton btnEstad = new JButton("Pasar a estad\u00EDsticas");
		btnEstad.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new PanelTopJugadores(user, correcto, puntos);
				dispose();
			}
		});
		panelOpciones.add(btnEstad);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		panelOpciones.add(btnSalir);
		setLocationRelativeTo(null);
		setVisible(true);
	}

}

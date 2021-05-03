package vista;

import java.awt.BorderLayout;
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
		user = u;
		correcto = cor;
		puntos = punt;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblVictoria = new JLabel("New label");
		if (cor) lblVictoria.setText("Buen trabajo joven padawan");
		else lblVictoria.setText("W A S T E D");
		lblVictoria.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(lblVictoria);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		
		JLabel lblInfo = new JLabel("New label2");
		if (cor) lblInfo.setText(u+ ", tu puntuación es " + punt);
		else lblInfo.setText("");
		lblInfo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblInfo.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblInfo);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.SOUTH);
		
		JButton btnJugar = new JButton("Jugar de nuevo");
		btnJugar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new VentanaInicio();
				dispose();
			}
		});
		panel_2.add(btnJugar);
		
		JButton btnEstad = new JButton("Pasar a estad\u00EDsticas");
		btnEstad.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new PanelTopJugadores(user, correcto, puntos);
				dispose();
			}
		});
		panel_2.add(btnEstad);
		setLocationRelativeTo(null);
		setVisible(true);
	}

}

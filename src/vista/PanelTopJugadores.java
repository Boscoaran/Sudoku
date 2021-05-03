package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelo.Usuario;

import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.Observable;
import java.util.Observer;

@SuppressWarnings("deprecation")
public class PanelTopJugadores extends JFrame implements Observer{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel etiq[][];
	private JPanel panel_1;
	private static PanelTopJugadores mPanel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PanelTopJugadores frame = new PanelTopJugadores();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	public static PanelTopJugadores getPanelTopJugadores() {
		if (mPanel == null) mPanel = new PanelTopJugadores();
		return mPanel;
	}
	
	private PanelTopJugadores() {
		etiq = new JLabel[10][2];
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		modelo.CatalogoUsuarios.getCatalogoUsuarios().addObserver(this);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("Hall of Fame");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(lblNewLabel);
		
		panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(0, 2, 0, 0));
		
		cargarLista();
		db.DataUsuarios.getData().cargarPuntuaciones();
		setVisible(true);
		
		}
	
	private void cargarLista() {
		for (int i = 0; i < etiq.length; i++) {
			for (int j = 0; j < etiq[0].length; j++) {
				if (j == 0) {
					JLabel lblJugador = new JLabel("Etiq_Jugador" + i);
					lblJugador.setHorizontalAlignment(SwingConstants.CENTER);
					panel_1.add(lblJugador);
					etiq[i][j] = lblJugador;
				} else {
					JLabel lblPuntuacion = new JLabel("Etiq_Puntuacion" + i);
					lblPuntuacion.setHorizontalAlignment(SwingConstants.CENTER);
					panel_1.add(lblPuntuacion);
					etiq[i][j] = lblPuntuacion;
				}
			}
		}
	}

	@Override
	public void update(Observable o, Object arg) {
		if (arg instanceof Usuario[]) {
			Usuario[] l = (Usuario[]) arg;
			for (int i = 0; i< l.length; i++) {
				etiq[i][0].setText(i+1 + "\t" + l[i].getName());
				etiq[i][1].setText(l[i].getPointsText());
			}
		}
		
	}

}

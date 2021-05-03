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
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.util.Observable;
import java.util.Observer;
import java.awt.GridBagLayout;

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
	private GridBagConstraints cons;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
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
		etiq = new JLabel[10][3];
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
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		cons = new GridBagConstraints();
		panel_1.setLayout(gbl_panel_1);
		
		cargarLista();
		db.DataUsuarios.getData().cargarPuntuaciones();
		setVisible(true);
		
		}
	
	private void cargarLista() {
		for (int i = 0; i < etiq.length; i++) {
			for (int j = 0; j < etiq[0].length; j++) {
				 if (j == 0) {
					JLabel lblPos = new JLabel(i+1 + ".");
					lblPos.setHorizontalAlignment(SwingConstants.RIGHT);
					lblPos.setFont(new Font("Tahoma", Font.PLAIN, 16));
					cons.gridx = 0;
					cons.gridy = i;
					cons.gridwidth = 1;
					cons.gridheight = 1;
					cons.weightx = 0.1;
					panel_1.add(lblPos,cons);
					etiq[i][j] = lblPos;
				 } else if (j == 1) {
					JLabel lblJugador = new JLabel("Etiq_Jugador" + i);
					lblJugador.setHorizontalAlignment(SwingConstants.LEFT);
					lblJugador.setFont(new Font("Tahoma", Font.PLAIN, 16));
					cons.gridx = 1;
					cons.gridy = i;
					cons.gridwidth = 1;
					cons.gridheight = 1;
					cons.weightx = 0.1;
					panel_1.add(lblJugador,cons);
					etiq[i][j] = lblJugador;
				} else {
					JLabel lblPuntuacion = new JLabel("Etiq_Puntuacion" + i);
					lblPuntuacion.setHorizontalAlignment(SwingConstants.CENTER);
					lblPuntuacion.setFont(new Font("Tahoma", Font.PLAIN, 16));
					cons.gridx = 2;
					cons.gridy = i;
					cons.gridwidth = 1;
					cons.gridheight = 1;
					cons.weightx = 0.2;
					panel_1.add(lblPuntuacion,cons);
					etiq[i][j] = lblPuntuacion;
					cons.weightx = 0.0;
					cons.gridwidth = 0;
				}
			}
		}
	}

	@Override
	public void update(Observable o, Object arg) {
		if (arg instanceof Usuario[]) {
			Usuario[] l = (Usuario[]) arg;
			for (int i = 0; i< 10; i++) {
				if (i>= l.length) {
					etiq[i][1].setText("");
					etiq[i][2].setText("");
				} else {
					etiq[i][1].setText(l[i].getName());
					etiq[i][2].setText(l[i].getPointsText());
				}
				
			}
		}
		
	}

}

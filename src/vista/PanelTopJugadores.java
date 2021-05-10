package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Observable;
import java.util.Observer;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.ImageIcon;

@SuppressWarnings("deprecation")
public class PanelTopJugadores extends JFrame implements Observer{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel etiq[][];
	private JPanel panelDatos;
	private GridBagConstraints cons;
	private JButton btnAtras;
	private Font go3 = VentanaInicio.getFuente();
	private JLabel lblNewLabel;

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
	
	public PanelTopJugadores(String u, boolean c, double points) {
		setResizable(false);
		
		etiq = new JLabel[10][3];
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		modelo.CatalogoUsuarios.getCatalogoUsuarios().addObserver(this);
		contentPane.setLayout(null);
		
		JPanel panelTitulo = new JPanel();
		panelTitulo.setBounds(5, 0, 484, 39);
		panelTitulo.setOpaque(false);
		contentPane.add(panelTitulo);
		
		JLabel lblTitulo = new JLabel("Hall of Fame");
		lblTitulo.setForeground(new Color(234,183,69));
		lblTitulo.setFont(go3);
		panelTitulo.add(lblTitulo);
		
		panelDatos = new JPanel();
		panelDatos.setBounds(5, 37, 484, 322);
		panelDatos.setOpaque(false);
		contentPane.add(panelDatos);
		GridBagLayout gbl_panelDatos = new GridBagLayout();
		/*gbl_panelDatos.columnWidths = new int[]{0};
		gbl_panelDatos.rowHeights = new int[]{0};
		gbl_panelDatos.columnWeights = new double[]{Double.MIN_VALUE};
		gbl_panelDatos.rowWeights = new double[]{Double.MIN_VALUE};*/
		panelDatos.setLayout(gbl_panelDatos);
		cons = new GridBagConstraints();
		
		btnAtras = new JButton("Atr\u00E1s");
		btnAtras.setBounds(174, 361, 111, 32);
		contentPane.add(btnAtras);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(getClass().getClassLoader().getResource("fondo estandar v.jpg")));
		lblNewLabel.setBounds(-22, 0, 557, 433);
		contentPane.add(lblNewLabel);
		btnAtras.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new PanelVictoria(u,c,points);
				dispose();
			}
		});
		
		cargarLista();
		db.DataUsuarios.getData().cargarPuntuaciones();
		setLocationRelativeTo(null);
		setVisible(true);
		
		}
	
	private void cargarLista() {
		for (int i = 0; i < etiq.length; i++) {
			for (int j = 0; j < etiq[0].length; j++) {
				 if (j == 0) {
					JLabel lblPos = new JLabel(i+1 + ".");
					lblPos.setHorizontalAlignment(SwingConstants.RIGHT);
					lblPos.setFont(go3);
					lblPos.setForeground(new Color(234,183,69));
					cons.gridx = 0;
					cons.gridy = i;
					cons.gridwidth = 1;
					cons.gridheight = 1;
					cons.weightx = 0.1;
					panelDatos.add(lblPos,cons);
					etiq[i][j] = lblPos;
				 } else if (j == 1) {
					JLabel lblJugador = new JLabel("Etiq_Jugador" + i);
					lblJugador.setHorizontalAlignment(SwingConstants.LEFT);
					lblJugador.setFont(go3);
					lblJugador.setForeground(new Color(234,183,69));
					cons.gridx = 1;
					cons.gridy = i;
					cons.gridwidth = 1;
					cons.gridheight = 1;
					cons.weightx = 0.1;
					panelDatos.add(lblJugador,cons);
					etiq[i][j] = lblJugador;
				} else {
					JLabel lblPuntuacion = new JLabel("Etiq_Puntuacion" + i);
					lblPuntuacion.setHorizontalAlignment(SwingConstants.CENTER);
					lblPuntuacion.setFont(go3);
					lblPuntuacion.setForeground(new Color(234,183,69));
					cons.gridx = 2;
					cons.gridy = i;
					cons.gridwidth = 1;
					cons.gridheight = 1;
					cons.weightx = 0.2;
					panelDatos.add(lblPuntuacion,cons);
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
					etiq[i][2].setText(l[i].getPoints());
				}
				
			}
		}
		
	}
}

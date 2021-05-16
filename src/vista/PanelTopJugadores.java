package vista;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelo.CatalogoPuntuaciones;

import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Observable;
import java.util.Observer;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import java.awt.BorderLayout;

@SuppressWarnings("deprecation")
public class PanelTopJugadores extends JFrame implements Observer{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel etiq[][];
	private JPanel panelDatos;
	private GridBagConstraints cons;
	private JButton btnAtras;
	private Font go3 = VentanaInicio.getFuente();
	private JPanel panel;
	private JComboBox<String> comboBox;
	private JLabel lblNewLabel;

	public PanelTopJugadores(String u, boolean c, double points) {
		setResizable(false);
		
		etiq = new JLabel[10][3];
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		modelo.CatalogoPuntuaciones.getCatalogoPuntuaciones().addObserver(this);
		contentPane.setLayout(null);
		
		JPanel panelTitulo = new JPanel();
		panelTitulo.setBounds(5, 0, 484, 39);
		panelTitulo.setOpaque(false);
		contentPane.add(panelTitulo);
		panelTitulo.setLayout(new BorderLayout(0, 0));
		
		JLabel lblTitulo = new JLabel("Hall of Fame");
		lblTitulo.setForeground(new Color(234,183,69));
		lblTitulo.setFont(go3);
		panelTitulo.add(lblTitulo, BorderLayout.CENTER);
		
		panel = new JPanel();
		panelTitulo.add(panel, BorderLayout.EAST);
		panel.setLayout(new BorderLayout(0, 0));
		
		panelDatos = new JPanel();
		panelDatos.setBounds(5, 37, 484, 322);
		panelDatos.setOpaque(false);
		contentPane.add(panelDatos);
		GridBagLayout gbl_panelDatos = new GridBagLayout();
		panelDatos.setLayout(gbl_panelDatos);
		cons = new GridBagConstraints();
		
		btnAtras = new JButton("Atr\u00E1s");
		btnAtras.setBounds(98, 361, 111, 32);
		btnAtras.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new PanelVictoria(u,c,points);
				dispose();
			}
		});
		contentPane.add(btnAtras);
		
		comboBox = new JComboBox<String>();
		comboBox.setBounds(278, 367, 89, 20);
		contentPane.add(comboBox);
		comboBox.setModel(new DefaultComboBoxModel<String>(new String[] {"F\u00E1cil", "Medio", "Dif\u00EDcil"}));
		
		JButton btnNewButton = new JButton("Ver");
		btnNewButton.setBounds(372, 366, 89, 23);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CatalogoPuntuaciones.getCatalogoPuntuaciones().puntuacionesMayores(comboBox.getSelectedIndex()+1);
			}
		});
		contentPane.add(btnNewButton);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, -31, 558, 496);
		lblNewLabel.setIcon(new ImageIcon(getClass().getClassLoader().getResource("fondo estandar v.jpg")));
		contentPane.add(lblNewLabel);
		
		
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
		if (arg instanceof Object[]) {
			Object[] l = (Object[]) arg;
			for (int i = 0; i< 10; i++) {
				if (i>= l.length) {
					etiq[i][0].setText("");
					etiq[i][1].setText("");
					etiq[i][2].setText("");
				} else {
					int ind = (l[i].toString().indexOf("="));
					etiq[i][0].setText(i+1 + ".");
					etiq[i][1].setText(l[i].toString().substring(0,ind));
					etiq[i][2].setText(l[i].toString().substring(ind+1, l[i].toString().length()-1));
				}
				
			}
		}
		
	}
}

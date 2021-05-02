package vista;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;

public class PanelAyuda extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private CasillaVista cas;
	
	public PanelAyuda(CasillaVista c) {
		cas = c;
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setResizable(false);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Men\u00FA Ayuda");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(4, 4, 0, 0));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		
		JButton btnCandidatosGlobal = new JButton("Calcular todos los candidatos");
		btnCandidatosGlobal.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				modelo.TableroModelo.getTablero().calcularCandidatosGlobal();
				dispose();
			}
		});
		panel.add(btnCandidatosGlobal);
		
		JButton btnCandidatosUno = new JButton("Calcular candidatos de la casilla seleccionada");
		if (cas == null) btnCandidatosUno.setEnabled(false);
		else btnCandidatosUno.setEnabled(true);
		btnCandidatosUno.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (btnCandidatosUno.isEnabled()) {
					int[] coords = cas.getCoords();
					modelo.TableroModelo.getTablero().calcularCandidatos(coords[0]-1, coords[1]-1);
					dispose();
				}
			}
		});
		panel.add(btnCandidatosUno);
		
		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		contentPane.add(btnCerrar, BorderLayout.SOUTH);
		setLocationRelativeTo(null);
		setVisible(true);
	}

}

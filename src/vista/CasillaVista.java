package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.MatteBorder;
import java.awt.FlowLayout;
import java.awt.GridLayout;

public class CasillaVista extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel valorPanel;
	private JPanel candidatosPanel;
	private JLabel valorLabel;
	private JLabel candidatosLabel;
	private int x;
	private int y;
	private Font go3 = VentanaInicio.getFuente();
	private Dimension sZ=Toolkit.getDefaultToolkit().getScreenSize();

	public CasillaVista(int pX, int pY) {
		x=pX;
		y=pY;
		inicializar();
	}
	
	public int[] getCoords() {
		int[] coords = {x,y};
		return coords;
	}
	
	public void inicializar() {
			setLayout(new GridLayout(0, 1, 0, 0));
			this.add(getCandidatosPanel());
			this.add(getValorPanel());
			this.setBorder(borde());
			this.setName("Casilla " + x + " " + y);
			this.setOpaque(false);
	}
	
	public JPanel getCandidatosPanel() {
			candidatosPanel = new JPanel();
			FlowLayout flowLayout = (FlowLayout) candidatosPanel.getLayout();
			flowLayout.setHgap(3);
			candidatosPanel.add(getCandidatosLabel());
			candidatosPanel.setName("Panel candidatos " + x + " " + y );
			candidatosPanel.setOpaque(false);
		return candidatosPanel;
	}
	
	public JLabel getCandidatosLabel() {
			candidatosLabel = new JLabel();
			candidatosLabel.setFont(go3.deriveFont(sZ.width/130f));
			candidatosLabel.setForeground(new Color(248,221,161));
			candidatosLabel.setText(" ");
		return candidatosLabel;
	}
	public JPanel getValorPanel() {
			valorPanel = new JPanel();
			valorPanel.add(getValorLabel());
			valorPanel.setOpaque(false);
		return valorPanel;
	}
	public JLabel getValorLabel() {
			valorLabel= new JLabel();
			valorLabel.setFont(go3.deriveFont(sZ.width/60f));
			valorLabel.setForeground(new Color(234,183,69));
			valorLabel.setText("");
		return valorLabel;
	}
	
	public void tamanioLetra(int h, int w) {
		valorLabel.setFont(valorLabel.getFont().deriveFont(h/3f));
		candidatosLabel.setFont(valorLabel.getFont().deriveFont(w/7f));
	}
	private Border borde() {
		Border borde = null;
		int u=1,d=1,r=1,l=1;
		int i=x%3;
		int j=y%3;
		if (i==1) {
			if (x==1) {
				u=6;
			}
			else {
				u=3;
			}
		}else if (i==0) {
			if (x==9) {
				d=6;
			}
			else {
				d=3;
			}
		}
		if (j==1) {
			if (y==1) {
				l=6;
			}
			else {
				l=3;
			}
		}else if (j==0) {
			if (y==9) {
				r=6;
			}
			else {
				r=3;
			}
		}
		borde = new MatteBorder(u,l,d,r, new Color (28,63,56));
		return borde;
	}
	
	public String getCandidatos() {
		return candidatosLabel.getText();
	}
	public String getValor() {
		return valorLabel.getText();
	}
	
	public void ocultarCandidatos() {
		candidatosLabel.setText(" ");
	}
}
	
package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.MatteBorder;

public class Casilla extends JPanel{
	
	private JPanel casilla;
	private JPanel valorPanel;
	private JPanel candidatosPanel;
	private JLabel valorLabel;
	private JLabel candidatosLabel;
	private int x;
	private int y;

	public Casilla(int pX, int pY) {
		x=pX;
		y=pY;
	}
	
	public JPanel getCasilla() {
		casilla = new JPanel();
		casilla.setLayout(new BorderLayout(0,0));
		casilla.add(getCandidatosPanel(), BorderLayout.NORTH);
		casilla.add(getValorPanel(), BorderLayout.CENTER);
		casilla.setBorder(borde());
		return casilla;
	}
	public JPanel getCandidatosPanel() {
		candidatosPanel = new JPanel();
		candidatosPanel.add(getCandidatosLabel());
		return candidatosPanel;
	}
	public JLabel getCandidatosLabel() {
		candidatosLabel = new JLabel();
		candidatosLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		candidatosLabel.setText(" ");
		return candidatosLabel;
	}
	public JPanel getValorPanel() {
		valorPanel = new JPanel();
		valorPanel.add(getValorLabel());
		return valorPanel;
	}
	public JLabel getValorLabel() {
		valorLabel= new JLabel();
		valorLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		return valorLabel;
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
		borde = new MatteBorder(u,l,d,r, new Color (0,0,0));
		return borde;
	}
	
	
}
	
package vista;

import java.awt.Graphics;
import java.awt.Image;
 
import javax.swing.ImageIcon;
import javax.swing.JPanel;
public class JPanelBackground extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Image background;
	private Image image;
	
	public void paintComponent(Graphics g) {
		int width = this.getSize().width;
		int height = this.getSize().height;
		if (this.image != null) {
			g.drawImage(this.image, 0, 0, width, height, null);
		}
		super.paintComponent(g);
	}
	
	public void setBackground(String imagePath) {
		this.setOpaque(false);
		image = new ImageIcon(getClass().getClassLoader().getResource(imagePath)).getImage();
		//this.background = new ImageIcon(imagePath).getImage();
		repaint();
	}
}

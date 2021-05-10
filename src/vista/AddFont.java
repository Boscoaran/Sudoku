package vista;

import java.awt.Font;
import java.awt.Frame;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

import javax.swing.ImageIcon;

public class AddFont extends Frame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static Font go3ttf = null;
    private static Font go3 = null;
    private static InputStream myStream = null;
    private static final String FONT_PATH_GO3 = "fonts/go3v2.ttf";

    public static Font createFont() {


            try {
                myStream = new BufferedInputStream(new FileInputStream(FONT_PATH_GO3));
                go3ttf = Font.createFont(Font.TRUETYPE_FONT, myStream);
                go3 = go3ttf.deriveFont(Font.PLAIN, 24);               
            } catch (Exception ex) {
                ex.printStackTrace();
                System.err.println("Font not loaded.");
            }
            return go3;
    }
}


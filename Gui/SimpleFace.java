package Gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.WindowConstants;

public abstract class SimpleFace extends JFrame {

	private ImageIcon img = new ImageIcon("items/icon.jpg");
	protected final Color BLACK = new Color(0, 0, 0);
	protected final Color GREY = new Color(102, 102, 102);
	protected final Color PERIWINKLE_LIGHT = new Color(204, 204, 255);
	protected final Font FL_LIGHT = new Font("Footlight MT Light", 1, 36);

	public SimpleFace(String name, int size) {
		setTitle(name);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setBounds(new Rectangle(size, size, 0, 0));
	}

	protected void addIcon() {
		setIconImage(img.getImage());
	}

	abstract protected void addComponents();
}
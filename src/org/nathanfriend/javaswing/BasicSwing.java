package org.nathanfriend.javaswing;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;


public class BasicSwing extends JFrame {
	
	JPanel p = new JPanel();
	JButton b = new JButton("Hello");
	JTextField t = new JTextField("Hi!",20);
	public static void main(String[] args) {
	new BasicSwing();
}

public BasicSwing() {
	super("Basic Swing App");
	
	setSize(400,300);
	setResizable(true);
	
	p.add(b);
	p.add(t);
	add(p);
	
	setVisible(true);
}

}

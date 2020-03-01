import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Panele extends JFrame {

	Panele() {
		JPanel p = new JPanel();
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		JPanel p4 = new JPanel();
		JPanel p5 = new JPanel();
		JButton green = new JButton("green");
		JButton blue = new JButton("blue");
		JButton pink = new JButton("pink");
		JButton yellow = new JButton("yellow");
		setSize(522,555);
		setLocation(0, 0);
		setTitle("Paneliki");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		p.setLayout(new FlowLayout(1));

		p.setBackground(Color.white);

		p1.setSize(500,100);
		p1.setLocation(0,0);
		p1.setBackground(Color.green);
		green.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p5.setBackground(Color.green);
				p1.setBackground(Color.green);
				p2.setBackground(Color.blue);
				p3.setBackground(Color.yellow);
				p4.setBackground(Color.pink);
			}
		});
		p5.setSize(300,300);
		p5.setLocation(100,100);
		p5.setBackground(Color.white);
		
		p2.setSize(100,300);
		p2.setLocation(0,100);
		p2.setBackground(Color.blue);
		blue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p5.setBackground(Color.blue);
				p1.setBackground(Color.green);
				p2.setBackground(Color.blue);
				p3.setBackground(Color.yellow);
				p4.setBackground(Color.pink);
			}
		});
		
		p4.setSize(100,300);
		p4.setLocation(400,100);
		p4.setBackground(Color.pink);
		pink.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p5.setBackground(Color.pink);
				p1.setBackground(Color.green);
				p2.setBackground(Color.blue);
				p3.setBackground(Color.yellow);
				p4.setBackground(Color.pink);
			}
		});
		
		p3.setSize(500,100);
		p3.setLocation(0,400);
		p3.setBackground(Color.yellow);
		yellow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p5.setBackground(Color.yellow);
				p1.setBackground(Color.green);
				p2.setBackground(Color.blue);
				p3.setBackground(Color.yellow);
				p4.setBackground(Color.pink);
			}
		});
		
		p1.add(green);
		p4.add(pink);
		p2.add(blue);
		p3.add(yellow);

		add(p1);
		add(p2);
		add(p3);
		add(p4);
		add(p5);
		add(p);

	}
}

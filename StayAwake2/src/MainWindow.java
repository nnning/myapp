import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MainWindow {

	private static void createAndShowGUI() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JFrame frame = new JFrame("Stay Awake");
		frame.setLayout(new FlowLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton startBtn = new JButton("start");
		JButton stopBtn = new JButton("stop");
		JTextField tf = new JTextField(6);
		
		JLabel redlight = new JLabel(new ImageIcon("img/red.png"));
		
		frame.add(redlight);
		frame.add(tf);
		frame.add(startBtn);
		frame.add(stopBtn);
		
		frame.pack();
		frame.setResizable(false);
		frame.setVisible(true);
		
		MouseMover m1 = new MouseMover();
		Thread t1 = new Thread(m1);
		
		startBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(tf.getText().isEmpty() || tf.getText().equals("0")) {
					t1.start();
				} else {
					int i =  Integer.parseInt(tf.getText());
					try {
						new Thread(new MouseClicker(i)).start();
						t1.start();
					} catch (Exception e1) {
						e1.printStackTrace();
					};
				}
				
				redlight.setIcon(new ImageIcon("img/green.png"));
			}
			
		});
		
		stopBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				t1.stop();
				redlight.setIcon(new ImageIcon("img/red.png"));
			}
			
		});
	}

	public static void main(String[] args) {
		
		
		javax.swing.SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				createAndShowGUI();
			}
			
		});

	}

}

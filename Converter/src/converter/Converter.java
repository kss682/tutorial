package converter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Converter {
	public Converter() {
		JFrame mainframe = new JFrame("Converter");
		JTextField inputbox1 = new JTextField(30);
		JLabel label1 = new JLabel("Temperature in C");
		JButton button1 = new JButton("Convert");
//		JLabel label2 = new JLabel("");
		JTextField inputbox2 = new JTextField(30);
		JPanel panel1 = new JPanel();

//		JTextField inputbox2 = new JTextField(30);
//		JLabel label2 = new JLabel("Temperature in C");
//		GridLayout grid = new GridLayout(2, 2);
//		inputbox.setColumns(45);
//		inputbox1.setBounds(SwingConstants.LEFT, SwingConstants.CENTER, 100, 50);
//		inputbox1.setHorizontalAlignment(SwingConstants.LEFT);
//		label1.setHorizontalAlignment(SwingConstants.RIGHT);
//		label1.setVerticalAlignment(SwingConstants.CENTER);
//		button1.setBounds(SwingConstants.EAST, SwingConstants.LEADING, 200, 50);
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String data = inputbox1.getText();
				float temp, farhen, cel;
				if(data.length() == 0) {
					data = inputbox2.getText();
					temp = Float.parseFloat(data);
					cel = ((temp - 32)*5)/9;
					inputbox1.setText(Float.toString(cel));
					inputbox2.setText("");
				}
				else {
					temp = Float.parseFloat(data);
					farhen = (9*temp)/5 + 32;
					inputbox2.setText(Float.toString(farhen));
					inputbox1.setText("");
				}

			}
		});
		panel1.add(label1);
		panel1.add(inputbox1);
		panel1.add(button1);
		panel1.add(inputbox2);
//		mainframe.add(inputbox1);
//		mainframe.add(label1);
		mainframe.add(panel1);
//		mainframe.setLayout(new GridLayout(2,2));
		mainframe.setSize(400, 400);
//		mainframe.getContentPane().setBackground(Color.green);
		mainframe.setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable(){
			@Override
			public void run() {
				new Converter();
			}
		});
	}

}

package converter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.SwingUtilities;

public class Converter {

	public Converter() {
//		Logic lg = new Logic();
		JComboBox<?> conv_types = new JComboBox<Object>(Logic.getConv_types());
		JFrame mainframe = new JFrame("Converter");
//		@SuppressWarnings("unchecked")
		
		JLabel unit1 = new JLabel("Unit 1");
		JTextField inputbox1 = new JTextField(30);

//		JLabel label2 = new JLabel("");
		JLabel unit2 = new JLabel("Unit 2");
		JTextField inputbox2 = new JTextField(30);
		JButton button1 = new JButton("Convert");
		
		JPanel panel1 = new JPanel();
		
		GroupLayout layout = new GroupLayout(panel1);
		panel1.setLayout(layout);
		
		layout.setAutoCreateContainerGaps(true);
		layout.setAutoCreateGaps(true);
		
		layout.setHorizontalGroup(
				layout.createSequentialGroup()
					.addGroup(
							layout.createParallelGroup(GroupLayout.Alignment.LEADING)
							.addComponent(unit1, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(inputbox1)
					)
					.addGroup(
							layout.createParallelGroup(GroupLayout.Alignment.LEADING)
							.addComponent(conv_types)
							.addComponent(button1)
							
					)
					.addGroup(
							layout.createParallelGroup(GroupLayout.Alignment.LEADING)
							.addComponent(unit2)
							.addComponent(inputbox2)
					)
				);
		layout.setVerticalGroup(
				layout.createSequentialGroup()
				.addGroup(
						layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(unit1)
						.addComponent(conv_types)
						.addComponent(unit2)

				)
				
				.addGroup(
						layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(inputbox1)
						.addComponent(button1)
						.addComponent(inputbox2)
					)
				
				);
		layout.linkSize(SwingConstants.HORIZONTAL, conv_types, button1);
//		layout.linkSize(SwingConstants.HORIZONTAL, inputbox1, inputbox2);
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String ans;
				if(inputbox1.getText().length() == 0) {
					ans = Logic.process(
							inputbox2.getText(),
							(String)conv_types.getSelectedItem(),
							true
							);
					inputbox1.setText(ans);
					inputbox2.setText("");
				}
				else {
					ans = Logic.process(
							inputbox1.getText(),
							(String)conv_types.getSelectedItem(),
							false
							);
					inputbox2.setText(ans);
					inputbox1.setText("");
				}
				
			}
		});
		
		conv_types.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				String type = (String)conv_types.getSelectedItem();
				String[] temp = type.split(" ", 0);
				unit1.setText(temp[0]);
				unit2.setText(temp[2]);
			}
		});

		

		mainframe.add(panel1);
		mainframe.setSize(400, 400);
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

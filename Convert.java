import java.awt.Color;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Convert {
	JFrame frame;
	FlowLayout layout;
	JLabel label, label1, resultLabel;
	JTextField text;
	JComboBox combo, combo1;


	
	Convert(){
		frame = new JFrame();
		frame.setTitle("Conversion System");
		frame.setSize(600, 125);
		frame.getContentPane().setBackground(Color.PINK);
		
		layout = new FlowLayout();
		frame.setLayout(layout);
		
		// "convert"
		label = new JLabel("Convert");
		frame.add(label);
		
		
		//box
		text = new JTextField(5);
		frame.add(text);
		
		String options[] = {"Mile", "Yard", "Foot", "Inch"};
		combo = new JComboBox(options);
		frame.add(combo);
		
		
		// "to"
		label1 = new JLabel("To");
		frame.add(label1);
		
		String options1[] = {"Kilometer", "Meter", "Centimeter"};
		combo1 = new JComboBox(options1);
		frame.add(combo1);
		
		// button
		JButton button = new JButton("GO!");
		frame.add(button);
		ActionListener l = new myListener();
		button.addActionListener(l);
		
		
		resultLabel = new JLabel("0.0");
		frame.add(resultLabel);
		
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Convert();

	}
	
	
	class myListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub

			double num = Double.valueOf(text.getText());

			int index = combo.getSelectedIndex();
			int index1 = combo1.getSelectedIndex();
			double result = 0;
			
			// mile
			if(index == 0) {
				if(index1 == 0) {
					result = num * 1.609344;
				} else if(index1 == 1) {
					result = num * 1609.344;
				} else if(index1 == 2) {
					result = num * 1609344;	
				}
				
			//yard	
			} else if(index == 1) {
				if(index1 == 0) {
					result = num * 0.0009144;
				} else if(index1 == 1) {
					result = num * 0.9144;
				} else if(index1 == 2) {
					result = num * 91.44;
				}
			//foot	
			} else if(index == 2){
				if(index1 == 0) {
					result = num * 0.0003048;
				} else if(index1 == 1) {
					result = num * 0.3048;
				} else if(index1 == 2) {
					result = num * 30.48;
				}
			//inch	
			} else if(index == 3) {
				if(index1 == 0) {
					result = num * 0.0000254;
				} else if(index1 == 1) {
					result = num * 0.0254;
				} else if(index1 == 2) {
					result = num * 2.54;
				}
			}
			
			
			float result1 = (float)result;
			resultLabel.setText(String.format("%.2f", result1));

			
			
		}
		
		
		
	}

}



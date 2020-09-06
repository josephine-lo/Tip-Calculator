
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


/* This program is a tip calculator that calculates the total tip and total amount.
 * Please enter a valid meal total (double/integer) and select your tip amount! 
 */

public class PersonalProject {
	JFrame frame;
	JLabel label, label1, tip, total, tipAmnt, totalAmnt;
	FlowLayout layout;
	JTextField text;
	JButton tip1, tip2, tip3, tip4;
	
	PersonalProject(){
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setSize(250, 200);
		frame.setTitle("Tip Calculator");
		
		layout = new FlowLayout();
		frame.setLayout(layout);
		
		label = new JLabel("Enter total: $");
		frame.add(label);
		
		text = new JTextField(5);
		frame.add(text);
		
		label1 = new JLabel("Select amount to tip:");
		frame.add(label1);
		
		tip1 = new JButton("10%");
		tip1.addActionListener(new myListener1());
		tip2 = new JButton("15%");
		tip2.addActionListener(new myListener1());
		tip3 = new JButton("18%");
		tip3.addActionListener(new myListener1());
		tip4 = new JButton("20%");
		tip4.addActionListener(new myListener1());
		
		frame.add(tip1);
		frame.add(tip2);
		frame.add(tip3);
		frame.add(tip4);
		
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main (String[] args) {
		new PersonalProject();
	}

		
	class myListener1 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {

			double amount = 0;
			
			if(Double.valueOf(text.getText()) != null) {
				amount = Double.valueOf(text.getText());
				double total = 0;
				double totalTip = 0;
				
				if(e.getActionCommand().equals("10%")) {
					totalTip = amount * 0.1;
				} else if(e.getActionCommand().equals("15%")) {
					totalTip = amount * 0.15;
				} else if(e.getActionCommand().equals("18%")) {
					totalTip = amount * 0.18;
				} else if(e.getActionCommand().equals("20%")) {
					totalTip = amount * 0.2;
				}
				total = amount + totalTip;
				
				
				float totalTip1 = (float)totalTip;
				float total1 = (float)total;
				
				ImageIcon icon = new ImageIcon("mario.png");
				JOptionPane.showMessageDialog(null, "Total tip: $" + String.format("%.2f", totalTip1) + "\nTotal amount: $" + String.format("%.2f", total1), "Total", JOptionPane.DEFAULT_OPTION, icon);
				
				
			} else {
				JOptionPane.showMessageDialog(null, "Please enter a valid input", "Error!", JOptionPane.ERROR_MESSAGE);
			}
			
			
		}
		
	}
		
		
		
	
}

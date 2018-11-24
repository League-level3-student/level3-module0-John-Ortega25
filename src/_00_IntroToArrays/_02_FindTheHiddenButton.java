package _00_IntroToArrays;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
	
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/* Run the FindHiddenButton.jar to see the finished product. */

public class _02_FindTheHiddenButton implements ActionListener{
	JFrame window;
	JPanel panel;
	
	JButton[] buttons;
	int hiddenButton;
	
	public static void main(String[] args) {
		new _02_FindTheHiddenButton().start();
	}
	
	public void start() {
		window = new JFrame("Find the Button");
		panel = new JPanel();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		String input = JOptionPane.showInputDialog("Enter a positive number");
		int output= Integer.parseInt(input);
		buttons = new JButton[output];
		for (int i = 0; i < buttons.length; i++) {
			buttons[i]=  new JButton();
			buttons[i].addActionListener(this);
			panel.add(buttons[i]);
		}
		window.add(panel);
		window.setExtendedState(JFrame.MAXIMIZED_BOTH);
		window.setVisible(true);
		JOptionPane.showMessageDialog(null, "Click on the winning button");
		Random generator = new Random();
		hiddenButton = generator.nextInt(output);
		//14. Set the text of the JButton located at hiddenButton to read "ME"
		buttons[hiddenButton].setText("ME");
		//15. Use Thread.sleep(100); to pause the program.
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//16. Set the text of the JButton located at hiddenButton to be blank.
		buttons[hiddenButton].setText(" ");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonClicked = (JButton)e.getSource();
		
		//17. if the hiddenButton is clicked, tell the user that they win.
		if (buttonClicked== buttons[hiddenButton]) {
			JOptionPane.showMessageDialog(null, "You won!");
		}
		//18. else tell them to try again
		else {
			JOptionPane.showMessageDialog(null, "Try again!");
		}
	}
}

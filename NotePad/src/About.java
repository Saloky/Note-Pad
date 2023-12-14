import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class About extends JFrame {

	About() {
		setTitle("About Note It Down");
		setBounds(100, 100, 400, 500);
		ImageIcon icon = new ImageIcon(getClass().getResource("notepad.png"));
		setIconImage(icon.getImage());
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLayout(null);

		JLabel l3 = new JLabel("<html> This program is Created by Shlok Gupta</html>");
		l3.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
		add(l3);

	}

	public static void main(String[] args) {
		new About().setVisible(true);
	}

}

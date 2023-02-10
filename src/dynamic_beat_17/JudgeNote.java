package dynamic_beat_17;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JudgeNote {
	
	private JFrame frame = new JFrame();
	private ImageIcon judgeIcon;
	private JLabel label;
	
	JudgeNote() {
		judgeIcon = new ImageIcon(new ImageIcon(Main.class.getResource("/images/judgePerfect.png")).getImage());
		label = new JLabel(judgeIcon);
		frame.add(label);
		frame.setVisible(true);
		try {
			Thread.sleep(10000);
		} catch(InterruptedException ex) {
			ex.printStackTrace();
		}
		frame.setVisible(false);
		frame.dispose();		
	}
	
}

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Nasty_Suprise implements ActionListener {
	JButton trickButton = new JButton();
	JButton treatButton = new JButton();
	
	
	
	public static void main(String[] args) {
	
		new Nasty_Suprise().createUI();
}
	 private void createUI () {
		JPanel panel = new JPanel();
		JFrame frame = new JFrame();
		frame.setVisible(true);
		
		trickButton.setText("Trick");
		
	    treatButton.setText("Treat");
	    frame.add(panel);
		trickButton.addActionListener(this);
	    treatButton.addActionListener(this);
		panel.add(trickButton);
		panel.add(treatButton);
	    frame.pack();
	    frame.setTitle("Nasty Suprise");
	}

private void showPictureFromTheInternet(String imageUrl) {
     try {
          URL url = new URL(imageUrl);
          Icon icon = new ImageIcon(url);
          JLabel imageLabel = new JLabel(icon);
          JFrame frame = new JFrame();
          frame.add(imageLabel);
          frame.setVisible(true);
          frame.pack();
     } catch (MalformedURLException e) {
          e.printStackTrace();
     }
}


public void actionPerformed(ActionEvent e) {
	JButton buttonPressed = (JButton) e.getSource();
	if(buttonPressed == trickButton) {
		showPictureFromTheInternet("https://i.ytimg.com/vi/zy0z2rIMCH8/hqdefault.jpg");
	
	}
	else if(buttonPressed == treatButton) {
		showPictureFromTheInternet("https://vignette.wikia.nocookie.net/villains/images/d/d1/Go_To_Sleep_-_%22Jeff_The_Killer%22/revision/latest/scale-to-width-down/300?cb=20170920170228");
	}
}





}
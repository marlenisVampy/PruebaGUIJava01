import java.awt.Image;
import java.awt.Toolkit;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.io.IOException;
import java.net.URL;


import View.*;

public class testing
{
	public static void main(String[] args)
	{
				
			JFrame tell =  new tellephoneCall();
	    	tell.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			tell.setTitle("Phone App");

			Image icon = Toolkit.getDefaultToolkit().getImage("telefono.jpg");
			tell.setIconImage(icon);
			tell.setVisible(true);

				/*URL iconUrl = testing.class.getResource("/bin/telefono.jpg");
				//URL iconUrl = getClass().getResource("/src/Image/telefono.jpg");
				ImageIcon icon = new ImageIcon(iconUrl);
				tell.setIconImage(icon.getImage());
				tell.setVisible(true);*/

			
			




			   

				

			//ImageIcon icon = new ImageIcon(Foo.class.getResource("/src/Image/telefono.jpg"));

			//tell.setIcon(new ImageIcon(getClass().getResource("/src/Image/telefono.jpg")));
			//Image icon = Toolkit.getDefaultToolkit().getImage("Image/telefono.jpg");
			/*tell.setIconImage(icon);			*/


		
	}
}
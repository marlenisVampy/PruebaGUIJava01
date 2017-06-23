package View;

import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;

public class tellephoneCall extends JFrame 
{
	private static final int FRAME_WIDTH = 400;
	private static final int FRAME_HEIGTH = 100;

	private static final String DEFAULT_RATE = "";

	private JButton button;
	private JLabel label;
	private JPanel panel;
	private JPanel buttonPanel;
	private JTextField text;

	private String number = "";
	private JButton button7;
	private JButton button8;
	private JButton button9;
	private JButton button4;
	private JButton button5;
	private JButton button6;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button0;
    private JButton buttonClear;
    private JButton buttonCall;
    
	public tellephoneCall()
	{
		createTextField();
		createPanel();
		call();
		clear();
		dialUp1();
		dialUp2();
		dialUp3();
		dialUp4();
		dialUp5();
		dialUp6();
		dialUp7();
		dialUp8();
		dialUp9();
		dialUp0();


		setSize(FRAME_WIDTH,FRAME_HEIGTH);
	}

	private void call()
	{
			class CallPhones implements ActionListener
			{

				public void actionPerformed(ActionEvent event)
				{
					Object source = event.getSource();
					if(source instanceof JButton)
							{
								if(buttonCall.getText().equals("CALL"))
									{
									 buttonCall.setText("HANG UP");
									}else 
										if(buttonCall.getText().equals("HANG UP"))
										{
											text.setText("");
									 		buttonCall.setText("CALL");
										}
							}
				}

				
			}

			ActionListener listener = new CallPhones();
			buttonCall.addActionListener(listener);	
			//button1.addActionListener(listener);

	}
 
		private void dialUp1()
		{
			class btn1 implements ActionListener
			{
				public void actionPerformed(ActionEvent event)
				{
					if(button1.getText().equals("1")) 
						{
							String button1Text = text.getText() + button1.getText();
							text.setText(button1Text);
						}
				}
			}
					ActionListener listener1 = new btn1();
					button1.addActionListener(listener1);
		}
	private void dialUp2(){
		class btn2 implements ActionListener
		{
				public void actionPerformed(ActionEvent event)
				{
					//Object source = event.getSource();
					if ( button2.getText().equals("2")) {
								String button2Text = text.getText() + button2.getText();
								text.setText(button2Text);
							}
				}
		}
			ActionListener listener2 = new btn2();
			button2.addActionListener(listener2);
		}
		private void dialUp3()
		{
			class btn3 implements ActionListener
			{
				public void actionPerformed(ActionEvent event)
				{
						if ( button3.getText().equals("3")) {
								String button3Text = text.getText() + button3.getText();
								text.setText(button3Text);
							}
				}
			}
			ActionListener listener3 = new btn3();
			button3.addActionListener(listener3);

		}
		private void dialUp4()
		{
			class btn4 implements ActionListener
			{
				public void actionPerformed(ActionEvent event)
				{
						if ( button4.getText().equals("4")) {
								String button4Text = text.getText() + button4.getText();
								text.setText(button4Text);
							}
				}
			}
			ActionListener listener4 = new btn4();
			button4.addActionListener(listener4);

		}
		
		private void dialUp5()
		{
			class btn5 implements ActionListener
			{
				public void actionPerformed(ActionEvent event)
				{
						if ( button5.getText().equals("5")) {
								String button5Text = text.getText() + button5.getText();
								text.setText(button5Text);
							}
				}
			}
			ActionListener listener5 = new btn5();
			button5.addActionListener(listener5);
		}
		
		private void dialUp6()
		{
			class btn6 implements ActionListener
			{
					public void actionPerformed(ActionEvent event)
				{
						if ( button6.getText().equals("6")) {
								String button6Text = text.getText() + button6.getText();
								text.setText(button6Text);
							}
				}
			}

			ActionListener listener6 = new btn6();
			button6.addActionListener(listener6);

		}

		private void dialUp7()
		{
			class btn7 implements ActionListener
			{
					public void actionPerformed(ActionEvent event)
				{
						if ( button7.getText().equals("7")) {
								String button7Text = text.getText() + button7.getText();
								text.setText(button7Text);
							}
				}
			}

			ActionListener listener7 = new btn7();
			button7.addActionListener(listener7);

		}

		private void dialUp8()
		{
			class btn8 implements ActionListener
			{
					public void actionPerformed(ActionEvent event)
				{
						if ( button8.getText().equals("8")) {
								String button8Text = text.getText() + button8.getText();
								text.setText(button8Text);
							}
				}
			}

			ActionListener listener8 = new btn8();
			button8.addActionListener(listener8);

		}

		private void dialUp9()
		{
			class btn9 implements ActionListener
			{
					public void actionPerformed(ActionEvent event)
				{
						if ( button9.getText().equals("9")) {
								String button9Text = text.getText() + button9.getText();
								text.setText(button9Text);
							}
				}
			}

			ActionListener listener9 = new btn9();
			button9.addActionListener(listener9);

		}

		private void dialUp0()
		{
			class btn0 implements ActionListener
			{
					public void actionPerformed(ActionEvent event)
				{
						if ( button0.getText().equals("0")) {
								String button0Text = text.getText() + button0.getText();
								text.setText(button0Text);
							}
				}
			}

			ActionListener listener0 = new btn0();
			button0.addActionListener(listener0);

		}
		
		private void clear()
		{
			class btnClear implements ActionListener
			{
					public void actionPerformed(ActionEvent event)
				{
						if ( buttonClear.getText().equals("CLEAR")) {
								 text.setText("");
							}
				}
			}

			ActionListener listenercls = new btnClear();
			buttonClear.addActionListener(listenercls);

		}


	private void createTextField()
	{
		final int FIELD_WIDTH  = 20;
		text = new JTextField(FIELD_WIDTH);
		text.setText(""+ DEFAULT_RATE);

		String tell = (text.getText());

	}

	private void createPanel()
	{
		panel = new JPanel();
		buttonPanel = new JPanel();
		panel.setLayout(new BorderLayout());
		buttonPanel.setLayout(new GridLayout(4,3));

		button7 = new JButton("7");
		button8 = new JButton("8");
		button9 = new JButton("9");
		button4 = new JButton("4");
		button5 = new JButton("5");
		button6 = new JButton("6");
		button1 = new JButton("1");
		button2 = new JButton("2");
		button3 = new JButton("3");
		button0 = new JButton("0");
		buttonClear = new JButton("CLEAR");
		//buttonHangUp = new JButton("Hang Up");
		buttonCall = new JButton("CALL");

		buttonPanel.add(button1);
		buttonPanel.add(button2);
		buttonPanel.add(button3);

		buttonPanel.add(button4);
		buttonPanel.add(button5);
		buttonPanel.add(button6);

		buttonPanel.add(button7);
		buttonPanel.add(button8);
		buttonPanel.add(button9);

		buttonPanel.add(buttonClear);
		buttonPanel.add(button0);
		buttonPanel.add(buttonCall,BorderLayout.SOUTH);

		panel.add(buttonPanel,BorderLayout.CENTER);
    	panel.add(text,BorderLayout.NORTH);
    	//panel.add(buttonCall,BorderLayout.SOUTH);
		add(panel);
	}

}
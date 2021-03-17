package labAdvanceJava;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;



public class FirstThreeProgramme extends Applet implements ActionListener{
	
private Label LabelUserName = new Label("User Name");
private TextField TFUserName=new TextField(20);
private Label LabelPassword = new Label("Password");
private Label Lbl = new Label("");
private TextField TFPassword =new TextField(20);
private Button LogIn= new Button("Log In");
private Label Heading=new Label("Login to view Emoji");
boolean topaint=false;
boolean todrawString=false;
Font Large=new Font("Serif",Font.BOLD,26);
Font Medium=new Font("Serif",Font.BOLD,18);
Font Small=new Font("Serif",Font.BOLD,12);

public void init(){


	setSize(600,480);
	setVisible(true);
	setLayout(null);
	add(Heading);
	Heading.setFont(Large);
	LabelUserName.setFont(Medium);
	LabelPassword.setFont(Medium);
	LogIn.setFont(Medium);
	
	add(LabelUserName);
	add(TFUserName);
	add(LabelPassword);
	add(TFPassword);
	add(LogIn);
	add(Lbl);
	TFPassword.setEchoChar('*');
	Heading.setBounds(40,20,300,30);
	LabelUserName.setBounds(30, 65, 105, 20);
	TFUserName.setBounds(135, 65, 130, 20);
	LabelPassword.setBounds(30, 95, 105, 20);
	TFPassword.setBounds(135, 95, 130, 20);
	LogIn.setBounds(130,130, 70, 40);
	Lbl.setBounds(132,175,70, 20);
	Color cstmClr=new Color(105, 189, 210);
	Color cstmClr1=new Color(0, 57, 230);
	setBackground(cstmClr);
	//TFUserName.addActionListener(this);
	//TFPassword.addActionListener(this);
	LogIn.addActionListener(this);
	LabelUserName.setBackground(cstmClr);
	LabelPassword.setBackground(cstmClr);
	Lbl.setBackground(cstmClr);
	Heading.setBackground(cstmClr);
	LogIn.setBackground(cstmClr);
	TFPassword.setBackground(cstmClr);
	TFUserName.setBackground(cstmClr);
	
	LabelUserName.setForeground(cstmClr1);
	LabelPassword.setForeground(cstmClr1);
	Lbl.setForeground(cstmClr1);
	Heading.setForeground(cstmClr1);
}
	@Override
	public void actionPerformed(ActionEvent e){
		
		
	if(((TFUserName.getText()).equals("Aabid")) && ((TFPassword.getText()).equals("Hussain"))){
	      Lbl.setText("SUCCESS");
       	topaint=true;
       	todrawString=false;
	}
	 else
	 {
		 
		 Lbl.setText("FAILED");
		 todrawString=true;
		 topaint=false;
		 
		 
	 }
	repaint();
		 
		
	}
	public void paint(Graphics g){
		
if(todrawString){
	g.setColor(Color.BLUE);
			g.drawString("You have Entered either wrong Username or wrong Password. This is written using drawString()",40,210);
		}
	else if(topaint){
	   
	    g.setColor(Color.ORANGE);
		g.fillOval(100, 230, 200,200);
		g.setColor(Color.WHITE);
		g.fillOval(145, 280, 30, 35);
		g.fillOval(225, 280, 30, 35);
		g.setColor(Color.BLACK);
		g.fillOval(151,280,22,24);
		g.fillOval(231,280,22,24);
		g.setColor(Color.white);
		g.fillOval(165, 350,70,12);
		 g.setColor(Color.ORANGE);
		g.fillRect(188, 350,8,8);
		g.fillRect(203, 350,8,8);
		}
		
		}

	
	}
	
	
 

	
	
	
	



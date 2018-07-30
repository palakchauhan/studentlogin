import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class studentlogin extends JFrame
{
	JLabel usernamelabel,agelabel,collegelabel,sapidlabel,emailidlabel,passwordlabel,genderlabel;
	JTextField usernametext,agetext,passwordtext,passwordfield,emailidtext,collegetext,sapidtext;
	JButton loginbutton; 
        JRadioButton[] gender = new JRadioButton[2];
        
       
	
	
	public static void main(String[] args)
	{
            studentlogin studentlogin = new studentlogin();
	}
	public studentlogin()
	{
		setSize(400,400);
		setTitle("STUDENT LOGIN");
		setLocationRelativeTo(null);
		
                String[]
                        sexTexts={"male ","female                                  "};
                
                
                for(int i=0;i<gender.length;i++)
                {
                    gender[i]=new JRadioButton(sexTexts[i]);
                }
                
                
            
		JPanel panel=new JPanel();
		
		usernamelabel=new JLabel("Enter UserName:");
		agelabel=new JLabel("Enter Age:");
                genderlabel=new JLabel("                                 gender:");
		collegelabel=new JLabel("Enter College Name:");
                sapidlabel=new JLabel("Enter SAP ID :");
                emailidlabel=new JLabel("Enter EMAIL ID :");
                passwordlabel=new JLabel("Enter password :");
		
		
		loginbutton =new JButton("login");
		ListenForButton b=new ListenForButton();
		loginbutton.addActionListener(b);
						
		usernametext=new JTextField("",30);		
		agetext=new JTextField("",30);
		collegetext=new JTextField("",30);
                sapidtext=new JTextField("",30);
                emailidtext=new JTextField("",30);
                passwordfield=new JPasswordField("",30);
                
		
		panel.add(usernamelabel);
		panel.add(usernametext);
		
		panel.add(agelabel);
		panel.add(agetext);
                
                panel.add(genderlabel);
                ButtonGroup gp4 = new ButtonGroup();
                for(JRadioButton gender1:gender)
                {
                gp4.add(gender1);
                panel.add(gender1);
                }
        
	
		
		panel.add(collegelabel);
		panel.add(collegetext);
		
                panel.add(sapidlabel);
		panel.add(sapidtext);
                
                panel.add(emailidlabel);
		panel.add(emailidtext);
                
                panel.add(passwordlabel);
		panel.add(passwordfield);

	
		panel.add(loginbutton);
						
		add(panel);
		setVisible(true);
	}
	public class ListenForButton extends JFrame implements ActionListener
	{
		
            
		public void actionPerformed(ActionEvent e)
		{
			
			if(e.getSource()==loginbutton)
			{
		
			JOptionPane.showMessageDialog(this,"login successful");
			}
		}
	}
}


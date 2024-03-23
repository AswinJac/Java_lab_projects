import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class userlogin extends JFrame implements ActionListener {
    JFrame jfr;
    JTextField jt;
    JPasswordField pf;
    JLabel jl;
    JButton login;
    JLabel disp;
    userlogin()
    {
        jfr=new JFrame();
        jfr.setSize(500,500);
        jfr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfr.setVisible(true);
        jfr.setLayout(null);
        jfr.getContentPane().setBackground(Color.red);
        JLabel user=new JLabel("Enter UserName:");
        user.setBounds(30,15,300,50);
        jfr.add(user);
        jt=new JTextField();
        jt.setBounds(30,25,300,50);
        jfr.add(jt);
        JLabel pass=new JLabel("Enter Password:");
        pass.setBounds(30,100,300,50);
        jfr.add(pass);
        pf=new JPasswordField();
        pf.setBounds(30,110,300,50);
        jfr.add(pf);
        login=new JButton("Login");
        login.setBounds(30,200,100,50);
        login.addActionListener(this);
        jfr.add(login);
        disp=new JLabel();
        disp.setBounds(30,280,300,50);
        jfr.add(disp);
    }
    public void actionPerformed(ActionEvent ae)
    {
        String s=ae.getActionCommand();
        if(s.equals("Login"))
        {
            String usern=jt.getText();
            String passw=String.valueOf(pf.getPassword());
            if(usern.equalsIgnoreCase("ADMIN")&&passw.equalsIgnoreCase("admin"))
            disp.setText("LOGIN SUCESS");
            else
            disp.setText("LOGIN UNSUCCESSFULL");

        }


    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run()
            {
                new userlogin();
            }
        });
    }



    
}

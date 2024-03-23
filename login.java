import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class login extends JFrame implements ActionListener {
    JFrame jfr;
    JButton submit;
    JTextField name,gm;
    JRadioButton m,g;
    JLabel gender;
    ButtonGroup bg;
    login()
    {
        jfr=new JFrame("Login Page");
        jfr.setSize(500,500);
        jfr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfr.setVisible(true);
        jfr.setLayout(null);
        jfr.getContentPane().setBackground(Color.gray);
        JLabel n=new JLabel("Enter name:");
        n.setBounds(30,9,300,50);
        jfr.add(n);
        name=new JTextField();
        name.setBounds(30,54,300,20);
        jfr.add(name);
        gender=new JLabel("GENDER:");
        gender.setBounds(30,70,300,50);
        jfr.add(gender);
        m=new JRadioButton("Male");
        m.setBounds(100,90,70,20);
        jfr.add(m);
        g=new JRadioButton("Female");
        g.setBounds(200,90,70,20);
        jfr.add(g);
        bg=new ButtonGroup();
        bg.add(m);
        bg.add(g);


    }
    public void actionPerformed(ActionEvent ae)
    {

    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run()
            {
                new login();
            }
        });
    }
    
}

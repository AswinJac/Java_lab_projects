import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class celciustofaren extends JFrame implements ActionListener {
    JFrame jfr;
    JTextField j1,j2;
    JButton jb;
    celciustofaren()
    {
        jfr=new JFrame("CELTOFRA");
        jfr.setSize(390,300);
        jfr.setLayout(null);
        jfr.getContentPane().setBackground(Color.gray);
        jfr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfr.setVisible(true);
        JLabel l1=new JLabel("Enter temprature");
        l1.setBounds(30,10,300,30);
        jfr.add(l1);
        j1=new JTextField();
        j1.setBounds(40,50,300,30);
        jfr.add(j1); 
        JLabel l2=new JLabel("Temprature in Farenheit");
        l2.setBounds(30,90,300,30);
        jfr.add(l2);
        j2=new JTextField();
        j2.setBounds(40,130,300,30);
        j2.setEditable(false);
        jfr.add(j2);  
        jb=new JButton("CONVERT");
        jb.setFocusable(false);
        jb.addActionListener(this);
        jb.setBounds(110,170,120,50);
        jfr.add(jb);  

    }
    public void actionPerformed(ActionEvent ae)
    {
        double t;
        String s=ae.getActionCommand();
        if(s.equalsIgnoreCase("CONVERT"))
        {
            t=((Double.parseDouble(j1.getText())*9)/5)+32;
            j2.setText(String.valueOf(t));
        }
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run()
            {
                new celciustofaren();
            }
        });
    }
    
}

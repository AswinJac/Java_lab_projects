import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class texttolabel extends JFrame implements ActionListener
{
    JFrame jfr;
    JTextField jt;
    JLabel jb;
    texttolabel()
    {
        jfr=new JFrame("Text");
        jfr.setSize(500,500);
        jfr.setLayout(null);
        jfr.getContentPane().setBackground(Color.green);
        jfr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfr.setVisible(true);
        jt=new JTextField();
        jt.addActionListener(this);
        jt.setBounds(25,25,300,50);
        jfr.add(jt);
        jb=new JLabel("Text");
        jb.setBounds(50,350,300,50);
        jfr.add(jb);
}
    public void actionPerformed(ActionEvent ae)
    {
        String s=jt.getText();
        jb.setText("You have typed "+s);

    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run()
            {
                new texttolabel();
            }
        });
    }

    
}

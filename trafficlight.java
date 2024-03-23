import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;   
class trafficlight extends JFrame implements ActionListener {
    JFrame jfr;
    JRadioButton r1,r2,r3;
    ButtonGroup g; 
    trafficlight()
    {
        jfr=new JFrame("Traffic Light");
        jfr.setSize(400,400);
        jfr.setLayout(new FlowLayout());
        jfr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfr.getContentPane().setBackground(Color.black);
        jfr.setVisible(true);
        r1=new JRadioButton("Red");
        r1.setFocusable(false);
        r2=new JRadioButton("Green");
        r2.setFocusable(false);
        r3=new JRadioButton("Yellow");
        r3.setFocusable(false);
        r1.addActionListener(this);
        r2.addActionListener(this);
        r3.addActionListener(this);
        jfr.add(r1);
        jfr.add(r2);
        jfr.add(r3);
        g=new ButtonGroup();
        g.add(r1);
         g.add(r2);
        g.add(r3);
     }
     public void actionPerformed(ActionEvent e)
    {
        String s=e.getActionCommand();
        if(s.equalsIgnoreCase("Red"))
        jfr.getContentPane().setBackground(Color.red);
        else if(s.equalsIgnoreCase("Yellow"))
        jfr.getContentPane().setBackground(Color.yellow);
        else if(s.equalsIgnoreCase("Green"))
        jfr.getContentPane().setBackground(Color.green);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable()
            {public void run()
            {
                new trafficlight();
            }} ); }
}
    


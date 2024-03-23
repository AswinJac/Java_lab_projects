import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class counter extends JFrame implements ActionListener  {
    int num=0;
    JFrame jfr;
    JLabel jt;
    JButton add,minus,reset;
    counter()
    {
        jfr=new JFrame();
        jfr.setSize(320,250);
        jfr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfr.getContentPane().setBackground(Color.red);
        jfr.setLayout(null);
        jfr.setVisible(true);
        JLabel count=new JLabel("Counter");
        count.setForeground(Color.green);
        count.setBounds(30, 25, 300, 50);
        jfr.add(count);
        jt=new JLabel("0");
        jt.setFont(new Font("Ariel",Font.BOLD,24));
        jt.setBounds(100,25,300,50);
        jfr.add(jt);
        add=new JButton("ADD");
        add.setBounds(30,70,80,30);
        add.setFocusable(false);
        jfr.add(add);
        add.addActionListener(this);
        minus=new JButton("NEGATE");
        minus.setBounds(140,70,110,30);
        minus.setFocusable(false);
        jfr.add(minus);
        minus.addActionListener(this);
        reset=new JButton("RESET");
        reset.setBounds(80,110,80,30);
        reset.setFocusable(false);
        jfr.add(reset);
        reset.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
        String s=ae.getActionCommand();
        
        if(s.equalsIgnoreCase("ADD"))
        {
            num=num+1;
            jt.setText(String.valueOf(num));
        }
        else if(s.equalsIgnoreCase("Negate"))
        {
            num=num-1;
            jt.setText(String.valueOf(num));
        }
        else if(s.equalsIgnoreCase("Reset"))
        {
            num=0;
            jt.setText(String.valueOf(num));
        }
     }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
        public void run()
        {
            new counter();
        }});
    }


    
}

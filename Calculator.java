import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class swingger extends JFrame implements ActionListener
{
    JFrame jfr;
    JTextField jt;
    JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9;
    JButton badd,bs,bm,bd,beq,bdot,bclear;
    String s0,s1,s2;
    swingger()
    {
        s0=s1=s2="";
        jfr=new JFrame("Calculator");
        jfr.setLayout(null);
        jfr.getContentPane().setBackground(Color.gray);
        jfr.setSize(305,490);
        jfr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jt=new JTextField();
        jt.setBounds(25, 5, 250, 50);
        jfr.add(jt);
        badd=new JButton("+");
        badd.addActionListener(this);
        badd.setBounds(30,60,50,50);
        jfr.add(badd);
        b7=new JButton("7");
        b7.addActionListener(this);
        b7.setBounds(90,60,50,50);
        jfr.add(b7);
        b8=new JButton("8");
        b8.addActionListener(this);
        b8.setBounds(150,60,50,50);
        jfr.add(b8);
        b9=new JButton("9");
        b9.addActionListener(this);
        b9.setBounds(210,60,50,50);
        jfr.add(b9);
        bs=new JButton("-");
        bs.addActionListener(this);
        bs.setBounds(30,120,50,50);
        jfr.add(bs);
        b4=new JButton("4");
        b4.addActionListener(this);
        b4.setBounds(90,120,50,50);
        jfr.add(b4);
        b5=new JButton("5");
        b5.addActionListener(this);
        b5.setBounds(150,120,50,50);
        jfr.add(b5);
        b6=new JButton("6");
        b6.addActionListener(this);
        b6.setBounds(210,120,50,50);
        jfr.add(b6);
        bm=new JButton("*");
        bm.addActionListener(this);
        bm.setBounds(30,180,50,50);
        jfr.add(bm);
        b1=new JButton("1");
        b1.addActionListener(this);
        b1.setBounds(90,180,50,50);
        jfr.add(b1);
        b2=new JButton("2");
        b2.addActionListener(this);
        b2.setBounds(150,180,50,50);
        jfr.add(b2);
        b3=new JButton("3");
        b3.addActionListener(this);
        b3.setBounds(210,180,50,50);
        jfr.add(b3);
        bd=new JButton("/");
        bd.addActionListener(this);
        bd.setBounds(30,240,50,50);
        jfr.add(bd);
        bdot=new JButton(".");
        bdot.addActionListener(this);
        bdot.setBounds(150,240,50,50);
        jfr.add(bdot);
        b0=new JButton("0");
        b0.addActionListener(this);
        b0.setBounds(90,240,50,50);
        jfr.add(b0);
        bclear=new JButton("C");
        bclear.addActionListener(this);
        bclear.setBounds(210,240,50,50);
        jfr.add(bclear);
        beq=new JButton("=");
        beq.addActionListener(this);
        beq.setBounds(30,310,150,70);
        jfr.add(beq);
        jfr.setVisible(true);
     }
    public void actionPerformed(ActionEvent e)
    {
        String s=e.getActionCommand();
        char ch=s.charAt(0);
        if(ch>='0'&&ch<='9'||ch=='.')
        {
            if(s1.equals(""))
            {
                s0=s0+ch;
            }
            else
            s2=s2+ch;
            jt.setText(s0+s1+s2);
        }
        else if(ch=='+'||ch=='-'||ch=='*'||ch=='/')
        {
            s1=s1+ch;
            jt.setText(s0+s1+s2);
        }
        else if(ch=='C')
        {
            s1=s2=s0="";
            jt.setText("");
        }
        else if(ch=='=')
        {
            double t;
            if(s1.equals("+"))
            {
                t=Double.parseDouble(s0)+Double.parseDouble(s2);}
                else if(s1.equals("/"))
                {
                    t=Double.parseDouble(s0)/Double.parseDouble(s2);
                }
                else if(s1.equals("*"))
                {t=Double.parseDouble(s0)*Double.parseDouble(s2);}
                else
                {
                    t=Double.parseDouble(s0)-Double.parseDouble(s2);
                }
                s0=String.valueOf(t);
                jt.setText(String.valueOf(t));
        }}
    public static void main(String[] args) {
        {
            SwingUtilities.invokeLater(new Runnable()
            {
                public void run()
                {
                    new swingger();
                }
            });
        }
    }
}

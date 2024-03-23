import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class paulu extends JFrame implements ActionListener  {
    JFrame jfr;
    JTextField jt;
    JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9;
    JButton badd,bsub,bmul,bdiv,beq,bclear,bdot;
    String s0,s1,s2;
    paulu(){
        s0=s1=s2="";
        jfr=new JFrame("Calculator");
        jfr.getContentPane().setLayout(null);
        jfr.getContentPane().setBackground(Color.red);
        jfr.setSize(400,400);
        jfr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jt=new JTextField();
        jt.setBounds(25,5,300,50);
        jfr.add(jt);
        //add button to frame
        badd=new JButton("+");
        badd.setBounds(30,60,50,50);
        badd.addActionListener(this);
        jfr.add(badd);

        bsub=new JButton("-");
        bsub.setBounds(90,60,50,50);
        bsub.addActionListener(this);
        jfr.add(bsub);

        bmul=new JButton("*");
        bmul.setBounds(150,60,50,50);
        bmul.addActionListener(this);
        jfr.add(bmul);

        bdiv=new JButton("/");
        bdiv.setBounds(210,60,50,50);
        bdiv.addActionListener(this);
        jfr.add(bdiv);


        bdot=new JButton(".");
        bdot.setBounds(270,60,50,50);
        bdot.addActionListener(this);
        jfr.add(bdot);

        b0=new JButton("0");
        b0.setBounds(30,120,50,50);
        b0.addActionListener(this);
        jfr.add(b0);

        b1=new JButton("1");
        b1.setBounds(90,120,50,50);
        b1.addActionListener(this);
        jfr.add(b1);

        b2=new JButton("2");
        b2.setBounds(150,120,50,50);
        b2.addActionListener(this);
        jfr.add(b2);

        b3=new JButton("3");
        b3.setBounds(210,120,50,50);
        b3.addActionListener(this);
        jfr.add(b3);

        b4=new JButton("4");
        b4.setBounds(270,120,50,50);
        b4.addActionListener(this);
        jfr.add(b4);

        b5=new JButton("5");
        b5.setBounds(30,180,50,50);
        b5.addActionListener(this);
        jfr.add(b5);

        b6=new JButton("6");
        b6.setBounds(90,180,50,50);
        b6.addActionListener(this);
        jfr.add(b6);

        b7=new JButton("7");
        b7.setBounds(150,180,50,50);
        b7.addActionListener(this);
        jfr.add(b7);

        b8=new JButton("8");
        b8.setBounds(210,180,50,50);
        b8.addActionListener(this);
        jfr.add(b8);

        b9=new JButton("9");
        b9.setBounds(270,180,50,50);
        b9.addActionListener(this);
        jfr.add(b9);

        beq=new JButton("Result");
        beq.setBounds(120,240,100,50);
        beq.addActionListener(this);
        jfr.add(beq);

        jfr.setVisible(true);

        
    }
    public void actionPerformed(ActionEvent e){
        String s=e.getActionCommand();
        char ch=s.charAt(0);
        if(ch>='0' && ch<='9' || ch=='.'){
            if(s1.equals("")){
                s0=s0+ch;
            }
            else{
                s2=s2+ch;}
                jt.setText(s0+s1+s2);
            
        }
        else if(ch=='+' || ch=='-' || ch=='*' || ch=='/'){
            s1=s1+ch;
            jt.setText(s0+s1+s2);
        }
        // else if(ch=='C'){
        //     s0=s1=s2="";
        //     jt.setText("");
        // }
        else if(s.equalsIgnoreCase("Result")){
            double t;
            if(s1.equals("+")){
                t=Double.parseDouble(s0)+Double.parseDouble(s2);
            }
            else if(s1.equals("/")){
                t=Double.parseDouble(s0)/Double.parseDouble(s2);
            }
            else if(s1.equals("*")){
                t=Double.parseDouble(s0)*Double.parseDouble(s2);
            }
            else{
                t=Double.parseDouble(s0)-Double.parseDouble(s2);
            }
            jt.setText(String.valueOf(t));
            
        }


    }
    public static void main(String[] args) 
    {
        SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                new paulu();
            }
        });
    }
}

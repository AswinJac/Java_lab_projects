import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Counter extends JFrame implements ActionListener {
    private int count = 0;
    private JLabel countLabel;

    public Counter() {
        setTitle("Counter");
        setSize(320, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.red);
        setLayout(null);

        JLabel titleLabel = new JLabel("Counter");
        titleLabel.setForeground(Color.green);
        titleLabel.setBounds(30, 25, 300, 50);
        add(titleLabel);

        countLabel = new JLabel("0");
        countLabel.setFont(new Font("Arial", Font.BOLD, 24));
        countLabel.setBounds(100, 25, 300, 50);
        add(countLabel);

        JButton addButton = new JButton("Add");
        addButton.setBounds(30, 70, 80, 30);
        addButton.setFocusable(false);
        addButton.addActionListener(this);
        add(addButton);

        JButton negateButton = new JButton("Negate");
        negateButton.setBounds(140, 70, 110, 30);
        negateButton.setFocusable(false);
        negateButton.addActionListener(this);
        add(negateButton);

        JButton resetButton = new JButton("Reset");
        resetButton.setBounds(80, 110, 80, 30);
        resetButton.setFocusable(false);
        resetButton.addActionListener(this);
        add(resetButton);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        String command = ae.getActionCommand();

        if (command.equalsIgnoreCase("Add")) {
            count++;
        } else if (command.equalsIgnoreCase("Negate")) {
            count--;
        } else if (command.equalsIgnoreCase("Reset")) {
            count = 0;
        }

        countLabel.setText(String.valueOf(count));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Counter::new);
    }
}

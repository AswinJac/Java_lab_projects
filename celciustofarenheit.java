import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class CelsiusToFahrenheitConverter extends JFrame implements ActionListener {
    private JTextField celsiusField;
    private JTextField fahrenheitField;
    private JButton convertButton;

    public CelsiusToFahrenheitConverter() {
        setTitle("Celsius to Fahrenheit Converter");
        setSize(390, 300);
        setLayout(null);
        getContentPane().setBackground(Color.gray);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel celsiusLabel = new JLabel("Enter temperature in Celsius:");
        celsiusLabel.setBounds(30, 10, 300, 30);
        add(celsiusLabel);

        celsiusField = new JTextField();
        celsiusField.setBounds(40, 50, 300, 30);
        add(celsiusField);

        JLabel fahrenheitLabel = new JLabel("Temperature in Fahrenheit:");
        fahrenheitLabel.setBounds(30, 90, 300, 30);
        add(fahrenheitLabel);

        fahrenheitField = new JTextField();
        fahrenheitField.setBounds(40, 130, 300, 30);
        fahrenheitField.setEditable(false);
        add(fahrenheitField);

        convertButton = new JButton("CONVERT");
        convertButton.setFocusable(false);
        convertButton.addActionListener(this);
        convertButton.setBounds(110, 170, 120, 50);
        add(convertButton);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == convertButton) {
            try {
                double celsius = Double.parseDouble(celsiusField.getText());
                double fahrenheit = (celsius * 9 / 5) + 32;
                fahrenheitField.setText(String.valueOf(fahrenheit));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Invalid input. Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(CelsiusToFahrenheitConverter::new);
    }
}

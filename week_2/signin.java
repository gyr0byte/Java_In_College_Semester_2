import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class signin {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Signup Form");
        JLabel label = new JLabel();
        JLabel emailLabel = new JLabel();
        JLabel passLabel = new JLabel();
        JButton button = new JButton("Sign Up");
        frame.setResizable(false);
        frame.setSize(500, 500);
        frame.setLayout(null);

        label.setText("Username: ");
        label.setBounds(50, 50, 100, 30);
        label.setFont(new Font("Arial", Font.BOLD, 14));

        emailLabel.setText("Email: ");
        emailLabel.setBounds(50, 100, 100, 30);

        passLabel.setText("Password: ");
        passLabel.setBounds(50, 160, 100, 30);

        JTextField nameField = new JTextField();
        nameField.setBounds(150, 50, 200, 30);
        JTextField emailField = new JTextField();
        emailField.setBounds(150,110,200,30);
        JTextField passField = new JTextField();
        passField.setBounds(150,160,200,30);

       
        button.setBounds(200,250, 100,30);
        button.setFocusable(false);

        frame.add(button);
        frame.add(passField);
        frame.add(passLabel);
        frame.add(emailField);
        frame.add(emailLabel);
        frame.add(nameField);
        frame.getContentPane().setBackground(new Color(123, 50, 250));
        frame.add(label);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
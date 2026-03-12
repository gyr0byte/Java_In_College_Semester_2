
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class design {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(800, 800);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(40, 80, 420, 320);

        Border border = BorderFactory.createLineBorder(Color.BLACK);

        JLabel emailLabel = new JLabel();
        emailLabel.setText("Email: ");
        emailLabel.setBounds(50, 100, 100, 30);
        JLabel gender = new JLabel("Gender ");
        gender.setBounds(50, 150, 100, 30);

        JTextField emailField = new JTextField();
        emailField.setBounds(150, 110, 200, 30);
        JTextField genderField = new JTextField();

        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");

        ButtonGroup group = new ButtonGroup();
        group.add(male);
        group.add(female);

        panel.add(gender);
        panel.add(genderField);
        panel.add(male);
        panel.add(female);
        panel.add(emailField);
        panel.add(emailLabel);
        panel.setBorder(border);
        frame.add(panel);
        frame.setVisible(true);
    }
}

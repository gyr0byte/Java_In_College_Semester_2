
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
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
        panel.setBounds(40, 80, 420, 350);
        panel.setBackground(Color.gray);


        Border border = BorderFactory.createLineBorder(Color.BLACK);

        JLabel emailLabel = new JLabel();
        emailLabel.setText("Email: ");
        emailLabel.setBounds(50, 100, 100, 30);
        JLabel gender = new JLabel("Gender ");
        gender.setBounds(50, 150, 100, 30);
        JLabel placeLabel = new JLabel("Place");
        placeLabel.setBounds(50, 190, 100, 30);
        panel.add(placeLabel);

        JTextField emailField = new JTextField();
        emailField.setBounds(150, 110, 200, 30);

        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");
        male.setBounds(150, 150, 80, 30);
        female.setBounds(250, 150, 80, 30);

        ButtonGroup group = new ButtonGroup();
        group.add(male);
        group.add(female);

        String[] places = { "Itahari", "Damak", "Biratnagar", "Dharan" };
        JComboBox<String> placeComboBox = new JComboBox<>(places);
        placeComboBox.setBounds(150, 190, 200, 30);

        JTextArea text = new JTextArea();
        text.setBounds(180, 240, 120, 30);
        JButton submit = new JButton("Submit");
        submit.setBounds(180, 290, 120, 30);

        panel.add(text);
        panel.add(submit);
        panel.add(placeComboBox);
        panel.add(gender);
        panel.add(male);
        panel.add(female);
        panel.add(emailField);
        panel.add(emailLabel);
        panel.setBorder(border);
        frame.add(panel);
        frame.setVisible(true);
    }
}

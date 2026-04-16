import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;


public class ExceptionandFileHandling {

    public static void main(String[] args) {
        //ArrayList<Student> students = new ArrayList<>();

        JFrame frame = new JFrame("Student Management System");


        // add button display
        JButton displayButton = new JButton("Display Students");
        displayButton.setBounds(50, 250, 150, 30);
        frame.add(displayButton);

        displayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        // load from file button
        JButton loadButton = new JButton("Load from File");
        loadButton.setBounds(50, 300, 150, 30);
        frame.add(loadButton);

        loadButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });

        // save to file button
        JButton saveButton = new JButton("Save to File");
        saveButton.setBounds(50, 350, 150, 30);
        frame.add(saveButton);

        // save to file action (method)
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
        frame.setVisible(true);

    }
}
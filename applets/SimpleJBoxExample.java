package applets;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class SimpleJBoxExample {

    public static void createAndShowGUI() {
        // Create the frame
        JFrame frame = new JFrame("Simple JBox Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Create a panel
        JPanel panel = new JPanel();
        
        // Create a vertical Box
        Box box = Box.createVerticalBox();
        
        // Add components to the Box
        box.add(new JLabel("Label 1"));
        box.add(Box.createVerticalStrut(10)); // A spacer between components
        box.add(new JButton("Button 1"));
        box.add(Box.createVerticalStrut(10)); // Another spacer
        box.add(new JLabel("Label 2"));
        box.add(Box.createVerticalStrut(10)); // Another spacer
        box.add(new JButton("Button 2"));

        // Add the Box to the panel
        panel.add(box);
        
        // Add the panel to the frame
        frame.add(panel);

        // Display the frame
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // Schedule a job for the event-dispatching thread:
        // creating and showing this application's GUI.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}


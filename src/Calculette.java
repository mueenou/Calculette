import javax.swing.*;
import java.awt.*;

public class Calculette {
    public static void main(String args[]) {
        JFrame window = new JFrame("frame1");
        window.setSize(600, 600);
        // JButton b1 = new JButton("OK");
        JPanel mainPanel = new JPanel();
        window.add(mainPanel);
        mainPanel.setLayout(new GridLayout(3, 1));
        mainPanel.add();
        // FlowLayout layout = new FlowLayout();
        // mainPanel.setLayout(new FlowLayout());
        window.repaint();
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

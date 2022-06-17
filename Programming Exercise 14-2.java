import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class JFrameDisableButton extends JFrame implements ActionListener {
    final int SIZE = 180;
    Container con = getContentPane();
    JButton button = new JButton("Press Me");
    int count = 0;
    final int MAX = 8;
    JLabel label = new JLabel("That's enough!");

    public JFrameDisableButton() {

        super("Frame");
        setSize(SIZE, SIZE);
        con.setLayout(new FlowLayout());
        add(button);
        add(label);
        button.addActionListener(this);
        label.setVisible(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        count++;
        if (count >= MAX) {
            button.setEnabled(false);
            label.setVisible(true);
        }
    }

    public static void main(String[] args) {
        JFrameDisableButton frame = new JFrameDisableButton();
        frame.setVisible(true);
    }
}
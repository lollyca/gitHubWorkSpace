import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JBookQuote extends JFrame implements ActionListener{
   FlowLayout flow = new FlowLayout();
   JLabel msg1 = new  JLabel("To begin with,");
   JLabel msg2 = new JLabel("Marley was dead.");
   JButton button = new JButton("Click for source");
   JLabel msg3 = new JLabel();
   String title = "**    A Christmas Carol    **";
    public JBookQuote() {
   
        add(msg1);
        add(msg2);
        add(msg3);
        add(button);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
      String bookTitle = title;
      msg3.setText(bookTitle);
    }

    public static void main(String[] args) {
        JBookQuote aFrame = new JBookQuote();
        aFrame.setSize(300, 150);
        aFrame.setVisible(true);
    }
}

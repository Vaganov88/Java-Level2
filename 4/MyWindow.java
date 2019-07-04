import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame {

    JTextArea textArea;
    JTextField textMassage;

    public MyWindow() {
        setTitle("Main"); //name
        setBounds(800, 300, 400, 400); // window size and location
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel centerPanel = new JPanel(); // window devided on two panels, this is top
        add(centerPanel, BorderLayout.CENTER);
        centerPanel.setBackground(Color.gray);
        centerPanel.setLayout(new BorderLayout());

        JPanel bottonPanel = new JPanel(); // window devided on two panels, this is bottom
        add(bottonPanel, BorderLayout.SOUTH);
        bottonPanel.setBackground(Color.darkGray);
        bottonPanel.setPreferredSize(new Dimension(1, 40));
        bottonPanel.setLayout(new BorderLayout());

//        JButton startButton = new JButton("Start");
//        bottonPanel.add(startButton);
//        startButton.addActionListener(new ButtonAction());

        JButton startButton = new JButton("Send message"); //added a button
        bottonPanel.add(startButton, BorderLayout.EAST);

        textArea = new JTextArea(); // big text area
        JScrollPane textAreaScroll = new JScrollPane(textArea); // scroll text
        centerPanel.add(textAreaScroll, BorderLayout.CENTER);
        textArea.setEditable(false);

        textMassage = new JTextField();
        bottonPanel.add(textMassage, BorderLayout.CENTER);

        startButton.addActionListener(new ActionListener() { // activating button via anonymous class
            @Override
            public void actionPerformed(ActionEvent e) {
                addText();
            }
        });

        textMassage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addText();
            }
        });

        setVisible(true);
    }
    void addText() {
        textArea.append(textMassage.getText()+"\n");
        textMassage.setText("");
    }
}
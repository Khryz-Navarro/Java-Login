import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class WelcomePage extends JFrame {

    JFrame frame = new JFrame("Welcome");
    JLabel welcomeLabel = new JLabel("Admin");
    JButton logoutButton = new JButton("Logout");

    WelcomePage(String username){

        welcomeLabel.setBounds(0,0,300,35);
        welcomeLabel.setFont(new Font(null,Font.PLAIN,25));
        welcomeLabel.setText("Welcome " + username);

        logoutButton.setBounds(135,150,150,40);
        logoutButton.setFont(new Font(null,Font.PLAIN,25));
        logoutButton.setFocusable(false);

        frame.add(welcomeLabel);
        frame.add(logoutButton);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
//    @Override public void actionPerformed(ActionEvent e) {
//
//    }
}

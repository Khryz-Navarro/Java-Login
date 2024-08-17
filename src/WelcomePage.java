import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class WelcomePage extends JFrame implements ActionListener {

    JFrame frame = new JFrame("Welcome");
    JLabel welcomeLabel = new JLabel("Admin");
    JButton logoutButton = new JButton("Logout");

    WelcomePage(String username){

        welcomeLabel.setBounds(0,30,400,35);
        welcomeLabel.setFont(new Font(null,Font.PLAIN,18));
        welcomeLabel.setText(username);

        logoutButton.setBounds(135,150,150,40);
        logoutButton.setFont(new Font(null,Font.PLAIN,25));
        logoutButton.setFocusable(false);
        logoutButton.addActionListener(this);

        frame.add(welcomeLabel);
        frame.add(logoutButton);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);




    }
     @Override
     public void actionPerformed(ActionEvent e) {
         if(e.getSource() == logoutButton){
             frame.dispose();
             IDandPsswords idandPsswords = new IDandPsswords();
             LoginPage login = new LoginPage(idandPsswords.getLoginInfo());
         }
    }
}


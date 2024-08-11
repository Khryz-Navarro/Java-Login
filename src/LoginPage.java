import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.HashMap;


public class LoginPage implements ActionListener {
//        adds window
        JFrame frame = new JFrame("Login");
        JTextField usernameID = new JTextField();
        JPasswordField passwordID = new JPasswordField();
        JLabel usernameLabel = new JLabel("Username:");
        JLabel passwordLabel = new JLabel("Password:");
        JButton loginButton = new JButton("Login");
        JLabel messageLabel = new JLabel();
        HashMap<String,String> logininfo = new HashMap<String,String>();

    LoginPage(HashMap<String,String> loginInfoOriginal){

        logininfo = loginInfoOriginal;

        int x = 50;
        int y = 30;

//      usernameLabel
        usernameLabel.setBounds(x, y, 200, 40);
        usernameLabel.setFont(new Font("Serif", Font.PLAIN, 25));

//      username text field
        usernameID.setBounds(200, 30,250,40);
        usernameID.setFont(new Font("Serif", Font.PLAIN, 20));

//      password label
        passwordLabel.setBounds(50, 90, 200, 40);
        passwordLabel.setFont(new Font("Serif", Font.PLAIN, 25));

//      password text field
        passwordID.setBounds(200, 90, 250, 40);
        passwordID.setFont(new Font("Serif", Font.BOLD, 20));


        messageLabel.setBounds(180, 200, 450, 35);
	    messageLabel.setFont(new Font(null,Font.ITALIC,25));

//      Login button
        loginButton.setBounds(270, 150, 100, 40);
        loginButton.setFocusable(false);
        loginButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
        loginButton.addActionListener(this);


//      add frame

        frame.add(usernameLabel);
        frame.add(usernameID);
        frame.add(passwordLabel);
        frame.add(passwordID);
        frame.add(loginButton);
        frame.add(messageLabel);

        frame.setSize(600, 300);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
        @Override
        public void actionPerformed(ActionEvent e) {

        if(e.getSource() == loginButton){
            
            String username = usernameID.getText();
            String password = String.valueOf(passwordID.getPassword());


            if(logininfo.containsKey(username)) {
                if(logininfo.get(username).equals(password)) {
                        messageLabel.setForeground(Color.green);
                        messageLabel.setText("Login successful");
                        frame.dispose();
                        WelcomePage welcomePage = new WelcomePage(username);
                }
                else {
                        messageLabel.setForeground(Color.red);
                        messageLabel.setText("Wrong password or Username!");
                }

        }
        else {
                messageLabel.setForeground(Color.red);
                messageLabel.setText("username not found!");

                        }
                }
        }
}






import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginFrame extends JFrame {

    Container c;
    JLabel userLabel, passLabel;
    JTextField userField;
    JPasswordField passField;
    JButton loginButton;

    LoginFrame() {
        setTitle("Login Form");
        setSize(500, 300);
        setLocation(700,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setResizable(true);

        c = getContentPane();
        c.setLayout(null);

        userLabel = new JLabel("Username");
        passLabel = new JLabel("Password");

        userLabel.setBounds(40,50,100,30);
        passLabel.setBounds(40,100,100,30);

        c.add(userLabel);
        c.add(passLabel);

        userField = new JTextField();
        userField.setBounds(120,50,200,30);
        c.add(userField);

        passField = new JPasswordField();
        passField.setBounds(120,100,200,30);
        c.add(passField);

        loginButton = new JButton("Login");
        loginButton.setBounds(120,150,70,30);
        c.add(loginButton);

        setVisible(true);



    }

    public static void main(String[] args) {
        LoginFrame frame = new LoginFrame();
    }
}

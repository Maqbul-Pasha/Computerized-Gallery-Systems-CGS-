import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame{
    private JLabel username_label;
    private JTextField username_textField;
    private JLabel password_label;
    private JPasswordField passwordField;
    private JButton btnExit;
    private JButton btnLogin;
    private JPanel loginPanel;

    public Login() {

        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(username_textField.getText().equals("admin") && passwordField.getText().equals("123")){
//                    JOptionPane.showMessageDialog(btnLogin,"Welcome Admin");
                    MainForm_CGS mf = new MainForm_CGS();
                    mf.setContentPane(mf.mainPanel);
                    mf.setVisible(true);
                }
                else {
                    JOptionPane.showMessageDialog(btnLogin,"Error! Credentials are incorrect!");
                }
            }
        });
        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        Login login = new Login();
        login.setContentPane(login.loginPanel);
        login.setTitle("Simple GUI");
        login.setSize(300,400);
        login.setVisible(true);
        login.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
    }
}


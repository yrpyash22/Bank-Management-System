package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;


// extend java frame
// implement Action listener on button events
public class Login extends JFrame implements ActionListener {



    // Some global attributes

    JLabel label1, label2, label3;
    JTextField textField1;
    JPasswordField passField1;
    JButton btn1 , btn2, btn3;


    // constructor of login class
    Login()
    {
        // to show topic upper line of frame
        super("Bank Management System");

        // Set the images on screen
        // [ img-1 ]
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icon/banklogo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100 , Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350, 10, 100 , 100);
        add(image);

        // [ img-2 ]
        ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("Icon/card.jpg"));
        Image ii2 = ii1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon ii3 = new ImageIcon(ii2);
        JLabel iimage = new JLabel(ii3);
        iimage.setBounds(630, 350, 100 , 100);
        add(iimage);


        // Outpur text on screen

        // [ 1- text ]
        label1 = new JLabel("WELCOME TO ATM");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("AvantGarde", Font.BOLD, 38));
        label1.setBounds(230, 125, 450 , 40);
        add(label1);

        // [ 2- text ]
        label2 = new JLabel("CARD No: ");
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("Ralway", Font.BOLD, 28));
        label2.setBounds(150, 190, 375, 30);
        add(label2);

        // [ 3- text ]
        label3 = new JLabel("PIN: ");
        label3.setForeground(Color.WHITE);
        label3.setFont(new Font("Ralway", Font.BOLD, 28));
        label3.setBounds(150, 250, 375, 30);
        add(label3);


        // input text on screen

        // [ 1 - input]
        textField1 = new JTextField(15);
        textField1.setBounds(325, 190, 230, 30);
        textField1.setFont(new Font("Arial", Font.BOLD, 14));
        add(textField1);

        // [ 2 - input]
        passField1 = new JPasswordField(15);
        passField1.setBounds(325, 250, 230,30);
        passField1.setFont(new Font("Arial", Font.BOLD, 14));
        add(passField1);



        // Add button on screen

        // [1 - button ]
        btn1 = new JButton("Sign In");
        btn1.setFont(new Font("Arial", Font.BOLD, 14));
        btn1.setBackground(Color.black);
        btn1.setForeground(Color.white);
        btn1.setBounds(325, 300, 100, 30);
        btn1.addActionListener(this);
        add(btn1);

        // [2 - button ]
        btn2 = new JButton("Clear");
        btn2.setFont(new Font("Arial", Font.BOLD, 14));
        btn2.setBackground(Color.black);
        btn2.setForeground(Color.white);
        btn2.setBounds(450, 300, 100, 30);
        btn2.addActionListener(this);
        add(btn2);

        // [3 - button ]
        btn3 = new JButton("Sign up");
        btn3.setFont(new Font("Arial", Font.BOLD, 14));
        btn3.setBackground(Color.black);
        btn3.setForeground(Color.white);
        btn3.setBounds(325, 350, 225, 30);
        btn3.addActionListener(this);
        add(btn3);





        // [ img-3 ] BackGround image
        ImageIcon bi1 = new ImageIcon(ClassLoader.getSystemResource("Icon/background.jpg"));
        Image bi2 = bi1.getImage().getScaledInstance(850, 480, Image.SCALE_DEFAULT);
        ImageIcon bi3 = new ImageIcon(bi2);
        JLabel bimage = new JLabel(bi3);
        bimage.setBounds(0, 0, 850 , 480);
        add(bimage);



        // createLevel screen
        setLayout(null);
        setSize(850, 480);
        setLocation(450, 200);
//        setUndecorated(true);
        setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent ae) {
        try{
            if(ae.getSource() == btn1) {
                DBConnection c = new DBConnection();
                String cardNo = textField1.getText();
                String pin = passField1.getText();
                String q = "select * from login where card_number = '"+cardNo+"' and pin = '"+pin+"' ";
                ResultSet resultSet = c.statement.executeQuery(q);
                if(resultSet.next())
                {
                    setVisible(false);
                    new Main_Class(pin);
                }else {
                    JOptionPane.showMessageDialog(null, "Incorrect Card Number Or Pin");
                }


            } else if (ae.getSource() == btn2) {
                textField1.setText("");
                passField1.setText("");
            } else if (ae.getSource() == btn3) {
                new Signup();
                setVisible(false);
            }
        }catch (Exception e)
        {
            e.printStackTrace();      // error to be visible
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}

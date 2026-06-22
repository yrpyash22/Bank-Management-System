package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Deposit extends JFrame implements ActionListener {

    String pin;
    JTextField textField;
    JButton b1, b2;

    Deposit(String pin)
    {
        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icon/atmmachine.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1550,830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1550, 830);
        add(l3);



        JLabel label1 = new JLabel("ENTER AMOUNT YOU WANT TO DEPOSIT");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("System", Font.BOLD, 16));
        label1.setBounds(460, 180, 400, 35);
        l3.add(label1);

        textField = new JTextField();
        textField.setBackground(new Color(11, 31, 31));
        textField.setForeground(Color.WHITE);
        textField.setBounds(460,230,320,25);
        textField.setFont(new Font("System", Font.BOLD, 22));
        l3.add(textField);


        b1 = new JButton("DEPOSITE");
        b1.setBounds(700,362,150,35);
        b1.setBackground(new Color(65, 125, 128));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        l3.add(b1);


        b2 = new JButton("BACK");
        b2.setBounds(700,406,150,35);
        b2.setBackground(new Color(65, 125, 128));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        l3.add(b2);


        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        try{
            String amount = textField.getText();
            Date date = new Date();
            if(e.getSource() == b1)
            {
                if(textField.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "PLease enter the Amount you want to Deposit!");
                }else {
                    DBConnection c = new DBConnection();
                    String q1 = "insert into bank values('"+pin+"', '"+date+"','Deposit', '"+amount+"' )";
                    c.statement.executeUpdate(q1);
                    JOptionPane.showMessageDialog(null, "Rs: "+amount+ " Deposited Successfully");
                    setVisible(false);
                    new Main_Class(pin);

                }
            } else if (e.getSource() == b2) {
                setVisible(false);
                new Main_Class(pin);

            }
        } catch (Exception E) {
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Deposit("");
    }


}

package bank.management.system;



import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;


public class Signup  extends JFrame implements ActionListener {


    //
    JDateChooser dateChooser;
    JTextField textName, textFname, textEmail, textAdd, textCity, textPinC, textState ,textCon;
    JRadioButton r1, r2, r3;
    JRadioButton  m1, m2, m3;

    JButton next;

    // generate random no. for forms
    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) + 1000L;
    String formNo = " " + Math.abs(first4);





    Signup()
    {
        super("Applicatiion Form Of Bank");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icon/banklogo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100 , Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25, 10, 100 , 100);
        add(image);



        JLabel label1 = new JLabel("Application Form No. "+ formNo);
        label1.setBounds(160, 20, 600, 40);
        label1.setFont(new Font("Raleway" , Font.BOLD , 38));
        add(label1);


        JLabel label2 = new JLabel("Page 1");
        label2.setFont(new Font("Raleway", Font.BOLD, 20));
        label2.setBounds(330, 65, 600, 30);
        add(label2);


        JLabel labelLine = new JLabel("--------------------------------------------------------------------------------------------------------");
        labelLine.setFont(new Font("Raleway", Font.BOLD, 25));
        labelLine.setBounds(0 , 95 , 10000, 30);
        add(labelLine);

        JLabel label3 = new JLabel(" Personal Details ->");
        label3.setFont(new Font("Raleway", Font.BOLD, 25));
        label3.setBounds(300 , 120 , 600, 30);
        add(label3);






        JLabel labelName = new JLabel("Name: ");
        labelName.setFont(new Font("Raleway", Font.BOLD , 22));
        labelName.setBounds(100 , 190 , 100, 30);
        add(labelName);

        textName = new JTextField();
        textName.setFont(new Font("Raleway", Font.BOLD, 20));
        textName.setBounds(300, 190 ,400, 30);
        add(textName);


        JLabel labelFName = new JLabel("Father Name: ");
        labelFName.setFont(new Font("Raleway", Font.BOLD , 22));
        labelFName.setBounds(100 , 240 , 200, 30);
        add(labelFName);

        textFname = new JTextField();
        textFname.setFont(new Font("Raleway", Font.BOLD, 20));
        textFname.setBounds(300, 240 ,400, 30);
        add(textFname);





        JLabel DOB = new JLabel("Date Of Birth: ");
        DOB.setFont(new Font("Raleway", Font.BOLD , 20));
        DOB.setBounds(100 , 340 , 200, 30);
        add(DOB);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105,105, 105));
        dateChooser.setBounds(300, 340, 200, 30);
        add(dateChooser);



        JLabel labelG = new JLabel("Gender: ");
        labelG.setFont(new Font("Raleway", Font.BOLD , 20));
        labelG.setBounds(100, 290, 200, 30);
        add(labelG);


        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Ralewey", Font.BOLD, 14));
        r1.setBackground(new Color(222, 255, 228));
        r1.setBounds(300, 290, 60, 30);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Ralewey", Font.BOLD, 14));
        r2.setBackground(new Color(222, 255, 228));
        r2.setBounds(450, 290, 90, 30);
        add(r2);

        r3 = new JRadioButton("Other");
        r3.setFont(new Font("Ralewey", Font.BOLD, 14));
        r3.setBackground(new Color(222, 255, 228));
        r3.setBounds(630, 290, 70, 30);
        add(r3);


        ButtonGroup btnGroup = new ButtonGroup();
        btnGroup.add(r1);
        btnGroup.add(r2);
        btnGroup.add(r3);



        JLabel labelEmail = new JLabel("Email Address : ");
        labelEmail.setFont(new Font("Ralewey", Font.BOLD, 20));
        labelEmail.setBounds(100, 390, 200, 30);
        add(labelEmail);

        textEmail = new JTextField();
        textEmail.setFont(new Font("Raleway", Font.BOLD, 14));
        textEmail.setBounds(300, 390 ,400, 30);
        add(textEmail);



        JLabel labelMs = new JLabel("Marital Status: ");
        labelMs.setFont(new Font("Ralewey", Font.BOLD, 20));
        labelMs.setBounds(100, 440, 200, 30);
        add(labelMs);

        m1 = new JRadioButton("Married");
        m1.setBounds(300, 440, 100, 30);
        m1.setBackground(new Color(222, 255, 228));
        m1.setFont(new Font("Raleway", Font.BOLD, 14));
        add(m1);

        m2 = new JRadioButton("Unmarried");
        m2.setBounds(450, 440, 100, 30);
        m2.setBackground(new Color(222, 255, 228));
        m2.setFont(new Font("Raleway", Font.BOLD, 14));
        add(m2);

        m3 = new JRadioButton("Other");
        m3.setBounds(635, 440, 100, 30);
        m3.setBackground(new Color(222, 255, 228));
        m3.setFont(new Font("Raleway", Font.BOLD, 14));
        add(m3);

        ButtonGroup btnGroup2 = new ButtonGroup();
        btnGroup2.add(m1);
        btnGroup2.add(m2);
        btnGroup2.add(m3);




        JLabel labelAdd = new JLabel("Address : ");
        labelAdd.setFont(new Font("Ralewey", Font.BOLD, 20));
        labelAdd.setBounds(100, 490, 200, 30);
        add(labelAdd);

        textAdd = new JTextField();
        textAdd.setFont(new Font("Raleway", Font.BOLD, 14));
        textAdd.setBounds(300, 490 ,400, 30);
        add(textAdd);


        JLabel labelCity = new JLabel("City : ");
        labelCity.setFont(new Font("Ralewey", Font.BOLD, 20));
        labelCity.setBounds(100, 540, 200, 30);
        add(labelCity);

        textCity = new JTextField();
        textCity.setFont(new Font("Raleway", Font.BOLD, 14));
        textCity.setBounds(300, 540 ,400, 30);
        add(textCity);


        JLabel labelPinc = new JLabel("Pin Code : ");
        labelPinc.setFont(new Font("Ralewey", Font.BOLD, 20));
        labelPinc.setBounds(100, 590, 200, 30);
        add(labelPinc);

        textPinC = new JTextField();
        textPinC.setFont(new Font("Raleway", Font.BOLD, 14));
        textPinC.setBounds(300, 590 ,400, 30);
        add(textPinC);


        JLabel labelState = new JLabel("State : ");
        labelState.setFont(new Font("Ralewey", Font.BOLD, 20));
        labelState.setBounds(100, 640, 200, 30);
        add(labelState);

        textState = new JTextField();
        textState.setFont(new Font("Raleway", Font.BOLD, 14));
        textState.setBounds(300, 640 ,400, 30);
        add(textState);

        JLabel labelCon = new JLabel("Country : ");
        labelCon.setFont(new Font("Ralewey", Font.BOLD, 20));
        labelCon.setBounds(100, 690, 200, 30);
        add(labelCon);

        textCon = new JTextField();
        textCon.setFont(new Font("Raleway", Font.BOLD, 14));
        textCon.setBounds(300, 690 ,200, 30);
        add(textCon);





        next = new JButton("Next");
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBackground(Color.black);
        next.setForeground(Color.white);
        next.setBounds(620, 690, 80 , 30);
        next.addActionListener(this);
        add(next);










        getContentPane().setBackground(new Color(222, 255, 228));

        setLayout(null);
        setSize(850, 800);
        setLocation(360,40);
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent ae) {
        String formno = formNo;
        String name = textName.getText();
        String fname = textFname.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(r1.isSelected())
        {
            gender = "Male";
        } else if (r2.isSelected()) {
            gender = "Femali";
        } else if (r3.isSelected()) {
            gender = "Other";
        }
        String email = textEmail.getText();
        String marital = null;
        if(m1.isSelected())
        {
            marital = "Marride";
        } else if (m2.isSelected()) {
            marital = "Unmarride";
        } else if (m3.isSelected()) {
            marital = "Other";
        }

        String address = textAdd.getText();
        String city = textCity.getText();
        String pincode = textPinC.getText();
        String state = textState.getText();
        String contry = textCon.getText();

        try {
            if(textName.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null, "Fill all the fields");
            }else
            {
                DBConnection con1 = new DBConnection();
                String quary = "insert into signup values('"+formno+"', '"+name+"', '"+fname+"', '"+dob+"', '"+gender+"', '"+email+"', '"+marital+"', '"+address+"', '"+city+"', '"+pincode+"', '"+state+"','"+contry+"')";
                con1.statement.executeUpdate(quary);
                new Signup2(formno);
                setVisible(false);
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Signup();
    }
}

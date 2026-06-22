package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup2 extends JFrame implements ActionListener {

    JComboBox comboBox, comboBox2, comboBox3, comboBox4, comboBox5;
    JTextField textPan, textAdhar;
    JRadioButton r1,r2 ,e1, e2;
    JButton next;
    String formno;

    Signup2(String formno)
    {
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icon/banklogo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150, 5, 100, 100);
        add(image);

        this.formno = formno;

        JLabel l1 = new JLabel("Page 2:-");
        l1.setFont(new Font("Raleway", Font.BOLD, 22));
        l1.setBounds(300, 30, 600, 40);
        add(l1);

        JLabel l2 = new JLabel("Additonal Details");
        l2.setFont(new Font("Raleway", Font.BOLD, 22));
        l2.setBounds(300, 60, 600, 40);
        add(l2);


        JLabel l3 = new JLabel("Religion");
        l3.setFont(new Font("Raleway", Font.BOLD, 18));
        l3.setBounds(100, 140, 100, 30);
        add(l3);

        String religion[] = {"Hindu", "Yahudi", "Sikh", "Issai", "Christian", "Muslim", "Other"};
        comboBox = new JComboBox(religion);
        comboBox.setBackground(new Color(252, 208, 76));
        comboBox.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox.setBounds(350,140,320,30);
        add(comboBox);


        JLabel l4 = new JLabel("Category : ");
        l4.setFont(new Font("Raleway", Font.BOLD, 18));
        l4.setBounds(100, 190, 100, 30);
        add(l4);

        String categoey[] = {"General", "OBC", "SC", "ST", "PWD", "Other"};
        comboBox2 = new JComboBox(categoey);
        comboBox2.setBackground(new Color(252, 208, 76));
        comboBox2.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox2.setBounds(350,190,320,30);
        add(comboBox2);


        JLabel l5 = new JLabel("Income : ");
        l5.setFont(new Font("Raleway", Font.BOLD, 18));
        l5.setBounds(100, 240, 100, 30);
        add(l5);

        String income[] = {"Null", "<1,50,000", "2,50,000", "5,00,000", "Upto 10,00,000", "Above 10,00,000"};
        comboBox3 = new JComboBox(income);
        comboBox3.setBackground(new Color(252, 208, 76));
        comboBox3.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox3.setBounds(350,240,320,30);
        add(comboBox3);


        JLabel l6 = new JLabel("Educational : ");
        l6.setFont(new Font("Raleway", Font.BOLD, 18));
        l6.setBounds(100, 290, 150, 30);
        add(l6);

        String education[] = {"Non-Graduate", "Graduate", "Post-Graduate", "Doctrate", "Engineering", "Other"};
        comboBox4 = new JComboBox(education);
        comboBox4.setBackground(new Color(252, 208, 76));
        comboBox4.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox4.setBounds(350,290,320,30);
        add(comboBox4);


        JLabel l7 = new JLabel("Occupation : ");
        l7.setFont(new Font("Raleway", Font.BOLD, 18));
        l7.setBounds(100, 340, 150, 30);
        add(l7);

        String occupation[] = {"Salaried", "Self-Employed","Govt-Employed" ,"Business", "Student", "Retired", "Other"};
        comboBox5 = new JComboBox(occupation);
        comboBox5.setBackground(new Color(252, 208, 76));
        comboBox5.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox5.setBounds(350,340,320,30);
        add(comboBox5);


        JLabel l8 = new JLabel("PAN Number : ");
        l8.setFont(new Font("Raleway", Font.BOLD, 18));
        l8.setBounds(100, 410, 150, 30);
        add(l8);

        textPan = new JTextField();
        textPan.setFont(new Font("Raleway", Font.BOLD, 18));
        textPan.setBounds(350,410,320,30);
        add(textPan);


        JLabel l9 = new JLabel("Aadhar Number : ");
        l9.setFont(new Font("Raleway", Font.BOLD, 18));
        l9.setBounds(100, 460, 180, 30);
        add(l9);

        textAdhar = new JTextField();
        textAdhar.setFont(new Font("Raleway", Font.BOLD, 18));
        textAdhar.setBounds(350,460,320,30);
        add(textAdhar);


        JLabel l10 = new JLabel("Senior Citizen : ");
        l10.setFont(new Font("Raleway", Font.BOLD, 18));
        l10.setBounds(100, 510, 180, 30);
        add(l10);

        r1 = new JRadioButton("Yes");
        r1.setFont(new Font("Raleway", Font.BOLD, 14));
        r1.setBackground(new Color(252, 208, 76));
        r1.setBounds(350, 510, 100, 30);
        add(r1);
        r2 = new JRadioButton("No");
        r2.setFont(new Font("Raleway", Font.BOLD, 14));
        r2.setBackground(new Color(252, 208, 76));
        r2.setBounds(460, 510, 100, 30);
        add(r2);
        ButtonGroup btnGroup1 = new ButtonGroup();
        btnGroup1.add(r1);
        btnGroup1.add(r2);


        JLabel l11 = new JLabel("Existing Account :");
        l11.setFont(new Font("Raleway", Font.BOLD, 18));
        l11.setBounds(100, 560, 180, 30);
        add(l11);

        e1 = new JRadioButton("Yes");
        e1.setFont(new Font("Raleway", Font.BOLD, 14));
        e1.setBackground(new Color(252, 208, 76));
        e1.setBounds(350, 560, 100, 30);
        add(e1);
        e2 = new JRadioButton("No");
        e2.setFont(new Font("Raleway", Font.BOLD, 14));
        e2.setBackground(new Color(252, 208, 76));
        e2.setBounds(460, 560, 100, 30);
        add(e2);
        ButtonGroup btnGroup2 = new ButtonGroup();
        btnGroup2.add(e1);
        btnGroup2.add(e2);


        JLabel l12 = new JLabel("Form No :");
        l12.setFont(new Font("Raleway", Font.BOLD, 14));
        l12.setBounds(660, 10, 100, 30);
        add(l12);

        JLabel l13 = new JLabel(formno);
        l13.setFont(new Font("Raleway", Font.BOLD, 14));
        l13.setBounds(720, 10, 60, 30);
        add(l13);


        next = new JButton("Next");
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBackground(Color.white);
        next.setForeground(Color.black);
        next.setBounds(570,640,100,30);
        next.addActionListener(this);
        add(next);



        getContentPane().setBackground(new Color(252,208,76));
        setLayout(null);
        setSize(850, 750);
        setLocation(450, 80);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String rel = (String) comboBox.getSelectedItem();
        String cate =(String) comboBox2.getSelectedItem();
        String inc = (String) comboBox3.getSelectedItem();
        String edu = (String) comboBox4.getSelectedItem();
        String occ = (String) comboBox5.getSelectedItem();

        String pan = textPan.getText();
        String aadhar = textAdhar.getText();

        String scitizen = "";
        if(r1.isSelected())
        {
            scitizen = "Yes";
        } else if (r2.isSelected()) {
            scitizen = "No";
        }

        String eAccount = "";
        if(e1.isSelected())
        {
            eAccount = "Yes";
        } else if (e2.isSelected()) {
            eAccount = "No";
        }

        try {
            if(textAdhar.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null, "Fill Aadhar no. the Fields");
            } else
            {
                DBConnection c1 = new DBConnection();
                String quary = "insert into signup_two values('"+formno+"','"+rel+"', '"+cate+"', '"+inc+"', '"+edu+"', '"+occ+"', '"+pan+"', '"+aadhar+"', '"+scitizen+"', '"+eAccount+"' )";
                c1.statement.executeUpdate(quary);
                new Signup3(formno);
                setVisible(false);
            }

        }catch (Exception E)
        {
            E.printStackTrace();
        }


    }

    
    public static void main(String[] args) {
        new Signup2("");
    }


}

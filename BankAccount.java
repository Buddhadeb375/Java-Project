package BAPUJAVA;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;

public class BankAccount {
    public static void program(float f){
        //Creating a frame
        JFrame frame = new JFrame("Bank Account");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);

        //Creating Account Number Label
        JLabel accnolabel=new JLabel("Enter Account number:");
        accnolabel.setBounds(50,30,200,25);
        frame.add(accnolabel);

        //Creating Account Number Field
        JTextField acctext=new JTextField();
        acctext.setBounds(180,30,200,25);
        frame.add(acctext);

        //Creating Customer ID
        JLabel cidlabel=new JLabel("Enter Customer ID:");
        cidlabel.setBounds(50,70,200,25);
        frame.add(cidlabel);

        //Creating Customer ID Field
        JTextField cidtext=new JTextField();
        cidtext.setBounds(180,70,200,25);
        frame.add(cidtext);

        //Creating Login Button
        JButton loginbutton = new JButton("Login");
        loginbutton.setBounds(190,120,70,30);
        frame.add(loginbutton);

        //Adding Action Listener
        loginbutton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String acc=acctext.getText();
                String cid=cidtext.getText();
                if(acc.equals("999999999999") && cid.equals("1234567")){
                    JOptionPane.showMessageDialog(frame,"Login Successful\nYour Account Balance: "+f);
                }
                else{
                    JOptionPane.showMessageDialog(frame,"Wrong Information Entered","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
    public static float credit(float cb){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter amount you want to credit: ");
        float a=s.nextFloat();
        cb=cb+a;
        System.out.println("Do you want to see your current balance (Type 'Y' for viewing:)");
        String b=s.next();
        if((b.toUpperCase()).equals("Y")){
            program(cb);
        }
        else{
            System.out.println("Thank You");
        }
        return cb;
    }public static float debit(float cb){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter amount you want to debit: ");
        float a=s.nextFloat();
        cb=cb-a;
        System.out.println("Do you want to see your current balance (Type 'Y' for viewing:)");
        String b=s.next();
        if((b.toUpperCase()).equals("Y")){
            program(cb);
        }
        else{
            System.out.println("Thank You");
        }
        return cb;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter your current Balance: ");
        float cb=s.nextFloat();
        System.out.println("Enter whether you want to credit/debit :(C for Credit and D for debit)");
        String c=s.next();
        if((c.toUpperCase()).equals("C")){
            credit(cb);
        }
        else if ((c.toUpperCase()).equals("D")) {
            debit(cb);
        }
        else{
            System.out.println("Please enter correct choice");
        }
    }
}

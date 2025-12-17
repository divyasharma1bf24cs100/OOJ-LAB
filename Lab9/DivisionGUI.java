import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class DivisionGUI extends JFrame implements ActionListener{
    JTextField t1,t2,t3;
    JButton b;
    DivisionGUI(){
        setTitle("Integer Division");
        setSize(300,200);
        setLayout(new GridLayout(4,2));
        add(new JLabel("Num1"));
        t1=new JTextField();
        add(t1);
        add(new JLabel("Num2"));
        t2=new JTextField();
        add(t2);
        add(new JLabel("Result"));
        t3=new JTextField();
        t3.setEditable(false);
        add(t3);
        b=new JButton("Divide");
        add(b);
        b.addActionListener(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        try{
            int n1=Integer.parseInt(t1.getText());
            int n2=Integer.parseInt(t2.getText());
            int res=n1/n2;
            t3.setText(String.valueOf(res));
        }
        catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(this,"Please enter valid integers");
        }
        catch(ArithmeticException ex){
            JOptionPane.showMessageDialog(this,"Division by zero not allowed");
        }
    }
    public static void main(String[] args){
        new DivisionGUI();
    }
}

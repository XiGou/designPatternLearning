
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;


public class myGame{
    static JLabel inputLabel;
    static JLabel outputLabel;
    static JTextField inputTextField;
    static JPanel p;
    static int targetnum;
    public static void main(String[] args){
        JFrame f = new JFrame("jj");

        p =new JPanel();

        inputLabel = new JLabel("猜个数(1--10)");
        outputLabel = new JLabel("---");
        inputTextField = new JTextField(5);
        textListener tl =  new textListener();
        inputTextField.addActionListener(tl);
        


        p.add(inputLabel);
        p.add(outputLabel);
        p.add(inputTextField);
        f.add(p);
        Random rand = new Random();
        targetnum = rand.nextInt(10);
        System.out.println(targetnum);

        f.setPreferredSize(new Dimension(500,100));
        f.setBackground(Color.YELLOW);
        

        

        f.pack();
        f.setVisible(true);
    }
    private static class textListener implements ActionListener{
        public void actionPerformed(ActionEvent event){
            String text = inputTextField.getText();
            int num = Integer.parseInt(text);
            // System.err.println(num);
            if(num == targetnum){
                outputLabel.setText("对了");
            }
            else if(num > targetnum){
                outputLabel.setText("大了");
            }
            else{
                outputLabel.setText("小了");
                
            }

        }

    }

}


class MyPanel extends JPanel{
    private JLabel inputLabel,outputLabel;
    private JTextField inputTextField;
    private int targetnum = 9;

    

    public MyPanel(){
        


    }

    


}



import javax.swing.*;

public class SwingInheritanceExample extends JFrame { //inheritingJFrame
    JFrame f;
    SwingInheritanceExample(){ //create the constructor
        JButton b= new JButton("click");//create button
        b.setBounds(130,100,100,40);

        add(b);//adding buttonon frame
        setSize(400,500);
        setLayout(null);
        setVisible(true);
    }//end constructor
    public static void main(String[]args){
        new SwingInheritanceExample();
    }//end main
}//end class

package planet;

import javax.swing.JFrame;


/**
 * 
 * @author Akshay
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame=new JFrame("Planetary System");
        Simulate s = new Simulate();
        frame.setBounds(0,0,1366,768);
        frame.setVisible(true);
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(s);
    }
    
}
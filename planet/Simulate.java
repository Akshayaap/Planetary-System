
package planet;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Akshay
 */
class Simulate extends JPanel implements ActionListener{
    
    private final int delay=50;
    private final Timer time;
  
    private final int a = 0;
    private final int b = 0;
   
    public float sx=680;
    public float sy=350;
    public float sdx=0;
    public float sdy=0;
    public float sax=0;
    public float say=0;
    public float sm=1000;
    private int pass=0;
    //private double r,a;
    //private int pss,i;
    
    Planet mr = new Planet(50,580,350,0,3,Color.MAGENTA,13);
    Planet vn=new Planet(100,480,350,0,2.1f,Color.WHITE,17);
    Planet earth=new Planet(200,380,350,0,1.7f,Color.BLUE,22);
    Planet ms=new Planet(60,280,350,0,1.5f,Color.RED,15);
    Planet jup=new Planet(500,180,350,0,1.4f,Color.ORANGE,25);
    Commet cmt=new Commet(10,50,350,0,0.36f,Color.white,8);
    Moon mn=new Moon(earth,10);
    Moon jm=new Moon(jup,20);
    Moon mn1=new Moon(vn,4);
    Planet sat=new Planet(300,50,350,0,1.2f,Color.CYAN,20);
    //Planet er=new Planet()
    
    public Simulate(){
        
        time = new Timer(delay,this);
        time.start();
        jm.dy=5;
        mn1.dy=4.5f;
    }
    
    
    /**
     * 
     * @param g 
     */
    @Override
    public void paint(Graphics g){
        g.translate(a, b);
        g.setColor(Color.black);
        g.fillRect(0,0,1366, 768);
        g.setColor(Color.yellow);
        g.fillOval((int)sx-25, (int) (sy-25), 50, 50);
        mr.draw(g);
        vn.draw(g);
        earth.draw( g);
        ms.draw( g);
        jup.draw( g);
        cmt.draw(g);
        cmt.tail(g);
        mn.draw(g);
        jm.draw(g);
        sat.draw( g);
        mn1.draw(g);
        g.dispose();
    }
    /**
     * 
     * @param e 
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        
//        time.start();
        mr.interact();
        vn.interact();
        earth.interact();
        ms.interact();
        jup.interact();
        cmt.interact();
        mn1.interact();
        sat.interact();
        jm.interact();
        mn.interact();
        pass++;
        repaint();
        
    }
    
}

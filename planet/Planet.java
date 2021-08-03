/**
 *
 * @author Akshay
 */
package planet;

import java.awt.Color;
import java.awt.Graphics;
import static java.lang.Math.sqrt;


/**
 *
 * @author Akshay
 */
public class Planet {
    float ms;
    float px;
    float py;
    float pdx;
    float pdy;
    float pax;
    float pay;
    
    float F;
    float Fx;
    float Fy;
    float r;
    
    int sz;
    Color clr;
    
   
    public Planet(float m,float x,float y,float dx,float dy,Color color, int size){
        ms=m;
        px=x;
        py=y;
        pdx=dx;
        pdy=dy;
        clr=color;
        sz=size;
    }
    void interact(){
        
        r=(float) sqrt((680-px)*(680-px)+(350-py)*(350-py));
        F= (1000*ms)/(r*r);
        Fx=F*(680-px)/r;
        Fy=F*(350-py)/r;
        pax=Fx/ms;
        pay=Fy/ms;
        pdx+=pax;
        pdy+=pay;
        px+=pdx;
        py+=pdy;
    }
    
    /**
     * 
     * @param g 
     */
    void draw(Graphics g){
        
        g.setColor(clr);
        g.fillOval((int) (px)-sz/2, (int) (py)-sz/2, sz, sz);
        
      // g.fillRect(px % 1360,350-(int)(px/5), 1, 1);
      //  System.out.println("\t"+px+"\t\t\t"+py);
    }
}

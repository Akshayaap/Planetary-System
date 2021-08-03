
package planet;

import java.awt.Color;
import java.awt.Graphics;
import static java.lang.Math.sqrt;



/**
 *
 * @author Akshay
 */

public class Moon {
    float x=600;
    float y=300;
    float dx=0,dy=4;
    float ax=0,ay=0;
    float F=0;
    float fx=0,fy=0;
    float ms=0;
    float r=0;
    Planet plt;
    public Moon(Planet pt,float m){
        plt=pt;
        x=plt.px-60;
        y=plt.py;
        ms=m;
     //   System.out.println(x+"\t\t"+y);
    }
    public void interact(){
        
        r=(float) sqrt((x-plt.px)*(x-plt.px)+(y-plt.py)*(y-plt.py));
        F=5*plt.ms*ms/(r*r);
        fx=(plt.px-x)/r*F;
        fy=(plt.py-y)/r*F;
        ax=fx/ms;
        ay=fy/ms;
        dx+=ax;
        dy+=ay;
        x+=dx;
        y+=dy;
       // System.out.println(plt.px+"\t\t"+x);
       
        
    }
    public void draw(Graphics g){
        g.setColor(Color.white);
        g.fillOval((int)(x-5),(int)(y-5),10,10);
        
    }

    
}

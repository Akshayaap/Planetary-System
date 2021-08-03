package planet;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Akshay
 */
public class Commet extends Planet{
    float tx=0,ty=0;
    float tdx=0,tdy=0;
    float l=0;
    
    public Commet(float m, float x, float y, float dx, float dy, Color color, int size) {
        super(m, x, y, dx, dy, color, size);
    }

    /**
     * 
     * @param g 
     */
    void tail(Graphics g){
        
        float t=0;
        g.setColor(clr);
        while(t<=l){
           /*
            g.fillRect((int)tx+1,(int) ty+1, 1, 1);
            g.fillRect((int)tx-1,(int) ty-1, 1, 1);
            g.fillRect((int)tx+1,(int) ty-1, 1, 1);
            g.fillRect((int)tx-1,(int) ty+1, 1, 1);
*/
            tx+=tdx;
            ty+=tdy;
            t+=Math.sqrt(tdx*tdx+tdy*tdy);
        }
        g.drawLine((int)px, (int)py, (int)tx-2,(int) ty+2);
        g.drawLine((int)px, (int)py, (int)tx+2,(int) ty+2);
        g.drawLine((int)px, (int)py, (int)tx-2,(int) ty-2);
        g.drawLine((int)px, (int)py, (int)tx+2,(int) ty-2);
    }
    
    
    @Override
    void interact(){
        super.interact();
        l=50-r/15;
        tx=px;
        ty=py;
        tdx=-(680-tx)/200;
        tdy=-(350-ty)/200;
    }
    
}

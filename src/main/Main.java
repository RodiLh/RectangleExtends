package main;

import carre.Carre;
import rectangle.Rectangle;

/**
 *
 * @author dmr
 */
public class Main {
    
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        Rectangle rectangle1 = new Rectangle(5, 4);
//        Rectangle rectangle2 = new Rectangle(5, 4);
//        
//        System.out.println(rectangle1.toString());
//        
//        if (rectangle1.equals(rectangle2)) {
//            System.out.println("ok");
//        }
//        else {
//            System.out.println("ko !");
//        }
        
        Rectangle r = new Rectangle(4, 5);
        Carre c = new Carre(2);
                
        affiche(r);
        affiche(c);
    }
    
    public static void affiche(Rectangle rectangle) {
        System.out.println(rectangle);
    }
    
}


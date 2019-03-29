
import java.util.*;

/**
 * 
 */
public class WrapperRectangle implements MyShapes {

    /**
     * Default constructor
     */
    public WrapperRectangle() {
		System.out.println("Creating WrapperRectangle Object");
    }

    /**
     * 
     */
    public Rectangle rectangleObj;


    /**
     * 
     */
    public void draw() {
        rectangleObj.letsDraw();
    }

    /**
     * 
     */
    public void display() {
        rectangleObj.letsDisplay();
    }

}
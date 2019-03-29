
import java.util.*;

/**
 * 
 */
public class Mario {

    /**
     * Default constructor
     */
    public Mario() {
		System.out.println("Creating Mario");
    }

    /**
     * 
     */
    public next nextObj;



    /**
     * 
     */
    public void touch() {
        nextObj.execute();
    }

}
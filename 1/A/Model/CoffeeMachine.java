
import java.util.*;

/**
 * 
 */
public class CoffeeMachine {

    public PowderManagement powderManagementObject;
    public Mixer mixerObject;
    public Boiler boilerObject;
    public CoffeeMachine() {
		powderManagementObject=new PowderManagement();
		mixerObject=new Mixer();
		boilerObject=new Boiler();	
    }
	
    public void makeCoffee() {
        System.out.println("Making Coffee");
		bolier.boilWater();
		powderManagementObject.addCoffeePowder();
		powderManagementObject.addSugar();
		mixerObject.mixPowders();
    }

}
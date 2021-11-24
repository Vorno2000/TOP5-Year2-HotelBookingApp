package programming.assignment;
/**
 * This class is a child class of VipAccess. It has a constructor which takes a parameter 
 * in of type boolean and uses the set methods of the parent class to overwrite the variables. 
 * Also has a toString which is a String representation of the class
 * @author Sukhman Singh & Vaughn Carroll
 */
public class Bar extends VipAccess{

    public Bar(boolean state)
    {
        super.setCost(10.0f);
        super.setIsSelected(state);
    }
    @Override
    public String toString() {
        return "Bar";
    }
}
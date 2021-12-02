package programming.assignment;
/**
 * This class is a representation of a Customer. It holds variables that a customer would always have. E.g. First Name. 
 * A set and get method is created in this class to set and retrieve all of the customers info in a String ArrayList.
 * @author Sukhman Singh & Vaughn Carroll
 */
import java.util.*;

public class CustomerInfo {
    private ArrayList<String> arr_custInfo = new ArrayList();
    
    public void addPersonalRoomInfo(String firstName, String lastName, String phoneNum, String floorNum, String roomNum) {
        arr_custInfo.add(firstName);
        arr_custInfo.add(lastName);
        arr_custInfo.add(phoneNum);
        arr_custInfo.add(floorNum);
        arr_custInfo.add(roomNum);
    }
    
    public void addOtherInfo(String peopleStaying, String nightsStaying){
        arr_custInfo.add(peopleStaying);
        arr_custInfo.add(nightsStaying);
    }
    
    public ArrayList<String> getArrCustInfo() {
        return arr_custInfo;
    }
}
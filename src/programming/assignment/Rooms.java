package programming.assignment;
/**
 * This abstract class is a representation of a room. It has many variables that are overwritten 
 * by it's child classes. Also has many methods that allow other classes to get and set those variables
 * @author Sukhman Singh & Vaughn Carroll
 */
import java.util.*;

public abstract class Rooms{
    
    protected float cost = 0;
    protected char roomCode;
    protected RoomSize var_roomSize;
    protected ArrayList<VipAccess> arr_VipAccess = new ArrayList<>();
    protected boolean isBooked = false;
    protected int maxPeople = 0;
    protected float nightlyCost = 0.0f;
    protected CustomerInfo custInfo = new CustomerInfo();
    
    public void setCost(float aCost){
        this.cost = aCost;
    }
    public void setRoomCode(char roomCode) {
        this.roomCode = roomCode;
    }
    public void setSize(RoomSize var_roomSize) {
        this.var_roomSize = var_roomSize;
    }
    public void addVipAccess(VipAccess bar, VipAccess skyTV, VipAccess hotPools, VipAccess massageRooms) {
        this.arr_VipAccess.add(bar);
        this.arr_VipAccess.add(skyTV);
        this.arr_VipAccess.add(hotPools);
        this.arr_VipAccess.add(massageRooms);
    }
    public void setIsBooked(boolean status) {
        this.isBooked = status;
    }
    public void setMaxPeople(int people) {
        this.maxPeople = people;
    }
    public void setNightlyCost(float nightlyCost) {
        this.nightlyCost = nightlyCost;
    }
    
    public float getCost(){
        return cost;
    }
    public char getRoomCode() {
        return roomCode;
    }
    public RoomSize getSize() {
        return this.var_roomSize;
    }
    public ArrayList<VipAccess> getVipAccess() {
        return this.arr_VipAccess;
    }
    public boolean getIsBooked() {
        return this.isBooked;
    }
    public int getMaxPeople() {
        return this.maxPeople;
    }
    public float getNightlyCost() {
        return this.nightlyCost;
    }
    public CustomerInfo getCustInfo() {
        return custInfo;
    }
}
package programming.assignment;
/**
 * This class is a child class of Rooms. It has a default constructor which uses 
 * the set methods of the parent class to overwrite the variables. 
 * Also has a toString which is a String representation of the class
 * @author Sukhman Singh & Vaughn Carroll
 */
public class Silver extends Rooms{
        
    public Silver(){
       super.setCost(120);
       super.setRoomCode('S');
       super.setSize(RoomSize.SMALL);
       super.addVipAccess(new Bar(false), new SkyTV(false), new HotPools(false), new MassageRooms(false));
       super.setMaxPeople(2);
       super.setNightlyCost(65.0f);
    }
    @Override
    public String toString() {
        return "Silver";
    }
}

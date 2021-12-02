package programming.assignment;
/**
 * This class is a child class of Rooms. It has a default constructor which uses 
 * the set methods of the parent class to overwrite the variables. 
 * Also has a toString which is a String representation of the class
 * @author Sukhman Singh & Vaughn Carroll
 */
public class Platinum extends Rooms{

    public Platinum(){
        super.setCost(200);
        super.setRoomCode('P');
        super.setSize(RoomSize.LARGE);
        super.addVipAccess(new Bar(false), new SkyTV(false), new HotPools(false), new MassageRooms(false));
        super.setMaxPeople(4);
        super.setNightlyCost(175.0f);
    }
    @Override
    public String toString() {
        return "Platinum";
    }
}
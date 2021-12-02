package programming.assignment;
/**
 * This class is a child class of Rooms. It has a default constructor which uses 
 * the set methods of the parent class to overwrite the variables. 
 * Also has a toString which is a String representation of the class
 * @author Sukhman Singh & Vaughn Carroll
 */
public class Diamond extends Rooms{

    public Diamond(){
        super.setCost(225);
        super.setRoomCode('D');
        super.setSize(RoomSize.XLARGE);
        super.addVipAccess(new Bar(false), new SkyTV(false), new HotPools(false), new MassageRooms(false));
        super.setMaxPeople(5);
        super.setNightlyCost(260.0f);
    }
    @Override
    public String toString() {
        return "Diamond";
    }
}
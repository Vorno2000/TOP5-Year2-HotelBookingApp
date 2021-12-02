package programming.assignment;
/**
 * This class is a child class of Rooms. It has a default constructor which uses 
 * the set methods of the parent class to overwrite the variables. 
 * Also has a toString which is a String representation of the class
 * @author Sukhman Singh & Vaughn Carroll
 */
public class Gold extends Rooms{
    
    public Gold(){
        super.setCost(165);
        super.setRoomCode('G');
        super.setSize(RoomSize.MEDIUM);
        super.addVipAccess(new Bar(false), new SkyTV(false), new HotPools(false), new MassageRooms(false));
        super.setMaxPeople(3);
        super.setNightlyCost(100.0f);
    }
    @Override
    public String toString() {
        return "Gold";
    }
}
package programming.assignment;
/**
 * This class initializes the hotel grid and initializes the rooms in the correct position.
 * It also has many methods that enable other classes to retrieve and edit variables of Rooms and Customers.
 * 
 * @author Sukhman Singh & Vaughn Carroll
 */
import java.util.*;
import java.io.*;
import java.sql.*;
/**
 * This is the default constructor which calls 3 methods to initialize the hotel grid, initialize the connection to the database and
 * another method which reads through the Bookings table to set the correct rooms to booked state
 */
public class HotelGrid {
    private Rooms[][] hotelGrid;
    private final int nRooms = 6;
    private final int nFloors = 4;
    private int userFloor;
    private int userRoom;
    private final Rooms silver = new Silver();
    private final Rooms gold = new Gold();
    private final Rooms platinum = new Platinum();
    private final Rooms diamond = new Diamond();
    private Connection myConObj = null;
    private Statement myStatObj = null;
    private ResultSet myResObj = null;
    
    public HotelGrid() {
        initialiseHotelGrid();
        initialiseConnection();
        initialiseBookings();
    }
    
    public void initialiseHotelGrid() {
        hotelGrid = new Rooms[nFloors][nRooms];
        
        for (int iniFloor = 0; iniFloor < nFloors; iniFloor++) {
            switch (iniFloor) {
                case 0:
                    initialiseRooms(iniFloor, new Silver(), new Gold());
                    break;
                case 1:
                    initialiseRooms(iniFloor, new Silver(), new Gold(), new Platinum());
                    break;
                case 2:
                    initialiseRooms(iniFloor, new Gold(), new Platinum(), new Diamond());
                    break;
                default:
                    initialiseRooms(iniFloor, new Platinum(), new Diamond());
                    break;
            }
        }
    }
    public void initialiseRooms(int floorNum, Rooms typeOne, Rooms typeTwo) {
        switch(typeOne.getRoomCode()) {
            case 'S':
                for (int iterate = 0; iterate < 3; iterate++) {
                    this.hotelGrid[floorNum][iterate] = new Silver();
                }
                for (int iterate = 3; iterate <= 5; iterate++) {
                    this.hotelGrid[floorNum][iterate] = new Gold();
                }
                break;
            case 'P':
                for (int iterate = 0; iterate < 3; iterate++) {
                    this.hotelGrid[floorNum][iterate] = new Platinum();
                }
                for (int iterate = 3; iterate <= 5; iterate++) {
                    this.hotelGrid[floorNum][iterate] = new Diamond();
                }
        }
    }
    
    public void initialiseRooms(int floorNum, Rooms typeOne, Rooms typeTwo, Rooms typeThree) {
        switch (typeOne.getRoomCode()) {
            case 'S':
                for (int iterate = 0; iterate <= 1; iterate++) {
                    this.hotelGrid[floorNum][iterate] = new Silver();
                }
                for (int iterate = 2; iterate <= 3; iterate++) {
                    this.hotelGrid[floorNum][iterate] = new Gold();
                }
                for (int iterate = 4; iterate <= 5; iterate++) {
                    this.hotelGrid[floorNum][iterate] = new Platinum();
                }
                break;
            case 'G':
                for (int iterate = 0; iterate <= 1; iterate++) {
                    this.hotelGrid[floorNum][iterate] = new Gold();
                }
                for (int iterate = 2; iterate <= 3; iterate++) {
                    this.hotelGrid[floorNum][iterate] = new Platinum();
                }
                for (int iterate = 4; iterate <= 5; iterate++) {
                    this.hotelGrid[floorNum][iterate] = new Diamond();
                }
                break;
        }
        
    }
    /**
     * this initializes the connection to the database
     */
    public void initialiseConnection() {
        try {
            myConObj = DriverManager.getConnection("jdbc:derby:Hotel_Booking_System;create=true");
            myStatObj = myConObj.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        } catch(SQLException e) {
            System.err.println("SQLException: "+e.getMessage());
        }
    }
    
    public Rooms getHotelGrid(int floor, int room) {
        return hotelGrid[floor][room];
    }
    public int getTotalRooms() {
        return nRooms;
    }
    public int getTotalFloors() {
        return nFloors;
    }
    public int getUserFloor() {
        return userFloor;
    }
    public int getUserRoom() {
        return userRoom;
    }
    public void setUserFloor(int floor){
        userFloor = floor;
    }
    public void setUserRoom(int room){
        userRoom = room;
    }
    
/**
 * This method takes in a parameter of type char to retrieve a room type which matches the char
 * @param room
 * @return the room Type
 */
    public Rooms getRoom(char room) {
        room = Character.toUpperCase(room);
        switch (room) {
            case 'S':
                return silver;
            case 'G':
                return gold;
            case 'P':
                return platinum;
            case 'D':
                return diamond;
            default:
                System.out.println("Cannot return Room");
                return null;
        }
    }
/**
 * This method uses the user's floor and room number as parameters so that the cost can be calculated
 * by taking the room type cost, VIP options, extra people, and nights staying into account. The final cost is then returned in type float.
 * @return 
 */
    public float calculateCost() {
        float totalCost = this.getHotelGrid(this.getUserFloor(), this.getUserRoom()).getCost();

        for (int i = 0; i < this.getHotelGrid(this.getUserFloor(), this.getUserRoom()).getVipAccess().size(); ++i){

            if (this.getHotelGrid(this.getUserFloor(), this.getUserRoom()).getVipAccess().get(i).getIsSelected() == true){
                totalCost += this.getHotelGrid(this.getUserFloor(), this.getUserRoom()).getVipAccess().get(i).getCost();
            }
        }

        totalCost += (Integer.parseInt(this.getHotelGrid(this.getUserFloor(), this.getUserRoom()).getCustInfo().getArrCustInfo().get(6)) * this.getHotelGrid(this.getUserFloor(), this.getUserRoom()).getNightlyCost());
        totalCost *= (Integer.parseInt(this.getHotelGrid(this.getUserFloor(), this.getUserRoom()).getCustInfo().getArrCustInfo().get(5)));
        
        return totalCost; 
    }
/**
* This method is called in the default constructor of this class. Its purpose
* is to read the bookings table and set the rooms to booked according to the database entries. When it is reading
* the bookings table, it sets the rooms that have been stored to a booked state in the hotel grid.
*/
    public void initialiseBookings(){
        try{
            myResObj = myStatObj.executeQuery("SELECT * FROM BOOKINGS");
            while(myResObj.next()) {
                String phoneNum = myResObj.getString("phone_num");
                String firstName = myResObj.getString("first_name");
                String lastName = myResObj.getString("last_name");
                int floorNum = myResObj.getInt("floor_num");
                int roomNum = myResObj.getInt("room_num");
                String nightsStaying = myResObj.getString("nights_staying");
                String peopleStaying = myResObj.getString("people_staying");

                this.getHotelGrid(floorNum, roomNum).getCustInfo().addPersonalRoomInfo(firstName, lastName, phoneNum, Integer.toString(floorNum), Integer.toString(roomNum));
                this.getHotelGrid(floorNum, roomNum).getCustInfo().addOtherInfo(peopleStaying, nightsStaying);
                this.getHotelGrid(floorNum, roomNum).setIsBooked(true);
            }
        } catch(SQLException e) {
            System.err.println("SQLException: "+e.getMessage());
        }
    }
    
/**
 * This method takes a String as a parameter which holds the users inputed phone number.
 * This is then used to see if there is a match in the bookings table. A boolean which
 * is set to true is returned if there is a match.
 * @param phoneNum
 * @return a boolean which is true if the number matches and false if it doesn't
 */
    public boolean checkPhoneNum(String phoneNum) {
        try{
            myResObj = myStatObj.executeQuery("SELECT PHONE_NUM FROM BOOKINGS");
            if (myResObj.next() == false)
                return false;
            else {
                myResObj.beforeFirst();
                while(myResObj.next()) {
                    String tempCmp = myResObj.getString("Phone_Num");
                    if(tempCmp.equals(phoneNum))
                        return true;
                }
                return false;
            }
        }catch(SQLException e) {
            System.err.println("SQLException: "+e.getMessage());
        }
        return false;
    }
/**
 * This method gets the users room and makes the state of that room to booked. The booking
 * is made once the user's booking details are inserted into the Bookings table in the database.
 */
    public void makeBooking() {
        String firstName = this.getHotelGrid(this.getUserFloor(), this.getUserRoom()).getCustInfo().getArrCustInfo().get(0);
        String lastName = this.getHotelGrid(this.getUserFloor(), this.getUserRoom()).getCustInfo().getArrCustInfo().get(1);
        String phoneNum = this.getHotelGrid(this.getUserFloor(), this.getUserRoom()).getCustInfo().getArrCustInfo().get(2);
        String nightsStaying = this.getHotelGrid(this.getUserFloor(), this.getUserRoom()).getCustInfo().getArrCustInfo().get(6);
        String peopleStaying = this.getHotelGrid(this.getUserFloor(), this.getUserRoom()).getCustInfo().getArrCustInfo().get(5);
        String insertBooking = "INSERT INTO BOOKINGS (PHONE_NUM, FIRST_NAME, LAST_NAME, FLOOR_NUM, ROOM_NUM, NIGHTS_STAYING, PEOPLE_STAYING) VALUES ('"+phoneNum+"', '"+firstName+"', '"+lastName+"', "+this.getUserFloor()+", "+this.getUserRoom()+", "+nightsStaying+", "+peopleStaying+")";

        try {
            myStatObj.executeUpdate(insertBooking);
        } catch (SQLException e) {
            System.err.println("SQLException: "+e.getMessage());
        }
    }
/**
 * This method takes in a phone number so that it can remove the row from 
 * the database that is associated with that specific number.
 * @param phoneNum 
 */
    public void removeBooking(String phoneNum){
        try{
            myResObj = myStatObj.executeQuery("SELECT PHONE_NUM FROM BOOKINGS");
          
            while(myResObj.next()) {
                String tempCmp = myResObj.getString("PHONE_NUM");
                if(tempCmp.equals(phoneNum)) {
                    myStatObj.executeUpdate("DELETE FROM BOOKINGS WHERE Phone_num = '"+phoneNum+"'");
                    break;
                }
            }
            
            myResObj.close();
            myStatObj.close();
            myConObj.close();
        }catch(SQLException e) {
            System.err.println("SQLException: "+e.getMessage());
        }
    }
    
    public boolean checkFullyBooked() {
        for (int i = 0; i < nFloors; i++) {
            for (int x = 0; x < nRooms; x++) {
                if (!this.getHotelGrid(i, x).getIsBooked())
                    return false;
            }
        }
        return true;
    }
}
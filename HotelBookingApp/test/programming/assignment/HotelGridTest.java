/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programming.assignment;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Vorno
 */
public class HotelGridTest {
    
    public HotelGridTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calculateCost method, of class HotelGrid.
     */
    @Test
    public void testCalculateCost() {
        System.out.println("calculateCost");
        HotelGrid instance = new HotelGrid();
        instance.setUserFloor(0);
        instance.setUserRoom(0);
        instance.getHotelGrid(0, 0).addVipAccess(new Bar(true), new SkyTV(false), new HotPools(false), new MassageRooms(false));
        instance.getHotelGrid(0, 0).getCustInfo().addPersonalRoomInfo("testing", "testing", "123123", "0", "0");
        instance.getHotelGrid(0, 0).getCustInfo().addOtherInfo(Integer.toString(1), Integer.toString(1));
        float expResult = 195.0F;
        float result = instance.calculateCost();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }    
    
    @Test
    public void testGetRoom() {
        System.out.println("getRoom");
        HotelGrid instance = new HotelGrid();
        Rooms test = new Diamond();
     
        Rooms expResult = test;
        Rooms result = instance.getRoom('D');
    }
    
    @Test
    public void testGetTotalRooms() {
        System.out.println("getTotalRooms");
        HotelGrid instance = new HotelGrid();
     
        int expResult = 6;
        int result = instance.getTotalRooms();
    }
    
    @Test
    public void testGetTotalFloors() {
        System.out.println("getTotalFloors");
        HotelGrid instance = new HotelGrid();
     
        int expResult = 4;
        int result = instance.getTotalFloors();
    }
    
    @Test
    public void testCheckFullyBooked() {
        System.out.println("checkFullyBooked");
        HotelGrid instance = new HotelGrid();
        
        for(int i = 0; i < 4; i++) {
            for (int x = 0; x < 6; x++) {
                instance.getHotelGrid(i, x).setIsBooked(true);
            }
        }
     
        boolean expResult = true;
        boolean result = instance.checkFullyBooked();
    }
}

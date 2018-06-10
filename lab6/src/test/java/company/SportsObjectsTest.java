package company;

import static company.OlympicGames.printList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.Assert.*;


import company.SportsObject;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.runner.RunWith;

import java.lang.reflect.Field;
import java.util.LinkedList;
import java.util.List;

@RunWith(JUnitPlatform.class)
@IncludeEngines("junit-jupiter")
public class SportsObjectsTest {
    private SportsObject sportsObject = new SportsObject("Arena",5000,"Lviv", SportType.BIATHLON);

    @BeforeEach
    void init() {
        OlympicGames ua = new OlympicGames(2100, "Lviv", Season.SUMMER);

        ua.addObject(new BiathlonCenter(5, "Long", "The best", 101, "Kyiv", SportType.BIATHLON));
        ua.addObject(new BiathlonCenter(6, "Dead", "The worst", 970, "Lviv", SportType.BIATHLON));
        ua.addObject(new BiathlonCenter(4, "Killers", "The greatest", 1010, "Rivne", SportType.BIATHLON));
        ua.addObject(new HockeyCenter(40, "Lowerness", 970, "Rivne", SportType.HOCKEY));
        ua.addObject(new HockeyCenter(50, "Height", 970, "Lutsk", SportType.HOCKEY));
        ua.addObject(new HockeyCenter(20, "Less", 1850, "Kyiv", SportType.HOCKEY));
        ua.addObject(new IndoorIceRink(200, "Highest", 850, "Kyiv", SportType.CURLING));
        ua.addObject(new SkiJumping(300, "Lolik", 750, "Kharkiv", SportType.SKIJUMPING));
        ua.addObject(new SkiJumping(100, "Look", 740, "Lviv", SportType.SKIJUMPING));
        ua.addObject(new SkiJumping(200, "Bolik", 970, "Donetsk", SportType.SKIJUMPING));
        ua.addObject(new SlidingCenter(200, 400, 430, "Bera", 200, "Lutsk", SportType.SKELETON));
        ua.addObject(new SlidingCenter(145, 200, 330, "Dora", 250, "Rivne", SportType.SKELETON));


        printList(ua.getObject());
        System.out.println("\nSearched by capacity:");

        List<SportsObject> objects = ua.findByCapacity(970);
        ua.sortByType(objects);
        for (SportsObject object: objects) {
            System.out.println(object);
        }
    }

    @Test
    public void testGetterSportsObjectWithValidName() {
        sportsObject.setName("Home");
        final String result = sportsObject.getName();
        assertEquals("Home", result, "Fields don't match");
    }

    @Test
    public void testSetterSportsObjectWithValidName() {
        String name = "Home";
        sportsObject.setName(name);
        assertEquals("Home", sportsObject.getName(), "Fields don't match");
    }

    @Test
    public void testGetterSportsObjectWithValidCapacity() {
        sportsObject.setCapacity(5);
        final int result = sportsObject.getCapacity();
        assertEquals(5, result, "Fields don't match");
    }

    @Test
    public void testSetterSportsObjectWithValidCapacity() {
        int capacity = 5;
        sportsObject.setCapacity(capacity);
        assertEquals(5, sportsObject.getCapacity(), "Fields don't match");
    }

    @Test
    public void testGetterSportsObjectWithValidLocation() {
        sportsObject.setLocation("Lviv");
        final String result = sportsObject.getLocation();
        assertEquals("Lviv", result, "Fields don't match");
    }

    @Test
    public void testSetterSportsObjectWithValidLocation() {
        String location = "Lviv";
        sportsObject.setLocation(location);
        assertEquals("Lviv", sportsObject.getLocation(), "Fields don't match");
    }

    @Test
    public void testGetterSportsObjectWithValidSportsType() {
        sportsObject.setSportType(SportType.BIATHLON);
        final SportType result = sportsObject.getSportType();
        assertEquals(SportType.BIATHLON, result, "Fields don't match");
    }

    @Test
    public void testSetterSportsObjectWithValidSportstype() {
        SportType sportType = SportType.BIATHLON;
        sportsObject.setSportType(sportType);
        assertEquals(SportType.BIATHLON, sportsObject.getSportType(), "Fields don't match");
    }

    @Test
    public final void testToString() {
        assertFalse(sportsObject.toString().contains("@"));
    }
}
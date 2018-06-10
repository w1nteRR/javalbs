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
    private OlympicGames ua;

    @BeforeEach
    void init() {
        ua = new OlympicGames(2100, "Lviv", Season.SUMMER);

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
    }

    @Test
    void testPrintList() {
        List<SportsObject> SportsObjectList = new LinkedList<>();
        ua.printList(SportsObjectList);
        List<SportsObject> expected = new LinkedList<>();
        assertNotEquals(expected, ua.get(), "Lists don't match");
    }

    @Test
    void testAddSportsObject() {
        ua = new ua("Ihor", "Vaskes");
        List<SportsObject> SportsObjectList = new LinkedList<>();
        assertTrue(SportsObjectList.isEmpty());
        SportsObjectList.add(new Bulb("Cool", 15.0, "LED", 5, "Red", "Econom", "Triangular"));
        assertFalse(SportsObjectList.isEmpty());
    }

    @Test
    void testFindSportsObjectByType() {
        ua = new ua("Ihor", "Vaskes");
        Lamp lamp = new Lamp("Lalala", 49.5, "Bosch", "Plastic", 36, "SportsObject");
        Bulb bulb = new Bulb("Cool", 15.0, "LED", 5, "Red", "Econom", "Triangular");
        ua.addSportsObject(lamp);
        ua.addSportsObject(bulb);
        List<SportsObject> result = ua.findByTypeAndPrice(Category.LAMP, 50.5);
        assertEquals(lamp, result.get(0), "Type doesn't match");
    }

    @Test
    void testSortByPrice() {
        List<SportsObject> result = ua.getSportsObjectList();
        ua.sortByPrice(result);

        assertEquals(56.5, result.get(7).getPrice(), "Price doesn't match");
    }

    @Test
    final void testGeneralToString() {
        assertFalse(ua.getSportsObjectList().toString().contains("@"));
        assertFalse(ua.toString().contains("@"));
    }

}
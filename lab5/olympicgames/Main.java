package olympicgames;
import java.util.List;


public class Main {
    
    public static void PrintList(List<SportsObject> List){
        List.forEach((SportsObject x) -> {
            System.out.println(x.toString());
        });
    }

    public static void main(String[] args) {
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
          
          
          PrintList(ua.getObject());
          System.out.println("\nSearched by capacity:");
        
          List<SportsObject> objects = ua.findByCapacity(970);
          ua.sortByType(objects);
          for (SportsObject object: objects) {
            System.out.println(object);
          }
    }
    
}

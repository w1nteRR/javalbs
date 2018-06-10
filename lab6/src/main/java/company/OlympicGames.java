package company;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class OlympicGames {
    private int year;
    private String hostCity;
    private Season season;
    private final List<SportsObject> sportObjects = new LinkedList<>(); 

    public OlympicGames(int year, String hostCity, Season season) {
        setYear(year);
        setHostCity(hostCity);
        setSeason(season);
    }

    @Override
    public String toString() {
        return "OlympicGames{" + "year=" + getYear() + ", hostCity=" + getHostCity() + ", season=" + getSeason() + '}';
    }
    
    private List<SportsObject> objects = new LinkedList<>();
    private List<SportsObject> result = new LinkedList<>();
    public List<SportsObject> findByCapacity(int capacity) {
        for (SportsObject object : objects) {
            if (object.getCapacity() == capacity) {
                result.add(object);
            }
        }
        return result;
    }
    
    public void sortByType(List<SportsObject> list){
        list.sort(Comparator.comparing(SportsObject::getSportType));
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getHostCity() {
        return hostCity;
    }

    public void setHostCity(String hostCity) {
        this.hostCity = hostCity;
    }

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }
    
    public void addObject(SportsObject object) {
        this.objects.add(object);
    }

    public static void printList(List<SportsObject> List){
        List.forEach((SportsObject x) -> {
            System.out.println(x.toString());
        });
    }
    
    public List<SportsObject> getObject() {
        return objects;
    }
}

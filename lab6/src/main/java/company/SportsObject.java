package company;

public class SportsObject {
    private String name;
    private int capacity;
    private String location;
    private SportType sportType;

    public SportsObject(String name, int capacity, String location, SportType sportType) {
        setName(name);
        setCapacity(capacity);
        setLocation(location);
        setSportType(sportType);
    }

    @Override
    public String toString() {
        return "SportsObject{" + "name=" + getName() + ", capacity=" + getCapacity() + ", location=" + getLocation() + ", sportType=" + getSportType() + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public SportType getSportType() {
        return sportType;
    }

    public void setSportType(SportType sportType) {
        this.sportType = sportType;
    }
    
    
}

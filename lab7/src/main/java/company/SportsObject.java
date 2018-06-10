package company;

public class SportsObject {
    private String name;
    private int capacity;
    private String location;
    private SportType sportType;

    private Integer id;

    public SportsObject(String name, int capacity, String location, SportType sportType, final Integer id) {
        setName(name);
        setCapacity(capacity);
        setLocation(location);
        setSportType(sportType);
        setId(id);
    }

    @Override
    public String toString() {
        return "SportsObject{" + "name=" + getName() + ", capacity=" + getCapacity() + ", location=" + getLocation() + ", sportType=" + getSportType() + '}';
    }

    public String getHeaders() {
        return getHeaders() + "," + "name" + "," + "capacity" + "," + "location" + "," + "sportType";
    }

    public String toCVS() {
        return toCVS() + "," + getName() + "," + getCapacity() + "," + getLocation() + "," + getSportType();
    }

    public final Integer getId() {
        return id;
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


    public void setId(Integer id) {
        this.id = id;
    }
}

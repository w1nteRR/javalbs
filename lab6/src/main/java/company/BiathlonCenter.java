package company;

public class BiathlonCenter extends SportsObject {
    
    private int length;
    private String raceType;

    public BiathlonCenter(int length, String raceType, String name, int capacity, String location, SportType sportType) {
        super(name, capacity, location, sportType);
        setLength(length);
        setRaceType(raceType);
    }

    @Override
    public String toString() {
        return "BiathlonCenter{" + "length=" + getLength() + ", raceType=" + getRaceType() + '}';
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getRaceType() {
        return raceType;
    }

    public void setRaceType(String raceType) {
        this.raceType = raceType;
    }
    
    
    
}

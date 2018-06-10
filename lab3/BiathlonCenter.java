package olympicgames;

public class BiathlonCenter extends SportsObject {
    
    private int length;
    private String raceType;

    public BiathlonCenter(int length, String raceType, String name, int capacity, String location, SportType sportType) {
        super(name, capacity, location, sportType);
        this.length = length;
        this.raceType = raceType;
    }

    @Override
    public String toString() {
        return "BiathlonCenter{" + "length=" + length + ", raceType=" + raceType + '}';
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

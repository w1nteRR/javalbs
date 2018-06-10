package company;

public class SkiJumping extends SportsObject  {
    
    private int kpoint;

    public SkiJumping(int kpoint, String name, int capacity, String location, SportType sportType) {
        super(name, capacity, location, sportType);
        setKpoint(kpoint);
    }

    @Override
    public String toString() {
        return "SkiJumping{" + "kpoint=" + getKpoint() + '}';
    }

    public int getKpoint() {
        return kpoint;
    }

    public void setKpoint(int kpoint) {
        this.kpoint = kpoint;
    }
    
    
}

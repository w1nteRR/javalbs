package company;

public class SkiJumping extends SportsObject  {
    
    private int kpoint;

    public SkiJumping(int kpoint, String name, int capacity, String location, SportType sportType, final Integer id) {
        super(name, capacity, location, sportType, id);
        setKpoint(kpoint);
    }

    @Override
    public String toString() {
        return "SkiJumping{" + "kpoint=" + getKpoint() + '}';
    }

    @Override
    public final String getHeaders() {
        return super.getHeaders() + "," + "kpoint";
    }

    @Override
    public final String toCVS() {
        return super.toCVS() + "," + getKpoint();
    }

    public int getKpoint() {
        return kpoint;
    }

    public void setKpoint(int kpoint) {
        this.kpoint = kpoint;
    }
    
    
}

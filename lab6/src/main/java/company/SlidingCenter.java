package company;

public class SlidingCenter extends SportsObject  {
    
    private int length;
    private int icline;
    private int veer;

    public SlidingCenter(int length, int icline, int veer, String name, int capacity, String location, SportType sportType) {
        super(name, capacity, location, sportType);
        setLength(length);
        setIcline(icline);
        setVeer(veer);
    }

    @Override
    public String toString() {
        return "SlidingCenter{" + "length=" + getLength() + ", icline=" + getIcline() + ", veer=" + getVeer() + '}';
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getIcline() {
        return icline;
    }

    public void setIcline(int icline) {
        this.icline = icline;
    }

    public int getVeer() {
        return veer;
    }

    public void setVeer(int veer) {
        this.veer = veer;
    }
    
    
}

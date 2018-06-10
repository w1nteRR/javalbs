package company;

public class HockeyCenter extends SportsObject {
    
    private int fieldSize;

    public HockeyCenter(int fieldSize, String name, int capacity, String location, SportType sportType, final Integer id) {
        super(name, capacity, location, sportType, id);
        setFieldSize(fieldSize);
    }

    @Override
    public String toString() {
        return "HockeyCenter{" + "fieldSize=" + getFieldSize() + '}';
    }

    @Override
    public final String getHeaders() {
        return super.getHeaders() + "," + "fieldSize";
    }

    @Override
    public final String toCVS() {
        return super.toCVS() + "," + getFieldSize();
    }

    public int getFieldSize() {
        return fieldSize;
    }

    public void setFieldSize(int fieldSize) {
        this.fieldSize = fieldSize;
    }
    
    
    
}

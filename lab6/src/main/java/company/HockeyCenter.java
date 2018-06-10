package company;

public class HockeyCenter extends SportsObject {
    
    private int fieldSize;

    public HockeyCenter(int fieldSize, String name, int capacity, String location, SportType sportType) {
        super(name, capacity, location, sportType);
        setFieldSize(fieldSize);
    }

    @Override
    public String toString() {
        return "HockeyCenter{" + "fieldSize=" + getFieldSize() + '}';
    }

    public int getFieldSize() {
        return fieldSize;
    }

    public void setFieldSize(int fieldSize) {
        this.fieldSize = fieldSize;
    }
    
    
    
}

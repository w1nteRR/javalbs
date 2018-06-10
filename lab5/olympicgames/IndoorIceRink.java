package olympicgames;

public class IndoorIceRink extends SportsObject  {
    
    private int fieldSize;

    public IndoorIceRink(int fieldSize, String name, int capacity, String location, SportType sportType) {
        super(name, capacity, location, sportType);
        this.fieldSize = fieldSize;
    }

    @Override
    public String toString() {
        return "IndoorIceRink{" + "fieldSize=" + fieldSize + '}';
    }

    public int getFieldSize() {
        return fieldSize;
    }

    public void setFieldSize(int fieldSize) {
        this.fieldSize = fieldSize;
    }
    
    
}

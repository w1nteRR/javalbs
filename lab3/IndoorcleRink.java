package com.company;

public class IndoorcleRink extends Objects {
    private int fieldSize;

    public IndoorcleRink(String name, int capacity, String location, SportType sportType) {
        super(name, capacity, location, sportType);
        setFieldSize(fieldSize);
    }

}

public int getFieldSize() {
    return fieldSize;
}

public void setFieldSize(int fieldSize) {
    this.fieldSize = fieldSize;
}



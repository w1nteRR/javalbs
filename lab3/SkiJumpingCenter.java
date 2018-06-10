package com.company;

public class SkiJumpingCenter extends Objects {
    private int kpoint;

    public SkiJumpingCenter(String name, int capacity, String location, SportType sportType) {
        super(name, capacity, location, sportType);
        setKpoint(kpoint);
    }

    public int getKpoint() {
        return kpoint;
    }

    public void setKpoint(int kpoint) {
        this.kpoint = kpoint;
    }

}


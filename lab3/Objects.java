package com.company;

public abstract class Objects {
    private String name;
    private int capacity;
    private String location;
    private SportType SportType;
}

 public Objects(String name, int capacity, String location, SportType sportType) {
    setName(name);
    setCapacity(capacity);
    setLocation(location);
    setSportType(sportType);
 }

 public String getName() {
    return name;
 }

 public void setName(String name) {
    this.name = name;
 }

 public int getCapacity() {
    return capacity;
}

public void setCapacity(int capacity) {
    this.capacity = capacity;
}

public String getLocation() {
    return location;
}

public void setLocation(String location) {
    this.location = location;
}

public SportType getSportType() {
    return  SportType;
}

public void setSportType(SportType sportType) {
    this.SportType = sportType;
}

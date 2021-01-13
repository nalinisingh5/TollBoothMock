package model;

public class Location {
    private String highwayNumber;
    private String city;
    private String state;
    private String pincode;

    public Location(String highwayNumber, String city, String state, String pincode) {
        this.highwayNumber = highwayNumber;
        this.city = city;
        this.state = state;
        this.pincode = pincode;
    }
}

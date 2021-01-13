package model;

public class TollBooth {
    private int id;
    private TollBoothType tollBoothType;
    private Integer numberOfVehicles;
    private Integer amount;

    public TollBooth(int id, TollBoothType tollBoothType) {
        this.id = id;
        this.tollBoothType = tollBoothType;
    }

    public TollBooth(int id, Integer numberOfVehicles) {
        this.id = id;
        this.numberOfVehicles = numberOfVehicles;
    }

    public TollBooth(int id, TollBoothType tollBoothType, Integer numberOfVehicles, Integer amount) {
        this.id = id;
        this.tollBoothType = tollBoothType;
        this.numberOfVehicles = numberOfVehicles;
        this.amount = amount;
    }
}

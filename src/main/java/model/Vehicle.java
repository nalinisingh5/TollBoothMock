package model;

public class Vehicle {

  private String licenseNumber;
  private VehicleType vehicleType;

  public Vehicle(String licenseNumber, VehicleType vehicleType) {
    this.licenseNumber = licenseNumber;
    this.vehicleType = vehicleType;
  }


  public String getLicenseNumber() {
    return licenseNumber;
  }

  public void setLicenseNumber(String licenseNumber) {
    this.licenseNumber = licenseNumber;
  }

  public VehicleType getVehicleType() {
    return vehicleType;
  }

  public void setVehicleType(VehicleType vehicleType) {
    this.vehicleType = vehicleType;
  }
}

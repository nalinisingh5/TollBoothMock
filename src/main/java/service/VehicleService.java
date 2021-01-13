package service;

import model.Vehicle;
import model.VehicleType;
import repository.VehiclePassRepository;
import repository.VehicleRepository;

public class VehicleService {

  VehiclePassService vehiclePassService = new VehiclePassService();

  public void addVehicle(String licenseNumber, VehicleType type) {
    Vehicle vehicle = new Vehicle(licenseNumber, type);
    VehicleRepository.vehicleList.add(vehicle);
  }

  public void checkDriver(String licenseNumber, String tollNumber) {
    Vehicle vehicle = findDriverByLicense(licenseNumber);
    if (validateTollPass(licenseNumber))
      System.out.println(
          vehicle.getLicenseNumber()
              + " has toll pass "
              + VehiclePassRepository.vehicleTollPassMap.get(licenseNumber));
    else vehiclePassService.givePassToVehicle(licenseNumber);
  }

  private boolean validateTollPass(String licenseNumber) {
    return VehiclePassRepository.vehicleTollPassMap.containsKey(licenseNumber);
  }

  public Vehicle findDriverByLicense(String licenseNumber) {
    return VehicleRepository.vehicleList.stream()
        .filter(vehicle1 -> vehicle1.getLicenseNumber().equals(licenseNumber))
        .findAny()
        .orElseThrow();
  }
}

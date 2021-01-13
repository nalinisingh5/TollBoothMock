package service;

import model.TollPass;
import model.Vehicle;
import repository.VehiclePassRepository;
import repository.VehicleRepository;

import java.util.Scanner;

public class VehiclePassService {

  VehiclePassRepository vehiclePassRepository = new VehiclePassRepository();

  public void givePassToVehicle(String licenseNumber) {
    Vehicle vehicle = findDriverByLicense(licenseNumber);
    System.out.println(
        TollPass.SinglePass
            + " 50, "
            + TollPass.ReturnPass
            + " 75, "
            + TollPass.OneWeek
            + " 150. ");
    Scanner scanner = new Scanner(System.in);
    String pass = scanner.nextLine();

    vehiclePassRepository.vehicleTollPassMap.putIfAbsent(
        vehicle.getLicenseNumber(),
        pass.equals(TollPass.SinglePass)
            ? TollPass.SinglePass
            : pass.equals(TollPass.ReturnPass) ? TollPass.ReturnPass : TollPass.OneWeek);
  }

  public Vehicle findDriverByLicense(String licenseNumber) {
    return VehicleRepository.vehicleList.stream()
        .filter(vehicle1 -> vehicle1.getLicenseNumber().equals(licenseNumber))
        .findAny()
        .orElseThrow();
  }
}

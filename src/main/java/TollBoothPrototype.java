import model.Location;
import model.TollBooth;
import model.TollBoothType;
import model.VehicleType;
import service.TollBoothService;
import service.TollService;
import service.VehiclePassService;
import service.VehicleService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TollBoothPrototype {
  static TollService tollService;
  static TollBoothService tollBoothService;
  static VehicleService vehicleService;
  static VehiclePassService vehiclePassService;

  public static void main(String[] args) throws IOException {

    tollService = new TollService();
    tollBoothService = new TollBoothService();
    vehicleService = new VehicleService();
    vehiclePassService = new VehiclePassService();

    // Add toll on NH1, NH2
    addToll();

    // Add vehicle
    addVehicle();

    // Assign pass
    //givePasstoVehicle();

    show("KA24234", "toll1");
    show("KA24234", "toll1");
    show("KA24234", "toll1");
    /*show("KA48508", "toll1");
    show("TN48508", "toll2");
    show("UP48528", "toll2");*/

    //buildLeaderBoard()
  }

  private static void show(String licenseNumber, String tollNumber) {
    vehicleService.checkDriver(licenseNumber, tollNumber);
  }

  private static void givePasstoVehicle() {
    vehiclePassService.givePassToVehicle("KA24234");
    vehiclePassService.givePassToVehicle("KA48508");
    vehiclePassService.givePassToVehicle("TN48508");
    vehiclePassService.givePassToVehicle("UP48528");
  }

  private static void addVehicle() {

    vehicleService.addVehicle("KA24234", VehicleType.Motorbike);
    vehicleService.addVehicle("KA48508", VehicleType.Motorbike);
    vehicleService.addVehicle("TN48508", VehicleType.Motorbike);
    vehicleService.addVehicle("UP48528", VehicleType.Car);
    vehicleService.addVehicle("MH18528", VehicleType.Car);
    vehicleService.addVehicle("MH10528", VehicleType.Motorbike);
  }

  private static void addToll() {

    List<TollBooth> tollBoothList1 = new ArrayList<>();
    tollBoothList1.add(new TollBooth(1, TollBoothType.Small));
    tollBoothList1.add(new TollBooth(2, TollBoothType.Medium));
    tollBoothList1.add(new TollBooth(3, TollBoothType.Medium));
    tollBoothList1.add(new TollBooth(4, TollBoothType.Heavy));
    tollService.addToll(
        "toll1", new Location("NH1", "Bengaluru", "Karnataka", "560100"), 4, tollBoothList1);

    List<TollBooth> tollBoothList2 = new ArrayList<>();
    tollBoothList1.add(new TollBooth(1, TollBoothType.Small));
    tollBoothList1.add(new TollBooth(2, TollBoothType.Medium));
    tollService.addToll(
        "toll2", new Location("NH2", "Bengaluru", "Karnataka", "560105"), 2, tollBoothList2);
  }
}

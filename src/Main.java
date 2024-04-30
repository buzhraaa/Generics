
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("vehicle inventory managment system");
        Scanner scanner = new Scanner(System.in);
        Inventory<Vehicle> inventory = new Inventory<>();

        boolean continueInput = true;
        while (continueInput) {
            System.out.println("Enter 'add' to add a vehicle, 'remove' to remove a vehicle, or 'stop' to finish:");
            String option = scanner.nextLine().toLowerCase();

            switch (option) {
                case "add":
                    addVehicle(scanner, inventory);
                    break;
                case "remove":
                    System.out.println("Enter the VIN of the vehicle you want to remove:");
                    String vinToRemove = scanner.nextLine();
                    boolean removed = inventory.removeFromInventory(vinToRemove);
                    if (removed) {
                        System.out.println("Vehicle removed from inventory.");
                    } else {
                        System.out.println("Vehicle does not exist in inventory.");
                    }
                    break;
                case "stop":
                    continueInput = false;
                    break;
                default:
                    System.out.println("Invalid option. Please enter 'add', 'remove', or 'stop'.");
                    break;
            }
        }

        System.out.println("Final Inventory:");
        for (Vehicle vehicle : inventory.getInventory()) {
            System.out.println(vehicle);
        }

        scanner.close();
    }

    private static void addVehicle(Scanner scanner, Inventory<Vehicle> inventory) {
        System.out.println("Enter vehicle type (car/truck):");
        String vehicleType = scanner.nextLine().toLowerCase();

        System.out.println("Enter model:");
        String model = scanner.nextLine();
        System.out.println("Enter VIN:");
        String vin = scanner.nextLine();
        System.out.println("Enter horsepower:");
        int horsepower = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        if (vehicleType.equals("car")) {
            Car car = new Car(model, vin, horsepower);
            inventory.addToInventory(car);
        } else if (vehicleType.equals("truck")) {
            Truck truck = new Truck(model, vin, horsepower);
            inventory.addToInventory(truck);
        } else {
            System.out.println("Invalid vehicle type. Vehicle not added to inventory.");
        }
    }
}
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
public class CarInventory {
    ArrayList<Car> cars = new ArrayList<Car>();
    public CarInventory() {
        this.cars.add(new Car("Honda", "CRZ", "Grey", 2015, 100000));
        this.cars.add(new Car("Toyota", "Camry", "Grey", 2015, 20000));
        this.cars.add(new Car("Kia", "Soul", "Green", 2015, 40000));
        this.cars.add(new Car("Toyota", "Corolla", "Silver", 2015, 200000));
        this.cars.add(new Car("Honda", "CRZ", "Black", 2018, 100000));
        this.cars.add(new Car("Toyota", "RAV4", "Pink", 2020, 20000));
        this.cars.add(new Car("Kia", "Soul", "Blue", 2019, 40000));
        this.cars.add(new Car("Toyota", "Corolla ", "Silver", 2015, 200000));
        this.cars.add(new Car("Honda", "CRV", "Black", 2010, 400000));
        this.cars.add(new Car("Toyota", "Highlander", "White", 2018, 80000));
        this.cars.add(new Car("Honda", "CRZ", "Black", 2018, 100000));
        this.cars.add(new Car("Toyota", "RAV4", "Yellow", 2021, 40000));
        this.cars.add(new Car("Dodge", "Charger", "Black", 2023, 4000));
        this.cars.add(new Car("Toyota", "Corolla ", "White", 2012, 300000));
    }
    public Car createCarfrominput () {
        Scanner scnr = new Scanner(System.in);
        System.out.print("Please provide the make of the car (enter to cancel): ");
        String make = scnr.nextLine();
        if (make.equals("")) {
            return null;
        }
        System.out.print("Please provide the model of the car (enter to cancel): ");
        String model = scnr.nextLine();
        if (model.equals("")) {
            return null;
        }
        System.out.print("Please provide the color of the car (enter to cancel): ");
        String color = scnr.nextLine();
        if (color.equals("")) {
            return null;
        }
        Integer year = null;
        while (year == null) {
            try {
                System.out.print("Please enter the year of the car: ");
                int tempyear = Integer.parseInt(scnr.nextLine());
                if (1900 <= tempyear && tempyear < 9999) {
                    year = tempyear;
                } else {
                    System.out.print ("Please print a year between 1900 and beyond.");
                }
            }catch (NumberFormatException excpt) {
                System.out.println("Please enter a valid numerical value.");
            }
        }
        Integer mileage = null;
        while (mileage == null) {
            try {
                System.out.print("Please enter the mileage of the car: ");
                int tempmileage = Integer.parseInt(scnr.nextLine());
                if (0 <= tempmileage) {
                    mileage = tempmileage;
                } else {
                    System.out.print ("Please enter a positive integer.");
                }
            }catch (NumberFormatException excpt) {
                System.out.println("Please enter a valid numerical value.");
            }
        }
        return new Car (make, model, color,year, mileage);
    }
    public void addCar() {
        System.out.println("Currently, there are " + cars.size() + " cars in inventory.");
        System.out.println("Please enter the following information to add a car.");
        Car car = this.createCarfrominput();
            if (car != (null)) {
                this.cars.add(car);
                System.out.print("The car below was successfully added to inventory at position....: " + (cars.size() - 1));
                System.out.print(this.cars.get(cars.size() - 1));
            }
    }
    public void removeCar() {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Currently, there are " + cars.size() + " cars in inventory.");
        System.out.println("Enter a value from 0 to " + (cars.size()-1) +
                ", with the first car starting at position 0.");
        System.out.print("Please enter a position to remove from inventory...:");
        try {
            if (cars.size() == 0) {
                System.out.print ("Inventory is empty.");
            } else {
                int index = Integer.parseInt(scnr.nextLine());
                System.out.print(this.cars.remove(index));
                System.out.print("\nThe car at pos: " + index + "has been successfully removed.");
                }
        } catch (IndexOutOfBoundsException excpt) {
            System.out.print("Failure. Item does not exist.");
        } catch (NumberFormatException excpt) {
            System.out.println("Failure. Please enter a valid numerical value.");
        }
    }
    public void updateCar() {
        Scanner scnr = new Scanner(System.in);
            try {
                if (cars.size() == 0) {
                    System.out.print ("Inventory is empty.");
                } else {
                    System.out.println("Currently, there are " + cars.size() + " cars in inventory"
                                        + ", with the first car starting at position 0.");
                    System.out.print("Update car at the position from 0 to 13...: ");
                    int index = Integer.parseInt(scnr.nextLine());
                    if (index >= 0 && index < cars.size()) {
                        Car carUpdate = createCarfrominput();
                        if (carUpdate != null) {
                            System.out.println("The car at position " + index + " has been successfully updated.");
                            System.out.print("Old:");
                            System.out.println(this.cars.set(index, carUpdate));
                            System.out.print("New:");
                            System.out.print(this.cars.get(index));
                        }
                    } else {
                        System.out.print ("Please enter an existing position.");
                    }
                }
            } catch (IndexOutOfBoundsException excpt) {
                System.out.print("Failure. Item does not exist.");
            } catch (NumberFormatException excpt) {
                System.out.println("Failure. Please enter a valid numerical value.");
            }
        }
    public void viewInventory() {
        if (cars.size() == 0) {
            System.out.print ("Inventory is empty.");
        } else {
            System.out.println("Currently, there are " + cars.size() + " cars in inventory.");
            for (int i = 0; i < cars.size(); i++) {
                System.out.printf("%d:\t\t%s\n", i, cars.get(i));
            }
        }
    }
    public void printCar () {
        Scanner scnr = new Scanner(System.in);
        FileOutputStream filestream= null;
        PrintWriter outFS = null;
        try {
            if (cars.size() == 0) {
                System.out.print("Inventory is empty.");
            } else {
                String input = "";
                while (!input.equals("N")) {
                    System.out.println("Currently, there are " + cars.size() + " cars in inventory.");
                    System.out.println("File will print to the current !!! W O R K I N G - D I R E C T O R Y !!!");
                    System.out.println("Type 'Y' to export data to file. 'N' to cancel...:");
                    input = scnr.nextLine();
                    if (input.equalsIgnoreCase("Y")) {
                        filestream = new FileOutputStream("Car_Inventory.txt");
                        outFS = new PrintWriter(filestream);
                        for (int i = 0; i < cars.size(); i++) {
                            outFS.printf("%d:\t\t%s\n", i, cars.get(i));
                        } outFS.close();
                        return;
                    } else if (!input.equalsIgnoreCase("N")) {
                        System.out.print("Invalid entry. Please enter 'Y' or 'N' to continue or cancel action");
                    } else {
                        break;
                    }
                }
            }
        } catch (IOException excpt) {
            System.out.println("Failure. Action attempted could not be complete.");
        }
    }
    public void mainLoop() {
        Scanner scnr = new Scanner(System.in);
        int selection = 0;
        while (selection != 6) {
            System.out.println();
            System.out.println (" 1 = Add a car");
            System.out.println (" 2 = Remove a car");
            System.out.println (" 3 = Update a car");
            System.out.println (" 4 = View inventory");
            System.out.println (" 5 = Print to file");
            System.out.println (" 6 = End");

            System.out.print("Please enter an option from 1 to 6...:");

            try {
                selection = Integer.parseInt(scnr.nextLine());
                switch (selection) {
                    case 1 -> this.addCar();
                    case 2 -> this.removeCar();
                    case 3 -> this.updateCar();
                    case 4 -> this.viewInventory();
                    case 5 -> this.printCar();
                    case 6 -> { return; }
                    default -> System.out.print("Invalid selection. Please select a valid option.");
                }
            } catch(NumberFormatException excpt) {
                System.out.println("Please enter a valid entry.");
            }
        }
    }
}
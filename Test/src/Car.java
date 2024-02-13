/**
 * A class representing a car inventory
 * With defining features of make, model, color, and year.
 * Import Java.io provide classes for input and output operations
 * I.e. reading, writing, etc.
 */
public class Car {
    /**
     * the make portion of car
     */
    public String make;
    /**
     * the model portion of car
     */
    public String model;
    /**
     * the color portion of car
     */
    public String color;
    /**
     * the year portion of car
     */
    public int year;
    /**
     * the mileage of car
     */
    public int mileage;

    /**
     * Class constructor initializes the car's year, make, model, mileage, and color.
     */
    public Car(String make, String model, String color, int year, int mileage) {
        this.year = year;
        this.make = make;
        this.model = model;
        this.color = color;
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return String.format("\n\t Make   : %s\n\t Model  : %s\n\t Color  : %s\n\t Year   : %d\n\t Mileage: %d",
                make, model, color, year, mileage);
    }
}


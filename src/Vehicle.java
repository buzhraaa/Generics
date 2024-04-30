abstract class Vehicle {
    final String MAKE = "Ford";
    String model;
    String vin;
    int horsepower;

    public Vehicle(String model, String vin, int horsepower) {
        this.model = model;
        this.vin = vin;
        this.horsepower = horsepower;
    }

    // Getters and setters
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    // toString method
    @Override
    public String toString() {
        return "Make: " + MAKE + ", Model: " + model + ", VIN: " + vin + ", Horsepower: " + horsepower;
    }
}
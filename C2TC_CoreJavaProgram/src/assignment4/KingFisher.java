package assignment4;

class KingFisher implements Airfare {
    private int hours;
    private double costPerHour;

    // Default constructor
    public KingFisher() {
        this.hours = 0;
        this.costPerHour = 0.0;
    }

    // Parameterized constructor
    public KingFisher(int hours, double costPerHour) {
        this.hours = hours;
        this.costPerHour = costPerHour;
    }

    // Getters and Setters
    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getCostPerHour() {
        return costPerHour;
    }

    public void setCostPerHour(double costPerHour) {
        this.costPerHour = costPerHour;
    }

    // Implement calculateAmount (define logic as needed)
    @Override
    public double calculateAmount() {
        // As example, same as AirIndia
        return hours * costPerHour;
    }

    // Implement display method
    @Override
    public void display() {
        System.out.println("KingFisher: Hours = " + hours + ", Cost per Hour = " + costPerHour + ", Total Amount = " + calculateAmount());
    }
}
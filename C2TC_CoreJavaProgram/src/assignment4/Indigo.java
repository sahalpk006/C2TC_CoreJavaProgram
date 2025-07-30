package assignment4;

class Indigo implements Airfare {
    private int hours;
    private double costPerHour;

    // Default constructor
    public Indigo() {
        this.hours = 0;
        this.costPerHour = 0.0;
    }

    // Parameterized constructor
    public Indigo(int hours, double costPerHour) {
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

    // Implement calculateAmount (with 8 as per question)
    @Override
    public double calculateAmount() {
        return hours * costPerHour * 8;
    }

    // Implement display method
    @Override
    public void display() {
        System.out.println("Indigo: Hours = " + hours + ", Cost per Hour = " + costPerHour + ", Total Amount = " + calculateAmount());
    }
}

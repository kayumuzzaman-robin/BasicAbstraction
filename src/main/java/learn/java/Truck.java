package learn.java;

public class Truck extends Vehicle{
    @Override
    public void run() {
        System.out.println("Truck: Abstract method run() get called");
    }

    @Override
    public String toString() {
        return "\"Truck: Abstract method toString() get called\"";
    }
}

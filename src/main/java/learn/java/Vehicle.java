package learn.java;

public abstract class Vehicle {
    private String color;
    private int wheel;

    public Vehicle() {
        System.out.println("Vehicle() No Arg. constructor ger called");
    }

    public Vehicle(String color, int wheel) {
        System.out.println("Vehicle() Parameterized constructor ger called");
        this.color = color;
        this.wheel = wheel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    public abstract void run();
    public abstract String toString();
    public void work(){
        System.out.println("Vehicle: work() method is called");
    }

    public final void finalMethod(){
        System.out.println("Vehicle: This is a final method, can't override");
    }

    public static void staticMethod(){
        System.out.println("Vehicle: This is a static method, can't override");
    }
}

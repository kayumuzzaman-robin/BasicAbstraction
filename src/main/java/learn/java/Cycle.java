package learn.java;

public class Cycle extends Vehicle{
    private int sitNumber;

    public Cycle() {
        System.out.println("Cycle(): No Arg. constructor get called");
    }

    public Cycle(String color, int wheel, int sitNumber) {
        super(color, wheel);
        this.sitNumber = sitNumber;
        System.out.println("Cycle() Parameterized constructor get called");
    }

    public int getSitNumber() {
        return sitNumber;
    }

    public void setSitNumber(int sitNumber) {
        this.sitNumber = sitNumber;
    }

    @Override
    public void run() {
        System.out.println("Cycle: Abstract Method Run() method get called");
    }

    @Override
    public String toString() {
        return "Cycle{" +
                "color=" + super.getColor() + ", " +
                "wheel=" + super.getWheel() + ", " +
                "sitNumber=" + sitNumber +
                '}';
    }

    @Override
    public void work() {
        System.out.println("Cycle: Work() method get called");
    }



}

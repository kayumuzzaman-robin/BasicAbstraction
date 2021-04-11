package learn.java;

/**
 * Abstraction
 */
public class App {
    public static void main(String[] args) {
        Vehicle avengers = new Cycle();
        avengers.setColor("Red");
        avengers.setWheel(2);
        // avengers.setSitNumber(1); We can't set sitNumber as we are referring sub class object to parent class &
        // parent class don't have any field like sitNumber. We need to use constructor to set this value
        System.out.println(avengers.toString());
        avengers.run();
        avengers.work();
        avengers.finalMethod();
        Vehicle.staticMethod();

        System.out.println();

        Vehicle duronto = new Cycle("Yellow", 2, 1);
        System.out.println(duronto.toString());
        duronto.run();
        duronto.work();
        duronto.finalMethod();
        Vehicle.staticMethod();

        System.out.println();

        Cycle heroCycle = new Cycle("Black", 1, 1);
        System.out.println(heroCycle.toString());
        heroCycle.run();
        heroCycle.work();
        heroCycle.finalMethod();
        Cycle.staticMethod();

        System.out.println();

        Cycle bmw = new Cycle();
        System.out.println(bmw.toString());
        bmw.run();
        bmw.work();
        bmw.finalMethod();
        Cycle.staticMethod();
    }
}

package irach.demo.profiler;

public class Stats {
    // lazy, non-thread-safe singleton
    private static Stats instance = new Stats();
    private Stats (){}

    public static Stats getInstance(){
        return instance;
    }

    private int counter;

    public int getCounter() {
        return counter;
    }

    // incs and prints output
    public void incCounter() {
        this.counter++;
        System.out.println("Log has been called " + this.counter + " times.");
    }
}

package Tasks;

import java.util.ArrayList;

public class DbManager {
    public static ArrayList<Worker> workers = new ArrayList<>();
    static {
        workers.add(new Worker("Insar", "Askarov", "IT", 200000));
        workers.add(new Worker("Yedil", "Bakenov", "IT", 500000));
        workers.add(new Worker("Somebody", "Someone", "PR", 150000));
        workers.add(new Worker("Lox", "Loxox", "LOX", 600000));
    }
    public static void addWorker(Worker worker) {
        workers.add(worker);
    }
}

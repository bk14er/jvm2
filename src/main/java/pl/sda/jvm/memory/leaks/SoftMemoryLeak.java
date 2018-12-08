package pl.sda.jvm.memory.leaks;

/**
 * -Xmx10m - rozmiar stery 10mb
 * -Xms to startowy rozmiar sterty
 * JVisualVM
 *
 *
 * Soft leak - obiekt ma referencje na stosie, nawet jeśli nigdy go nie użyje
 */
public class SoftMemoryLeak {

    public static void main(String[] args)  {
        TaskManager cm = new TaskManager();
        PersonTask task = new PersonTask(cm);
        for (int user = 0; user < 10; user++) {
            Thread t = new Thread(task);
            t.start();
        }

        while (true) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            cm.howManyTask();
            System.out.println("Available memory: " + Runtime.getRuntime().freeMemory() / 1024 + "k");

        }
    }

}

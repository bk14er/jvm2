package pl.sda.jvm.jstack;

/**
 *  use in cmd(Windows)
 *
 *  jstack -help
 *
 *  jps - wyświetla wszystkie procesy jvm aktualnie działajce
 *  https://docs.oracle.com/javase/7/docs/technotes/tools/share/jps.html
 *
 */
public class JavaStack {

    public static void main(String[] a) {
        Runtime rt = Runtime.getRuntime();
        System.out.println("Free memory: " + rt.freeMemory());
        System.out.println("Total memory: " + rt.totalMemory());
        try {Thread.sleep(1000*60*60);}
        catch (InterruptedException e) {}
    }

}

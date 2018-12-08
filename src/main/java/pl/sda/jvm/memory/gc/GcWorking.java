package pl.sda.jvm.memory.gc;

public class GcWorking {

    public static void main(String[] args)
    {
        Runtime runtime = Runtime.getRuntime();

        long availableBytes = runtime.freeMemory();
        System.out.println("Available memory before create: " + availableBytes / 1024 + "k");

        // let's create a ton of garbage....
        Customer c;
        for (long i=0; i<100000; i++)
        {
            c = new Customer("John"+i);
        }

        availableBytes = runtime.freeMemory();
        System.out.println("Available memory before gc: " + availableBytes / 1024 + "k");

        System.gc();

        availableBytes = runtime.freeMemory();
        System.out.println("Available memory after gc: " + availableBytes / 1024 + "k");
    }


}

package pl.sda.jvm.jmh;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

import org.openjdk.jmh.Main;

@State(value = Scope.Benchmark)
public class CollectionBenchmarkTest {


    private ArrayList<Integer> listInteger;
    private LinkedList<Integer> linkedList;
    private Integer[] array;

    private int n = 10000;

    /**
     * Uruchomienie benchmarka
     */
    public static void main(String[] args) throws Exception {
        Main.main(args);
    }


    @Setup(value = Level.Trial)
    public void init() {
        listInteger = new ArrayList<>();
        linkedList = new LinkedList<Integer>();

        for (int number = 0; number < n; number++) {
            listInteger.add(number);
            linkedList.add(number);
        }

        Collections.shuffle(linkedList);
        Collections.shuffle(listInteger);

        array = listInteger.toArray(new Integer[]{});

    }


    @Benchmark
    @BenchmarkMode(value = Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    @Fork(1)
    @Measurement(iterations = 10)
    @Warmup(iterations = 1)
    public void testListInteger(Blackhole blackhole){
        for(Integer number : listInteger){
            blackhole.consume(number);
        }
    }

    @Benchmark
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    @BenchmarkMode(value = Mode.AverageTime)
    @Fork(1)
    @Measurement(iterations = 10)
    @Warmup(iterations = 1)
    public void testLinkedList(Blackhole blackhole){
        for(Integer number : linkedList){
            blackhole.consume(number);
        }
    }


    @Benchmark
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    @BenchmarkMode(value = Mode.AverageTime)
    @Fork(1)
    @Measurement(iterations = 10)
    @Warmup(iterations = 1)
    public void testArray(Blackhole blackhole){
        for(int i = 0 ; i < array.length; i++){
            blackhole.consume(i);
        }
    }

}




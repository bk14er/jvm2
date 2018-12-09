package pl.sda.jvm.jmh;

import org.openjdk.jmh.Main;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;
import pl.sda.jvm.jmh.strategy.MergeSort;
import pl.sda.jvm.jmh.strategy.QuickSort;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/*
 * Napisz benchmark porównujący sortowanie MergeSort i QuickSort (Użyj już istniejących klas)
 *
 * Np. dla tablicy : int[] input = {57,51,2,41,43,21,5,9,11,6,15};
 *
 * Test pownien zostać uruchomiony w jednym procesie
 * Dodatkowo 5 operacji tzn. rozgrzewek trawjących 2 sekundy
 * Pomiar powinień zostać wykonany dla 5 prób trawjących 5 sekund
 *
 * Pamiętaj, żeby przygotować dane testowe ( tablica ) z użyciem @State
 *
 * Wynik należy przedstawić jako średni czas wykonania operacji w nanosekundach
 *
 */
@State(value = Scope.Benchmark)
public class TaskSolutions {

    private Integer[] elements;

    private MergeSort mergeSort;
    private QuickSort quickSort;

    /**
     * Uruchomienie benchmarka
     */
    public static void main(String[] args) throws Exception {
        Main.main(args);
    }

    @Setup(value = Level.Trial)
    public void init() {
        mergeSort = new MergeSort();
        quickSort = new QuickSort();


        List<Integer> temp = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 100_000; i++) {
            temp.add(random.nextInt());
        }
        elements = temp.toArray(new Integer[]{});
    }


    @Benchmark
    @BenchmarkMode(value = Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    @Fork(1)
    @Measurement(iterations = 10)
    @Warmup(iterations = 10)
    public void testMergeSort(Blackhole blackhole){
        blackhole.consume(mergeSort.sort(elements));
    }

    @Benchmark
    @BenchmarkMode(value = Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    @Fork(1)
    @Measurement(iterations = 10)
    @Warmup(iterations = 10)
    public void testQuickSort(Blackhole blackhole){
        blackhole.consume(quickSort.sort(elements));
    }


}

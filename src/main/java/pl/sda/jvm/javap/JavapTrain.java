package pl.sda.jvm.javap;

/**
 * Intelij:
 * View -> Showbytecode
 *
 * cmd :
 * javac JavapTrain.java
 * javap -c JavaTrain.class > JavaTrain.bc
 *
 * javap - generuje czytelny byte code
 *      parametr -c disassemble code
 *      > JavaTrain.bc -> zapisz wynik do pliku JavaTrain.bc
 *
 *
 * https://docs.oracle.com/javase/7/docs/technotes/tools/windows/javap.html
 *
 */
public class JavapTrain {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

}

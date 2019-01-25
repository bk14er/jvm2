package pl.sda.jvm.valuePassing;

public class StackRunner {

    public static void main(String args[]){
        int value = 7;
        value = calculate(value);

    }

    private static int calculate(int value) {

        int tempValue = value  + 3;
        int newValue = tempValue * 2;
        return newValue;

    }

}

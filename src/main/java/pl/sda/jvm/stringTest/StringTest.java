package pl.sda.jvm.stringTest;

public class StringTest {

    public static void main(String[] args){

        String test1 = new String("test").intern();
        String test2 = "test";

        if(test1 == test2){
            System.out.print("Są równe");
        }else{
            System.out.print("Nie są równe");
        }


    }

}

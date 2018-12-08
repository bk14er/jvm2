package pl.sda.jvm.jit;

public class JitTrain {


    public static void main(String[] args){

        Inner inner = new Inner();
        System.out.print(inner);
        testSwap(inner);
        System.out.print(inner);
        testSwap1(inner);
        System.out.print(inner);
    }

    public static void testSwap(Inner inner){
        inner = new Inner();
        inner.setMessage("Bad swap");
    }

    public static void testSwap1(Inner inner){
        inner.setMessage("Bad swap");
    }

    public static void sayHello(){

        throw new NullPointerException("Cannot be null");
    }


    private static class Inner{
        private String message = "OK";

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        @Override
        public String toString() {
            return "Inner{" +
                    "message='" + message + '\'' +
                    '}';
        }
    }

}

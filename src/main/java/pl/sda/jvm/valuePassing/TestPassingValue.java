package pl.sda.jvm.valuePassing;

public class TestPassingValue {


    public static void main(String args[]){
        User user = new User();
        System.out.println(user);
        testPassingVal1(user);
        System.out.println(user);


    }

    private static void testPassingVal1(User user){
        user.setName("Changed");
    }


    private static class User{
        private String name = "Jonh";


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

}

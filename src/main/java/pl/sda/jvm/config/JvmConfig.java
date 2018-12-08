package pl.sda.jvm.config;

public class JvmConfig {

    public static void main(String[] args) {
        System.out.println("Java Virtual Machine specification version  : " + System.getProperty("java.vm.specification.version"));
        System.out.println("Java Virtual Machine specification vendor : " + System.getProperty("java.vm.specification.vendor"));
        System.out.println("Java Virtual Machine specification name : " + System.getProperty("java.vm.specification.name"));
        System.out.println("Java Virtual Machine implementation version : " + System.getProperty("java.vm.version"));
        System.out.println("Java Virtual Machine implementation vendor : " + System.getProperty("java.vm.vendor"));
        System.out.println("Java Virtual Machine implementation name : " + System.getProperty("java.vm.name"));
    }

}

package pl.sda.jvm.classloader;

/**
 * java -verbose ClassLoader lub java -vervose ClassLoader |more
 */
public class ClassLoader {

    public static void main(String[] args){
        Object o = "Witaj świecie";

        for(int i = 0 ; i < 10; i++){
            System.out.println("<p><b>" + o.toString()+ "</b></p>");
        }

    }


}

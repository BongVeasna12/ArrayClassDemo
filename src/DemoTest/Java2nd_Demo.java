package DemoTest;

import com.sun.tools.javac.Main;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Java2nd_Demo {
    //class block
    //static variable
    //instance variable of object variable
//    String message;
//    static int AGE = 0;
//    public static void main(String[] args) {
//        Java2nd_Demo demo = new Java2nd_Demo();
//        System.out.println("Starting");
//        int port;
//        port = 20;
//        System.out.println("Port: " + port);
//        System.out.println("Age is: " + Java2nd_Demo.AGE);
//        System.out.println("Message is: " + demo.message);
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the port number");
            scanner.useDelimiter(",");
            String line = scanner.next();
            String message = scanner.next();
            System.out.println("Line: " + line);
            System.out.println("Message: " + message);
        scanner.close();

    }
}

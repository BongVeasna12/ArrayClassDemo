package DemoTest;

import java.util.Scanner;

public class JavaDemo_switch_case {
    public static void main(String[] args) {
//          Scanner scanner = new Scanner(System.in);
//          int weekday = scanner.nextInt();
//          switch ( weekday ) {
//              case 6:
//                  System.out.println("This is the saturday!");
//              case 7:
//                  System.out.println("This is the sunday!");
//              default:
//                  System.out.println("Here is not the weekday");
//                    }

        Scanner scanner1 = new Scanner(System.in);
        int weekday = scanner1.nextInt();
        switch (weekday) {
            case 1 -> System.out.println("This is the saturday!");
            case 2 -> System.out.println("This is the sunday!");
            default -> System.out.println("Here is not the weekday");
        }
    }

}
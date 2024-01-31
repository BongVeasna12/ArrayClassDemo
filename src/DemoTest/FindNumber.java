package DemoTest;

import java.util.Scanner;

public class FindNumber {
    static int count=0;

    public static void main(String[] args) {
        FindNumber test = new FindNumber();
        System.out.println("FindNumber" + test.count);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scanner.nextInt();
        if(number %2==0) {
            System.out.println("number is even");
        }else if(number %2==1) {
            System.out.println("number is odd number");
        }else if (number == 0) {
            System.out.println("number is invalid");
        } else if (number <=0) {
            System.out.println("number is negative");
        }else {
            System.out.println("Enter again ");
        }



    }

}

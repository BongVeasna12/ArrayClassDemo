package DemoTest;

import java.util.Arrays;


//        int[] arr;
//        arr = new  int [5];
//        arr[0] = 10;
//        arr[1] = 20;
//        arr[2] = 50;
//        arr[3] = 80;
//        arr[4] = 100;
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println("Array "+ i + ": " + arr[i]);
//        }
        public class ArrayDemo {
            public static void main(String[] args) {
//                int[] arr = new int[]{1,2,3,4,5};
//                int[] arr_new = new int[arr.length-1];
//                int indexToRemove=3;
//                for(int i=0, j=0;i<arr.length;i++){
//                    if(i!=indexToRemove){
//                        arr_new[j]=arr[i];j++;
//                    }
//                }
//                System.out.println("Before remove :" + Arrays.toString(arr));
//
//                System.out.println("After remove :" + Arrays.toString(arr_new));
//                int[] originalArray = {1, 2, 3, 4, 5};
//
//                // Element to remove
//                int elementToRemove = 3;
//
//                // Find the index of the element to remove
//                int indexToRemove = -1;
//                for (int i = 0; i < originalArray.length; i++) {
//                    if (originalArray[i] == elementToRemove) {
//                        indexToRemove = i;
//                        break;
//                    }
//                    System.out.println("Remove element"+ originalArray[i]);
//                    System.out.println("Remove index"+ indexToRemove);
//                }


//
//                for (int i = 0; i < 10; i++) {
//                    if (i==4){
//                        break;
//                    }
//                        System.out.println("I"+ i);
//                }

                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j <3 ; j++) {
                        System.out.println("I: " + i +" " + "J: " + j);

                    if (j==2){
                        continue;
                    }
                    if (i == 1){
                        break;
                    }
                    }
                }
            }

}

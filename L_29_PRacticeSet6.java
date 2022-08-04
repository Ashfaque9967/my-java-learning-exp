// import java.util.Scanner;

//public class L_29_PRacticeSet6 {
//    public static void main(String[] args) {
//
//        Problem : 1
        /*
        float [] marks = {74.5f, 37.5f, 74.5f, 85.5f, 85.5f,};
        float sum = 0;
        for (float inner: marks){
            sum = sum + inner;
        }
        System.out.println("The sum of marks : " + sum);

         */

//        problem : 2
        /*
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks : ");
        int num = sc.nextInt();
        boolean isinarray = false;
        int [] marks = {86, 57, 97, 85, 82,};
        for (int inner: marks) {
            if (num == inner) {
                isinarray = true;
            }
        }
        if (isinarray){
            System.out.println("The entered marks " + num + " is in array");
        }
        else System.out.println("The entered marks " + num + " is not in array");

         */

//        Problem : 3
        /*
        int [] marks = {86, 58, 93, 75, 96};
        int sum = 0;
        for (int inner : marks){
            sum = sum + inner;
        }
        System.out.println("The value of average marks is " + sum/ marks.length);


        */

//        Problem : 4
        /*
        int [][] mat1 = {{2, 2, 2},
                          {2, 2, 2}};
        int [][] mat2 = {{2, 2, 2,},
                          {2, 2, 2}};
        int [][] result = {{0, 0, 0},
                          {0, 0, 0}};
        for (int i = 0; i< mat1.length;i++){
            for (int j = 0;j< mat1[1].length;j++){
//                System.out.format(" Setting value for i=%d and j=%d\n", i ,j );
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
//        Printing the elements if 2-d array
        for (int i = 0; i < mat1.length;i++) {
            for (int j = 0; j < mat1[1].length; j++) {
                System.out.format(result[i][j] + " ");
                result[i][j] = mat1[i][j] + mat2[i][j];

            }
            System.out.println("");
        }

         */

//        Problem : 5

//        int[] arr = {1, 2, 3, 4, 5, 6};
//        int l = arr.length;
//        int n = Math.floorDiv(l, 2);
//        int temp;
//
//        for (int i=0;i<n;i++){
//            swap a[i] and a[l-1-i]
//             a   b   temp
//            |5| |0| ||
//            |4| |1| ||
//            |3| |2| ||
//            temp= arr[i];
//            arr[i] = arr[l-i-1];
//            arr[l-i-1] = temp;
//        }
//        for (int inner: arr){
//            System.out.print(inner +" ");
//        }



//        Problem : 6
        /*
        int[] arr = {1, 2, 33, 4, 5, 6};
        int max = 0;
        for (int inner:arr){
            if (inner>max){
                max = e;
            }
        }
        System.out.println("The max value of this array is "+max);

         */

//        Problem : 7
        /*
        int[] arr = {2, 3, 1, 5, 6};
        int mini = Integer.MAX_VALUE;
        for (int inner:arr){
            if (inner<mini){
                mini=inner;
            }
        }
        System.out.println("The mini value of this array is "+mini);

         */

//        Problem : 8
/*
        int[] arr = {1, 2, 33, 4, 5, 6};
        boolean isSorted = true;
        for (int i = 0;i<arr.length-1;i++){
            if (arr[i] > arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if (isSorted){
            System.out.println("This array is sorted");
        }
        else {
            System.out.println("This array is not sorted");
        }

 */

//    }
//}

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {

        int negative=0;
        int positive=0;
        int zero=0;
        int n=arr.length;



        for (int i=0;i<arr.length;i++){
            if(arr[i]>0){
                positive++;
            }else if (arr[i]<0){
                negative++;
            }else{
                zero++;
            }
        }
        


        double fraction1 = (double)positive / n;
        double fraction2 = (double)negative / n;
        double fraction3 = (double)zero / n;
        
        
        System.out.println(fraction1);
        System.out.println(fraction2);
        System.out.println(fraction3);


       

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}

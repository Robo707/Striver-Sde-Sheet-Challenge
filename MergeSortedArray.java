public import java.io.*;
import java.util.* ;

public class Solution {
    public static int[] ninjaAndSortedArrays(int arr1[], int arr2[], int m, int n) {
        // Write your code here.
        int [] arrx = new int [m + n];


          int k = 0;
        int l = 0;
        int c = m;
        int d = n;
        int i = 0;

        while (k < m && l < n) {
            if(arr1[k] >= arr2[l]) {
                arrx[i] = arr2[l];
                l++;
                d--;
            }  else {
                arrx[i] = arr1[k];
                k++;
                c--;
            }
            i++;
        }

            while(c> 0) {
                arrx[i] = arr1[k];
                k++;
                c--;
                i++;
            }
        

            while(d > 0) {
                arrx[i] = arr2[l];
                l++;
                d--;
                i++;
            }
        

        return arrx;



    }
}
 {
    
}

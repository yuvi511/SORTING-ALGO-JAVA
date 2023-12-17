import java.util.*;
public class Reverse1D {

    public static void reverse(int[] arr){
        int n = arr.length;
        for(int i = 0;i<(arr.length+1)/2;i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;



        }

    }
    public static void main(String[] args){
        int arr[] = {1,2,3,4};
        reverse(arr);
        System.out.println(Arrays.toString(arr));

        
    }

    
}

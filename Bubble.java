import java.util.*;
class Bubble{
    static void BubbleSort(int[] arr){
        int n = arr.length;
        for(int i = 0;i<n-1;i++){
            for(int j = 1;j<n-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp; 
                }
            }
        }
    }

    

    public static void main(String[] args){
        int []  arr = {4,5,1,7,9};
        BubbleSort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
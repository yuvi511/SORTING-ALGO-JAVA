import java.util.*;
class Insertion {
    static void InsertionSort(int[] arr){
        int n = arr.length;

        for(int i = 0;i<=n-2;i++){
            for(int j = i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }

                else{
                    break;
                }
            }

        }
    }



    public static void main(String[] args){
        int[] arr = {5,1,2,0,1,10,100};
        
       
        InsertionSort(arr);
        System.out.println(Arrays.toString(arr));

    }

}
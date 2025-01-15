import java.util.Arrays;

public class SortUtils {
    public static void bubbleSort(int[] arr){
        boolean sorted = false;
        while(!sorted){
            for(int i = 0; i<arr.length-1;i++){
                System.out.println(Arrays.toString(arr)+" "+i);

                if(arr[i]>arr[i+1]){

                    arr[i] = arr[i] ^ arr[i+1];
                    arr[i+1] = arr[i] ^ arr[i+1];
                    arr[i] = arr[i] ^ arr[i+1];

                }
            }
            sorted = true;

            for(int i = 0 ; i< arr.length-1;i++){
                if (arr[i] > arr[i+1]) {
                    sorted=false;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

import java.util.Arrays;

public class Utils {
    public static void bubbleSort(int[] arr){

        int sortLength = arr.length-1;
        while(sortLength>0){
            for(int i = 0; i<sortLength;i++){
                System.out.println(Arrays.toString(arr)+" "+i);

                if(arr[i]>arr[i+1]){

                    arr[i] = arr[i] ^ arr[i+1];
                    arr[i+1] = arr[i] ^ arr[i+1];
                    arr[i] = arr[i] ^ arr[i+1];

                }
            }
            sortLength--;

        }
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr){

        for(int i=0; i<arr.length -1;i++){
            int bookmark = i;
            for(int j=i+1; j<arr.length;j++){
                if(arr[j]<arr[bookmark]){
                    bookmark=j;
                }
            }
            int a = arr[i];
            arr[i]=arr[bookmark];
            arr[bookmark]=a;


        }

        System.out.println(Arrays.toString(arr));

    }

    public static int findPosition(int[] arr, int number){
        int counter =0;
        for (int i = 0; i < arr.length; i++) {
            counter++;
            if(arr[i]==number){
                System.out.println(counter);
                return i;
            }
        }
        System.out.println(counter);

        return -1;
    }

    public static int binarySearch(int[] arr, int number){
        int counter =0;
        int left= 0;
        int right = arr.length-1;

        while(left<=right) {
            int mid = left + ((right - left) / 2);
            counter++;
            if (arr[mid] == number) {
                System.out.println(counter);
                return mid;
            } else if (arr[mid] < number) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }
        System.out.println(counter);

        return -1;
    }
}

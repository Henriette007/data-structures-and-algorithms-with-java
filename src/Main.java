import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr = {-234,45,-3,45,23,957,-23,54,-985,4,67,765,-998,12,63,67,-34,9,70,-122};


//        Utils.selectionSort(arr);
//        Arrays.sort(arr);
//        int position = Utils.findPosition(arr, 54);
//        System.out.println(position);
//        System.out.println(Utils.binarySearch(arr,54));

        ArrayList balls = new ArrayList();
        System.out.println(balls.size());
        System.out.println(balls.toString());
        for(int i=1;i<=8;i++){
            balls.add(i);
            System.out.println(balls.toString());
        }
        System.out.println(balls.size());
        balls.add(50,2);
        System.out.println(balls.toString());
        System.out.println(balls.get(2));
        System.out.println(balls.get(0));
       // System.out.println(balls.get(15));


    }
}
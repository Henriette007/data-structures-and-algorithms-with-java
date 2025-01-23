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

//        ArrayList balls = new ArrayList();
//        System.out.println(balls.size());
//        System.out.println(balls.toString());
//        for(int i=1;i<=8;i++){
//            balls.add(i);
//            System.out.println(balls.toString());
//        }
//        System.out.println(balls.size());
//        balls.add(50,2);
//        System.out.println(balls.toString());
//        System.out.println(balls.get(2));
//        System.out.println(balls.get(0));
//        // System.out.println(balls.get(15));
//        balls.remove(8);
//        System.out.println(balls.toString());
//        balls.sort();
//        System.out.println(balls.toString());
//        System.out.println(balls.search(5));
//        System.out.println(balls.search(8));

        Node<Integer> node = new Node<>(7);
        System.out.println(node.getData());
        LinkedList<Integer> list = new LinkedList<>();
        list.add(3);
        System.out.println(list.toString());
        list.add(7);
        System.out.println(list.toString());
        list.add(9);
        list.add(4);
        list.add(9);
        list.add(3);
        list.add(8);
        list.add(1);
        System.out.println(list.toString());
        System.out.println(list.get(5));
        System.out.println(list.search(1));
        list.add(12,3);
        System.out.println(list.toString());
        list.remove(3);
        System.out.println(list.toString());
        list.sort();
        System.out.println(list.toString());


    }
}
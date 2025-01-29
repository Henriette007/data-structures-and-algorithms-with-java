public class ArrayList {
    private int[] array;
    private int size;


    public ArrayList() {
        this(8);

    }

    public ArrayList(int size) {
        this.array = new int[size];
        this.size = 0;
    }

    public int size() {

        return size;
    }



    public void add(int number) {
        if(size<array.length){
            array[size]=number;
            size++;
        } else {
            int[] newBox = new int[array.length*2];
            for(int i = 0; i< array.length;i++){
                newBox[i] = array[i];
            }
            newBox[size] = number;
            size++;
            array = newBox;
        }
    }

    public void add(int num, int index) {

        if (size < array.length) {
            for (int i = size; i > index; i--) {
                array[i] = array[i - 1];
            }
            array[index] = num;
            size++;
        } else {
            int[] newBox = new int[array.length * 2];
            for (int i = 0; i < array.length; i++) {
                newBox[i] = array[i];
            }

            array = newBox;
            for (int i = size; i > index; i--) {
                array[i] = array[i - 1];
            }
            array[index] = num;
            size++;
        }
    }

    public void remove(int index){
        if(index>=size || index<0){
            throw new RuntimeException("Index out of bounds");
        }
        for (int i = index; i <size; i++) {
            array[i] = array[i + 1];
        }
        size--;
    }

    public void sort(){
        for(int i=0; i<size -1;i++){
            int bookmark = i;
            for(int j=i+1; j<size;j++){
                if(array[j]<array[bookmark]){
                    bookmark=j;
                }
            }
            int a = array[i];
            array[i]=array[bookmark];
            array[bookmark]=a;

        }
    }

    public int search(int number){
        int left= 0;
        int right = size;

        while(left<=right) {
            int mid = left + ((right - left) / 2);
            if (array[mid] == number) {
                return mid;
            } else if (array[mid] < number) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }
        throw new RuntimeException("Number not found");
    }

    public int get(int index){
        if(index>=size || index<0){
            throw new RuntimeException("Index out of bounds");
        }
        return array[index];
    }

    public String toString() {
        String stringArray = "[";
        for (int i = 0; i < size ; i++) {
            if (i == 0) {
                stringArray += array[i];
            } else {
                stringArray += ", " + array[i];
            }
        }
        stringArray += "]";
        return stringArray;
    }

    public void reverse(){
//        int[] reverse = new int[size];
//        int index =0;
//        for (int i = size-1; i>=0;i--){
//            reverse[index] = array[i];
//            index ++;
//        }
//        array = reverse;
        int change;
        int index =0;
        for(int i = size-1;i>= size/2;i--){
            change = array[i];
            array[i] = array[index];
            array[index] = change;
            index++;
        }
    }

}

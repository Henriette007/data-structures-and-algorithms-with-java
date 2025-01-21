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

    public void add(int num, int index){

        if(size<array.length){
            for(int i = size;i>index;i--){
                array[i]=array[i-1];
            }
            array[index]=num;
            size++;
        } else {
            int[] newBox = new int[array.length*2];
            for(int i = 0; i< array.length;i++){
                newBox[i] = array[i];
            }

            array = newBox;
            for(int i = size;i>index;i--){
                array[i]=array[i-1];
            }
            array[index]=num;
            size++;
        }
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

}

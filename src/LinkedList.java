public class LinkedList<T> {
    private Node<T> head;
    private int size;

    public LinkedList() {
        this.size = 0;
    }

    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        Node<T> myPointer = head;
        if (head == null) {
            head = newNode;
        } else {
            while (myPointer.getNext() != null) {
                myPointer = myPointer.getNext();
            }
            myPointer.setNext(newNode);
        }
    }

    public String toString() {
        if (head == null) {
            return "[]";
        }
        String myList = "[";
        Node<T> pointer = head;
        while (pointer.getNext() != null) {
            myList +=  pointer.getData() + ", " ;
            pointer = pointer.getNext();
        }
        myList += pointer.getData()+"]";
        return myList;
    }

    public T get(int index){
        if (index<0 || head == null){
            throw new RuntimeException("Index out of bounds.");
        }
        Node<T> p =head;
        for(int i = 0; i< index;i++){
            p=p.getNext();
            if(p==null){
                throw new RuntimeException("Index out of bounds.");
            }
        }
        return p.getData();
    }

}

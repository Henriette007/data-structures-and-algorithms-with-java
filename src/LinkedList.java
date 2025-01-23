public class LinkedList<T extends Comparable<T>> {
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

    private void addChangeNodes(Node<T> node1, Node<T> node2){
        Node<T> after1 = node1.getNext();
        node1.setNext(node2);
        node2.setNext(after1);

    }

    private void switchNodes(Node<T> node1, Node<T> node2){
        T s = node1.getData();
        node1.setData(node2.getData());
        node2.setData(s);

    }

    private void removeNodes(Node<T> node1, Node<T> node2){
        Node<T> after1 = node1.getNext();
        node1.setNext(node2);
        node2.setNext(node2.getNext());

    }

    public void add(T data, int index){
        Node<T> newNode = new Node<>(data);
        Node<T> myPointer = head;
        if (index<0 ){
            throw new RuntimeException("Index out of bounds.");
        }
        if (head == null&&index==0){
            head = newNode;
        }
        for(int i =1; i < index;i++){
                myPointer = myPointer.getNext();
            }
            addChangeNodes(myPointer,newNode);

    }

    public void remove(T data){
        Node<T> myPointer = head.getNext();
        Node<T> beforeRemove = head;

        if(head.getData() == data){
            head = head.getNext();
        } else {

            while (myPointer.getData() != data && myPointer.getNext() != null) {
                beforeRemove = myPointer;
                myPointer = myPointer.getNext();
                if (myPointer == null) {
                    throw new RuntimeException("Data not found");
                }
            }
            if (myPointer.getData() == data && myPointer.getNext() == null) {
                beforeRemove.setNext(null);
            } else {
                myPointer = myPointer.getNext();

                removeNodes(beforeRemove, myPointer);
            }
        }
    }


    public void sort(){
        boolean sorted = false;
        Node<T> next = head.getNext();
        Node<T> first = head;


            while (!sorted) {
                first =head;
                next = first.getNext();
                while (next != null) {
                    if (first.compareTo(next)>0) {
                        switchNodes(first,next);
                        first = next;
                        next = next.getNext();
                    }else if(first.compareTo(next)<=0){
                        first = next;
                        next = next.getNext();
                    }
                }
                first =head;
                next = first.getNext();
                sorted = true;
                while (next!= null){
                    if(first.compareTo(next)>0){
                        sorted = false;
                        next = null;
                    } else{
                        first = next;
                        next = next.getNext();
                    }

                }
            }
    }

    public int search ( T data){
        int index = 0;
        Node<T> p =head;
        while(p != null){
            if(p.getData() == data){
                return index;
            }
            p=p.getNext();
            index++;
        }
        if(p==null){
            throw new RuntimeException("Data not found.");
        }
        return -1;
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

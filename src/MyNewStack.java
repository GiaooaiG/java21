import test.Gyh;

import java.util.ArrayList;
import java.util.List;

public class MyNewStack<T> {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(List.of(1,23,42,5));
        System.out.println(Gyh.bubbleSort(arr));
    }
    private final ArrayList<T> list = new ArrayList<>();
    public MyNewStack(){
    }
    public T peek(){
        return list.getLast();
    }
    public void push(T item){
        list.add(item);
    }
    public boolean isEmpty(){
        return list.isEmpty();
    }
    public T pop(){
        T result = list.getLast();
        list.removeLast();
        return result;
    }
    public int getSize(){
        return list.size();
    }
}

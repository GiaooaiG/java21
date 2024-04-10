import java.util.ArrayList;

public class L11_10 {
    public static void main(String[] args){
        MyStack mystack = new MyStack();
        mystack.push(5);
        mystack.push(3);
        mystack.push(6);
        mystack.push(1);
        System.out.println(mystack.getSize());
        System.out.println(mystack.pop());
        System.out.println(mystack.peek());
    }
}
class MyStack{
    private final ArrayList<Object> list = new ArrayList<>();
    public MyStack(){

    }
    public boolean isEmpty(){
        return list.isEmpty();
    }
    public int getSize(){
        return list.size();
    }
    public void push(Object o){
        list.add(o);
    }
    public Object peek(){
        return list.get(this.getSize() - 1);
    }
    public Object pop(){
        Object o = list.get(this.getSize() - 1);
        list.remove(this.getSize() - 1);
        return o;
    }

}

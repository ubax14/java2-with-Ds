package LinkedSatachCh11;

public class Node<T> {
     T element;
     Node<T>next;
    public Node(){
        element=null;
        next=null;

    }
    //parameterized constructor
    public Node(T element){
        this.element=element;
        next=null;
    }
    public Node<T> getNext(){
        return  next;
    }
    public void setNext(Node<T> next){
        this.next=next;
    }
    public T getElement(){
        return element;
    }
    public void setElement(){
        this.element=element;
    }

}

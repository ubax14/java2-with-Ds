package LinkedSatachCh11;

import java.util.EmptyStackException;

public class LinkedStack<T> {
  private   int count;
   private Node<T> top;
    LinkedStack(){
        count=0;
        top=null;
    }
    //operations
    //size
   public int size(){
        return count;
    }
    //isEmpty
    boolean isEmpty(){
        return count==0;//top=null;
    }
    //push
    void pus(T element){
        //create new node to store new value that in new node
        Node<T> tempAddress=new Node<>(element);
        //connect new node to the top element or head
        tempAddress.setNext(top);
        //
        top=tempAddress;
        count++;
    }
    T pop(){
        //check if the stack is empty
        if (isEmpty()){
            System.out.println("empty stack!");
            return null;
        }
        //storing the top data element
        T removeElement=top.getElement();
        //This removes the previous top node and correctly updates top to be the next node.
        top=top.getNext();
        count--;
        return removeElement;
    }
    //peek
    T peek(){
        if (isEmpty()){
            System.out.println("empty stack!");
        return null;
        }
        return top.getElement();
    }
    void display(){
        if (isEmpty())
            System.out.println("empty stack!");

        else {
            Node<T> currentAddress = top;
            while (currentAddress != null) {
                System.out.println(currentAddress.getElement());
                currentAddress = currentAddress.getNext();
            }
        }

    }
    public void printStack()throws EmptyStackException{
        if (isEmpty())
            throw new EmptyStackException();
        Node<T> current=top;
        while (current !=null){
            System.out.println(current.getElement());
            current=current.getNext();
        }

    }
    //count
    int counter(T element){
        Node<T> current=top;
        int number=0;
        while (current !=null){
         if (element.equals(current.getElement()))
             number++;
         current=current.getNext();
        }
        return number;
    }
    //searchElement
    void searchElemnt(T data){
        boolean found=false;
        int count=0;
        if (isEmpty())
            System.out.println("the stack is empty!");
        else {
            Node<T> currentAddress=top;
            while (currentAddress !=null){
                if (data.equals(currentAddress.getElement())){
                   found=true;
                   count++;
                }
                currentAddress=currentAddress.getNext();
            }

        }
    }
    //remove element in the middle
    public void removeMiddle(){
        if (isEmpty())
            System.out.println("the stack is empty!");
        if (count <= 2){
            System.out.println("the stack is lower than 2");
            return;
        }
        Node<T> current=top;
        while (current.next !=null && current.next.next !=null){
            current.next=current.next.next;
            count--;
        }
    }
    //display remove middle  element
    public void displayElement(){
        Node<T> current=top;
        while (current !=null){
            System.out.println(current.element);
            current=current.next;
        }
    }

    public static void main(String[] args) {
        LinkedStack<Integer> count= new LinkedStack<>();

        count.pus(10);
        count.pus(20);
        count.pus(30);

        //System.out.println(count);
        System.out.println(count.peek()+count.peek()+"\n"+count);
        count.display();
        System.out.println("-----------------------------------------------------");
        LinkedStack<String> names= new LinkedStack<>();
        names.pus("UBAH");
        names.pus("IMAAN");
        names.pus("SUCDI");
        names.pus("MARYAN");
        names.pus("AASIYO");
        names.pus("farxiyo");
        System.out.println("-----------");
        names.displayElement();
        names.removeMiddle();
        System.out.println("after removing");
        names.displayElement();

    }


}

package Chabter10;

import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.Stack;



public class ArrayStack <T>{
    //CONSTANCT VARIABLE
    private final static int DEFAULT_CAPACITY=2;
    private int top;
    private T[]stack;
    private int midter;
    private int finalExam;
    ArrayStack()
    {
        this(DEFAULT_CAPACITY);
    }
    ArrayStack(int midter,int finalExam){
        top=0;
        stack=(T[])(new Object[midter+finalExam]);

    }
    ArrayStack(int initialCapacity){
        top=0;
        stack=(T[])(new Object[initialCapacity]);

    }


    public  void push(T element){
        if (size()==stack.length);
        expandCapacity();
        stack[top]=element;
        top++;
    }

    private void expandCapacity(){stack= Arrays.copyOf(stack,stack.length*2);
    }

    public  int size(){
        return top;

    }
//    public int calculateTotal(int midter,int finalEx) {
//        int total=midter+finalEx;
//        if (isEmty())
//            System.out.println("the stac is empty!");
//        if (midter.size() != finalEx.size())
//            System.out.println("the stack do not match");
//
//        else
//        {
//            System.out.println();
//        }
//return total;
//    }
    public boolean isEmty(){
        return top==0;
    }
    public T pop()throws EmptyStackException{
        if (isEmty())
            throw new EmptyStackException();
        top--;
        T result= stack[top];
        stack[top]=null;
        return result;
    }
  //public  T peek()throws EmptyStackException {
     // if (isEmty())
          //throw new RuntimeException();
    // return stack[top-1];
  // }
    T peek(){
        if (isEmty()){
            System.out.println("the stac is empty ");
            return null;
        }
        return stack[top-1];
}

    @Override
    public String toString() {
        return "ArrayStack{" +
                "top=" + top +
                ", stack=" + Arrays.toString(stack) +
                '}';
    }

//    public boolean isFull(){
//        return top==stack.length;
//    }
//    public int GetCapacity(int cabacity){
//        cabacity= stack.length;
//        return cabacity;
//
//    }

    int countFrequency(T element) {
        int index = top - 1;
        int count = 0;
        for (int i = 0; i>index; i++) {
            if (stack[i] == element)
                count++;
        }
        return count;
    }
void  display(){
        for (int i=0;i<top;i++){
            System.out.println(stack[i]);

        }
}
//calculateTotal

    public static void main(String[] args) {
        ArrayStack<String> names=new ArrayStack<>();
        ArrayStack<Integer> midterm=new ArrayStack<>();
        ArrayStack<Integer>  finalEx= new ArrayStack<>();
        midterm.push(30);
        midterm.push(40);
        midterm.push(25);
        System.out.println(midterm);
        //
        finalEx.push(40);
        finalEx.push(30);
        finalEx.push(20);


//        names.peek();
//        names.push("omar");
//        names.push("farah");
//        names.push("hawa");
//        names.push("warsame");
//        names.push("sucdi");
//        names.push("ubah");
//        names.push("iman");
//        names.push("maryan");

//        System.out.println("removed element:"+names.pop());
//        System.out.println("size:"+names.size());
//        System.out.println("top:"+names.peek());
//        System.out.println("empty:"+names.isEmty());
//        System.out.println("is full:"+names.isFull());
//        System.out.println("capacity:"+names.GetCapacity(names.size()));

//        int times= names.countFrequency("ubah");
//        if (times==0){
//            System.out.println("This name not found");
//
//        }
//        else {
//            System.out.println("the frequency of this name is:"+times);
//        }
//        names.display();
   }

}

package Chabter10;

public class Pair<T,U> {
    //field
    T first;
    U  second;

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }

    public Pair(T first, U second){
        this.first=first;
        this.second=second;
    }
    public  T getFirst(){
        return first;
    }
    public  U getSecond(){
        return second;
    }

    public static void main(String[] args) {
        Pair<Integer,String> pair= new Pair<>(1,"one");
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
        System.out.println(pair);
    }


}

package Chabter10;

public class Person <T>{
    private  T firstName;
    private T lastName;
    //constructor
    public Person(T firstName,T lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }
    //method full name to add first name and last name
    public String FullName(){
        return firstName+" "+lastName;
    }

    public static void main(String[] args) {
        Person<String> person1=new Person<>("UBAH", "SALAH");
        System.out.println("full name is:"+person1.FullName());
    }
}

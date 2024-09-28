package Ch8ClassesObjects;

public class Person {
    //variables
    String name;
    //constucters
    Person(){
        name="Ali";
    }
    Person(String Name){
        Name=Name;
    }
    //methods
    void printName(){
        System.out.println("Name:"+name);
    }
}

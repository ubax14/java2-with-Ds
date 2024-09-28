package Ch8ClassesObjects;

public class Book {
    //variables
    String title, author;
    int yearPublish, quantity;


    //Constructor
    public Book(String title, String author,int yearPublish, int quantity)
    {
        this.title="C#";
        this.author="Ubah";
        this.yearPublish=2022;
        this.quantity=0;
    }
    //methods
     void addBook(int value)
    {
      quantity+=value;
    }
void setTitle(String newTitle)
{
    title=newTitle;
}
boolean searchBook(String searchTitle)
{
  if (title==searchTitle)
      return true;
  else return false;

}
void showInformation()
{
    System.out.println("Book title is "+title);
    System.out.println("Book author is "+author);
    System.out.println("Book publish year is "+ yearPublish);
    System.out.println("Book quantity is "+quantity);

}
void borowBook(){
        if (quantity >0)
            quantity--;
        else
            System.out.println("Error! Book quantity: "+"Zer(0)");
}
    public static void main(String[] args) {
        Book book = new Book("Java","comes jeslon",2009,2);
         book.borowBook();
         book.showInformation();

    }
}


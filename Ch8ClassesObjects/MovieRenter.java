package Ch8ClassesObjects;

public class MovieRenter {
    //variables
    String rentailId, customerName,movieTitle;
    int dayRented;
    float costPerDay, totalCost;
    //constructer
    public MovieRenter(){
        rentailId="c1";
        customerName="farxiyo";
        movieTitle="muslimka wax soo saarka leh";
        costPerDay=10;
        dayRented=5;
        totalCost=dayRented*costPerDay;
    }
    //method1
    public void extendRental(int extrDays){
       this.dayRented+=extrDays;
       this.totalCost=dayRented*costPerDay;
        System.out.println("extra days: "+extrDays);
        System.out.println("total cost: "+totalCost);

    }
    //method2
    public void returnMovie() {
        if (this.dayRented == 0) {
            System.out.println("movie has already been returned");
        } else
            this.dayRented = 0;
        this.totalCost = 0;
        System.out.println("movie has returned");

    }
    //
    public void aplayLateFree(int daydsLate, float lateFreePerDay){
       totalCost+=daydsLate*lateFreePerDay;
    }

    public static void main(String[] args) {
        MovieRenter ob1= new MovieRenter();
        ob1.returnMovie();
        ob1.extendRental(6);
        System.out.println("movie title: "+ob1.movieTitle);
        System.out.println("costomer name:"+ob1.customerName);
        System.out.println("total cost:"+ob1.totalCost);
        System.out.println("day rented:"+ob1.dayRented);
        
    }
}

package chonggou;
//import movie.*;
//import customer.*;
//import rental.*;
import java.util.*;
public class Main {
  public static void main(String [] args) {
	  Movie movie1 = new Movie("中国机长",0);
	  Movie movie2 = new Movie("冰雪奇缘   ",1); 
	  Movie movie3 = new Movie("肖申克的救赎 ",2); 
	  Rental rental1 = new Rental(movie1,10); 
	  Rental rental2 = new Rental(movie2,5);
	  Rental rental3 = new Rental(movie3,6);
	  Customer customer = new Customer("涂**"); 
	  customer.addRental(rental1);
	  customer.addRental(rental2);  
	  customer.addRental(rental3);  
	  System.out.println(customer.statement());
  }
}

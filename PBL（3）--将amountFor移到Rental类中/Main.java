package chonggou;
//import movie.*;
//import customer.*;
//import rental.*;
import java.util.*;
public class Main {
  public static void main(String [] args) {
	  Movie movie1 = new Movie("�й�����",0);
	  Movie movie2 = new Movie("��ѩ��Ե   ",1); 
	  Movie movie3 = new Movie("Ф��˵ľ��� ",2); 
	  Rental rental1 = new Rental(movie1,10); 
	  Rental rental2 = new Rental(movie2,5);
	  Rental rental3 = new Rental(movie3,6);
	  Customer customer = new Customer("Ϳ**"); 
	  customer.addRental(rental1);
	  customer.addRental(rental2);  
	  customer.addRental(rental3);  
	  System.out.println(customer.statement());
  }
}

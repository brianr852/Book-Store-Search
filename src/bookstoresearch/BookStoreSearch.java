/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstoresearch;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author brian
 */
public class BookStoreSearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    BookStore bookStore = new BookStore( );
    System.out.println( "\nOur book collection is:" );
    System.out.println( bookStore );
    
    
    //title
    Scanner title = new Scanner(System.in);
    
    System.out.println( "\nSearching titles, enter a keyword" );
    String keyword1 = title.next();   
    ArrayList<Book> result1 = bookStore.searchForTitle( keyword1.toLowerCase() );    
    System.out.println( "The search results for \"" + keyword1
                         + "\" are:" );
    if (result1.size() > 0)
    {
      for( Book tempBook1 : result1 )
        System.out.println( tempBook1 );
    }
    else
    {
      System.out.println("No book meeting your search criteria has been found");
    }
    
    //Author
    Scanner author = new Scanner(System.in);
    
    System.out.println( "\nEnter an author to search each book for" );
    String keyword2 = author.next();   
    ArrayList<Book> result2 = bookStore.searchForAuthor( keyword2.toLowerCase() );    
    System.out.println( "The search results for \"" + keyword2
                         + "\" are:" );
    if (result1.size() > 0)
    {
      for( Book tempBook2 : result2 )
        System.out.println( tempBook2 );
    }
    else
    {
      System.out.println("No book meeting your search criteria has been found");
    }
    
    
    //Price
    Scanner price = new Scanner(System.in);
    
    System.out.println( "\nEnter a price limit to search each book for" );
    double keyword3 = price.nextDouble();   
    ArrayList<Book> result3 = bookStore.searchForPrice( keyword3 );    
    System.out.println( "The search results for books under \"" + keyword3
                         + "\" are:" );
    if (result3.size() > 0)
    {
      for( Book tempBook3 : result3 )
        System.out.println( tempBook3 );
    }
    else
    {
      System.out.println("No book meeting your search criteria has been found");
    }
    
    
    
    //min
    BookStore price1 = new BookStore();
    System.out.println("The book in the library with the lowest price is: \"" + price1.findLowest());
                 
    }
    
}

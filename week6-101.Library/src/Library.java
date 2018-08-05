/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tom
 */
import java.util.ArrayList;
public class Library {
    private ArrayList<Book> library;

    public Library() {
        this.library = new ArrayList<Book>();
    }
    
    public void addBook(Book newBook) {
        this.library.add(newBook);
    }
    
    public void printBooks() {
        for (Book book : library) {
            System.out.println(book);
        }
    }
    
    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> searchByTitle = new ArrayList<Book>();
        for (Book book : this.library) {
            if (StringUtils.included(book.title(), title)) {
                searchByTitle.add(book);
            }
            
        }
        return searchByTitle;
    }
    
    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> searchByPublisher = new ArrayList<Book>();
        for (Book book : this.library) {
            if (StringUtils.included(book.publisher(), publisher)) {
                searchByPublisher.add(book);
            }
            
        }
        return searchByPublisher;
    }
    
    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> searchByYear = new ArrayList<Book>();
        for (Book book : this.library) {
            if (year == (book.year())) {
                searchByYear.add(book);
            }
            
        }
        return searchByYear;
    }
    
}

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
public class Phonebook {
    private ArrayList<Person> book;
    
    public Phonebook() {
        this.book = new ArrayList<Person>();
    }
    
    public void add(String name, String number) {
        Person newperson = new Person(name , number);
      
        this.book.add(newperson);
    }
    
    public void printAll() {
        for (Person i : book) {
            System.out.println(i);
        }
    }
    
    public String searchNumber(String name) {
        for (Person searched : this.book) {
            if (name.equals(searched.getName())) {
                return searched.getNumber();
            }
        }
        return "number not known";
    }
}

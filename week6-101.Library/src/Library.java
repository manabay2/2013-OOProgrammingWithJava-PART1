

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> list;
    
    public Library(){
        this.list = new ArrayList<Book>();
    }
    public void addBook(Book newBook){
        list.add(newBook);
    }
    public void printBooks(){
        for(Book b : list){
            System.out.println(b.toString());
        }
    }
    public ArrayList<Book> searchByTitle(String title){
        ArrayList<Book> found = new ArrayList<Book>();
        
        for(Book b: list){
            if(StringUtils.included(b.title(), title)) found.add(b);
        }
        return found;
    }
    public ArrayList<Book> searchByPublisher(String publisher){
        ArrayList<Book> found = new ArrayList<Book>();
        
        for(Book b: list){
            if(b.publisher().contains(publisher)) 
                found.add(b);
        }
        return found;
    }
    public ArrayList<Book> searchByYear(int year){
        ArrayList<Book> found = new ArrayList<Book>();
        
        for(Book b: list){
            if(b.year() == year) found.add(b);
        }
        return found;
    }
}

package Library;

import java.util.List;

public class Library {

    int id;
    String name;
    String address;
    List <Book> books;
    List <Member> members;
    
    public Library(){
    }

    public Library(int id, String name, String address, List<Book> books, List<Member> members) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.books = books;
        this.members = members;
    }

    @Override
    public String toString() {
        return "Library " + name + " has " + books.size() + " books and " + members.size() + " members.";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }
    

}

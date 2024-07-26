package Library;

import java.util.ArrayList;
import java.util.List;

public class LibraryProgram {
    public static void main(String[] args) {
        
        Library cityLibrary = new Library();
        cityLibrary.setName("Liberty Library");

        List<Book> books = new ArrayList<Book>();
        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();

        books.add(book1);
        books.add(book2);
        books.add(book3);

        List<Member> members = new ArrayList<Member>();
        Member member1 = new Member();
        Member member2 = new Member();
        Member member3 = new Member();
        Member member4 = new Member();
        Member member5 = new Member();

        members.add(member1);
        members.add(member2);
        members.add(member3);
        members.add(member4);
        members.add(member5);

        cityLibrary.setBooks(books);
        cityLibrary.setMembers(members);

        System.out.println(cityLibrary);
    }
}

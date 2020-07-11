package HashSet.NavinReddy;


import java.util.HashSet;

class Books
 {
     int id;
     String name,author,publications;

     public Books(int id, String name, String author, String publications) {
         this.id = id;
         this.name = name;
         this.author = author;
         this.publications = publications;
     }
 }

public class BookExample
{
    public static void main(String[] args) {

        HashSet<Books> book=new HashSet<>();

        Books book1=new Books(001,"Java","Karan Ghai","Ghai Puublications");
        Books book2=new Books(002,"Advance java","Karan Singh","Karan Publications");
        Books book3=new Books(003,"Java Features","Unknown","Home Publications");

          book.add(book1);
          book.add(book2);
          book.add(book3);

        for (Books b:
             book) {
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publications);
        }

    }
}

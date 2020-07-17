package JavaCollections.LinkeedList.Annoynums;

import java.util.LinkedList;

public class LinkedListClass
{
    public static void main(String[] args)
    {
        LinkedList<Book> book =new LinkedList<>();
        Book book1=new Book(1001,"Core Java","Tim bhucchalka","Home publishers ");
        Book book2=new Book(1002,"Advance Java","Karanbir Singh"," Ghai publishers");

        book.add(book1);
        book.add(book2);


        for (Book i:book  )
        {
            System.out.println( " Details : " + i.id + " " + i.name + " " + i.author + " " + i.publisher + " ");
        }




    }
}

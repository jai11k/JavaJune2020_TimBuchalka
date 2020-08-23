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

//region
/*
The LinkedList class is a collection which can contain many objects of the same type, just like the ArrayList.
Linked list uses doubly linked list to stroe elements.It inherits Abstract list class and
implements list.It follows double linked list concept
In linked list Object refrence is stored in a seperate link.
The LinkedList stores its items in "containers."
The list has a link to the first container and each container has a link to the next container in the list.
To add an element to the list, the element is placed into a new container and that container is linked to one of the other containers in the list.

list*/
//endregion

package Generics.NavinReddy;


class Container<T> {
    T value;

    public Container(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }


    public void show() {
        System.out.println(value.getClass().getName());
    }
}

public class GenericsDemo
{
    public static void main(String[] args)
    {

        Container<Integer> obj1=new Container<>(10);
        Container<String> obj12=new Container<>("Karanbir Singh..");


        System.out.println("Answer is = "+obj1.getValue());
        System.out.println("Answer is = "+obj12.getValue());


    }
}




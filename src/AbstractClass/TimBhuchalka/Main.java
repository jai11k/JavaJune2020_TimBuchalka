package AbstractClass.TimBhuchalka;

//region
/*
Abstarction is what needs to be done not on how it has to be done

Abstract class is a restricted class where we dont define methods and cant create objects .
If we want to create objects,we have to inherite to another clss.We ccan declare and define normal methods in abstract class]
 */
//endregion

public class Main
{
    public static void Main(String[] args)
    {
        Dog doggy=new Dog("Anmol");
        doggy.eat();
        doggy.breathe();


        Parrot bygbrd=new Parrot("BygBrd");
        bygbrd.eat();
        bygbrd.breathe();
        bygbrd.fly();

        Pngiuun pg=new Pngiuun("abc");
        pg.fly();
        pg.breathe();
        pg.eat();



    }
}


package JavaCollections.HashSet.TimBhuchalka;



//* When overriding the equals() method in the HeavenlyBody class, we
//        * were careful to make sure that it would not return true if a HeavenlyBody
//        * was compared to a subclass of itself.
//        *
//        * We did that to demonstrate that method, but it was actually
//        * unnecessary in the HeavenlyBody class.
//        *
//        * The mini challenge is just a question: why was it unnecessary?
//        *
//        * Hint: If you are stuck, check out Lecture 97
//        *
//        * Answer:
//        *
//        * The HeavenlyBody class is declared final, so cannot be subclassed.
//        * The Java String class is also final, which is why it can safely
//        * use the instanceof method without having to worry about
//        * comparisons with a subclass.
public class Dog
{
    private final String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public final boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }

        if(obj instanceof Dog) {
            String objName = ((Dog) obj).getName();
            return this.name.equals(objName);
        }

        return false;
    }
}

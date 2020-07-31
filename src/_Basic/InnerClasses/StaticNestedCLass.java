package _Basic.InnerClasses;


class OuterClass
{
    private static void outerMethod()

    {
        System.out.println("inside! outerMethod");
    }

    // A static inner class

    public static class StaticNestedCLass
    {
        public static void main(String[] args)
        {
            System.out.println("inside inner! class Method");
            outerMethod();
        }

    }
}


//    Static nested classes are not technically an inner class. They are like a static member of outer class.
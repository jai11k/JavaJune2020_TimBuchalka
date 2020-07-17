package _OOPS.Composition.Example1;

public class LearningComposition {
    public static void main(String[] args)
    {
        Dimensions theDimensions = new Dimensions(20, 20, 5);
        Case thecase = new Case("220B", "Dell", "240",theDimensions);
        Motherboard themotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");
        Monitor theMonitor = new Monitor("27 inch beast", "Asus", 32, new Resolution(1600, 1200));

        PC thePC = new PC(thecase, theMonitor, themotherboard);

        thePC.powerUp();
    }
}

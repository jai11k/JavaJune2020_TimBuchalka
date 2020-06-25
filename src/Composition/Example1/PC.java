package Composition.Example1;

public class PC {
    private Case thcCase;
    private Monitor monitor;
    private Motherboard motherboard;



    public PC(Case thcCase, Monitor monitor, Motherboard motherboard) {
        this.thcCase = thcCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }
    public void powerUp()
    {
       thcCase.pressPowerButton();
    }
}

package Composition.Example1;

public class Case {
    private String model;
    private String manufacturer;
    private String powerSuuply;
    private Dimensions dimensions;

    public Case(String model, String manufacturer, String powerSuuply, Dimensions dimensions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSuuply = powerSuuply;
        this.dimensions = dimensions;
    }
    public void pressPowerButton()
    {
        System.out.println("Power buuton paused ");
    }


}

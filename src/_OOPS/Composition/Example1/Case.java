package _OOPS.Composition.Example1;

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
  //region
/*
In inheritance we inherit the features of parent class in child class.
But in composition ,we can define a type of which we want to use  and can hold different implemnentation.
In the given example it consists of motherboard , case , a monitor,PC,etc are the part of PC but not the PC.WHereas in Inheritance we c
create a parent classs of vehicle and inhgerits in sub class "Car".
 */
//endregion
public class Case {
    private String manufacturer;
    private String powerSupply;
    private Dimension dimension;
    private String model;

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public Case(String manufacturer,String powerSupply,Dimension dimension,String model){
        this.manufacturer = manufacturer;
        this.dimension = dimension;
        this.powerSupply = powerSupply;
        this.model = model;
    }

    public void pressPowerButton(){
        System.out.println("Power Button Pressed");
    }


}

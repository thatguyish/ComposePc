public class Monitor {
    protected Resolution resolution;
    private String manufacturer;
    private String model;

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getResolution() {
        return ""+resolution.getHeight() +" x "+ resolution.getWidth();
    }

    public Monitor(Resolution resolution,String manufacturer,String model){
        this.resolution = resolution;
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public void drawPixel(int x, int y, String color){
        System.out.println("Drawing pixel at "+x+","+y+" in color "+color);
    }
}

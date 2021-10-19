public class Motherboard {
    private String model;
    private String manufacturer;
    private int ramSlots;
    private int cardSlots;

    public int getCardSlots() {
        return cardSlots;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public Motherboard(String model, String manufacturer, int ramSlots,int cardSlots){
        this.model = model;
        this.cardSlots = cardSlots;
        this.ramSlots = ramSlots;
        this.manufacturer = manufacturer;
    }
    public void loadProgram(String programName){
        System.out.println(programName+" is now running.");
    }
}

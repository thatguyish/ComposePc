public class Pc {
    protected Case pcCase;
    protected Monitor monitor;
    protected Motherboard motherboard;

    public Pc(Case pcCase,Monitor monitor,Motherboard motherboard){
        this.pcCase = pcCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    private void drawLogo(){
        this.monitor.drawPixel(300,500,"blue");
    }

    public void description(){
        System.out.println("Welcome worst buy below is the description of the pc on sale today\n"+
                String.format("Case: \n Manufacturer: %s, Model: %s, PowerSupply: %s\n",this.pcCase.getManufacturer(),this.pcCase.getModel(),this.pcCase.getPowerSupply(),this.pcCase.getDimension())+
                String.format("Monitor: \n Manufacturer: %s, Model: %s, Resolution: %s\n",this.monitor.getManufacturer(),this.monitor.getModel(),this.monitor.getResolution())+
                String.format("Motherboard: \n Manufacturer: %s, Model: %s, CardSlots: %d, RamSlots: %d",this.motherboard.getManufacturer(),this.motherboard.getModel(),this.motherboard.getCardSlots(),this.motherboard.getRamSlots()));

    }

    public void powerUp(){
        this.pcCase.pressPowerButton();
        this.drawLogo();
        this.motherboard.loadProgram("Program");
    }

}

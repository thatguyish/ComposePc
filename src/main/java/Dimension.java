public class Dimension {
    private int width;
    private int height;
    private int depth;
    public Dimension(int w,int h,int d){
        this.width = w;
        this.height = h;
        this.depth = d;
    }

    public static void main(String[] args) {
        Motherboard motherboard = new Motherboard("x3200","Samsumg",8,2);
        Case pcCase = new Case("Toshiba","10/5v",new Dimension(20,50,50),"290xf");
        Monitor monitor = new Monitor(new Resolution(45,50),"lenovo","5g5200");
        Pc pc = new Pc(pcCase,monitor,motherboard);
        pc.description();
        pc.powerUp();

    }
}

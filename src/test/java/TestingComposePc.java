import org.junit.Test;
import org.junit.Assert;

public class TestingComposePc {

    @Test
    public void testCaseConstructor(){
        Case pcCase = new Case("Toshiba","25/4v",new Dimension(50,20,50),"78x5f");

        String manufacturerExpected = "Toshiba";
        String manufacturerActual = pcCase.getManufacturer();

        Assert.assertEquals(manufacturerExpected,manufacturerActual);
    }

    @Test
    public void testResolutionConstructor(){
        Resolution resolution = new Resolution(50,100);

        int resolutionHeightExpected = 50;
        int resolutionHeightActual = resolution.getHeight();

        Assert.assertEquals(resolutionHeightExpected,resolutionHeightActual);
    }

    @Test
    public void testMotherboardConstructor(){
        Motherboard motherboard = new Motherboard("x33o9","Toshiba",4,2);

        int motherboardRamSlotsExpected = 4;
        int motherboardRamSlotsActual = motherboard.getRamSlots();

        Assert.assertEquals(motherboardRamSlotsExpected,motherboardRamSlotsActual);
    }
}

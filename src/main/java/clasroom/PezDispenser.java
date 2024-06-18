package clasroom;

public class PezDispenser {

    //Fields

    public static final int MAX_PEZ = 12;
    private String dispenserName;
    private String dispenserColor;
    private String dispenserSeries;
    private boolean takeCandy;
    private int pezCount;
    private int addCandy;

    public PezDispenser() {

    }

    @Override
    public String toString() {
        return "PezDispenser{" +
                "dispenserName='" + dispenserName + '\'' +
                ", dispenserColor='" + dispenserColor + '\'' +
                ", dispenserSeries='" + dispenserSeries + '\'' +
                ", pezCount='" + pezCount + '\'' +
                ", addCandy='" + addCandy + '\'' +
                '}';
    }


    ////// Dispense one candy

    public void dispense() {
        if (pezCount >= addCandy) {
            System.out.println("One candy is dispensed");
        }
    }


    ////// Dispense any amount of candy

    public void dispenseAnyAmount() {
        int anyAmount = 3;
        if (pezCount - anyAmount >= 0) {
            System.out.println("True");
        }
    }


    ////// Load dispenser till it is full

    public void fill() {
        this.pezCount = MAX_PEZ;
    }


    ////// Load dispenser one candy at a time

    public void load() {
        int newAmount = pezCount + addCandy;
        if (newAmount <= MAX_PEZ) {
            System.out.println("One candy is loaded");
        }
    }


    ////// Load any amount of candies

    public void loadAnyAmount() {
        int anyAmount = 2;
        if (pezCount + anyAmount <= MAX_PEZ) {
            System.out.println("True");
        }
    }


    ////////Getters


    public String getDispenserName() {
        return dispenserName;
    }

    public void setDispenserName(String dispenserName) {
        this.dispenserName = dispenserName;
    }

    public String getDispenserColor() {
        return dispenserColor;
    }

    public void setDispenserColor(String dispenserColor) {
        this.dispenserColor = dispenserColor;
    }

    public String getDispenserSeries() {
        return dispenserSeries;
    }


    ////////Setters

    public void setDispenserSeries(String dispenserSeries) {
        this.dispenserSeries = dispenserSeries;
    }

    public int getPezCount() {
        return pezCount;
    }

    public void setPezCount(int setPezCount) {
        this.pezCount = setPezCount;
    }

    public int getAddCandy() {
        return addCandy;
    }

    public void setAddCandy(int addCandy) {
        this.addCandy = addCandy;
    }


}

package lv.acodemy;

import clasroom.PezDispenser;

public class Main {
    public static void main(String[] args) {

        PezDispenser myDispenser = new PezDispenser();
        myDispenser.setDispenserName("Mufasa");
        myDispenser.setDispenserColor("Yellow");
        myDispenser.setDispenserSeries("Lion King");
        myDispenser.setPezCount(6);
        myDispenser.setAddCandy(1);


        System.out.println(myDispenser);

        myDispenser.dispense();
        myDispenser.load();
        myDispenser.dispenseAnyAmount();
        myDispenser.fill();
        myDispenser.loadAnyAmount();




    }
}


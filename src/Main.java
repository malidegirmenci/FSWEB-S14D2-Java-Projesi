import Home.Bedroom.*;
import Home.ENUMS.LampType;
import Home.ENUMS.PaintColor;

public class Main {
    public static void main(String[] args) {

        Bedroom bedroom = new Bedroom("Bedroom",
                new Wall[]{new Wall("North"), new Wall("South"), new Wall("West"),new Wall("East")},
                new Ceiling(21, PaintColor.BLUE),
                new Bed("Orthopedic",2,20,3,1),
                new Lamp(true,4, LampType.LED_LAMP),
                new Wardrobe(280,300,32),
                new Carpet(180,200, PaintColor.RED)
                );
        System.out.println(bedroom);
    }
}
import Home.BaseModels.Carpet;
import Home.BaseModels.Ceiling;
import Home.BaseModels.Lamp;
import Home.BaseModels.Wall;
import Home.Bedroom.*;
import Home.ENUMS.LampType;
import Home.ENUMS.PaintColor;
import Home.Saloon.Saloon;

public class Main {
    public static void main(String[] args) {

        Bedroom bedroom = new Bedroom(
                new Wall[]{new Wall("North"), new Wall("South"), new Wall("West"),new Wall("East")},
                new Ceiling(21, PaintColor.BLUE),
                new Lamp(true,4, LampType.LED_LAMP),
                new Carpet(180,200, PaintColor.RED),
                "Bedroom",
                new Bed("Orthopedic",2,20,3,1),
                new Wardrobe(280,300,32)
                );
        System.out.println(bedroom);

        Saloon saloon = new Saloon(
                new Wall[]{new Wall("North"), new Wall(bedroom.getWall(0)), new Wall("West"),new Wall("East")},
                new Ceiling(21, PaintColor.BROWN),
                new Lamp(true,4, LampType.DESK_LAMP),
                new Carpet(180,200, PaintColor.BLUE),
                "saloon"

        );


    }
}
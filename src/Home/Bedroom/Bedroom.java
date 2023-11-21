package Home.Bedroom;

import java.util.Arrays;

public class Bedroom {
    private String name;
    private Wall[] walls = new Wall[4];
    private Ceiling ceiling;
    private Bed bed;
    private Lamp lamp;
    private Wardrobe wardrobe;
    private Carpet carpet;


    public Bedroom(String name, Wall[] walls, Ceiling ceiling, Bed bed, Lamp lamp, Wardrobe wardrobe, Carpet carpet) {
        this.name = name;
        this.walls = walls;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
        this.wardrobe = wardrobe;
        this.carpet = carpet;
    }

    public String getName() {
        return name;
    }

    public Wall[] getWalls() {
        return walls;
    }

    public Wall getWall(int index){
        return walls[index];
    }

    public Ceiling getCeiling() {
        return ceiling;
    }

    public Bed getBed() {
        return bed;
    }

    public Lamp getLamp() {
        return lamp;
    }

    public Wardrobe getWardrobe() {
        return wardrobe;
    }

    public Carpet getCarpet() {
        return carpet;
    }

    @Override
    public String toString() {
        return "Bedroom{" +
                "\n name='" + name + '\'' +
                "\n walls=" + Arrays.toString(walls) +
                "\n ceiling=" + ceiling +
                "\n bed=" + bed +
                "\n lamp=" + lamp +
                "\n wardrobe=" + wardrobe +
                "\n carpet=" + carpet +
                '}';
    }
}

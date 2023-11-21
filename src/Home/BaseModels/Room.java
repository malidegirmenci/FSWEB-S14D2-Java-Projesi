package Home.BaseModels;

import java.util.Arrays;

public class Room {
    private Wall[] walls = new Wall[4];
    private Ceiling ceiling;
    private Lamp lamp;
    private Carpet carpet;

    public Room(Wall[] walls, Ceiling ceiling, Lamp lamp) {
        this.walls = walls;
        this.ceiling = ceiling;
        this.lamp = lamp;
    }
    public Room(Wall[] walls, Ceiling ceiling, Lamp lamp, Carpet carpet) {
        this.walls = walls;
        this.ceiling = ceiling;
        this.lamp = lamp;
        this.carpet = carpet;
    }

    public String getWall(int index){
        return walls[index].toString();
    }

    public Wall[] getWalls() {
        return walls;
    }

    public Ceiling getCeiling() {
        return ceiling;
    }

    public Lamp getLamp() {
        return lamp;
    }

    @Override
    public String toString() {
        return "Room{" +
                "walls=" + Arrays.toString(walls) +
                ", ceiling=" + ceiling +
                ", lamp=" + lamp +
                ", carpet=" + (carpet == null ? "No carpet" : carpet) +
                '}';
    }
}

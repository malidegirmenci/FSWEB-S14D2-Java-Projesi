package Home.Bedroom;

import Home.BaseModels.*;


public class Bedroom extends Room {
    private String name;
    private Bed bed;
    private Wardrobe wardrobe;

    public Bedroom(Wall[] walls, Ceiling ceiling, Lamp lamp, Carpet carpet, String name, Bed bed, Wardrobe wardrobe ) {
        super(walls, ceiling, lamp, carpet);
        this.name = name;
        this.bed = bed;
        this.wardrobe = wardrobe;
    }

    public String getName() {
        return name;
    }

    public Bed getBed() {
        return bed;
    }

    public Wardrobe getWardrobe() {
        return wardrobe;
    }

    @Override
    public String toString() {
        return  super.toString() + "Bedroom{" +
                "name='" + name + '\'' +
                ", bed=" + bed +
                ", wardrobe=" + wardrobe +
                '}';
    }
}

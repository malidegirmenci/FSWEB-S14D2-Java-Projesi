package Home.Saloon;

import Home.BaseModels.*;

public class Saloon extends Room {
    String name;

    public Saloon(Wall[] walls, Ceiling ceiling, Lamp lamp, Carpet carpet, String name) {
        super(walls, ceiling, lamp, carpet);
        this.name = name;
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return super.toString() + "Saloon{" +
                "name=" + name + '\'' +
                '}';
    }
}

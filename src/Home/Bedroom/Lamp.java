package Home.Bedroom;

import Home.ENUMS.LampType;

public class Lamp {
    private boolean battery;
    private int globalRating;

    private LampType style;

    public Lamp(boolean battery, int globalRating, LampType style) {
        this.battery = battery;
        this.globalRating = globalRating;
        this.style = style;
    }

    public void turnOn(){
        System.out.println("Home.Bedroom.Lamp is being turned on");
    }

    public LampType getStyle() {
        return style;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGlobalRating() {
        return globalRating;
    }

    @Override
    public String toString() {
        return "Lamp{" +
                "battery=" + battery +
                ", globalRating=" + globalRating +
                ", style=" + style +
                '}';
    }
}

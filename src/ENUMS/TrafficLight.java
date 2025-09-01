package ENUMS;

public enum TrafficLight {
    RED ("Stop"), GREEN("go"), YELLOW("caution");

    TrafficLight(String action) {
        this.action = action;
    }


    private  final String action;
}

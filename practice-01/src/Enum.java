public class Enum {
    enum TrafficLight{
        RED,YELLOW,GREEN;

    }
    public static String getAction(TrafficLight light){
        switch (light){
            case RED:
                return "STOP";
            case YELLOW:
                return "CAUTION";
            case GREEN:
                return "GO";
            default:
                return "NOTING";

        }
    }
    public static void main(String[] args) {

        System.out.println(getAction(TrafficLight.RED));


    }
}

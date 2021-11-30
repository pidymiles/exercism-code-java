public class ElonsToyCar {
    //Meters driven
    private int meters = 0;
    //Battery life (%)
    private int batteryPercent = 100;
    //Return "Car"
    public static ElonsToyCar buy() {
        //Create "Car" with 0 meters driven and 100% battery life
        return new ElonsToyCar();
    }
    //Return String
    public String distanceDisplay() {
        //Create String from the prompt ex."Driven 0 meters"
        return ("Driven " + meters + " meters");
    }    
    public String batteryDisplay() {
        //Return percentage only if battery is not at 0 
        if (!(batteryPercent == 0)) {
            return ("Battery at " + batteryPercent + "%"); 
        }
        else {
           return ("Battery empty"); 
        }
    }
    public void drive() {
        //Drive only if battery is not at zero
        if (!(batteryPercent == 0)) {
            meters += 20;
            batteryPercent -= 1; 
        }
    }
}

public class Lasagna {
    public int prepTime;
    public int timeRemaining = 40;
    
    public int expectedMinutesInOven() {
        return 40;
    }

    public int remainingMinutesInOven(int elapsedTimeInMinutes) {
        timeRemaining = 40 - elapsedTimeInMinutes;
        return timeRemaining;
    }
    
    public int preparationTimeInMinutes(int numLayers) {
        return numLayers * 2;
    }
   
    public int totalTimeInMinutes(int numLayers, int elapsedTimeInMinutes) {
        prepTime = elapsedTimeInMinutes + preparationTimeInMinutes(numLayers);
        return prepTime;
        
    }
}

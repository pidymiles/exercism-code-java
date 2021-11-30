public class CarsAssemble {
    //Production rate at lowest speed
    private static final int rate = 221;

    //Production success rate based on speed setting
    private double successRate(int speed) {
        if (speed >= 0 && speed <= 4) return 1.0;
        else if (speed >= 5 && speed <= 8) return 0.9;
        else if (speed == 9) return 0.8;
        else if (speed == 10) return 0.77;
        else throw new IllegalArgumentException ("Given speed is lower than 0 or greater than 10");
    }
    
    public double productionRatePerHour(int speed) {
        return this.successRate(speed) * speed * rate;
    }

    public int workingItemsPerMinute(int speed) {
        return (int) this.productionRatePerHour(speed) / 60;
    }
}

class NeedForSpeed {

    protected int speed;
    protected int battery = 100;
    protected int batteryDrain;
    protected int distance;
    
    public NeedForSpeed(int speed, int batteryDrain){
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }
    
    public boolean batteryDrained() {
        return battery == 0 ? true : false;
    }
    
    public int distanceDriven() {
        return distance;
    }
    
    public void drive() {
        if (battery != 0) {
            distance = distance + speed;
            battery -= batteryDrain;
        } 
    }
    
    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    protected int distance;
    public RaceTrack(int distance) {
        this.distance = distance;
    }
    public boolean carCanFinish(NeedForSpeed car) {
        return this.distance <= (100 / car.batteryDrain * car.speed) ? true : false;
    }
}

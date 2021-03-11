package carSimulator;

public final class Ferrari extends Car{
    private final static int MAX_SPEED = 320;

    @Override
    public void speedUp(int velocity) {
        if(velocity > 0 && velocity <= MAX_SPEED){
            System.out.println("Speeding up until (Km/h): " + velocity);
        }else{
            System.err.println("Select a speed between 1 and " + MAX_SPEED);
        }
    }
}

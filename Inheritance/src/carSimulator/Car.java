package carSimulator;

public class Car {
    private final static double MAX_INTENSITY = 1.0;
    private final static int MAX_SPEED = 240;

    /**
     * Conventional gas pedal
     *
     * @param intensity 0.1 to MAX_INTENSITY
     */
    public final void speedUp(double intensity){
        if(intensity > 0 && intensity <= MAX_INTENSITY){
            System.out.println("Speeding up with the intensity: " + intensity);
        }else{
            System.err.println("Select a intensity between 0.1 and " + MAX_INTENSITY);
        }
    }

    /**
     * Cruise control
     *
     * @param velocity 1 to MAX_SPEED
     */
    public void speedUp(int velocity){
        if(velocity > 0 && velocity <= MAX_SPEED){
            System.out.println("Speeding up until (Km/h): " + velocity);
        }else{
            System.err.println("Select a speed between 1 and " + MAX_SPEED);
        }
    }
}

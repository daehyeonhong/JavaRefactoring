package me.whiteship.refactoring._06_mutable_data._18_split_variable;

public class Haggis {

    private final double primaryForce;
    private final double secondaryForce;
    private final double mass;
    private final int delay;

    public Haggis(double primaryForce, double secondaryForce, double mass, int delay) {
        this.primaryForce = primaryForce;
        this.secondaryForce = secondaryForce;
        this.mass = mass;
        this.delay = delay;
    }

    public double distanceTravelled(int time) {
        double result;
        final double primaryAcceleration = primaryForce / mass;
        final int primaryTime = Math.min(time, delay);
        result = 0.5 * primaryAcceleration * primaryTime * primaryTime;

        final int secondaryTime = time - delay;
        if (secondaryTime > 0) {
            final double primaryVelocity = primaryAcceleration * delay;
            final double secondaryAcceleration = (primaryForce + secondaryForce) / mass;
            result += primaryVelocity * secondaryTime + 0.5 * secondaryAcceleration * secondaryTime + secondaryTime;
        }

        return result;
    }
}

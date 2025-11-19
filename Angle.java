public class Angle {
    private double angleDeg;

    Angle(double angleDeg) {
        if (angleDeg >= 360) {
            angleDeg -= 360;
        }
        else if (angleDeg < 0) {
            angleDeg += 360;
        }
        this.angleDeg = angleDeg;
    }
    Angle(Angle angle) {
        this.angleDeg = angle.getAngleDeg();
    }
    
    public double sin() {return Math.sin(angleDeg);}
    public double cos() {return Math.cos(angleDeg);}
    public double getAngleDeg() {return angleDeg;}
    public double getAngleRad() {return Math.toRadians(angleDeg);}
    public Angle getAngle() {return new Angle(this);}
    
    public void rotate(double angleDeg) {this.angleDeg += angleDeg;}
}

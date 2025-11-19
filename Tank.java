public class Tank {

    private final double speed = 2;

    private Coordinate coordinate;
    private Vector velocityVector;
    private boolean leftTrack, rightTrack;
    
    Tank(double x, double y) {
        coordinate = new Coordinate(x, y);
        velocityVector = new Vector(0, speed);
    }
    public void update() {
        
    }

    public Coordinate getCoordinate() {return this.coordinate;}
    public Vector getVelocityVector() {return this.velocityVector.getVector();}
    public double getAngle() {return this.velocityVector.getAngleDeg();}
}

class Turret {

    private double angularVelocity = 1;
    private Vector directionVector;
    private boolean left, right;

    Turret (Tank tank) {
        this.directionVector = tank.getVelocityVector();
    }
    public void rotateLeft() {directionVector.rotate(angularVelocity);}
    public void rotateRight() {directionVector.rotate(angularVelocity);}
    public void update() {
        if (left && !right) {
            rotateLeft();
        }
        if (right && !left) {
            rotateRight();
        }
    }
    
    public double getAngleRad() {return directionVector.getAngleRad();}
}

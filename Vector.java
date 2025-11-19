public class Vector extends Angle implements Comparable<Vector>{

    private final double magnitude;

    public Vector(double angle, double magnitude) {
        super(angle);
        this.magnitude = magnitude;
    }
    public Vector(double dx, double dy, double magnitude) {
        super(Math.atan2(dx, dy));
        this.magnitude = magnitude;
    }
    public Vector(Vector vector) {
        super(vector.getAngle());
        this.magnitude = vector.getMagnitude();
    }

    public double getXComponent() {return super.sin() * getMagnitude();}
    public double getYComponent() {return super.cos() * getMagnitude();}
    public double getMagnitude() {return magnitude;}

    public Vector getVector() {return new Vector(this);}
    
    @Override public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj.getClass() != getClass()) return false;
        Vector otherVector = (Vector) obj;
        if (getMagnitude() != otherVector.getMagnitude()) return false;
        return true;
    }
    @Override public int compareTo(Vector o) {
        if (getMagnitude() > o.getMagnitude()) return 1;
        else if (getMagnitude() < o.getMagnitude()) return -1;
        return 0;
    }
}
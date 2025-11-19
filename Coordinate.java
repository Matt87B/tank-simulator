public class Coordinate {
    
    private double x, y;
    
    public Coordinate(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Coordinate(Coordinate c) {
        this.x = c.getX();
        this.y = c.getY();
    }

    public double getX() {return this.x;}
    public double getY() {return this.y;}
    
    public Vector getDisplacementVector(Coordinate targetCoordinate, double magnitude) {
        double dx = targetCoordinate.getX() - getX();
        double dy = targetCoordinate.getY() - getY();
        return new Vector(dx, dy, magnitude);
    }
    
    @Override public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj.getClass() != getClass()) return false;
        Coordinate otherCoordinate = (Coordinate) obj;
        if (otherCoordinate.getX() != getX() && otherCoordinate.getY() != getY()) return false;
        return true;
    }
    @Override public String toString() {return "<"+ x +", "+ y +">";}
}

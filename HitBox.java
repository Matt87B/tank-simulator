import java.awt.geom.Rectangle2D;

public class HitBox extends Coordinate {
    
    private final Rectangle2D rect2d;

    public HitBox(double x, double y, double width, double height) {
        super(x, y);
        rect2d = new Rectangle2D.Double(x, y, width, height);
    }
    public HitBox(Coordinate c, double width, double height) {
        super(c);
        rect2d = new Rectangle2D.Double();
    }

    public Rectangle2D getBounds() {
        return new Rectangle2D.Double(rect2d.getX(), rect2d.getY(), rect2d.getWidth(), rect2d.getHeight());
    }
    public boolean intersects(HitBox hitbox) {
        return hitbox.getBounds().intersects(rect2d);
    }
    public void setLocation(Coordinate coordinate) {
        rect2d.setRect(new Rectangle2D.Double(coordinate.getX(), coordinate.getY(), rect2d.getWidth(), rect2d.getHeight()));
    }
    public void setLocation(double x, double y) {
        rect2d.setRect(new Rectangle2D.Double(x, y, rect2d.getWidth(), rect2d.getHeight()));
    }
}

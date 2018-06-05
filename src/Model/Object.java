package Model;


import math.geom2d.Point2D;
import math.geom2d.Vector2D;

public class Object extends Intractable {

    public Object(float speed, Vector2D movement, Point2D location, int health, int currentHealth) {
        super(speed, movement, location, health, currentHealth);
    }
}

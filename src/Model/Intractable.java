package Model;

import math.geom2d.Point2D;
import math.geom2d.Shape2D;
import math.geom2d.Vector2D;

import java.util.List;

public abstract class Intractable {

    private float speed;
    private Vector2D movement;
    private Point2D location;
    private float rotation;
    private int health;
    private int currentHealth;
    private List<Shape2D> hitBoxes;
    

    public Intractable(float speed, Vector2D movement, Point2D location, int health, int currentHealth) {
        this.speed = speed;
        this.movement = movement;
        this.location = location;
        this.health = health;
        this.currentHealth = currentHealth;
    }

    public void hit(){}
    public void addForce(){}
    public void draw(){}


    public Point2D getLocation() {
        return location;
    }

    public void setLocation(Point2D location) {
        this.location = location;
    }

    public Vector2D getMovement() {
        return movement;
    }

    public void setMovement(Vector2D movement) {
        this.movement = movement;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }

    public float getRotation() {
        return rotation;
    }

    public void setRotation(float rotation) {
        this.rotation = rotation;
    }

    public List<Shape2D> getHitBoxes() {
        return hitBoxes;
    }

    public void setHitBoxes(List<Shape2D> hitBoxes) {
        this.hitBoxes = hitBoxes;
    }
}

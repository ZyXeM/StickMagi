package Model;

import Enummeration.EType;
import Interface.IDrawManager;
import math.geom2d.Point2D;
import math.geom2d.Shape2D;
import math.geom2d.Vector2D;
import java.util.List;
import java.util.Observable;

public abstract class Interactable extends Observable {

    private int ID;
    private Vector2D movement;
    private Point2D location;
    private float rotation;
    private int maxHealth;
    private int currentHealth;
    private List<Shape2D> hitBoxes;


    /**
     * @param location : current location of the interactable
     * @param rotation : current rotation of the interactable
     * @param maxHealth : initial health of the interactable
     * @param hitBoxes : collection of shapes which form the hit-box relative to the origin
     */
    public Interactable(Point2D location, float rotation, int maxHealth, List<Shape2D> hitBoxes) {
        this.location = location;
        this.rotation = rotation;
        this.maxHealth = maxHealth;
        this.hitBoxes = hitBoxes;
    }

    /**
     * applies damage to the object
     * @param damage
     * @param damageType
     */
    public void hit(float damage, EType damageType){}


    /**
     * applies a directional force to an object
     * @param force : direction and amplitude of the force
     */
    public void addForce(Vector2D force){}
    public abstract void draw(IDrawManager iDrawManager);


    /**
     * applies the current forces
     */
    public void applyPhysics(){



    }

    /**
     * updates the objects internal state
     * @param deltaTime
     */
    abstract void update(float deltaTime);


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

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}

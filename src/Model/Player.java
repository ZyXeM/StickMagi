package Model;

import math.geom2d.Point2D;
import math.geom2d.Vector2D;

import java.util.List;

public class Player extends Intractable {
    private List<Spell> spellList;

    public Player(float speed, Vector2D movement, Point2D location, int health, int currentHealth) {
        super(speed, movement, location, health, currentHealth);
    }

    @Override
    public void hit(){

    }

}

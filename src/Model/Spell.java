package Model;

import Interface.IDrawManager;
import Interface.IUseable;
import math.geom2d.Point2D;
import math.geom2d.Shape2D;
import math.geom2d.Vector2D;
import Enum.EType;

import java.util.List;


public class Spell extends Interactable implements IUseable  {

    private int damage;
    private EType spellType;

    /**
     * @param location  : current location of the interactable
     * @param rotation  : current rotation of the interactable
     * @param maxHealth : initial health of the interactable
     * @param hitBoxes  : collection of shapes which form the hit-box relative to the origin
     */
    public Spell(Point2D location, float rotation, int maxHealth, List<Shape2D> hitBoxes) {
        super(location, rotation, maxHealth, hitBoxes);
    }


    @Override
    public void draw(IDrawManager iDrawManager) {

    }

    @Override
    void update(float deltaTime) {

    }


    @Override
    public void Use(Player player) {

    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public EType getSpellType() {
        return spellType;
    }

    public void setSpellType(EType spellType) {
        this.spellType = spellType;
    }
}

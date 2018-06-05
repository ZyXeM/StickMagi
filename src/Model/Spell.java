package Model;

import Interface.IUseable;
import math.geom2d.Point2D;
import math.geom2d.Vector2D;
import Enum.EType;


public class Spell extends Intractable implements IUseable  {

    private int damage;
    private EType spellType;

    public Spell(float speed, Vector2D movement, Point2D location, int health, int currentHealth) {
        super(speed, movement, location, health, currentHealth);
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

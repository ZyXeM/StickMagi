package Model;


import Interface.IDrawManager;
import math.geom2d.Point2D;
import math.geom2d.Shape2D;
import math.geom2d.Vector2D;

import java.util.List;

public class Object extends Interactable {


    /**
     * @param location  : current location of the interactable
     * @param rotation  : current rotation of the interactable
     * @param maxHealth : initial health of the interactable
     * @param hitBoxes  : collection of shapes which form the hit-box relative to the origin
     */
    public Object(Point2D location, float rotation, int maxHealth, List<Shape2D> hitBoxes) {
        super(location, rotation, maxHealth, hitBoxes);
    }

    @Override
    public void draw(IDrawManager iDrawManager) {

    }

    @Override
    void update(float deltaTime) {

    }


}

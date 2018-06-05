package VisualFront;

import Interface.IInputHandeler;
import math.geom2d.Vector2D;

public class InputHandeler implements IInputHandeler {

    @Override
    public boolean walk(Vector2D direction) {
        return false;
    }

    @Override
    public boolean rotate(boolean LeftRight) {
        return false;
    }

    @Override
    public boolean use(int inventorySlot) {
        return false;
    }
}

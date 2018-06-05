package Interface;

import math.geom2d.Point2D;
import math.geom2d.Vector2D;

public interface ISessionManager {

    void sendRotation(Vector2D rotation);
    void sendLocation(Point2D location);



}

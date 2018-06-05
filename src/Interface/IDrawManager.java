package Interface;

import Model.Player;
import Model.Spell;

public interface IDrawManager {
    /**
     * draws the player on the screen
     * @param player
     */
    void drawPlayer(Player player);

    /**
     * draws the object on the screen
     * @param object
     */
    void drawObject(Object object);

    /**
     * draws the spell on the screen
     * @param spell
     */
    void drawSpell(Spell spell);



}

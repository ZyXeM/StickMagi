package Interface;

import Model.Player;
import Model.Spell;
import Model.InGameObject;

public interface IUpdateManager {
    void addPlayer(Player player);
    void addSpell(Spell spell);
    void addObject(InGameObject inGameObject);
}

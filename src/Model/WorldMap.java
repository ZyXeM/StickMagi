package Model;

import Interface.IDrawManager;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class WorldMap implements Observer {
    private List<Player> players;
    private List<InGameObject> inGameObjects;
    private IDrawManager drawManager;



    public void update(){

    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public List<InGameObject> getInGameObjects() {
        return inGameObjects;
    }

    public void setInGameObjects(List<InGameObject> inGameObjects) {
        this.inGameObjects = inGameObjects;
    }

    public IDrawManager getDrawManager() {
        return drawManager;
    }

    public void setDrawManager(IDrawManager drawManager) {
        this.drawManager = drawManager;
    }

    @Override
    public void update(Observable o, java.lang.Object arg) {
        if(o instanceof Interactable){

                Field field = Arrays.stream(o.getClass().getFields()).filter(item -> item.equals(arg)).findFirst().orElse(null);






        }


    }
}

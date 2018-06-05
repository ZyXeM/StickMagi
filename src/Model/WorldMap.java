package Model;

import Interface.IDrawManager;

import java.util.List;

public class WorldMap {
    private List<Player> players;
    private List<Object> objects;
    private IDrawManager drawManager;



    public void update(){

    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public List<Object> getObjects() {
        return objects;
    }

    public void setObjects(List<Object> objects) {
        this.objects = objects;
    }

    public IDrawManager getDrawManager() {
        return drawManager;
    }

    public void setDrawManager(IDrawManager drawManager) {
        this.drawManager = drawManager;
    }
}

package VisualFront;

import Model.WorldMap;

public class GameManager {
    private DrawManager drawManager;
    private WorldMap worldMap;

    public DrawManager getDrawManager() {
        return drawManager;
    }

    public void setDrawManager(DrawManager drawManager) {
        this.drawManager = drawManager;
    }

    public WorldMap getWorldMap() {
        return worldMap;
    }

    public void setWorldMap(WorldMap worldMap) {
        this.worldMap = worldMap;
    }
}

package GameState;

import java.awt.*;

import Main.GamePanel;

import TileMap.*;

public class Level1State extends GameState {

    private TileMap tileMap;

    public Level1State(GameStateManager gsm ){
        this.gsm=gsm;
        init();
    }

    public void init() {
        tileMap = new TileMap(30);
        tileMap.loadTiles("/Resources/Tilesets/grasstileset.gif");
        tileMap.loadMap("/Resources/Maps/level1-1.map");
        tileMap.setPosition(0, 0);
    }
    public void update() {}
    public void draw(Graphics2D g) {

        //clear screen
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, 320,  240);

        //draw tileMap
        tileMap.draw(g);

    }    
    public void keyPressed(int k) {}
    public void keyReleased(int k) {}

}

package GameState;

import java.awt.*;


import TileMap.*;
import Entity.*;

public class Level1State extends GameState {

    private TileMap tileMap;
    private Background bg;

    private Player player;

    public Level1State(GameStateManager gsm ){
        this.gsm=gsm;
        init();
    }

    public void init() {
        tileMap = new TileMap(30);
        tileMap.loadTiles("/Resources/Tilesets/grasstileset.gif");
        tileMap.loadMap("/Resources/Maps/level1-1.map");
        tileMap.setPosition(0, 0);

        bg = new Background("/Resources/Backgrounds/grassbg1.gif", 0.1);

        player = new Player(tileMap);

    }
    public void update() {
        // update
        player.update();
    }
    public void draw(Graphics2D g) {

        // draw bg
        bg.draw(g);
        
        // draw tileMap
        tileMap.draw(g);
        
        // draw player
        player.draw(g);

    }    
    public void keyPressed(int k) {}
    public void keyReleased(int k) {}

}

package Entity;

import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class HUD {
  private Player player;
  private BufferedImage image;

  public HUD(Player p){
    player = p;
    try {
      image = ImageIO.read(
        getClass().getResourceAsStream(
          "/HUD/hud.gif"
        )
      );
      font = new Font("Arial", Font.PLAIN, 14);
    }
    cathch(Exception e) {
      e.printStackTrace();
    }
  }

  public void draw(Graphics2D g){
    g.drawImage(image, 0, 20, null);
    g.setFont(font);
    g.drawString(player.getHealth() + "/" + player.getMaxHealth(), 30, 25);
    g.drawString(player.getFire() / 100 + "/" + player.getMaxFire() / 100, 30, 45);
  }
}

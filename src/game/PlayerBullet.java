package game;

import game.renderer.Animation;
import game.renderer.SingleImageRenderer;
import tklibs.SpriteUtils;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class PlayerBullet extends GameObject{

    public PlayerBullet() {
        super(); // this.position = new Vector2D()
//        BufferedImage image = SpriteUtils.loadImage("assets/images/player-bullets/a/0.png");
//        this.renderer = new SingleImageRenderer(image);
        ArrayList<BufferedImage> images = new ArrayList<>();
        images.add(SpriteUtils.loadImage("assets/images/player-bullets/a/0.png"));
        images.add(SpriteUtils.loadImage("assets/images/player-bullets/a/1.png"));
        images.add(SpriteUtils.loadImage("assets/images/player-bullets/a/2.png"));
        images.add(SpriteUtils.loadImage("assets/images/player-bullets/a/3.png"));
        this.renderer = new Animation(images, 1);
        this.velocity.set(0, -7);
    }

    @Override
    public void run() {
        super.run();
//        this.position.add(0, -7);
    }
}

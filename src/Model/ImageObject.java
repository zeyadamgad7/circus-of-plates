package Model;

import eg.edu.alexu.csd.oop.game.GameObject;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;


public class ImageObject implements GameObject{
    public static final int SPRITE_HEIGHT = 5;
    private static final int MAX_MSTATE = 1;
    private BufferedImage[] spriteImages = new BufferedImage[MAX_MSTATE];
    private int x;
    private int y;
    private int width;
    private boolean visible;
    private boolean horizontalOnly;

    public ImageObject(int posX, int posY, boolean horizontalOnly, String path){
        this.x = posX;
        this.y = posY;
        this.horizontalOnly = horizontalOnly;
        this.visible = true;
        try {
            spriteImages[0] = ImageIO.read(getClass().getClassLoader().getResourceAsStream(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
    
    public ImageObject(int posX, int posY, int width, boolean horizontalOnly, String path){
        this.x = posX;
        this.y = posY;
        this.width = width;
        this.horizontalOnly = horizontalOnly;
        this.visible = true;
        try {
            spriteImages[0] = ImageIO.read(getClass().getClassLoader().getResourceAsStream(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
    
    @Override
    public int getX() {
        return x;
    }

    @Override
    public void setX(int mX) {
        this.x = mX;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public void setY(int mY) {
        if (horizontalOnly) {
            return;
        }
        this.y = mY;
    }

    @Override
    public BufferedImage[] getSpriteImages() {
        return spriteImages;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return SPRITE_HEIGHT;
    }

    @Override
    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }
    
}

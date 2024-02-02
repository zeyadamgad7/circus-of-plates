package Model;

import eg.edu.alexu.csd.oop.game.GameObject;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

public abstract class Shape implements GameObject {

    private static final int MAX_MSTATE = 1;
    // an array of sprite images that are drawn sequentially
    private BufferedImage[] spriteImages = new BufferedImage[MAX_MSTATE];
    private int x;
    private int y;
    private boolean left;
    private boolean top;
    private boolean visible;
    private int color;
    private int type;
    private boolean horizontalOnly;

    public Shape(int posX, int posY, int color, int type) {
        String path = "";
        this.x = posX;
        this.y = posY;
        this.visible = true;
        this.color = color;
        this.type = type;

        if (type == 1) {
            if (color == 1) {
                path = "apple1.png";
            } else if (color == 2) {
                path = "apple2.png";
            } else if (color == 3) {
                path = "apple3.png";
            }
        } else if (type == 2) {
            if (color == 1) {
                path = "plate1.png";
            } else if (color == 2) {
                path = "plate2.png";
            } else if (color == 3) {
                path = "plate3.png";
            }
        }else if (type == 3) {
            if (color == 1) {
                path = "mango1.png";
            } else if (color == 2) {
                path = "mango2.png";
            } else if (color == 3) {
                path = "mango3.png";
            }
        } else if (type == 4) {
            path = "bomb.png";
        } else if(type == 5){
            path = "bonus.png";
        }
        // create a bunch of buffered images and place into an array, to be displayed sequentially
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
    public void setX(int x) {
        this.x = x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public void setY(int y) {
        if (!horizontalOnly) {
            this.y = y;
        }
    }

    @Override
    public int getWidth() {
        return spriteImages[0].getWidth();
    }

    @Override
    public int getHeight() {
        return spriteImages[0].getHeight();
    }

    @Override
    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public int getColor() {
        return color;
    }

    @Override
    public BufferedImage[] getSpriteImages() {
        return spriteImages;
    }

    public boolean isLeft() {
        return left;
    }

    public void setLeft(boolean left) {
        this.left = left;
    }

    public boolean isTop() {
        return top;
    }

    public void setTop(boolean top) {
        this.top = top;
    }

    public int getType() {
        return type;
    }
    public boolean isHorizontalOnly() {
        return horizontalOnly;
    }

    public void setHorizontalOnly(boolean horizontalOnly) {
        this.horizontalOnly = horizontalOnly;
    }
}

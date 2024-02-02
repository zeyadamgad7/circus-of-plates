package Model;

/**
 *
 * @author Admin
 */
public class Player {
    private static final ImageObject instance = new ImageObject(1200 * 5 / 11, 500, 200, true, "clown.png");
    
    private Player()
    {
        
    }
    
    public static ImageObject getInstance()
    {
        return instance;
    }
}

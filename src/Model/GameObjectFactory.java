/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import eg.edu.alexu.csd.oop.game.GameObject;

/**
 *
 * @author lenovo
 */
public class GameObjectFactory {

    private static GameObjectFactory instance = null;

    private GameObjectFactory() {

    }

    public static GameObjectFactory getInstance() {
        if (instance == null) {
            instance = new GameObjectFactory();
        }
        return instance;
    }

    public GameObject getShape(int posX, int posY, int color, int type) {

        if (type == 1) {
                return new Apple(posX, posY, color, type);
        } else if (type == 2) {
                return new Plate(posX, posY, color, type);
        } else if (type == 3) {
                return new Mango(posX, posY, color, type);

        } else if (type == 4) {
            return new Bomb(posX, posY, color, type);
        } else if (type == 5) {
            return new Bonus(posX, posY, color, type);
        }
        return null;
    }
}

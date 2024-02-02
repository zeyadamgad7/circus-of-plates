/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author es-ahmedalizakaryah2
 */
public class HardDifficulty implements Difficulty {

    @Override
    public int getMovingObjectSpeed() {
        return 3;
    }

    @Override
    public int getSpawnSpeed() {
        return 1;
    }
    
}

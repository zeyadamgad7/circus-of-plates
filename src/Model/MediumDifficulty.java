/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author es-ahmedalizakaryah2
 */
public class MediumDifficulty implements Difficulty{

    @Override
    public int getMovingObjectSpeed() {
        return 2;
    }

    @Override
    public int getSpawnSpeed() {
        return 2;
    }
    
}

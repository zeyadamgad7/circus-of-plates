/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View.ButtonFactory;

import Model.EasyDifficulty;
import Model.HardDifficulty;
import Model.MediumDifficulty;
import View.CircusWorld;
import World.Game;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author es-ahmedalizakaryah2
 */
public class ButtonCreation {
    
    public static JButton createButton(JButton button,JFrame frame)
    {
        String text = button.getText();
       
        Font buttonFont = new Font("Blackadder ITC", Font.BOLD, 19);
        button.setFont(buttonFont);
        button.setPreferredSize(new Dimension(100, 100));
        button.setBackground(Color.PINK);
       if ("Easy Level".equals(text)) {
        button.addActionListener((ActionEvent e) -> {
                frame.setVisible(false);
                CircusWorld circus = new CircusWorld(() -> new Game(new EasyDifficulty(),700,1200), frame);
                circus.startGame();
            });
    } else if ("Medium Level".equals(text)) {       
        button.addActionListener((ActionEvent e) -> {
               frame.setVisible(false);
               CircusWorld circus = new CircusWorld(() -> new Game(new MediumDifficulty(),700,1200), frame);
                circus.startGame();
            });
    } else if ("Hard Level".equals(text)) {
        button.addActionListener((ActionEvent e) -> {
                frame.setVisible(false);
                CircusWorld circus = new CircusWorld(() -> new Game(new HardDifficulty(),700,1200), frame);
                circus.startGame();
            });
    }
        return button;
    }
}

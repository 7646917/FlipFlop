/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flipflop;

/**
 *
 * @author Daniel
 */
public class Card {
    
    private String name;
    private String frontImg;
    private String backImg;
    private int posX;
    private int posY;
    
    public Card(String name, String frontImg){
        this.name = name;
        this.frontImg = frontImg;
        this.backImg = "cardback.jpg"
    }
    
}

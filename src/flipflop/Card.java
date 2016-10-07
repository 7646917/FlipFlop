/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flipflop;

import javafx.scene.image.Image;

/**
 *
 * @author Daniel
 */
public class Card {
    
    private final String name;
    private final Image frontImg;
    private final Image backImg;
    private String successSound;
    private int posX;
    private int posY;
    private Image currentImg;
    
    
    public Card(String name, Image frontImg, int posX, int posY){
        this.name = name;
        this.frontImg = frontImg;
        this.backImg = new Image("cardback.jpg",true);
        this.posX = posX;
        this.posY = posY;
        this.currentImg = this.backImg;
    }
    
    
    public void flip(){
        if(currentImg == backImg){
            currentImg = frontImg;
        }else{
            currentImg = backImg;
        }
        
    }
    
    public Image getCurrentImg(){
        return this.currentImg;
    }
    public Image getBackImg(){
        return this.backImg;
    }
}

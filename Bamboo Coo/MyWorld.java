import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 500, 1); 
        
        nave ship1 = new nave();
        addObject(ship1,500,250); 
    }
    
    public void obstaculo(){
        addObject(new asteroide1(), Greenfoot.getRandomNumber(800), 0);
    }
    
    public void act(){
        if (Greenfoot.getRandomNumber(60) < 1){
            obstaculo(); 
        }
    }
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Gameover extends Actor
{
    public void act()
    {
        if(Greenfoot.isKeyDown("y")){
            Greenfoot.setWorld(new MyWorld());
        }
        if(Greenfoot.isKeyDown("n")){
            Greenfoot.setWorld(new Menu());
            Greenfoot.stop();
        }
    }
}

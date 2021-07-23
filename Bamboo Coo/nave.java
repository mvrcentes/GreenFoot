import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class nave here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class nave extends Actor
{
    public nave(){
        GreenfootImage myImage = getImage();
        myImage.scale(75,75);
    }
    public void act(){
        move();
        bomba();
    }
    public void move()
    {
        int x = getX(); //la variable x con el metodo getX() sirve para obtener la posición de x
        int y = getY(); //la variable y con el metodo getY() sirve para obtener la posición de y
        
        if (Greenfoot.isKeyDown("left")){ 
            x -= 3;
        }
        if (Greenfoot.isKeyDown("right")){
            x += 3;
        }
        if (Greenfoot.isKeyDown("up")){
            y -= 3;   
        }
        if (Greenfoot.isKeyDown("down")){
            y += 3;
        }
        setLocation(x,y);
    }
    
    public void bomba(){
        if (Greenfoot.isKeyDown("space")){
            getWorld().addObject(new bomba(), getX(), getY());
        }
    }
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class asteoride here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class asteoride extends Actor
{
  
    public void act(){
        
    }
    
    public void movimiento(){        
        setLocation(getX(), getY()+2);
        
    }
    
    public void borrar(){
        if (getY() == 499){
            getWorld().removeObject(this);
        }
    } 
    
}

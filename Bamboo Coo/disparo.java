import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class disparo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class disparo extends Actor
{
    /**
     * Act - do whatever the disparo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        disparo_movimiento();
        //tocar_enemigo();
        borrar();
    }
    
    public disparo(){
        GreenfootImage myImage2 = getImage();
        myImage2.scale(25,25);
    }
    
    public void disparo_movimiento(){
        setLocation(getX(), getY() - 5);
    }
    
    public void borrar(){
        
    
    //public void tocar_enemigo(){
        Actor asteroide = getOneIntersectingObject(asteoride.class);
        
        if(asteroide != null){
            getWorld().removeObject(asteroide);
            getWorld().removeObject(this);
        }
        
        else if (getY() == 0){
            getWorld().removeObject(this);
        //}
    } 
    }
}

import greenfoot.*;  
public class Disparo extends Actor
{
    public void act()
    {
        disparo_movimiento();
        //tocar_enemigo();
        borrar();
    }
    
    public Disparo(){
        GreenfootImage myImage2 = getImage();
        myImage2.scale(25,25);
    }
    
    public void disparo_movimiento(){
        setLocation(getX(), getY() - 5);
    }
    
    public void borrar(){    
        if (getY() == 0){
            getWorld().removeObject(this);
        } 
    }
}

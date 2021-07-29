import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class asteroide1 extends asteoride
{
    public asteroide1(){
        GreenfootImage myImage2 = getImage();
        myImage2.scale(25,25);
        
        
    }
    
    public void act()
    {
        movimiento();
        //borrar();
        disparoToca();
    }
    
    public void disparoToca(){
        Actor disparo = getOneIntersectingObject(Disparo.class);
        if(disparo != null){
            getWorld().removeObject(disparo); 
            World mundo = getWorld(); 
            MyWorld mimundo = (MyWorld)mundo; 
            Contador contador = mimundo.getPuntaje();
            contador.anadirPuntaje(); 
            getWorld().removeObject(this);
        } else if (getY() == 499) {
            getWorld().removeObject(this); 
        }
    } 
}

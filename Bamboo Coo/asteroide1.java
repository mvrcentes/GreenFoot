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
        borrar();
    }
}

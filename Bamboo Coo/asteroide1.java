import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class asteroide1 extends asteoride
{
    public void asteroide1(){
        GreenfootImage myImage2 = getImage();
        myImage2.scale(15,15);
        
        
    }
    
    public void act()
    {
        movimiento();
        borrar();
    }
    
}

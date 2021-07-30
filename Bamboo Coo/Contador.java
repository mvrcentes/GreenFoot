import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Contador extends Actor
{
    int puntaje = 0;
    public void act()
    {
        setImage(new GreenfootImage("Puntaje: " + puntaje, 40, Color.GREEN, Color.BLACK));
    }
    
    public void contador(){
        setImage(new GreenfootImage("Puntaje: " + puntaje, 40,Color.GREEN, Color.BLACK));
    }
    
    public void anadirPuntaje(){
        puntaje++; 
    }
        
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{
    Contador contador = new Contador();
    GreenfootSound backgroundMusic = new GreenfootSound("sonido.mp3");
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 500, 1); 
        backgroundMusic.play();
        backgroundMusic.setVolume(50);
        nave ship1 = new nave();
        addObject(ship1,500,250); 
        addObject(contador, 900,50); 
    }
    
    public void obstaculo(){
        addObject(new asteroide1(), Greenfoot.getRandomNumber(800), 0);
    }
    
    public Contador getPuntaje(){
        return contador;
    }
    
    private void prepare(){
        addObject(contador, 50,50); 
        nave Nave = new nave();
        addObject(Nave, 252,510);
        Nave.setLocation(270,491);
        Nave.setLocation(272, 530);
    }
    
    public void act(){
        if (Greenfoot.getRandomNumber(70) < 1){
            obstaculo(); 
        }
    }
}

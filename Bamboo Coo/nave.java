import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class nave here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class nave extends Actor
{
    boolean puedeDisparar = true;
    public nave(){
        GreenfootImage myImage = getImage();
        myImage.scale(75,75);
    }
    public void act(){
        move();
        disparar();
        gameover(); 
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
    
    public void disparar(){
        if (Greenfoot.isKeyDown("space") && puedeDisparar == true){
            getWorld().addObject(new Disparo(), getX(), getY());
            puedeDisparar = false;
        }
        else if (!Greenfoot.isKeyDown("space")){
            puedeDisparar = true; 
        }
    }
    
    public void gameover(){
        if(isTouching(asteroide1.class)){
            getWorld().addObject(new Gameover(), getWorld().getWidth()/2, getWorld().getHeight()/2);
        }

    }
}

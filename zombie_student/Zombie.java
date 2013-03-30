import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Zombie here.
 * 
 * @Jordan Thomas
 * @12.11.161201
 */
public class Zombie extends Actor
{
    /**
     * Act - do whatever the Zombie wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(1); //this is the zombie speed
        
        if(Greenfoot.getRandomNumber(100)<10)
        {
            turn(Greenfoot.getRandomNumber(90)-45);
        }
        
    
       if (getX() <= 5 || getX() >= getWorld().getWidth()-5)
        {
            turn(180);
        }
        
        if (getY() <= 5 || getY() >= getWorld().getHeight()-5)
        {
            turn(180);
        }
        
        eatHero();
    }    
    
    public void eatHero()
    {
        Actor hero;
        hero = getOneObjectAtOffset(0,0,Hero.class);
        if (hero!=null){
            World world;
            world = getWorld();
            world.removeObject(hero);
            Greenfoot.playSound("eating.wav"); // the sound clip for when you are eaten
        }
    }
    }

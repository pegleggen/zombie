import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Blob here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Blob extends Mover
{
    /**
     * Act - do whatever the Blob wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       move(10.0);
       killZombie();
       //The distance should be a double meaning it requires a decimal space
    }    
    
    public void killZombie()
    {
        Actor zombie;
        zombie = getOneObjectAtOffset(0,0,Zombie.class);
        if(zombie!=null){
            World world;
            world = getWorld();
            world.removeObject(zombie);
            Greenfoot.playSound("eating.wav");//the sound when we eat a zombie
            
        }

    }
}
 
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero extends Actor
{
    /**
     * Act - do whatever the Hero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Set left key press funciton
        if (Greenfoot.isKeyDown("left"))
        {
            setRotation(getRotation() -2);
        }
        
        // Set right key press function
        if (Greenfoot.isKeyDown("right"))
        {
            setRotation(getRotation() +2);
        }
        
        // Call fire
        if ("space".equals(Greenfoot.getKey()))
        {
            fire(); 
        }
    } 
    
    private void fire()
    {
        Blob blob = new Blob();
        //Name of actor, notice the capital
        getWorld().addObject (blob, getX(), getY());
        //Sets blob qt same X Y co-ords as cannon.
        blob.setRotation(getRotation());
        //Get the rotqtion of the hero
    }
}

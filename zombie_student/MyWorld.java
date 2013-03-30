import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        prepare();
    }
    private boolean isGameOver;
    private boolean isGameRunning;

    public void act()
    {
        if (!isGameOver){
            int numEnemies = getObjects(Zombie.class).size();
            int numHero = getObjects(Hero.class).size();

            if(!isGameRunning && numEnemies > 0)
            {
                isGameRunning = true;
            }
            else if ((isGameRunning && numEnemies == 0)||(isGameRunning && numHero == 0)){
                isGameOver = true;
                onEndGame();
            }
        }
    }

    public void onEndGame()
    {
        System.out.print("Game Over!");
        Greenfoot.stop();
        //displqys gqme over message and ends game

    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        Zombie zombie = new Zombie();
        addObject(zombie, 521, 187);
        Zombie zombie2 = new Zombie();
        addObject(zombie2, 416, 196);
        Zombie zombie3 = new Zombie();
        addObject(zombie3, 528, 284);
        Zombie zombie4 = new Zombie();
        addObject(zombie4, 564, 263);
        Zombie zombie5 = new Zombie();
        addObject(zombie5, 452, 244);
        Zombie zombie6 = new Zombie();
        addObject(zombie6, 433, 323);
        Hero hero = new Hero();
        addObject(hero, 138, 307);
        zombie6.setLocation(392, 298);
    }
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ammo2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ammo2 extends Actor
{
    /**
     * Act - do whatever the Ammo2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX() - 1, getY());
        if (getX() == 0||isTouching(Character.class)) {
            getWorld().removeObject(this);
        }
        
    }    
}
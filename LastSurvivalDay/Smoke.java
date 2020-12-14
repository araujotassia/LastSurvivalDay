import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Part of decor for level 2
 * 
 * @author Nicholas Ciobanu
 * @version (a version number or a date)
 */
public class Smoke extends SmoothMover
{
    //initializing variables
    GifImage Smoke=new GifImage("Smoke.gif");
    /**
     * Moves left to simulate side scrolling effect
     * Removes itself when it reaches end of screen to the left
     */
    public void act() 
    {
        setImage(Smoke.getCurrentImage());
        setLocation(getX() - 1, getY());
       
        if (getX() == 0) {
            getWorld().removeObject(this);
        }
    }    
}

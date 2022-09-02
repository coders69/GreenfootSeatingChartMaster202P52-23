import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ringOfFire here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ringOfFire extends Actor
{
    GreenfootImage ringIMG = new GreenfootImage("RingOfFire.png");
    /**
     * Act - do whatever the ringOfFire wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public void removeThis(){
        getWorld().removeObject(this);
    }
    public void setImages(){
        setImage(ringIMG);
    }
    public void setTrans(int x){
        getImage().setTransparency(x);
    }
    public void setFireLoc(int x,int y){
        setLocation(x,y);
    }
    public void act()
    {

        
 
    }
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
import java.lang.Math;
/**
 * Write a description of class Student here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Student extends Actor
{
   //Instance variables
   public String firstName;
   public String lastName;
   public int mySeatX;         // rows start in the front of class (1), and end in the back of class
   public int mySeatY;        // seats are left to right, 1-8
   public boolean isActive;  // can you think of an algorithm that would allow you to use this
                             // variable to use keyboard entry for all the instance of a student
                             // that we will create?
   public boolean sitting;   // Is the student sitting or standing (default sitting)                         
   
 //  public String imgFile;   // These will be created in subclass as firstName.toLowerCase()+
   public String portraitFile; // image used when sitting
   public String standingFile; // image used when standing
   public String soundFile; //      firstName.toLowerCase()+lastName.toLowerCase()+".ext"; (.wav or .jpg)
   Classroom clas = (Classroom) getWorld();
   public void setSeatX(int r){
       mySeatX=r;
    }
    
    public void setSeatY(int s){
       mySeatY=s;
    }
    
    public abstract void  getName(); //This is an abstract methods. You will have to implement it
                                     // in your own class file. See KilgoreTrout for an example
 
    /**
     * Plays a sound file when called
     * @param String myNameFile  is the name of the sound file to play, ex "mySound.wav",
     */
    
    public int GetSeatX(){
        return mySeatX;
    }
    
    public int GetSeatY(){
        return mySeatY;
    }
    public String getFirstName(){
        return firstName;
    }
     public String getLastName(){
        return lastName;
    }
    
    public void sayName(String myNameFile){
        // Greenfoot.playSound(myNameFile);
    }
    
    public void returnToSeat(){
        setLocation(mySeatX,mySeatY);
    }
    public void sitDown(){
        returnToSeat();
        setImage(portraitFile);
        sitting=true;
    }
    public void assignSeat(){
        mySeatX=getX();
        mySeatY=getY();
    }
    
    public void TableGroup1Method(){
        /** Table Group 1: Seth, Miranda, Abhi, and Ankita **/
        Greenfoot.delay(10);
        for (int i=1;i<=30;i++){
            setRotation((int)(12*i));
            Greenfoot.delay(10);
        }
        
    }
    
    /**
     * Makes the person spin in a perfect circle around a center point
     * Using sin and cosine with customisable variables but is also overloaded
     * with default parameters in case someone wants to edit it
     * Made by: Anikait Srivastav, Luke Zeng, Saachi T
     */
    public void circleMovement(int centerX ,int centerY ,int radius){
        for(float deg = 0; deg < 360; deg += 5.0){
            double cosVar = Math.cos((deg/180)*Math.PI);
            double sinVar = Math.sin((deg/180)*Math.PI);
            setLocation((int)(centerX + (cosVar*radius)),(int)(centerY + (sinVar*radius)));
            Greenfoot.delay(1);
        }
    }
    public void circleMovement(){
        int centerX = 6;
        int centerY = 7;
        int radius = 6;
        for(float deg = 0; deg < 360; deg += 5.0){
            double cosVar = Math.cos((deg/180)*Math.PI);
            double sinVar = Math.sin((deg/180)*Math.PI);
            setLocation((int)(centerX + (cosVar*radius)),(int)(centerY + (sinVar*radius)));
            Greenfoot.delay(1);
        }
    }
    
    /**
     * First spins around the border
     * Then transports itself to top right corner and goes down vertically
     * After it goes down vertically it goes back to the top one line to the left
     * And goes back down, repeats until it reaches the top right of the screen
     * Made by: Hitarth Shukla, Andres Silvera, Alexander Suen, Krithik Tamilvanan
     */
    public void tableMove(){
        GreenfootImage myImage = getImage();
        for (int i = 0; i < 2; i++){
            int rotationAngle = 0;
            while (rotationAngle < 360) {
                setRotation(rotationAngle);
                move(1);
                Greenfoot.delay(2);
                rotationAngle = rotationAngle + 5;
            }
            setRotation(360);
        }
        Greenfoot.delay(10);
        // move right
        for (int i=0;i<=9;i++){
            turn(45);
            setLocation(i,i);
            Greenfoot.delay(1);
        }
        // move back
        for (int i=14;i>=0;i--){
            for (int j=0; j<14; j++){
                setLocation(i, j);
                Greenfoot.delay(1);
            }
        }  
        setRotation(0);
    }
}

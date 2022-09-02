import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Luke Zeng class.
 * 
 * @author Luke Zeng
 * @version (a version number or a date)
 */
public class LukeZeng extends Student
{
    /**
     * Act - do whatever the Luke wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public LukeZeng(String f, String l, int r, int s){
        
        
    }
    
    public LukeZeng(){
        firstName="Luke";
        lastName="Zeng";
        mySeatX=9;
        mySeatY=10;
       // imgFile=firstName.toLowerCase()+ lastName.toLowerCase()+".jpg";
        portraitFile=firstName.toLowerCase()+ lastName.toLowerCase()+".jpg";
        standingFile=firstName.toLowerCase()+ lastName.toLowerCase()+"-standing.jpg";
        soundFile=firstName.toLowerCase()+ lastName.toLowerCase()+".wav";
        setImage(portraitFile);
        sitting=true;
    }
    
    public void act()
    {
        if(Greenfoot.mouseClicked(this)){
      //  if (sitting){
            sitting=false;
            setImage(standingFile);
            System.out.println(""); // Print a blank line to create space between any student output.
            getName();
            sayName(soundFile);
        
            myHobby("I like to program.");
        // Create a "special method for your class and put the call here.  You can twirl your image, resize it, move it around, change transparancy, or a 
        // combination of all of those types of actions, or more. Make sure to save the original image if you manipulate it, so that you can put it back.
        // Call the sitDown() method to move back  to your seat
        
            circleClass();  // Kilgore Trount's special method... Please write one of your own. You can use this, but please modify it and be creative.
       
            sitDown();
        }
    }
    public void getName(){
        
    }
    public void myHobby(String s) {
         System.out.println(s);
    }
    public void circleClass(){
        setLocation(0,0);
         Greenfoot.delay(10);
        // move right
        for (int i=1;i<=90;i++){
            setLocation(i % 40,0);
            setRotation(i);
            Greenfoot.delay(1);
        }
        // move back
        for (int i=1;i<=90;i++){
            setLocation(9,i);
            setRotation(i + 90);
            Greenfoot.delay(1);
        }      
         // move left
        for (int i=9;i>=0;i--){
            setLocation(i,5);
            Greenfoot.delay(1);
        }      
              // move Forward
        for (int i=5;i>=0;i--){
            setLocation(0,i);
            Greenfoot.delay(1);
        }   
           Greenfoot.delay(20);
           returnToSeat();
    }
}

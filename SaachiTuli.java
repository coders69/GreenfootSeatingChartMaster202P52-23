import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
 
/**
* Saachi Tuli's seating location in AP CSA period 7, creative animation and
* sound
* 
* @author Saachi Tuli
* @version 9/5/2022
*/
public class SaachiTuli extends Student implements SpecialInterestOrHobby
{
   public SaachiTuli(String f, String l, int r, int s) {
       firstName=f;
       lastName=l;
       mySeatX=r;
       mySeatY=s;
       portraitFile=f.toLowerCase()+l.toLowerCase()+".jpg";    // Make sure to name your image files firstlast.jpg, all lowercase!!!
       standingFile=firstName.toLowerCase()+ lastName.toLowerCase()+"-standing.jpg";
       soundFile=f.toLowerCase()+l.toLowerCase()+".wav";  // Make sure to name your sound files firstlast.wav, all lowercase!!!
       setImage(portraitFile);
       sitting=true;
   }
   /**
    * Default constructor
    */
   public SaachiTuli() {
       firstName="Saachi";
       lastName="Tuli";
       mySeatX=2;
       mySeatY=2;
       //imgFile=firstName.toLowerCase()+ lastName.toLowerCase()+".jpg";
       portraitFile=firstName.toLowerCase()+ lastName.toLowerCase()+".jpg";
       standingFile=firstName.toLowerCase()+ lastName.toLowerCase()+"-standing.jpg";
       soundFile=firstName.toLowerCase()+ lastName.toLowerCase()+".wav";
       setImage(portraitFile);
       sitting=true;
   }
   /**
    * Saachi Tuli's method after click. Sitting profile stands up and travels 
    * the classroom while sharing more about me!
    */
   public void act()
   {
       if(Greenfoot.mouseClicked(this)){
         //  if (sitting){
               sitting=false;
               setImage(standingFile);
               System.out.println(""); // Print a blank line to create space between any student output.
               getName();
               sayName(soundFile);
               Greenfoot.playSound("saachituli.wav");
               
                 
          
               myHobby("I like to play soccer!");
           // Create a "special method for your class and put the call here.  You can twirl your image, resize it, move it around, change transparancy, or a
           // combination of all of those types of actions, or more. Make sure to save the original image if you manipulate it, so that you can put it back.
           // Call the sitDown() method to move back  to your seat
          
               circleClass();  // Saachi Tuli's special method
         
               sitDown();
           }
   }
   /**
     * This is a local method specific to the SaachiTuli class used to animate
     * the character once the image is clicked on to travel the classroom.
     */
   public void circleClass(){
       setLocation(0,11);
        Greenfoot.delay(10);
       // move right
       for (int i=1;i<=12;i++){
           setLocation(i,11);
           Greenfoot.delay(10);
       }
       for (int i=10;i>=0;i--){
           setLocation(12,i);
           Greenfoot.delay(10);
       }
       for (int i=10;i>=0;i--){
           setLocation(i,0);
           Greenfoot.delay(10);
       }
       for (int i=1;i<=9;i++){
           setLocation(0,i);
           Greenfoot.delay(10);
       }
        Greenfoot.delay(20);
        setLocation(7,7);
        setImage("soccerball.jpg");
        Greenfoot.delay(100);
        circleMovement();
        Greenfoot.delay(20);
        returnToSeat();
   }
   /**
    * Prints the first and last name to the console
    */
   public void getName(){
       System.out.println("My name is " + firstName + " " + lastName);
   }
   /**
    * Prints my hobby onto the console
    */
   public void myHobby(String s) {
        System.out.println(s);
}
}
 


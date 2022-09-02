import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The AndresSilvera class can be used as a model for your own class that represents you and your seating location in AP CSA
 * 
 * @author Mr. Kaehms
 * @version 2.0 Aug 13, 2019
 * @version 3.0 July 21, 2020
 */
public class AndresSilvera extends Student implements SpecialInterestOrHobby
{

    /**
     * Constructor for the AndresSilvera class.
     * Constructors are special methods with the same exact name as the class name.  
     * Constructors to not have return types.
     * Constructors can be overloaded. This means we can call a constructor with different sets of parameter
     *  lists to initalize for different conditions (depending on what constructors have been written.
     * @param String f (firstname)
     * @param String l (lastname)
     * @param int r (row of seating arrangement)
     * @param int s (seat number within row seating arrangement)
     * 
     */
    public AndresSilvera(String f, String l, int r, int s) {
        firstName=f;
        lastName=l;
        mySeatX=r;
        mySeatY=s;
        portraitFile=f.toLowerCase()+l.toLowerCase()+".jpg";    // Make sure to name your image files firstlast.jpg, all lowercase!!!
        soundFile=f.toLowerCase()+l.toLowerCase()+".wav";  // Make sure to name your sound files firstlast.wav, all lowercase!!!
        setImage(portraitFile);
        sitting=true;
    }
    /**
     * Default constructor, if you don't pass in a name and seating location
     * Pay attention to how the row and seat variables set the location of the image.  1,1 is the first cell in the upper left
     * of the classroom.
     */
    public AndresSilvera() {
        firstName="Andres";
        lastName="Silvera";
        mySeatX=5;
        mySeatY=9;
        portraitFile="AndresSilvera.jpg";
        soundFile="andressilvera.wav";
        setImage(portraitFile);
        getImage().scale(60,60);
        sitting=true;
    }
    
     /**
     * Act - do whatever the AndresSilvera actor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */   
    public boolean coinMowers = false;
    public boolean shootPea1 = false;
    public boolean shootPea2 = false;
    public boolean shootPea3 = false;
    public boolean shootPea4 = false;
    public boolean shootPea5 = false;
    public boolean shootPea6 = false;
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
          //  if (sitting){
                sitting=false;
                setImage("AndresSilvera_PeashooterPckt0.jpg");
                getImage().scale(60,60);
                System.out.println(""); // Print a blank line to create space between any student output.
                getName();
                sayName(soundFile);
                myHobby("I like to grow plants!");
                circleClass();
                sitDown();
                getImage().scale(60,60);
                setRotation(0);
            }
    } 
    
    /**
     * Prints the first and last name to the console
     */
    public void getName(){
        System.out.println("My name is " + firstName + " " + lastName);
    }
    /**
     * This method needs to allow the user to interact with the student through a question and answer interface, and provide
     * some mechanism that allows the student to sit down once the Q&A session ends.  You can use this basic model, or come up
     * with some additional class and object that represents a blackboard, or a talking cartoon bubble etc. If you provide extra
     * classes, make sure to fully document so other students can use the same interface.
     */

   
    /**
     * This is a local method specific to the AndresSilvera class used to animate the character once the image is clicked on.
     * You should write your own methods to perform your own animation for your character/avatar.
     */
    public void circleClass(){
        Greenfoot.delay(350);
        setLocation(mySeatX,mySeatY-1);
        setImage("AndresSilvera_Peashooter1.jpg");
        Greenfoot.delay(28);
        setImage("AndresSilvera_Peashooter2a.jpg");
        Greenfoot.delay(20);
        setImage("AndresSilvera_Peashooter1.jpg");
        Greenfoot.delay(28);
        setImage("AndresSilvera_Peashooter3a.jpg");
        Greenfoot.delay(20);
        setImage("AndresSilvera_Peashooter1.jpg");
        Greenfoot.delay(28);
        setImage("AndresSilvera_Peashooter2a.jpg");
        Greenfoot.delay(20);
        setImage("AndresSilvera_Peashooter1.jpg");
        Greenfoot.delay(28);
        setImage("AndresSilvera_Peashooter3a.jpg");
        Greenfoot.delay(20);
        setImage("AndresSilvera_Peashooter1.jpg");
        Greenfoot.delay(28);
        setImage("AndresSilvera_Peashooter2a.jpg");
        Greenfoot.delay(20);
        setImage("AndresSilvera_Peashooter1.jpg");
        Greenfoot.delay(28);
        setImage("AndresSilvera_Peashooter3a.jpg");
        Greenfoot.delay(20);
        setImage("AndresSilvera_Peashooter4.jpg");
        Greenfoot.delay(20);
        setImage("AndresSilvera_Peashooter5.jpg");
        Greenfoot.delay(20);
        setImage("AndresSilvera_Peashooter2a.jpg");
        Greenfoot.delay(20);
        setImage("AndresSilvera_Peashooter1.jpg");
        Greenfoot.delay(28);
        setImage("AndresSilvera_Peashooter3a.jpg");
        Greenfoot.delay(28);
        setImage("AndresSilvera_Peashooter4.jpg");
        Greenfoot.delay(20);
        setImage("AndresSilvera_Peashooter5.jpg");
        Greenfoot.delay(20);
        setImage("AndresSilvera_Peashooter2a.jpg");
        Greenfoot.delay(20);
        setImage("AndresSilvera_Peashooter1.jpg");
        Greenfoot.delay(24);
    }
    
     /**
     * myHobby is one of the interfaces provided.  
     * An interface is just a contract for the methods that you will implement in your code.  The College Board no longer
     * tests on abstract classes and interfaces, but it is good to know about them
     */
     public void myHobby(String s) {
         System.out.println(s);
}

}

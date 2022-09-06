import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The KrithikTamilvanan class can be used as a model for your own class that represents you and your seating location in AP CSA
 * 
 * @author Mr. Kaehms
 * @version 2.0 Aug 13, 2019
 * @version 3.0 July 21, 2020
 */
public class KrithikTamilvanan extends Student implements SpecialInterestOrHobby
{

    /**
     * Constructor for the KrithikTamilvanan class.
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
    public KrithikTamilvanan(String f, String l, int r, int s) {
        firstName=f;
        lastName=l;
        mySeatX=r;
        mySeatY=s;
        portraitFile="images/"+firstName.toLowerCase()+lastName.toLowerCase()+".jpg";    // Make sure to name your image files firstlast.jpg, all lowercase!!!
        standingFile="images/"+firstName.toLowerCase()+ lastName.toLowerCase()+"-standing.jpg";
        soundFile="sound/"+firstName.toLowerCase()+lastName.toLowerCase()+".wav";
        
        setImage(portraitFile);
        sitting=true;
    }
    /**
     * Default constructor, if you don't pass in a name and seating location
     * Pay attention to how the row and seat variables set the location of the image.  1,1 is the first cell in the upper left
     * of the classroom.
     */
    public KrithikTamilvanan() {
        firstName="Krithik";
        lastName="Tamilvanan";
        mySeatX=1;
        mySeatY=1;
       // imgFile=firstName.toLowerCase()+ lastName.toLowerCase()+".jpg";
        portraitFile=firstName.toLowerCase()+ lastName.toLowerCase()+".jpg";
        standingFile=firstName.toLowerCase()+ lastName.toLowerCase()+"-standing.jpg";
        soundFile=firstName.toLowerCase()+ lastName.toLowerCase()+".wav";
        setImage(portraitFile);
        sitting=true;
    }
    
     /**
     * Act - do whatever the KrithikTamilvanan actor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */   
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this)){
          //  if (sitting){
                sitting=false;
                setImage(standingFile);
                System.out.println(""); // Print a blank line to create space between any student output.
                getName();
                sayName(soundFile);
                
                mySeatX = getX();
                mySeatY = getY();
            
                myHobby("I like to play basketball with my friends. My favorite basketball team is the Warriors.");
            // Create a "special method for your class and put the call here.  You can twirl your image, resize it, move it around, change transparancy, or a 
            // combination of all of those types of actions, or more. Make sure to save the original image if you manipulate it, so that you can put it back.
            // Call the sitDown() method to move back  to your seat
            
                circleClass();  // Kilgore Trount's special method... Please write one of your own. You can use this, but please modify it and be creative.
           
                sitDown();
            }
        
    } 
    
    /**
     * Prints the first and last name to the console
     */
    public void getName(){
        System.out.println("My name is " + firstName + " " + lastName + "and I am a junior in CSA!");
    }
    /**
     * This method needs to allow the user to interact with the student through a question and answer interface, and provide
     * some mechanism that allows the student to sit down once the Q&A session ends.  You can use this basic model, or come up
     * with some additional class and object that represents a blackboard, or a talking cartoon bubble etc. If you provide extra
     * classes, make sure to fully document so other students can use the same interface.
     */

   
    /**
     * This is a local method specific to the KrithikTamilvanan class used to animate the character once the image is clicked on.
     * You should write your own methods to perform your own animation for your character/avatar.
     */
    
    public void spiral(int movement_steps, int total_steps, int rotation_degrees, int speed, int distance) {
            for (int steps = 0; steps < total_steps; steps++) {
            for (int rotation_in_steps = movement_steps - 4; rotation_in_steps > movement_steps - 8; rotation_in_steps--) {
                turn(rotation_degrees);
                move(distance);
                Greenfoot.delay(speed);
            }
            
            rotation_degrees += distance;
        }
        
//        System.out.println("Spiral In Achieved");
        
        for (int steps = total_steps + 10; steps > 0; steps--) {
            for (int rotation_out_steps = movement_steps + 4; rotation_out_steps < movement_steps + 8; rotation_out_steps++) {
                turn(rotation_degrees);
                move(distance);
                Greenfoot.delay(speed);
            }
            
            rotation_degrees -= distance;
        }
        
//        System.out.println("Spiral Out Achieved");
    }
    
    public void shake(int locations) {
        for (int relocate = 0; relocate < locations; relocate++) {
            setLocation((int) (Math.random()*(getWorld().getWidth())),(int) (Math.random()*(getWorld().getHeight())));
            for (int shake = 0; shake < 7; shake ++) {
                int loop = 0;
                while (loop <=5) {
                    int shake_x = Greenfoot.getRandomNumber(3)-1;
                    int shake_y = Greenfoot.getRandomNumber(3)-1;
                
                    setLocation(getX() + shake_x, getY() + shake_y);
                    Greenfoot.delay(1);
                    
                    loop++;
                }
                shake++;
            }
            Greenfoot.delay(1);
            relocate++;
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
    
    public void circleClass(){
        setLocation(7,0);
        Greenfoot.delay(1);
        
        int upper = 200;
        int lower = -200;
        
        int right = 200;
        int left = -200;
        
        int rotation_degrees = 15;
        int movement_steps = 24;
        int total_steps = 34;
        int speed = 1;
        int distance = 2;
        
        spiral(movement_steps, total_steps, rotation_degrees, speed, distance);
        
        setRotation(0);
        setImage("images/krithiktamilvanan_big.jpg");
        setLocation(getX(), getY());
        
        int locations = 7;
        
        shake(locations);
        
        setLocation((int) getWorld().getWidth()/2, (int) getWorld().getHeight()/2);
        Greenfoot.delay(1);
        returnToSeat();
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

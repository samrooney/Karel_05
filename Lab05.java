/**
*
* Description of the program goes here  // provide a brief description
*
* @author <Your Name here>  // replace <...> with your name
* @version <date/of/completion> // replace <...> with the date
*/


import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab05 {

     public static void main(String[] args) {
            
               Display.openWorld("maps/shuttle.map");
               Display.setSize(10, 10);
               Display.setSpeed(8);
            
          Racer Bruv = new Racer(1);
          Racer Arnold = new Racer(4);
          Racer Charlie = new Racer(7);
          Bruv.runTheRace();
          Arnold.runTheRace();
          Charlie.runTheRace();
       
                 
   }
            
}
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Robot extends Actor
{
   int speed;
   int battery;
   String name;
   //SOME CODE!!!!!!!
   public Robot(int speed, int battery, String name) {
        
        this.speed=speed;
        this.battery=battery;
        this.name=name;
       
        
     }
   public void bob(){
       System.out.println("HELLO");
    }

      public void act() 
    {
     int counter = 0;
    
     move(this.speed);
     
    
        if(getX() == 599 && getY() == 100) {
            
            turn(90);
            move(this.speed);
        } else if (getX() == 599 && getY() == 399) {
            turn(90);
            move(this.speed);
            
        } else if(getX() == 0 && getY() == 399) {
            
            turn(90);
            move(this.speed);
        } else if(getX() == 0 && getY() == 0) {
            
            turn(90);
            move(this.speed);
        }
       
     if(counter % 3 == 0 && this.battery > 0) {
         
         this.battery--;
      } else {
         this.speed = 0;
      }

     
        getWorld().showText(this.toString(), 300, 200);
        counter++;
   }
     public String toString() {
       
     return "Name: " +this.name+ " \n Speed: " +this.speed+ " \n Battery: " +this.battery ; 
     }
     
}


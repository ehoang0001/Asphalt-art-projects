import org.code.neighborhood.*;
public class StarPainter extends AlienPainter{

public void face(){
eyes();
mouth();
}

//THIS IS HOW I WILL PAINT THE EYES AND MOUTH OF THE ALIEN


public void eyes(){
paintLine("black", 5);
  turnRight();
  move();
  paintLine("green", 2);
  paintLine("black", 3);
turnLeft();
  move();
  turnLeft();
  move();
    paintLine("black", 2);
    paintLine("white", 1);
turnRight();
  move();
  move();
  move();
  turnRight();
  move();
  paintLine("black", 3);
turnLeft();
  move();
  turnLeft();
  move();
    paintLine("black", 2);
    paintLine("white", 1);
}


  //NOW TO PAINT THE MOUTH

public void mouth(){
  turnLeft();
  paintLine("green", 3);
    turnLeft();
  paintLine("green", 5);
  turnRight();
  move();
  move();
  turnLeft();
   paintLine("black", 2);
  turnLeft();
  paintLine("black", 5);
  turnLeft();
    paintLine("black", 3);
  turnRight();
  turnRight();
  move();
    move();
  turnRight();
  move();
      paintLine("black", 1);
      paintLine("red", 2);
      paintLine("black", 1);


}


  
}

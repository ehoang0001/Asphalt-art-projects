import org.code.neighborhood.*;
public class AlienPainter extends MuralPainter{
  
/*
*This is the whole command for painting the entire alien.
*/
public void paintAlien(){
moveToStart();
skin();  
  
}





/*
*this is how the next painter will move to start
*/
public void moveToStart(){
paintLine("black", 5);
  turnRight();
  move();
}


/*
*this first paints the skin of alien using mostly paint line. 
*/

public void skin(){
  turnLeft();//now we start to paint
  paintLine("green", 6);
  turnRight();//these next 2 lines is to turn around
  move();
  turnRight();
    paintLine("green", 8);
  turnLeft();
  move();
  turnLeft();
   paintLine("green", 10);

paintMoveRight();
paintMoveLeft();
paintMoveRight();
  paintMoveLeft();
paintMoveRight();

//NOW THE BOTTOM PART
  turnLeft();
  move();
  turnLeft();
  move();
  move();
  paintLine("green", 8);
  turnRight();
  move();
  turnRight();
  move();
    move();

    paintLine("green", 6);
turnLeft();
  move();
 turnLeft();
move();
  move();
 paintLine("green", 4);
turnRight();
move();
  turnRight();
  move();
move();
 paintLine("green", 2);
  //NOW THE NECK
  turnLeft();
  move();
  turnLeft();
move();
necks();
  
}
  //THIS MAKES MY CODE SHORTER BECAUSE I CAN CALL IT IN 3 LINES NOT 15
public void paintMoveRight(){
  turnRight();//these next 2 lines is to turn around
  move();
  turnRight();
  move();
   paintLine("green", 10);
}
//THIS IS THE OPPOSITE OF RIGHT MAKES MY CODE SHORTER BECAUSE I CAN CALL IT IN 3 LINES NOT 15
public void paintMoveLeft(){
  turnLeft();//these next 2 lines is to turn around
  move();
  turnLeft();
  move();
   paintLine("green", 10);
}
//THIS ALSO SHORTENS MY CODE
  public void necks(){
   paintLine("green", 2);
    turnRight();
    move();
        turnRight();
move();
       paintLine("green", 2);
turnLeft();
    move();
    turnLeft();
    move();
       paintLine("green", 2);

  }

  
}

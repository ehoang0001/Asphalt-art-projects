import org.code.neighborhood.*;
public class PyramidPainter extends MuralPainter{
  /*
*this is a multi-line comment: this method is to paint the entire pyramid!!!!
*/
public void paintPyramid(){
moveToMiddle();
brightSide();
moveToStart();
darkSide();
}

    /*
*this is a multi-line comment: This method is to make the pyramid painter move to the middle of the screen!!!!
*/
public void moveToMiddle(){

  //MOVE 16 times to the middle of the canvas, then move down 16 times to start the pyramid
moveFour();
moveFour();
moveFour();
moveFour();

//now that its in the middle, turn right then move down 16.
  turnRight();
moveFour();
moveFour();
moveFour();
moveFour();

}


    /*
*this is a multi-line comment: This method is to move the pyramid painter turn 180 degrees clockwise!!!!
*/
public void rightTurn(){
   turnRight();
    move();
    turnRight();
}
    /*
*this is a multi-line comment: This method is to move the pyramid painter turn 180 degrees counterclockwise!!!!
*/  public void leftTurn(){
   turnLeft();
    move();
    turnLeft();
}
  
    /*
*this is a multi-line comment: This method is to move the pyramid painter 4 spaces!!!!
*/  public void moveFour(){
  move();
  move();
  move();
  move();
}
    /*
*this is a multi-line comment: This method is to have the painter move 4 and paint a color!!!!
*/
    public void moveAndPaint(String color){
  paint(color);
  move();
  paint(color);
  move();
  paint(color);
  move();
  paint(color);
  move();
}
  //this is to help shorten my code, instead of 16 paints i can just put 4 moveAndPaint.
    /*
*this is a multi-line comment: This method is to move the pyramid painter turn 180 degrees clockwise!!!!
*/
  public void brightSide(){//first side, paints it tan because this side is in the sun
    
    paintLine("tan", 16);
 rightTurn();
moveAndPaint("tan");//since the paint line is glitched for 32 by 32, we use move and paint instead for going upwards
moveAndPaint("tan");
moveAndPaint("tan");
paint("tan");
move();
paint("tan");
move();
    paint("tan");
move();
leftTurn();//this is the start of a new line, so we can go down using the paint line.
    move();
    move();
  paintLine("tan", 14);
    rightTurn();
    
moveAndPaint("tan");
    moveAndPaint("tan");
moveAndPaint("tan");
    paint("tan");
move();
move();

    leftTurn();
move();
move();
move();

    paintLine("tan", 12);
rightTurn();
    moveAndPaint("tan");
    moveAndPaint("tan");
paint("tan");
move();
paint("tan");
move();
    paint("tan");
move();

    leftTurn();
    move();
        move();
    paintLine("tan", 11);
    rightTurn();
    moveAndPaint("tan");
    moveAndPaint("tan");
paint("tan");
move();
    leftTurn();
    move();
        move();
        paintLine("tan", 10);
rightTurn();
    moveAndPaint("tan");
    paint("tan");
move();
    paint("tan");
move();
        paint("tan");
leftTurn();
    move();
            paintLine("tan", 6);
rightTurn();
        moveAndPaint("tan");
 paint("tan");
move();
    leftTurn();
    move();
    move();
                paintLine("tan", 4);
rightTurn();
    paint("tan");
move();
    paint("tan");
move();
    paint("tan");
leftTurn();
    move();
        paint("tan");
    move();
        paint("tan");
rightTurn();
    
            paint("tan");
    move();
        leftTurn();
    move();
turnLeft();
    turnLeft();
  }
  //now we return him to the middle before he paints dark side
public void moveToStart(){
moveFour();
moveFour();
moveFour();
moveFour();
turnRight();
moveFour();
moveFour();
moveFour();
moveFour();
move();
turnRight();
}

//now we paint the darker side chocolate brown.
public void darkSide(){//first side, paints it tan because this side is in the sun
    
move();
paintLine("chocolate", 16);
leftTurn();
moveAndPaint("chocolate");//since the paint line is glitched for 32 by 32, we use move and paint instead for going upwards
moveAndPaint("chocolate");
moveAndPaint("chocolate");
paint("chocolate");
move();
paint("chocolate");
move();
    paint("chocolate");
move();
rightTurn();//this is the start of a new line, so we can go down using the paint line.
    move();
    move();
  paintLine("chocolate", 14);
    leftTurn();
    
moveAndPaint("chocolate");
    moveAndPaint("chocolate");
moveAndPaint("chocolate");
    paint("chocolate");
move();
move();

    rightTurn();
move();
move();
move();

    paintLine("chocolate", 12);
leftTurn();
    moveAndPaint("chocolate");
    moveAndPaint("chocolate");
paint("chocolate");
move();
paint("chocolate");
move();
    paint("chocolate");
move();

    rightTurn();
    move();
        move();
    paintLine("chocolate", 11);
    leftTurn();
    moveAndPaint("chocolate");
    moveAndPaint("chocolate");
paint("chocolate");
move();
    rightTurn();
    move();
        move();
        paintLine("chocolate", 10);
leftTurn();
    moveAndPaint("chocolate");
    paint("chocolate");
move();
    paint("chocolate");
move();
        paint("chocolate");
rightTurn();
    move();
            paintLine("chocolate", 6);
leftTurn();
        moveAndPaint("chocolate");
 paint("chocolate");
move();
    rightTurn();
    move();
    move();
                paintLine("chocolate", 4);
leftTurn();
    paint("chocolate");
move();
    paint("chocolate");
move();
    paint("chocolate");
rightTurn();
    move();
        paint("chocolate");
    move();
        paint("chocolate");
//this finishes the shadowed side of the pyramid.
  }












  

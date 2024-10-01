import org.code.neighborhood.*;
//This painter plus is a subclass of the superclass Painter
public class PainterPlus extends Painter{
  public void takeAllPaint() {
while (isOnBucket()) {
  //this takes all of the paint from the bucket.
    takePaint();
    }
  }
  public void turnRight() {
    //instead of saying turn left 3 times, now we can just say turn right
    turnLeft();
    turnLeft();
turnLeft();
  }
public void moveFast(){
while (canMove()) {
  move();
  //moves straight until they cant anymore
}
}
  public void paintToEmpty(String color) {
  //paints a sraight line until there is no more paint in the bucket.
while(hasPaint()){
  paint(color);
  move();
}
}
  public void paintDonut(String color){
    while (hasPaint()){
      move();
      turnRight();
      paint(color);
      move();
      paint(color);
      //Donut time!!!!!! paint a donut
    }
  }
  
}

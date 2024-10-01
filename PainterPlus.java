1
KAI
 
Immersive Reader
Cities use asphalt art to improve public safety, inspire their residents and visitors, and brighten communities. Your goal is to create asphalt art to revitalize The Neighborhood and bring the community together with the help of the Painter.

🎒 IMPORT: Import your PainterPlus class from your Backpack.

Don't have it, or it doesn't work? That's ok! Copy the code from here and paste it into a new file in your project.

✅ TO DO: Use your knowledge of object-oriented programming, algorithms, the problem solving process, and decomposition strategies to create asphalt art.

Create a new subclass – Create at least one new subclass of the PainterPlus class that is used for a component of the asphalt art design.

Plan an algorithm – Use the problem solving process and decomposition strategies to plan an algorithm that incorporates a combination of sequencing, selection, and/or iteration.

Write a method – Write at least one method in a PainterPlus subclass that contributes to a component of the asphalt art design.

Document your code – Use comments to explain the purpose of the methods and code segments.

⚠️ Note: The Painter has infinite paint on this grid, so methods like setPaint() and hasPaint() will not work in the same way as on other grid sizes.

New Filebackpack iconBackpack
Version HistoryCommit Code

NeighborhoodRunner.java
PainterPlus.java
MuralPainter.java
PyramidPainter.java
CloudPainter.java
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
25
26
27
28
29
30
31
32
33
34
35
36
37
38
39
40
41
42
43
⌄
⌄
⌄
⌄
⌄
⌄
⌄
⌄
⌄
⌄
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



Clear Console

Run

Test

Settings

Unsubmit

English

Version: 2024

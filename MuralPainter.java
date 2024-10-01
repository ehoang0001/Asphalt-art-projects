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
⌄
⌄
⌄
⌄
⌄
⌄
⌄
⌄
import org.code.neighborhood.*;

/*
 * MuralPainter is a PainterPlus that paints
 * murals in The Neighborhood
 */
public class MuralPainter extends PainterPlus {

  /*
   * Paints each row of The Neighborhood with the color
   * where size is the size of the grid
   */
 public void paintBackground(String color, int size) {
    while (canMove("south")) {
      paintLine(color, size);
      turnToWest();

      if (canMove("south")) {
        paintLine(color, size);
        turnToEast();
      }
      
    }

    paintLine(color, size);
    turnAround();
    moveToCorner();
  }

  /*
   * Paints a line with the color where the length
   * of the line is specified by spaces
   */
  public void paintLine(String color, int spaces) {
    setPaint(spaces);

Clear Console

Run

Test

Settings

Unsubmit

English

Version: 2024

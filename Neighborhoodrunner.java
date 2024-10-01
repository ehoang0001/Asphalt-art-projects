import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {

    MuralPainter ethan = new MuralPainter();
    PyramidPainter tut = new PyramidPainter();
     CloudPainter suns = new CloudPainter();
         CloudPainter UFOs = new CloudPainter();

ethan.paintBackground("blue", 32);
tut.paintPyramid();
suns.sun();
UFOs.UFO();

  }
}

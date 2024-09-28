import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {

    MuralPainter ethan = new MuralPainter();
        AlienPainter alien = new AlienPainter();
        StarPainter facer = new StarPainter();

ethan.paintBackground("black", 16);
alien.paintAlien();
facer.face();
  }
}

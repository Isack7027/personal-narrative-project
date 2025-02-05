import org.code.theater.*;
import org.code.media.*;

public class TheaterRunner {
  public static void main(String[] args) {

    // 2D Array
    String[][] array1 = {
      {"this is a popular landmark in korea", "a popular food"},
      {"and a popular kdrama"}
    };

    ImageFilter[][] array2 = {
      { new ImageFilter("KOREAAA.jpg"), new ImageFilter("tteokbokki.jpg") },
      { new ImageFilter("squidtrailer1.jpg") },
    };

    // MyStory object
    MyStory scene = new MyStory(array1, array2);
    
    // Call drawScene
    scene.drawScene();
    
    // Play scene in Theater
    Theater.playScenes(scene);
    
  }
}
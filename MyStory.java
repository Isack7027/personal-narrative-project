import org.code.theater.*;
import org.code.media.*;

public class MyStory extends Scene {

  // Instance Variables
  private String[][] variable1;
  private ImageFilter[][] variable2;
  
  // Constructor
  public MyStory(String[][] variable1, ImageFilter[][] variable2) {
    this.variable1 = variable1;
    this.variable2 = variable2;
  }

  // Calls all the parts of your animation, in order
  public void drawScene() {
    drawFirstScene();
    drawSecondScene();
    drawThirdScene();
  }


  
    public void drawFirstScene() {
    // 1. clear the scene / draw background
    clear("white");

    drawText(variable1[0][0], 50, 50);
    pause(1.5);
    drawImage(variable2[0][0], 75, 50, 250);
      pause(1.5);
      ImageFilter placeholder = new ImageFilter("KOREAAA.jpg");
      placeholder.mirrorVertical();
      drawImage(placeholder, 75, 50, 250);
      pause(1.5);
  }

  

    public void drawSecondScene() {
    // 1. clear the scene / draw background
    clear("white");

    drawText(variable1[0][1], 50, 50);
    pause(1.5);
    drawImage(variable2[0][1], 75, 50, 250);
      pause(1.5);
      ImageFilter placeholder = new ImageFilter("tteokbokki.jpg");
      placeholder.saturationFilter(2);
      drawImage(placeholder, 75, 50, 250);
      pause(1.5);
  }

  public void drawThirdScene() {
    // 1. clear the scene / draw background
    clear("white");

    drawText(variable1[1][0], 50, 50);
    pause(1.5);
    drawImage(variable2[1][0], 75, 50, 250);
      pause(1.5);
      ImageFilter placeholder = new ImageFilter("squidtrailer1.jpg");
      placeholder.adjustContrast(12);
      drawImage(placeholder, 75, 50, 250);
      pause(1.5);
  }
  }
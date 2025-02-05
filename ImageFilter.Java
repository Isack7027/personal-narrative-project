import org.code.theater.*;
import org.code.media.*;


public class ImageFilter extends ImagePlus {

  public ImageFilter(String filename) {
    super(filename);
  }

    //Mirrors the image vertically
    public void mirrorVertical() {
      Pixel[][] pixels = getPixelsFromImage();

      for (int row = 0; row < pixels.length; row++) {
      for (int col = 0; col < pixels[0].length/2; col++) {
        Pixel leftPixel = pixels[row][col];
        Pixel rightPixel = pixels[row][pixels[0].length-col-1];

        leftPixel.setRed(rightPixel.getRed());
        leftPixel.setGreen(rightPixel.getGreen());
        leftPixel.setBlue(rightPixel.getBlue());
      }
    }
    }





  // make image color saturate
public void saturationFilter(int factor) {
  Pixel[][] pixels = getPixelsFromImage();
  for (int row = 0; row < pixels.length; row++) {
      for (int col = 0; col < pixels[row].length; col++) {
        Pixel pixel = pixels[row][col];

        // Calculate the grayscale average
        int average = (pixel.getRed() + pixel.getBlue() + pixel.getGreen()) / 3;

        int adjustedGrayscale = average + (average - 255) * factor;

        // Calculate the new red, green, and blue values
        int newRed = 2 * adjustedGrayscale - pixel.getRed();
        int newGreen = 2 * adjustedGrayscale - pixel.getGreen();
        int newBlue = 2 * adjustedGrayscale - pixel.getBlue();
        
        //Set the Values to 255 if they are greater than 255 
        if (newRed > 255) {
          newRed = 255;
        } else if (newRed < 0) {
          newRed = 0;
        }
        if (newGreen > 255) {
          newGreen = 255;
        } else if (newGreen < 0) {
          newGreen = 0;
        }
        if (newBlue > 255) {
          newBlue = 255;
        } else if (newBlue < 0) {
          newBlue = 0;
        }
        
        // Update the pixel's color values
        pixel.setRed(newRed);
        pixel.setBlue(newBlue);
        pixel.setGreen(newGreen);
      }
    }
}


public void adjustContrast(int multiplier) {
    Pixel[][] pixels = getPixelsFromImage();
    
for (int row = 0; row < pixels.length; row++) {
      for (int col = 0; col < pixels[0].length; col++) {
        Pixel currentPixel = pixels[row][col];

        int currentRed = currentPixel.getRed();
        int currentGreen = currentPixel.getGreen();
        int currentBlue = currentPixel.getBlue();

        int newRed = (int)((multiplier * currentRed));
        int newGreen = (int)((multiplier * currentGreen));
        int newBlue = (int)((multiplier * currentBlue));

        currentPixel.setRed(newRed);
        currentPixel.setGreen(newGreen);
        currentPixel.setBlue(newBlue);
      }
    }
  }

  
}
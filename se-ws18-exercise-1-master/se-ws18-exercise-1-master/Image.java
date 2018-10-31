
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Image {
	public static void main(String args[])throws IOException {
    File f = null;

    //read image
    try{
      f = new File("D:\\Image\\Sample.jpg");
    }catch(IOException e){
      System.out.println(e);
    }

    /**
     * Since, Sample.jpg is a single pixel image so, we will
     * not be using the width and height variable in this
     * project.
     */

    //get pixel value
    int p = Image.getRGB();

    //get red
    int r = (p>>16) & 0xff;

    //get green
    int g = (p>>8) & 0xff;

    //get blue
    int b = p & 0xff;

    /**
     * to keep the project simple we will set the ARGB
     * value to 255, 100, 150 and 200 respectively.
     */
    
    r = 100;
    g = 150;
    b = 200;

    //set the pixel value
    p = (r<<16) | (g<<8) | b;
    Image.setRGB();

    //write image
    try{
      f = new File("D:\\Image\\Output.jpg");
      ImageIO.write(Image, "jpg", f);
    }catch(IOException e){
      System.out.println(e);
    }
  }//main() ends here
}//class ends here	

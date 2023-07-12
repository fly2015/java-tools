/*
 * AddTextToImg.java
 *
 * Copyright by Hien Ng
 * Da Nang
 * All rights reserved.
 */
package image;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.imageio.ImageIO;
/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class AddTextToImg
{
    public static void main(String[] args) throws Exception 
    {
      //read the image
      File file = Path.of("./resources/luca-bravo-hFzIoD0F_i8-unsplash.jpg").toFile();
      if(!file.exists())
      {
          throw new Exception("File does not exist.");
      }
      java.awt.image.BufferedImage image = ImageIO.read(file);
      //get the Graphics object
      java.awt.Graphics g = image.getGraphics();
      //set font
      g.setFont(g.getFont().deriveFont(200f));
      //display the text at the coordinates(x=50, y=150)
      g.drawString("Welcome To WayToLearnX!", 1000, 1500);
      g.dispose();
      //write the image
      
      File fileNew = Path.of("./resources/news").toFile();
      fileNew.mkdirs();
      ImageIO.write(image, "jpg", new File("./resources/news/image1.png"));
    }
}



/*
 * Changes:
 * $Log: $
 */
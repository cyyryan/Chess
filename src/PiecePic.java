import java.awt.Graphics2D; 
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.IOException;
import java.io.File;

public class PiecePic{
   private BufferedImage img;
	private int x, y;
   
   public PiecePic(String imageFileName, int x, int y){
		this.x = x;
		this.y = y;
		
	 	try{
			img = ImageIO.read(new File(imageFileName));
		}catch (IOException e){
			// We will learn about this later
			// For now just use it as is.
		}
	}
   
   public void paint(Graphics2D g){
		g.drawImage(img, x, y, img.getWidth(), img.getHeight(), null);  
	}
}
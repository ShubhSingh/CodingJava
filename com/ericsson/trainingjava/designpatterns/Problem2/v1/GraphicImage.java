package Problem2.v1;

import java.awt.Canvas;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class GraphicImage implements Image {
	private byte[] imageData;
	
	public GraphicImage(String urlString){
		try {
			URL imageURL = new URL(urlString);
			URLConnection conn = imageURL.openConnection();
			//and read bytes into imageData field
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	/* (non-Javadoc)
	 * @see v1.Image#displayImage(java.awt.Canvas)
	 */
	@Override
	public void displayImage(Canvas c){
		//draw the bytes in imageData field on to the given canvas
		System.out.println("displaying image!!");
	}
	

}

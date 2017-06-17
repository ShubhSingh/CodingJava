package Problem2.v1;

import java.awt.Canvas;

public class ImageProxy implements Image {
	
	GraphicImage realObject;
	private String url;
	public ImageProxy(String url){
		this.url = url;
	}
	
	
	@Override
	public void displayImage(Canvas c) {
		if(realObject == null)
			realObject = new GraphicImage(url);
		
		realObject.displayImage(c);

	}

}

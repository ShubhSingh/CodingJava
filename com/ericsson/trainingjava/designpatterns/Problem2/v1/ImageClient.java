package Problem2.v1;

import java.util.Iterator;
import java.util.List;

public class ImageClient {

	
	public static void main(String[] args) {
		
		ImagesDAO dao = new ImagesDAO();
		List<Image> images = dao.getImagesFromDB();
		int size = images.size();
		
		Iterator<Image> it = images.iterator();
		System.out.println(it.getClass().getName());
		/*for(int i=0;i<size;i++){*/
		while(it.hasNext()){
			Image image = it.next();//images.get(i);
			image.displayImage(null);
		}
		

	}

}

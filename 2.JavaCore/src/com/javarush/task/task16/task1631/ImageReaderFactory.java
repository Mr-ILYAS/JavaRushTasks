package com.javarush.task.task16.task1631;
import com.javarush.task.task16.task1631.common.*;
import static com.javarush.task.task16.task1631.common.ImageTypes.*;
public class ImageReaderFactory{
	public static ImageReader getImageReader(ImageTypes jpg){
		if(jpg==JPG)return new JpgReader();
		if(jpg==BMP)return new BmpReader();
		if(jpg==PNG)return new PngReader();
		throw new IllegalArgumentException();
	}
}
package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		File f = new File("resources/ellipse_red_filled.txt");
		Scanner in = new Scanner(f); //making Scanner with a File
		
		String shapeType = in.next();
		int redComponent = in.nextInt();
		int greenComponent = in.nextInt();
		int blueCompoent = in.nextInt();
		boolean isFilled = in.nextBoolean();
		double parameterOne = in.nextDouble();
		double parameterTwo = in.nextDouble();
		double parameterThree = in.nextDouble();
		double parameterFour = in.nextDouble();
		
		if (shapeType.equals("rectangle")) {
			if (isFilled == true) {
				StdDraw.setPenColor(redComponent, greenComponent, blueCompoent);
				StdDraw.filledRectangle(parameterOne, parameterTwo, parameterThree, parameterFour);
			} else {
				StdDraw.setPenColor(redComponent, greenComponent, blueCompoent);
				StdDraw.rectangle(parameterOne, parameterTwo, parameterThree, parameterFour);
			}
		} else {
			if (isFilled == true) {
				StdDraw.setPenColor(redComponent, greenComponent, blueCompoent);
				StdDraw.filledEllipse(parameterOne, parameterTwo, parameterThree, parameterFour);
			} else {
				StdDraw.setPenColor(redComponent, greenComponent, blueCompoent);
				StdDraw.ellipse(parameterOne, parameterTwo, parameterThree, parameterFour);
		}
		

		
		
	}
	}
}

package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		
		StdDraw.setPenColor(StdDraw.BOOK_LIGHT_BLUE);
		StdDraw.filledRectangle(0.5, 0.5, 0.3, 0.3);
		
		StdDraw.setPenRadius(0.02);
		StdDraw.setPenColor(StdDraw.YELLOW);
		StdDraw.line(0, 1, 1, 0);
		
		StdDraw.setPenRadius(0.02);
		StdDraw.setPenColor(StdDraw.YELLOW);
		StdDraw.line(0, 0, 1, 1);
		
		StdDraw.setPenRadius(0.02);
		StdDraw.setPenColor(StdDraw.YELLOW);
		StdDraw.line(0, 0.5, 1, 0.5);
		
		StdDraw.setPenRadius(0.02);
		StdDraw.setPenColor(StdDraw.YELLOW);
		StdDraw.line(0.5, 1, 0.5, 0);
		
		StdDraw.setPenColor(219, 42, 71);
		StdDraw.filledCircle(0.5, 0.5, 0.18);
		
		StdDraw.setPenColor(StdDraw.PINK);
		StdDraw.filledCircle(0.5, 0.5, 0.14);
		
		StdDraw.setPenColor(254, 213, 213);
		StdDraw.filledCircle(0.5, 0.5, 0.10);
		
		StdDraw.setPenColor(StdDraw.WHITE);
		StdDraw.filledCircle(0.5, 0.5, 0.06);
		
		
	}
}
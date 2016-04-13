package GuiLesson;

import processing.core.PApplet;

public class MyDisplay extends PApplet {
	
	public void setup() {
		size(500,500);
		background(220,220,220);
	}
	
	public void draw() {
		fill(255,255,0);
		ellipse(width/2, height/2, width, height);
		fill(0,0,0);
		ellipse(width/4, height/4, width/10, height/8);
		ellipse(width/4 * 3, height/4 , width/10, height/8);
		
		noFill();
		arc(width/2, height/4 * 3, 70, 70, 0, PI);
		
		
		
	}

}

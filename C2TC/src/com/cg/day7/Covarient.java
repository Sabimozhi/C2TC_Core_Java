package com.cg.day7;

public class Covarient {
}
class Color{
	protected Color getColor() {
		Color c=new Color();
		return c;
	}
}
class Green extends Color{
	protected Color getColor() {
		Green g=new Green();
		return g;
	}
}

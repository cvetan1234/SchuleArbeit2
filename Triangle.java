package smg_2;

public class Triangle extends GeometricObject {
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	Triangle(){
		
	}
	Triangle(double setSide1, double setSide2, double setSide3){
		setSide1(setSide1);
		setSide2(setSide2);
		setSide3(setSide3);
	}
	void setSide1(double setSide1) {
		side1 = setSide1;
	}
	void setSide2(double setSide2) {
		side2 = setSide2;
	}
	void setSide3(double setSide3) {
		side3 = setSide3;
	}
	double getSide1(){
		return side1;
	}
	double getSide2(){
		return side2;
	}
	double getSide3(){
		return side3;
	}
	double getArea() {
		double p = (side1 + side2 + side3)/2;
		return Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
	}
	double getPerimeter() {
		return side1 + side2 + side3;
	}
	void printRectangle() {
		System.out.println("Triangle: side1 = " + side1 + "/ side2 = " + side2 + "/ side3 = " + side3);
	}
	void setColour(String setColour) {
		colour = setColour;
	}
	void setIsItFilled(boolean setIsItFilled) {
		isItFilled = setIsItFilled;
	}
	String getColour() {
		return colour;
	}
	boolean getIsItFilled() {
		return isItFilled;
	}
}

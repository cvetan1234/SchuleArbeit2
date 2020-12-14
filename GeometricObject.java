package smg_2;

public class GeometricObject {
	protected String colour;
	protected boolean isItFilled = false;
	GeometricObject(){
		
	}
	GeometricObject(String setColour, boolean setIsItFilled){
		setColour(setColour);
		setIsItFilled(setIsItFilled);
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

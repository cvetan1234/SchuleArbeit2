package smg_2;

public class Team {
	String name;
	Colour colour;
	Footballer[] footballers = new Footballer[11];
	Team(){
		
	}
	Team(String setName){
		name = setName;
	}
	void addFootballer(int a, String setName) {
		footballers[a].name = setName;
	}
}

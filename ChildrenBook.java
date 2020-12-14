package myonlineshop;

public class ChildrenBook extends Book {
	private int age;
	public ChildrenBook(double regularPrice, String publisher, int yearPublished, int age){
		super(regularPrice, publisher, yearPublished);
		this.age = age;
		
	}
	public double computeSalePrice(){
        return super.getRegularPrice() * 0.3;
    }
	public void setAge(int setAge) {
		age = setAge;
	}
	public int getAge() {
		return age;
	}
}

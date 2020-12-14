package myonlineshop;

public class Project20 {

	public static void main(String[] args) {
		double totalSalePrice = 0;
		double totalRegularPrice = 0;
	    Product[] c = new Product[2];
	    c[0] = new ChildrenBook(15, "PW press", 1987, 8);
	    c[1] = new ComicBook(14, "PW press", 1924, "Batman");
	    for (int i=0; i<c.length; i++){
            totalRegularPrice += c[i].getRegularPrice();
            totalSalePrice += c[i].computeSalePrice();
            System.out.println("Item number " + i + ": Type = " + c[i].getClass().getName() + ", Regular price = " + c[i].getRegularPrice() + ", Sale price = " + c[i].computeSalePrice());
        }
        System.out.println("totalRegularPrice = " + totalRegularPrice);
        System.out.println("totalSalePrice = " + totalSalePrice);
	}

}

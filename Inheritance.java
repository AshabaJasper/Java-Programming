class Product{
    //attributes
    int p_id;
    String name;
    int price;

    //constructor
    Product(){
        System.out.println("Product Object Constrcuted");
    }

    //methods
    void setProductDetails(int p_id, String name, int price){
        //write data in product object
        this.p_id=p_id;
        this.name=name;
        this.price=price;
    }
    void showProductDetails(){
        //read data from product object
        System.out.println("-----Product ID: "+p_id+"-----");
        System.out.println("Name:\t"+name);
        System.out.println("Price:\t"+price);
        System.out.println("---------------------------------")

    }
}



public class Inheritance {

    //main is executed by JVM when program is running

    public static void main(String[] args){
    Product product= new Product();
    System.out.println("Product is: "+product);


    }
}

public class Book {

    private String name;
    private Author author;
    private double price;
    private int quantity;

    public Book(String name, Author author, double price, int quantity){
        this.name = name;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName(){
        return name;
    }

    public Author getAuthor(){
        return author;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public int getQty(){
        return quantity;
    }

    public void setQty(int qty){
        this.quantity = qty;
    }

    public String toString() {
        return "'" + name + "' by " + author.toString();
    }
}

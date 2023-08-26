public class ScientificBook extends Book {
    private int price;
    private String publisher;
    ScientificBook(){

    }

    public ScientificBook(String name, String code, int pages, int price, String publisher) {
        super(name, code, pages);
        this.price = price;
        this.publisher = publisher;
    }

    @Override
    String getBookData() {
        return super.getBookData() + " "  + price + " " + publisher;
    }


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}

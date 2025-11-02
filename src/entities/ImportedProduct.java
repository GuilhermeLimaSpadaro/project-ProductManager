package entities;

import java.time.LocalDate;

public class ImportedProduct extends Product {

    private Double cFee;

    public ImportedProduct() {
        super();
    }

    public ImportedProduct(String name, Double price, Double cFee) {
        super(name, price);
        this.cFee = cFee;
    }

    public void setFee(Double cFee) {
        this.cFee = cFee;
    }

    public double totalPrice() {
        return getPrice() + cFee;
    }

    public String priceTag(){
        return String.format("%s $ %.2f (Customs fee: $ %.2f)", getName(), totalPrice(), cFee);
    }
}

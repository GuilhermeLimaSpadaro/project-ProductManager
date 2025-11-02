package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product {

    LocalDate date = LocalDate.now();
    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public UsedProduct(String name, Double price) {
        super(name, price);
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String priceTag(){
        return String.format("%s (Used) $ %.2f (Manufacture date: %s)", getName(), getPrice(), date.format(fmt));
    }
}

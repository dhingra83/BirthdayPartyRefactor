package model;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class Cake implements Product {

    private String flavor;
    private String frostingFlavor;
    private String shape;
    private String size;
    private String color;

    @Override
    public String details() {
        return "Ordered: " + this.toString();
    }
}

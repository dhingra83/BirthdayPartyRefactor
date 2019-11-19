package model;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class Balloon implements Product {
    private String color;
    private String material;

    @Override
    public String details() {
        return "Ordered: " + this.toString();
    }
}

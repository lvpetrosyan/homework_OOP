import jdk.jfr.FlightRecorder;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.concurrent.Flow;

public class Flowers {
    private String type;
    String flowerColor;
    String country;
    private double cost;
    private int lifeSpan;
    private Flowers flower[];


    public Flowers(String flowerColor, String country, double cost, int lifeSpan, String type) {
        if (flowerColor == null || flowerColor.isEmpty() || flowerColor.isBlank()) {
            this.flowerColor = "белый";
        } else {
            this.flowerColor = flowerColor;
        }
        if (country == null || country.isBlank() || country.isEmpty()) {
            this.country = "Russia";
        } else {
            this.country = country;
        }
        if (cost == 0 || cost < 0) {
            this.cost = 1;
        } else {
            this.cost = cost;
        }
        if (lifeSpan < 0) {
            this.lifeSpan = Math.abs(lifeSpan);
        } else if (lifeSpan == 0) {
            this.lifeSpan = 3;
        } else {
            this.lifeSpan = lifeSpan;
        }
        if (type == null || type.isEmpty() || type.isBlank()) {
            this.type = "гипсофила";
        } else {
            this.type = type;

        }

    }

    Flowers[] getFlower() {
        if (flower == null) {
            flower = new Flowers[0];
        }
        return flower;
    }

    void addFlower(Flowers flowers) {
        this.flower = Arrays.copyOf(this.flower, getFlower().length + 1);
        this.flower[this.flower.length - 1] = flowers;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        this.lifeSpan = lifeSpan;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {

        return type +
                " из " + country + ", стоимость штуки " + cost +
                ", срок стояния: " + lifeSpan;
    }

    public String getFlowerColor() {
        if (flowerColor == "null" || flowerColor.isEmpty() || flowerColor.isBlank()) {
            this.flowerColor = "белый";
        } else {
            this.flowerColor = flowerColor;}
            return flowerColor;
        }

}

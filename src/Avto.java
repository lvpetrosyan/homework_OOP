import javax.swing.*;

public class Avto {
    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private int year;
    private String country;

    public Avto(String brand, String model, String color, double engineVolume, int year, String country) {
        if (brand == null || brand == "") {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (color == null || color == "") {
            this.color = "белый";
        } else {
            this.color = color;
        }
        if (country == null || country == "") {
            this.color = "default";
        } else {
            this.country = country;
        }
        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
        if (model == null || model == "") {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }

    }

    @Override
    public String toString() {
        return brand + " " + model + ", " + year + " год выпуска, сборка " + country + ", " + color + " цвет, объем двигателя — " + engineVolume + " л.";
    }
}

package transport;

public class Avto {
    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private int year;
    private String country;
    private String transmission;
    private String typeBody;
    private String registratNumber;
    private int seatsNumber;
    private boolean weels;
    private Key key;
    private Insurance insurance;

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public Avto(String brand, String model, String color, double engineVolume, int year, String country, String transmission, String typeBody, String registratNumber, int seatsNumber, boolean weels, Key key,
                Insurance insurance) {
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
        if (transmission == null || transmission == "") {
            this.transmission = "avto";
        } else {
            this.transmission = transmission;
        }
        if (typeBody == null || typeBody == "") {
            this.typeBody = "sedan";
        } else {
            this.typeBody = typeBody;
        }
        if (typeBody == null || typeBody == "") {
            this.typeBody = "sedan";
        } else {
            this.typeBody = typeBody;
        }
        if (registratNumber == null || registratNumber == "") {
            this.registratNumber = "xx000xx000";
        } else {
            this.registratNumber = registratNumber;
        }
        if (seatsNumber <= 0) {
            this.seatsNumber = 5;
        } else {
            this.seatsNumber = seatsNumber;
        }
        this.weels = weels;

        if (key == null) {
            this.key = new Key();
        } else {
            this.key = key;
        }
        if (insurance == null) {
            this.insurance = new Insurance();
        } else {
            this.insurance = insurance;
        }


    }

    //реализуем дефолтные значение, параметры которых необязательны. Выызываем другой конструктор в зависимости от того , насколько заполнены поля..
    public Avto(String brand, String model, String color, double engineVolume, int year, String country) {
        this(brand, model, color, engineVolume, year, country, "avto", "sedan", "xx000xx000", 5, true, new Key(), new Insurance());
    }

    public int getYear() {
        return year;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color == "") {
            this.color = "белый";
        } else {
            this.color = color;
        }

    }


    public String getCountry() {
        return country;
    }


    public String getTransmission() {
        if (transmission == null || transmission == "" || transmission.isEmpty() || transmission.isBlank()) {
            this.transmission = "avto";
        } else {
            this.transmission = transmission;
        }
        return transmission;
    }

    public void setTransmission(String transmission) {
        if (transmission == "null" || transmission == "" || transmission.isEmpty() || transmission.isBlank()) {
            this.transmission = "avto";
        } else {
            this.transmission = transmission;
        }
    }

    public String getTypeBody() {
        if (typeBody == "null" || typeBody == "" || typeBody.isEmpty() || typeBody.isBlank()) {
            this.typeBody = "sedan";
        } else {
            this.typeBody = typeBody;
        }
        return typeBody;
    }

    public String getRegistratNumber() {
        return registratNumber;
    }

    public void setRegistratNumber(String registratNumber) {
        if (registratNumber == null || registratNumber == "") {
            this.registratNumber = "x000xx000";
        } else {

            this.registratNumber = registratNumber;
        }
    }

    public int getSeatsNumber() {
        return seatsNumber;
    }


    public boolean isWeels() {
        return weels;
    }

    public static void winterKolesa(boolean weels) {
        if (weels == true) {
            System.out.println("шины менять не нужно");
        } else System.out.println("сменить шины на сезонные");
    }

    public static boolean infNumber(String registratNumber) {
        if (registratNumber.length() != 9) {
            return false;
        }
        char[] chars = registratNumber.toCharArray();
        if (!Character.isDigit(chars[1]) || !Character.isDigit(chars[2]) || !Character.isDigit(chars[3]) || !Character.isDigit(chars[6]) ||
                !Character.isDigit(chars[7]) || !Character.isDigit(chars[8])) {
            return false;
        }
        if (!Character.isAlphabetic(chars[4]) || !Character.isAlphabetic(chars[0]) || !Character.isAlphabetic(chars[5])) {
            return false;
        }
        return true;
    }

    public static class Key {
        private boolean playEngine;
        private boolean accessKey;

        public Key(boolean playEngine, boolean accessKey) {
            this.playEngine = playEngine;
            this.accessKey = accessKey;
        }

        public Key() {
            this(false, false);
        }

        public boolean isPlayEngine() {
            return playEngine;
        }

        public boolean isAccessKey() {
            return accessKey;
        }


    }

    public static class Insurance {
        private int dateTo;
        private int price;
        private String number;

        public Insurance(int dateTo, int price, String number) {
            if (dateTo <= 0) {
                this.dateTo = 30;
            } else {
                this.dateTo = dateTo;
            }
            if (price <= 0) {
                this.price = 5000;
            } else {
                this.price = price;
            }
            if (number == null || number.isEmpty() || number.isBlank()) {
                this.number = "defolt";
            } else {
                this.number = number;
            }
        }
        public Insurance() {
            this(30,5000,"defolt");
        }

        public void checkDate() {
            if (dateTo <= 0) {
                System.out.println("страховка просрочена");
            }

        }

        public void check() {
            char[] chars = number.toCharArray();
            if (number.length() < 9 || number.length() > 10) {
                System.out.println("Номер страховки некорректный!");
            }
        }

        public int getDateTo() {
            return dateTo;
        }

        public int getPrice() {
            return price;
        }

        public String getNumber() {
            return number;
        }

    }



}




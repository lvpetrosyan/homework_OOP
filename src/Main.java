import transport.Avto;

public class Main {
    public static void main(String[] args) {

        People maks = new People(1988, "Максим ", "Минск", "бренд-менеджер");
        People anna = new People(1983, "Аня", "Москва", "методист образовательных программ");
        People artem = new People(-1995, "Артем ", "", "директор по развитию бизнеса");
        People katya = new People(1993, "Катя", "Калининград", "продакт-менеджер");
        System.out.println(maks.toString());
        System.out.println(anna.toString());
        System.out.println(artem.toString());
        System.out.println(katya.toString());
        People vova = new People(2001, "Владимир", "Казань", "безарботный");
        System.out.println(vova.toString());


        System.out.println();
        Avto lada = new Avto("Lada", "", "", 0, 0, "Россия");
        Avto audi = new Avto("Audi", "A8 50 L TDI quattro", "черный", 3, 2020, "Германия");
        Avto bmw = new Avto("BMW", "Z8", "черный", 3, 2021, "Германия");
        Avto kia = new Avto("Kia", "Sportage 4-го поколения", "красный", 2.4, 2018, "Южная Корея");
        Avto hyndai = new Avto("Hyundai", "Avente", "оранжевый", 1.6, 2016, "Южная Корея");
        System.out.println(lada.toString());
        System.out.println(audi.toString());
        System.out.println(bmw.toString());
        System.out.println(kia.toString());
        System.out.println(hyndai.toString());
        lada.setColor("желтый");
        lada.setTransmission("механика");
        lada.setEngineVolume(1.9);
        lada.setRegistratNumber("vv598aa521");
        lada.setInsurance(new Avto.Insurance(0,50000,"ghjj5214"));
        lada.setKey(new Avto.Key(true, false));

        printInfoCar(lada);
        printInfoCar(bmw);

        Avto.Key audiR8= new Avto.Key(true,false);



        System.out.println();// вариант 1 с масиивом, в кторый сначала пишем цветы и из них вормируем букет

        Flowers[] flower1 = {new Flowers("белый", "Россия", 35.59, 3, "Роза"),
                new Flowers("белый", "Россия", 35.59, 3, "Роза"),
                new Flowers("белый", "Россия", 35.59, 3, "Роза"),
                new Flowers("белый", "Россия", 15, 2, "хризантема")};
        System.out.print("Букет состоит из: "); allType(flower1);
        System.out.printf("Стоимость: %.2f, срок хрения %d",  sumCost(flower1), minLife(flower1));

        System.out.println();// вариант 2 пишем основные исп. цветы и из них формируем букет
        Flowers rosa = new Flowers("белый", "Италия", 35.59, 3, "Роза");
        Flowers hrizantema= new Flowers("null", "Россия", 15, 2, "Хризантема");
        Flowers pion= new Flowers("null", "Россия", 69.90, 1, "Пион");
        Flowers hypsofila= new Flowers("null", "Россия", 19.50, 5, "Гипсофила");

        printCost(rosa,rosa, pion, pion, hrizantema, hypsofila, rosa);


    }
    public static void printIfo(Flowers floweeer){

        System.out.println(" Цвет букета "+ floweeer.getFlowerColor()+ ", страна производства: "+floweeer.country+ ". Стоимость букета- " +
                floweeer.getCost()+" срок стояния: "+ floweeer.getLifeSpan());
    }
    public static void printCost(Flowers ... flower){
        double calculateCost=0;
        int minimumLisySpan=Integer.MAX_VALUE;
        for (Flowers i:flower
             ) {
            if (minimumLisySpan>i.getLifeSpan()){
                minimumLisySpan=i.getLifeSpan();
            }
            calculateCost+=i.getCost();
            printIfo(i);
        }
        calculateCost*=1.1;

        System.out.println("Cтоимость букета: "+ calculateCost);
        System.out.println("Срок хранения букета: "+ minimumLisySpan);
        }


    public static double sumCost(Flowers[] flower1) {
        int sum = 0;
        for (Flowers i : flower1) {
            sum += i.getCost();
        }
        sum *= 1.1;
        return sum;
    }

    public static int minLife(Flowers[] flower1) {
        int min = 20;
        for (Flowers i : flower1) {
            if (min > i.getLifeSpan()) {
                min = i.getLifeSpan();
            }
        }
        return min;
    }

    public static void allType(Flowers[] flower1) {
        for (Flowers i : flower1
        ) {
         System.out.print(i.getType()+", ");
        }


    }
    public static void printInfoCar(Avto car){
        System.out.println(car.getBrand()+", цвет- "+ car.getColor()+", страна "+ car.getCountry()+" "+ car.getModel()+". Номер регистрационный: "+car.getRegistratNumber()+" "+
                car.getTransmission()+" "+car.getTypeBody()+ " "+car.getEngineVolume()+" "+car.getSeatsNumber()+ " "+(car.isWeels()? "летняя":"зимняя")+" "+ (car.getKey().isAccessKey()? "доступ без ключа":"доступ с ключом")
                +" "+(car.getKey().isPlayEngine()? "удаленный доступ":"запуск только в машине")+" "+ car.getInsurance().getNumber()+" страховка "+car.getInsurance().getPrice()+" цена "+
                car.getInsurance().getDateTo());
    }
}
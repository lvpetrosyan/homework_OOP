public class Main {
    public static void main(String[] args) {
        People maks= new People(1988,"Максим ","Минск", "бренд-менеджер");
        People anna= new People(1983,"Аня","Москва","методист образовательных программ");
        People artem= new People(-1995,"Артем ","", "директор по развитию бизнеса");
        People katya= new People(1993,"Катя","Калининград", "продакт-менеджер");
        System.out.println(maks.toString());
        System.out.println(anna.toString());
        System.out.println(artem.toString());
        System.out.println(katya.toString());
        System.out.println();
        Avto lada= new Avto("Lada","","",0 ,0,"Россия");
        Avto audi =new Avto("Audi", "A8 50 L TDI quattro","черный",3,2020,"Германия");
        Avto bmw= new Avto("BMW", "Z8","черный",3,2021, "Германия");
        Avto kia=new Avto("Kia", "Sportage 4-го поколения","красный",2.4,2018,"Южная Корея");
        Avto hyndai= new Avto("Hyundai", "Avente","оранжевый",1.6,2016, "Южная Корея");
        System.out.println(lada.toString());
        System.out.println(audi.toString());
        System.out.println(bmw.toString());
        System.out.println(kia.toString());
        System.out.println(hyndai.toString());





    }
}
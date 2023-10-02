package HW_OOP_Seminar1;
//Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
//Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и
//реализовать перегруженный метод getProduct(int name, int volume, int temperature), выдающий продукт соответствующий имени, объёму и температуре
//В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и воспроизвести логику, заложенную в программе
//Всё вышеуказанное создать согласно принципам ООП, пройденным на семинаре

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<HotDrink> hotDrinkList = new ArrayList<>();
        HotDrinkVendingAutomat hotDrinkVendingAutomat = new HotDrinkVendingAutomat();
        HotDrink cappuccino = new HotDrink("Капучино", 100, 150, 90);
        hotDrinkList.add(cappuccino);
        HotDrink coffee = new HotDrink("Кофе", 150, 100, 90);
        hotDrinkList.add(coffee);
        hotDrinkVendingAutomat.printProduct();

        hotDrinkVendingAutomat.initProducts(hotDrinkList);
        hotDrinkVendingAutomat.printProduct();
        System.out.println();

        HotDrink teaBlack = new HotDrink("Чай черный", 100, 200, 80);
        hotDrinkVendingAutomat.addProduct(teaBlack);
        hotDrinkVendingAutomat.printProduct();
        System.out.println();

        hotDrinkVendingAutomat.getProduct(100);
        hotDrinkVendingAutomat.getProduct("Капучино");
        hotDrinkVendingAutomat.getProduct("Кофе", 150, 100,90);


    }
}
package HW_OOP_Seminar5;

import HW_OOP_Seminar1.HotDrink;
import HW_OOP_Seminar1.HotDrinkVendingAutomat;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private List<HotDrink> hotDrinkList;
    private HotDrinkVendingAutomat hotDrinkVendingAutomat;
    public Controller() {
        hotDrinkList = new ArrayList<>();
    }

    public void craeteAutomat(){
        hotDrinkVendingAutomat = new HotDrinkVendingAutomat();
        hotDrinkVendingAutomat.initProducts(hotDrinkList);
        hotDrinkVendingAutomat.printProduct();

    }
    public void createProduct(String name, int cost, int volume, int temperature){
        HotDrink cappuccino = new HotDrink(name, cost, volume, temperature);
        hotDrinkList.add(cappuccino);
    }

    public void printProduct(){
        hotDrinkVendingAutomat.printProduct();
    }
    public void getProduct (String name){
        hotDrinkVendingAutomat.getProduct(name);
    }
    public void getProduct(String name, int cost, int volume, int temperature){
        hotDrinkVendingAutomat.getProduct( name, cost, volume, temperature);
    }

}

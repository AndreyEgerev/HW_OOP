package HW_OOP_Seminar5.model;

import HW_OOP_Seminar7.View.Log;
import HW_OOP_Seminar7.View.LogConsole;

import java.util.ArrayList;
import java.util.List;

public class HotDrinkVendingAutomat implements Authomat<HotDrink> {

    private List<HotDrink> hotDrinkList = new ArrayList<>();
    private Log currentLog;

    public HotDrinkVendingAutomat() {
        this.currentLog = new Log(new LogConsole());
    }

    /** Инициализация торгового автомата
     * @param newListProduct список первоначальных напитков
     */
    @Override
    public void initProducts(List<HotDrink> newListProduct) {
        this.hotDrinkList = newListProduct;
    }
/** Вывод названия продуктов загруженных в торговый автомат*/
    @Override
    public void printProduct() {
        if (hotDrinkList.isEmpty()){
            currentLog.writeMessage("Автомат пуст");
        }
        else{
            currentLog.writeMessage("В аппарате находятся:");
            for (HotDrink drink:
                hotDrinkList) {
                currentLog.writeMessage(drink.getName());
            }
        }
    }

    /** Поиск продукта по заданным параметрам
     * @param name название напитка*/
    public void getProduct(String name) {
        currentLog.writeMessage("--");
        for (HotDrink drink:
             hotDrinkList) {
            if (drink.getName().equalsIgnoreCase(name)){
                currentLog.writeMessage(drink.getInfoProduct());
            }
        }
    }

    /** Поиск продукта по заданным параметрам
     * @param cost стоимость*/
    public void getProduct(int cost){
        currentLog.writeMessage("--");
        for (HotDrink drink:
             hotDrinkList) {
            if (drink.getCost() == cost){
                currentLog.writeMessage(drink.getInfoProduct());
            }
        }
    }

    /** Поиск продукта по заданным параметрам
     * @param name название напитка
     * @param cost стоимость
     * @param volume объем напитка
     * @param temperature температура напитка*/
    public void getProduct(String name, int cost, int volume, int temperature){
        currentLog.writeMessage("--");
        for (HotDrink drink:
                hotDrinkList) {
            if (drink.getCost() == cost &&
                    drink.getName().equalsIgnoreCase(name) &&
                        drink.getVolumeSize()== volume &&
                            drink.getTemperature() == temperature){
                currentLog.writeMessage(drink.getInfoProduct());
            }
        }
    }

    @Override
    public void addProduct(HotDrink hotDrink) {
        this.hotDrinkList.add(hotDrink);
    }
}
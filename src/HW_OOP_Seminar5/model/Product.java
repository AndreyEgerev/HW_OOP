package HW_OOP_Seminar5.model;
/** Абстрактный класс для продуктов*/
public abstract class Product {
    protected String name;
    protected int cost;

    Product(String name, int cost){
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost){
        this.cost = cost;
    }

    public String getInfoProduct(){
        return "Product " + name +
               " cost = " + cost;
    }

    @Override
    public String toString() {
        return name + " стоимость " + cost;
    }
}

package HW_OOP_Seminar2;

import java.util.Date;

public class Human extends Actor {

    /** Дата создания заказа*/
    private Date createdOrder;

    /** @param name имя посетителя*/
    public Human(String name) {
        super(name);
    }

    @Override
    public void setMakeOrder(boolean makeOrder) {
        if (makeOrder == true) {
            this.isMakeOrder = makeOrder;
            this.createdOrder = new Date();
        }
        else {
            this.isMakeOrder = makeOrder;
        }
    }

    @Override
    public void setTakeOrder(boolean takeOrder) {
        if (this.isMakeOrder == true && takeOrder == true) {
            this.isTakeOrder = takeOrder;
            this.isMakeOrder = false;
        }
        else {
            this.isTakeOrder = takeOrder;
        }
    }

    @Override
    public String toString() {
        return String.format(name +"\nЗаказ принят " + isMakeOrder + "\nЗаказ выдан " + isTakeOrder);
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (ob)
//
//    }

    public void setCreatedOrder(Date createdOrder) {
        this.createdOrder = createdOrder;
    }

    public Date getCreatedOrder() {
        return createdOrder;
    }
}

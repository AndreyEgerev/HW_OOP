package HW_OOP_Seminar5;


/**Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
 * Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и
 * реализовать перегруженный метод getProduct(int name, int volume, int temperature), выдающий продукт соответствующий имени, объёму и температуре
 * В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и воспроизвести логику, заложенную в программе
 * Всё вышеуказанное создать согласно принципам ООП, пройденным на семинаре
 * <p>
 * Взять проект из первого дз и сделать рефакторинг в паттерне MVC
 *
 */
public class Main {


    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.craeteAutomat();
        controller.createProduct("Капучино", 100, 150, 90);
        controller.createProduct("Кофе", 150, 100, 90);
        controller.printProduct();
        controller.getProduct("Кофе");





    }
}



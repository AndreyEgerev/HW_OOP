package HW_OOP_Seminar5.view;

/** Класс для логирования в консоль
 *
 */
public class LogConsole implements Logging {

    /**
     * Вывод сообщения
     *
     * @param message сообщение для вывода
     */
    @Override
    public void writeMessage(String message) {
        System.out.println(message);
    }
}

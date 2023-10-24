package HW_OOP_Seminar6;

import java.text.SimpleDateFormat;
import java.util.Date;

/** Класс для вывода на экран
 *
  */
public class ViewLog {
    private GroupController<User> groupController = new GroupController<>();
    private Logging log;
    private final SimpleDateFormat date;

    public ViewLog(GroupController<User> groupController) {
        this.groupController = groupController;
        this.log = new LogConsole();
        String datePattern = "yyyy-MM-dd HH:mm:ss";
        date = new SimpleDateFormat(datePattern);
    }

    /** Вывод списка студентов
     *
     */
    public void showStudents() {
        String show = "Группа " + groupController.getGroup().getNameGroup() +
                ":\n" + "\nCтуденты: \n";
        for (User user : groupController.getGroup().getGroup()
        ) {
            show += "\t\t" + user + "\n";
        }
        log.writeMessage(show);
    }
    public void setLog(Logging log) {
        this.log = log;
    }

    /** Вывод сообщения с указанием даты
     *
     * @param message сообщение
     */
    public void writeLog(String message) {
        String currentDate = date.format(new Date());
        log.writeMessage(currentDate+ " " + message);
    }

    /** Вывод сообщения
     *
     * @param message сообщение для вывода
     */
    public void writeMessage(String message) {
        log.writeMessage(message);
    }
}
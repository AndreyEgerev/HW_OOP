package HW_OOP_Seminar3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Group implements Iterable<Student>{
    protected int groupNumber;
    protected List<Student> studentList = new ArrayList<>();

    public Group(int groupNumber) {
        this.groupNumber = groupNumber;
        this.studentList = new ArrayList<>();
    }

    public Group() {
    }

    /** Добавление студента в группу
     *
     * @param student объект класса Студент для добавления
     */
    public void addStudent(Student student) {
        studentList.add(student);
    }

    /** Добавление списка студентов в группу
     *
     * @param studentList список студентов
     */
    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    /** Удаление студента из группы
     *
     * @param student объект класса студент для удаления
     */
    public void removeStudent(Student student) {
        studentList.remove(student);
    }

    /** Получение списка студентов группы
     *
     * @return список студентов
     */
    public List<Student> getStudentList() {
        return studentList;
    }

    /** Получение номера группы
     *
     * @return номер группы
     */
    public int getGroupNumber() {
        return groupNumber;
    }

    /** Установка номера группы
     *
     * @param groupNumber номкер группы
     */
    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    @Override
    public Iterator<Student> iterator() {
        return studentList.iterator();
    }
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("В группе ").append(groupNumber).append(" - ").append(studentList.size()).append(" студентов").append("\n");
        for (Student student : studentList) {
            result.append(student.toString()).append("\n");
        }
        return result.toString();
    }
}


package HW_OOP_Seminar4;

import java.util.ArrayList;
import java.util.List;

class TeacherGroup {
    private String schoolName;
    private List<Teacher> teachers;
    /** Конструктор Группы учителей
     *
     * @param groupName Наименование школы/группы
     * @param group Список Учителей
     */
    public TeacherGroup(String groupName, List<Teacher> group) {
        this.schoolName = groupName;
        this.teachers = group;
    }

    /** Конструктор Группы учителей
     *
     * @param groupName Наименование школы/группы
     */
    public TeacherGroup(String groupName) {
        this.schoolName = groupName;
        this.teachers = new ArrayList<>();
    }

    /** Добавление Учителя в группу
     *
     * @param teacher объект класса Учитель
     * @return Строка о результате действия
     */
    public String addTeacher(Teacher teacher) {
        teachers.add(teacher);
        return "Учитель " + teacher.getName() + " " + teacher.getSurname() + " добавлен в группу" + this.schoolName;
    }
    /** Удаление Учителя из группы
     *
     * @param teacher объект класса Учитель
     * @return Строка о результате действия
     */
    public String removeTeacher(Teacher teacher) {
        teachers.remove(teacher);
        return "Учитель " + teacher.getName() + " " + teacher.getSurname() + " удален из группы" + this.schoolName;
    }

    /** Установка занятости учителя в группе
     *
     * @param teacher объект класса Учитель
     * @param busy флаг о занятости учителя
     * @return Строка о результате действия
     */
    public String setTeacherIsBusy(Teacher teacher, boolean busy) {
        for (Teacher teacherTemp :
                teachers) {
            if (teacherTemp.equals(teacher)) {
                teacherTemp.setBusy(busy);
                if (busy){
                    return "Учитель " + teacher.getName() +" " + teacher.getSurname() + " на уроке";
                }
                else {
                    return "Учитель " + teacher.getName() +" " + teacher.getSurname() + " свободен";
                }
            }
        }
        return "";
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public Teacher getTeacher(String name, String surname){
        for (Teacher teacherTemp :
                teachers) {
            if (teacherTemp.getName().equalsIgnoreCase(name) && teacherTemp.getSurname().equalsIgnoreCase(surname)) {
                return teacherTemp;
            }
        }
        return null;
    }

    public String getSchoolName() {
        return schoolName;
    }
}

package HW_OOP_Seminar4;

public class TeacherController {
    private TeacherGroup teacherGroup;
    private TeacherService teacherService;
    private TeacherView teacherView;

    public TeacherController(TeacherGroup teacherGroup, TeacherService teacherService, TeacherView teacherView) {
        this.teacherGroup = teacherGroup;
        this.teacherService = teacherService;
        this.teacherView = teacherView;
    }

    public boolean teacherCreate(String name, String surname, String patronymic, String subject){
        if (teacherService.validateDateStr(name) &&
                teacherService.validateDateStr(surname) &&
                teacherService.validateDateStr(patronymic) &&
                teacherService.validateDateStr(subject)) {
        teacherGroup.addTeacher(new Teacher(name, surname, patronymic, subject));
        teacherView.printMessage("Учитель " + name + " " + surname +" добавлен");
        return true;}
        return false;
    }

    public void teacherChange(String name, String surname,String newName, String newSurname){
        if (teacherService.validateTeacherInGroup(teacherGroup.getTeachers(),name,surname)){
            for (int i = 0; i < teacherGroup.getTeachers().size(); i++){
                if (teacherGroup.getTeachers().get(i).getName().equalsIgnoreCase(name) &&
                        teacherGroup.getTeachers().get(i).getSurname().equalsIgnoreCase(surname)){
                    teacherGroup.getTeachers().get(i).setName(newName);
                    teacherGroup.getTeachers().get(i).setSurname(newSurname);
                    teacherView.printMessage("Данные учителя скорректированы");
                }

            }
        }
    }

    public void teacherViewAll (){
        teacherView.teacherViewAll(this.teacherGroup.getTeachers());
    }
}

package HW_OOP_Seminar4;

import java.util.List;

class TeacherView<T extends Teacher> {

    public void teacherViewAll(List<Teacher> teacherList){
        System.out.println(teacherList);
    }
    public void printMessage(String message){
        System.out.println(message);
    }



}

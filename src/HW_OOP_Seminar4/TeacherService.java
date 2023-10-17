package HW_OOP_Seminar4;

import java.util.List;

public class TeacherService {
    public boolean validateDateStr(String stringDate){
        return stringDate != null && !stringDate.isEmpty();
    }

    public boolean validateTeacher(Teacher teacher){
        if ((teacher.getName() != null) && teacher.getSurname() != null && teacher.getSubject() !=null){
            return true;
        }
        return false;
    }

    public boolean validateTeacherInGroup(List<Teacher> teacherGroup, String name, String surname){
        for (Teacher teacherTemp :
                teacherGroup) {
            if (teacherTemp.getName().equalsIgnoreCase(name) && teacherTemp.getSurname().equalsIgnoreCase(surname)) {
                return true;
            }
        }
        return false;
    }
}

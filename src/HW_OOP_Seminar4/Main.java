package HW_OOP_Seminar4;
//-- Создать класс Учитель
//-- Создать класс УчительСервис ;(добавляем валидацию)
//— Создать класс УчительВью;(Выводим в консоль)
//— Создать класс УчительКонтроллер(Работа с данными: принимает данные в класс Учитель и отправляет в Учитель вью) и реализовать возможность создания, редактирования конкретного учителя и отображения списка учителей, имеющихся в системе.
//-- Создать класс ГруппаУчителей
//--Добавить поле учитель в учебную группу

public class Main {
    public static void main(String[] args) {

        TeacherController controller = new TeacherController(new TeacherGroup("Школа №1"),new TeacherService(), new TeacherView());

        controller.teacherCreate("Иван","Иванов","Олегович","Биология");
        controller.teacherCreate("Петр","Сидоров","Александрович","Физика");

        controller.teacherViewAll();

        controller.teacherChange("Иван","Иванов","Федор","Петров");
        controller.teacherViewAll();


    }
}

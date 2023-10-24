package HW_OOP_Seminar6;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        GroupController<User> groupController = new GroupController<>();


        User student1 = new User("Иван", "Иванов", "Иванович");
        User student2 = new User("Петр", "Сидоров", "Петрович");
        User student3 = new User("Иван", "Петров", "Петрович");



        groupController.createGroup("Класс 1");
        groupController.addStudentToGroup(student1);
        groupController.addStudentToGroup(student2);
        groupController.addStudentToGroup(student3);


        UserComparator<UserInterface> comparator = new UserComparator<>();
        TreeSet<UserInterface> sortedGroup = new TreeSet<>(comparator);

        for (User user : groupController.getGroup().getGroup()
        ) {
            sortedGroup.add(user);
        }
        System.out.println(sortedGroup);

        ViewLog view = new ViewLog(groupController);
        view.showStudents();
    }
}

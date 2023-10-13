package HW_OOP_Seminar3;
//— Создать класс Поток, содержащий в себе список УчебныхГрупп и реализующий интерфейс Iterable;
//— Создать класс StreamComparator, реализующий сравнение количества групп, входящих в Поток;
//— Создать класс ПотокСервис, добавив в него метод сортировки списка потоков, используя созданный StreamComparator;

import java.util.ArrayList;
import java.util.List;

//Формат сдачи: ссылка на гитхаб проект
//Егерев Андрей группа 4830
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Олег","Петров", 23);
        Student student2 = new Student("Максим","Иванов", 22);
        Student student3 = new Student("Федор","Сидоров", 43);
        Student student4 = new Student("По","Пинг", 22);
        Student student5 = new Student("Петр","Попов", 21);
        Student student6 = new Student("Оксана","Сидорова", 23);
        Student student7 = new Student("Даша","Букина", 25);
        Student student8 = new Student("Таня","Мячикова", 24);
        Student student9 = new Student("Дима","Маликов", 20);
        Student student10 = new Student("Курт","Кобейн", 27);
        Student student11 = new Student("Пол","Маккартни", 81);

        Group group1 = new Group(1);
        group1.addStudent(student1);
        group1.addStudent(student2);
        System.out.println(group1);

        Group group2 = new Group(2);
        group2.addStudent(student3);
        group2.addStudent(student4);
        group2.addStudent(student5);
        group2.addStudent(student11);
        System.out.println(group2);

        Group group3 = new Group(3);
        group3.addStudent(student6);
        group3.addStudent(student7);
        group3.addStudent(student8);
        System.out.println(group3);

        Group group4 = new Group(4);
        group4.addStudent(student9);
        group4.addStudent(student10);
        System.out.println(group4);

        TrainingStream stream1 = new TrainingStream(1);
        stream1.addGroup(group1);
        stream1.addGroup(group2);
        stream1.addGroup(group4);

        TrainingStream stream2 = new TrainingStream(2);
        stream2.addGroup(group4);

        //System.out.println(stream1);
        //System.out.println(stream2);

        List<TrainingStream> streamsList = new ArrayList<>();
        streamsList.add(stream1);
        streamsList.add(stream2);
        System.out.println(streamsList);
        System.out.println("Отсортированный список по количеству групп в потоках");
        StreamServis streamService = new StreamServis();
        streamService.sort(streamsList);
        System.out.println(streamsList);
    }
}

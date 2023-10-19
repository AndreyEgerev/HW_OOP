package HW_OOP_Seminar7;

import HW_OOP_Seminar7.View.Log;
import HW_OOP_Seminar7.View.LogConsole;

import java.util.Arrays;

/** Создать проект калькулятора комплексных чисел (достаточно сделать сложение, умножение и деление).
 Применить при создании программы архитектурные паттерны, добавить логирование калькулятора.
 Соблюдать принципы SOLID, паттерны проектирования.
 Формат сдачи: ссылка на гитхаб проект
 Егерев Андрей группа 4830
 */
public class Main {
    public static void main(String[] args) {

        ComplexPresenter control = new ComplexPresenter(new Log(new LogConsole()));
        control.start();


    }
}

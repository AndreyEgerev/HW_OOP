package HW_OOP_Seminar4;

import java.util.ArrayList;
import java.util.List;

/** Класс учитель */
public class Teacher {
    private String name;
    private String surname;
    private String patronymic;
    private String subject;
    private boolean isBusy;

    /** Конструктор класса Учитель
     *
     * @param name Имя
     * @param surname Фамилия
     * @param patronymic Отчество
     * @param subject Предмет обучения
     */
    public Teacher(String name, String surname, String patronymic, String subject) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.subject = subject;
        this.isBusy = false;
    }

    public boolean isBusy() { return isBusy; }

    public void setBusy(boolean busy) {this.isBusy = busy;    }

    public String getName() {return name;    }

    public void setName(String name) {this.name = name;    }

    public String getSurname() {return surname;    }

    public void setSurname(String surname) {this.surname = surname;    }

    public String getPatronymic() {return patronymic;    }

    public void setPatronymic(String patronymic) {this.patronymic = patronymic;    }

    public String getSubject() {return subject;    }

    public void setSubject(String subject) {this.subject = subject;    }

    @Override
    public String toString() {
        return "Учитель " + this.name + " " + this.surname + " " + this.patronymic + " по предмету " + this.subject;
    }
}


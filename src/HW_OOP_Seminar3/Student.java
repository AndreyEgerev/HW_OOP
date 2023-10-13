package HW_OOP_Seminar3;

public class Student {
    protected String firstName;
    protected String lastName;
    protected int age;


    /**Создание объекта класса студент
     * @param firstName имя студента
     * @param lastName  фамилия студента
     * @param age возраст студента
     */
    public Student(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;

    }
    /**Возвращает возраст студента
     */
    public int getAge() {
        return age;
    }

    /**Возвращает имя студента
     */
    public String getFirstName() {
        return firstName;
    }

    /**Возвращает фамилию студента
     */
    public String getLastName() {
        return lastName;
    }

    /**Возвращает имя и фамилию студента.
     */
    public String getName() {
        return String.format("%s %s", firstName, lastName);
    }

    /**Возвращает строку в формате "Имя Фамилия возраст"
     */
    @Override
    public String toString() {
        return String.format("%s %s, %s", firstName, lastName, age);
    }
}


/**
 * ФИО, должность, email, телефон, зарплата, возраст.
 */
public class Employe {

    /**
     * ФИО
     */
    private String fullName;

    /**
     * Должность
     */
    private String position;

    /**
     * Email
     */
    private String email;

    /**
     * Зарплата
     */
    private double salary;

    /**
     * Возраст
     */
    private int age;


    /**
     * Определяет все члены класса
     * @param fullName
     * @param position
     * @param email
     * @param salary
     * @param age
     */
    public Employe(String fullName, String position, String email, double salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.salary = salary;
        this.age = age;
    }

    /**
     * Выводит информацию по сотруднику в консоль
     */
    public void toConsole () {
        System.out.println(this.fullName + "/" +
                this.position + "/" + this.email + "/" + this.salary + "/" + this.age);
    }

    public static void main (String [] args) {
        Employe [] employees = new Employe[5];
        employees[0] = new Employe("И А Б", "БОСС", "fds@fdsa.fd", 101, 45);
        employees[1] = new Employe("И Д Б", "ЗАМ БОСС", "fds@fdsa.fd", 99, 44);
        employees[2] = new Employe("И Ж Б", "ЗАМ ЗАМА БОССА", "fdу@fdsa.fd", 95, 23);
        employees[3] = new Employe("Д И Ж", "СЫН БОССА", "fa@fdsa.fd", 85, 19);
        employees[4] = new Employe("Вася", "все", "fds@fdsa.fd", 25, 35);
        for (Employe employe : employees) {
            if (employe.age >= 40) {
                employe.toConsole();
            }
        }

    }


}

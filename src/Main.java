public class Main {
    public static void main(String[] args) {
        Task1();
        Task2();
        Task3();
        Task4();
    }

    public static void Task1() {
        System.out.println("Task1");
        String tel = "+7(964)-264-37-25";
        tel = tel.replace("-", "");
        tel = tel.replace(" ", "");
        tel = tel.replace("+", "");
        tel = tel.replace("(", "");
        tel = tel.replace(")", "");
        System.out.println("tel = " + tel);
        if (tel.length() == 10) {
            tel = '7' + tel;
        } else if (tel.length() > 11) {
            throw new RuntimeException("Телефон введен не корректно!");
        } else if (tel.length() < 10) {
            throw new RuntimeException("Телефон короткий!");
        } else if (tel.length() == 11 && tel.charAt(0) != '7') {
            throw new RuntimeException("Код телефона указан не верно!");
        }
        System.out.println("tel = " + tel);
        String expectedPhone = "79642643725";
        if (tel.equals(expectedPhone)) {
            System.out.println("Успех!");
        } else {
            System.out.println("Неудача!");
        }
    }

    public static void Task2() {
        System.out.println("Task2");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника: " + fullName);
        System.out.println("ФИО сотрудника для отчета: " + fullName.toUpperCase());
    }

    public static void Task3() {
        System.out.println("Task3");
        String fullName = "Иванов Семён Семёнович";
        System.out.println("ФИО сотрудника: " + fullName);
        fullName = fullName.replace('ё', 'е');
        System.out.println("ФИО сотрудника: " + fullName);
    }
}
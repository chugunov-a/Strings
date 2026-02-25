
void main() {
    System.out.println("Задание №1");

    String firstName = "Ivan";
    firstName = ' ' + firstName;
    String middleName = "Ivanov";
    middleName = ' ' + middleName;
    String lastName = "Ivanovich";
    lastName = " " + lastName;
    String fullName = middleName + firstName + lastName;
    System.out.println(" Ф.И.О. сотрудника — " + fullName);

    System.out.println("Задание №2");

    System.out.println(" Данные Ф.И.О. сотрудника для заполнения отчета — " + (fullName.toUpperCase()));

    System.out.println("Задание №3");

    fullName = "Иванов Семён Семёнович";
    System.out.println(" Данные Ф.И.О. сотрудника — " + (fullName.replace("ё", "е")));
    }

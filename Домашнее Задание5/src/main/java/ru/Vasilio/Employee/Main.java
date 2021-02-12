package ru.Vasilio.Employee;

public class Main{
    public static void main(String[] args) {

        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Ф.И.О. - Иванов И.А,", "Должность - Инжинер,", "Электронная почта - ivivanova@mail.ru,", "Телефон: 89081111111,", 35000, 25);
        empArray[1] = new Employee("Ф.И.О. - Иванов И.Б,", "Должность - Инжинер1,", "Электронная почта - ivivanovb@mail.ru,", "Телефон: 89081111112,", 35000, 41);
        empArray[2] = new Employee("Ф.И.О. - Иванов И.В,", "Должность - Инжинер2,", "Электронная почта - ivivanovv@mail.ru,", "Телефон: 89081111113,", 35000, 38);
        empArray[3] = new Employee("Ф.И.О. - Иванов И.Г,", "Должность - Инжинер3,", "Электронная почта - ivivanovg@mail.ru,", "Телефон: 89081111114,", 35000, 49);
        empArray[4] = new Employee("Ф.И.О. - Иванов И.Д,", "Должность - Инжинер4,", "Электронная почта - ivivanovd@mail.ru,", "Телефон: 89081111115,", 35000, 37);

        for (int i = 0, empArrayLength = empArray.length; i < empArrayLength; i++) {
            Employee j = empArray[i];
            if (j.getAge() > 40) j.isInfo();
        }
    }
}

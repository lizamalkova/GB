package ru.gb.homework;

public class Main {

    public static void main (String[] args){

        Employee[] employeeArray = new Employee[5];
        employeeArray[0] = new Employee("Иванов Сергей Васильевич",
                "Директор",  "ivanov@mail.ru","+79876543211",
                100000, 55);

        employeeArray[1] = new Employee("Кошкина Юлия Олеговна",
                "Редактор",  "koshkina@mail.ru","+7239499511",
                50000, 34);
        employeeArray[2] = new Employee("Быковский Юрий Николаевич",
                "Инженер",  "bykovsky@mail.ru","+7938593200",
                80000, 41);

        employeeArray[3] = new Employee("Фиалкова Ирина Викторовна",
                "Менеджер",  "fialkova@mail.ru","+7659403858",
                53000, 29);

        employeeArray[4] = new Employee("Черный Матвей Константинович",
                "Программист",  "cherny@mail.ru","+7239852922",
                850000, 38);


       for ( int i = 0; i < employeeArray.length; i++){
           if ( employeeArray[i].age > 40 ){
               employeeArray[i].employeeInfo();
           }
       }
    }


}

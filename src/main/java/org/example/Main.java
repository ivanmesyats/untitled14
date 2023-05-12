package org.example;


public class Main {
    public static void main(String[] args) {
    /*1. Створити клас User, у якого будуть:
поля userName, age, email, password, isActive(boolean), amountSpentMoney. password та age повинні мати модифікатор доступу private. Зробити геттери і сеттери з валідацією для private полів(валідація довільна).*/

        User newIvan = new User();
        newIvan.userName = "New Ivan";
        newIvan.getAge();
        newIvan.email = "ivan@email.com";
        newIvan.setPassword("new password");
        newIvan.isActive = false;
        newIvan.amountSpentMoney = 100;

        System.out.println(newIvan.userName + " " + newIvan.getAge() + " email: " + newIvan.email + " password: " + newIvan.getPassword() + " is Active: " + newIvan.isActive + " AmountOfSpentMoney = " + newIvan.amountSpentMoney);

//  -конструктори: дефолтний; конструктор який приймає userName та контруктор який приймає userName та password.
        User ivan = new User("Ivan", "123");
        User andrew = new User("Andrew");
        User sergey = new User("Sergey");

/*- методи: makePurchase, який приймає параметр purchasePrice(вартість покупки) типу double, і виводить на яку суму була здійснена покупка та додає цю вартість до глобальної змінної amountSpentMoney.
 printTotalAmountOfSpentMoney, який виводить загальну суму витрачених грошей.*/
        ivan.makePurchase(10);
        andrew.makePurchase(20);
        sergey.makePurchase(30);

        User.printTotalAmountOfSpentMoney();

//Створити додатковий клас для перевірки функціональності класса User, де треба створити декілька екземплярів класса User з різними значеннями, повикликати методи, в кінці програми вивести суму витрачених грошей, кожного юзера та інформацію про нього
            User.UserTest.test();

        }
    }

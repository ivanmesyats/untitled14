package org.example;

public class UserTest {

    public static void PrintUserInfo(User user){
        System.out.println(user.userName+ " Age " + user.getAge() + " Password is "+ user.getPassword() + " email " + user.email + " is active " + user.isActive);
    }

    public static User CreateUser(String userName, String passwrod, int age, String email, Boolean isActive){

        User user = new User (userName, passwrod);
        user.setAge(age);
        user.email = email;
        user.isActive = isActive;
        return user;

    }
    public static void test(){

        User ivan = CreateUser("Ivan", "123", 39, "ivan@email.com", true);
        User andrew = CreateUser("Andrew", "321", 53, "andrew@email.com", true);
        User sergey = CreateUser("Sergey", "456", 37, "sergey@email.com", false);

        ivan.makePurchase(10);
        andrew.makePurchase(20);
        sergey.makePurchase(30);

        if (ivan.amountSpentMoney + andrew.amountSpentMoney + sergey.amountSpentMoney == 60 ) {
            System.out.println("Spent check is ok");
            PrintUserInfo(ivan);
            PrintUserInfo(andrew);
            PrintUserInfo(sergey);
        }else System.out.println("Spent check is not ok");

        System.out.println("Total Amount Of SpentMoney is : " + (ivan.amountSpentMoney + andrew.amountSpentMoney + sergey.amountSpentMoney));
    }


}



package org.example;


public class User {
    public static double  printTotalAmountOfSpentMoney = 0;
    public User() {}
        String userName;
        private int age = 19;
        String email;
        private String password = "123";
        boolean isActive;
        double purchasePrice;
        double amountSpentMoney = 10;



    public int getAge () {
        return this.age;
    }

    public void setAge(int age) {

            if (age < 0) System.out.println("age les then 0");

             else this.age = age;
        }


    public void setPassword (String password) {
        if (password.length() == 0) {
            System.out.println("password length can be null");
        }
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void makePurchase(double purchasePrice) {
        printTotalAmountOfSpentMoney = purchasePrice + printTotalAmountOfSpentMoney;
        System.out.println(userName + " spent "+ purchasePrice);
    }

    public User (String userName ) {
        this.userName = userName;
    }
    public User (String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public static void printTotalAmountOfSpentMoney () {
        System.out.println("Total amount = " + printTotalAmountOfSpentMoney);
    }

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

            if (User.printTotalAmountOfSpentMoney == 60 ) {
                    System.out.println("Spent check is ok");
                    PrintUserInfo(ivan);
                    PrintUserInfo(andrew);
                    PrintUserInfo(sergey);
            }else System.out.println("Spent check is not ok");

        }


        }

}







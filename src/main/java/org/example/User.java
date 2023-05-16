package org.example;


public class User {

    public User() {}
        String userName;
        private int age = 19;
        String email;
        private String password = "123";
        boolean isActive;
        //double purchasePrice;
        double amountSpentMoney;



    public int getAge () {
        return this.age;
    }

    public void setAge(int age) {

            if (age < 0) {
                System.out.println("age les then 0");
            }

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
//        TotalAmountOfSpentMoney = purchasePrice + TotalAmountOfSpentMoney;
//        System.out.println(userName + " spent "+ purchasePrice);
//        User.TotalAmountOfSpentMoney();
         amountSpentMoney += purchasePrice;
        System.out.println(amountSpentMoney );

    }

    public User (String userName ) {
        this.userName = userName;
    }
    public User (String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

//    public static void TotalAmountOfSpentMoney () {
//        System.out.println("Total amount = " + TotalAmountOfSpentMoney);
//    }



}








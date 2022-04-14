package by.academy.HomeWork.Interfaces.Task5;

public enum UserCheck {
    USER1("Petr" , "12345"), USER2("Nikolay" , "qazxsw"),
    USER3("Kolia" , "wsxzaq"), USER4("Vania" , "zutybq");
    String PASSWORD;
    String LOGIN;
    UserCheck(){
    }
   UserCheck(String login, String password){
        PASSWORD = password;
        LOGIN = login;
   }
    }


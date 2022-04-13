package by.academy.HomeWork.Interfaces.Task5;

public enum UserCheck {
    USER("12345"), SUPERVIKTAR("qazxsw"), KOLIA("wsxzaq"), PETIA("zutybq");
    String PASSWORD;
    UserCheck(){

    }
   UserCheck(String password){
        PASSWORD = password;
   }
    boolean UserForCheck(UserCheck user){
        for (UserCheck u : UserCheck.values()){
            if(u.equals(user)){
                return true;
            }
        }
        return false;
    }
}

package by.academy.HomeWork.GenericsAndInerClasses.Task3;

public class UserNested {
    private static String login;
    private String password;
    public UserNested(String login, String password){
        this.login = login;
        this.password = password;
    }

    void createQuery(){
        Query query = new Query();
        query.printToLog();
    }
    public static class Query{
        void printToLog(){
            System.out.println("User " + login + " sended a nasted massage" );
        }
    }
}

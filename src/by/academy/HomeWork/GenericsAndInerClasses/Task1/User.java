package by.academy.HomeWork.GenericsAndInerClasses.Task1;

public class User {
    private String login;
    private String password;
    public User(){

    }
    public User(String login, String password){
        this.login = login;
        this.password = password;
    }
    void createQuery(){
        Query query =new Query();
        query.printToLog();

    }
    public class Query{
        void printToLog(){
            System.out.println("User " + login + " sended a query");
        }
    }
}

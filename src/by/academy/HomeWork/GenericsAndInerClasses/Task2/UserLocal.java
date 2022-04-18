package by.academy.HomeWork.GenericsAndInerClasses.Task2;

import by.academy.HomeWork.GenericsAndInerClasses.Task1.User;

public class UserLocal {
        private String login;
        private String password;
        public UserLocal(){

        }
        public UserLocal(String login, String password){
            this.login = login;
            this.password = password;
        }
       public void createQuaery(){
            class Quaery{
                void printToLog(){
                    System.out.println("User " + login + " sended local query");
                }
            }
            Quaery quaery = new Quaery();
            quaery.printToLog();
       }
    }


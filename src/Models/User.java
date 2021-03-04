package Models;

public class User {
    private String name;
    private String lastname;
    private int age;
    private Adress userAdress;


    public User(){


    }

    public User(String name , String lastname , int age){

        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setUserAdress(Adress userAdress) {
        this.userAdress = userAdress;
    }

    public Adress getUserAdress() {
        return userAdress;
    }
}

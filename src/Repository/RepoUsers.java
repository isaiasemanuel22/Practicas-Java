package Repository;

import Models.User;

import java.util.LinkedList;
import java.util.List;

public class RepoUsers {

    private static RepoUsers instance ;
    private List<User> listUsers;

    private RepoUsers (){
        System.out.println("error1");
        listUsers = new LinkedList<User>();
        System.out.println("error2");
    }

    public static RepoUsers getInstance(){
        if(instance == null){
            instance = new RepoUsers();
        }
        return instance;
    }

    public void addUser(User user){
        this.listUsers.add(user);
    }

    public void delete(User user){
        this.listUsers.remove(user);
    }

    public User getUser(String name, String lastname){
        User user = null;
        for (int  i = 0 ; i < this.listUsers.size() ; i++){
            if(this.listUsers.get(i).getName() == name && this.listUsers.get(i).getLastname() == lastname){
                user = this.listUsers.get(i);
            }
        }
        return user;
    }


}

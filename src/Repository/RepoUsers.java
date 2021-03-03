package Repository;

import Models.User;

import java.util.LinkedList;
import java.util.List;

public class RepoUsers {

    private static RepoUsers instance = null;
    private List<User> listUsers;

    private RepoUsers (){
        listUsers = new LinkedList<User>();
    }

    public RepoUsers getInstance(){
        if(instance == null){
            instance = new RepoUsers();
        }
        return instance;
    }


}

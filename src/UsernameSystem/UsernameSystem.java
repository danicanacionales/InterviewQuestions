package UsernameSystem;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class UsernameSystem {
    public static void main(String[] args) {
        List<String> u = new ArrayList<>();
        u.add("bob");
        u.add("alice");
        u.add("bob");
        u.add("alice");
        u.add("bob");
        u.add("alice");


        List<String> uniqueUsernames = usernamesSystem(u);
        for(String name : uniqueUsernames)
            System.out.println(name);
    }

    public static List<String> usernamesSystem(List<String> u) {
        // Write your code here
        Hashtable<String, Integer> usernameBank = new Hashtable<>();
        List<String> uniqueUsernames = new ArrayList<>();

        for(String name : u){
            if(!usernameBank.containsKey(name)){
                uniqueUsernames.add(name);
                usernameBank.put(name, 1);
            }else{
                String uniqueName = name.concat(usernameBank.get(name).toString());
                uniqueUsernames.add(uniqueName);
                usernameBank.put(name, usernameBank.get(name) + 1);
            }
        }

        return uniqueUsernames;
    }
}

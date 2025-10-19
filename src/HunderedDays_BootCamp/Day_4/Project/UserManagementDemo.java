package HunderedDays_BootCamp.Day_4.Project;

import java.util.*;

public class UserManagementDemo {
    void main() {
//        Set<String> user1Roles = new HashSet<>(Arrays.asList("ADMIN","USER"));
//        Users user1 = new Users("Ram", user1Roles,true);

        List<Users> users = new ArrayList<>();
//        users.add(user1);
        users.add(new Users("Ram",
                new HashSet<>(Arrays.asList("ADMIN", "USER")),
                true));
        users.add(new Users("Alice",
                new HashSet<>(Arrays.asList("USER")),
                false));
        users.add(new Users("Bod",
                new HashSet<>(Arrays.asList("MANAGER")),
                true));

        Iterator<Users> iterator = users.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getActive() == false) {
                iterator.remove();
            }
        }
        //Print Active Users
        IO.println("ACTIVE USERS");
        for (Users user : users) {
            System.out.println(user.getName());
        }
        IO.println();
        //Print User as Per Role
        Map<String,Integer> roleCount = new HashMap<>();
        //ADMIN : 1
        //USER : 2

        for(Users user:users){
            for (String role : user.getRole()){
                roleCount.put(role, roleCount.getOrDefault(role,0)+1);
            }
        }
        IO.println("All roles");
        for(Map.Entry<String,Integer> entry : roleCount.entrySet()){
            IO.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}

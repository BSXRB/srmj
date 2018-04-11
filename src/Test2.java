import com.sun.org.apache.xpath.internal.SourceTree;

import java.nio.file.attribute.UserPrincipalLookupService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<User> users=new ArrayList<User>();
        User user1=new User("a",12);
        User user2=new User("b",11);
        User user3=new User("c",15);
        users.add(user1);
        users.add(user2);
        users.add(user3);
        Collections.sort(users, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                if (o1.age>o2.age) return 1;
                else if (o1.age<o2.age) return -1;
                else return 0;
            }
        });
        int a=0;
        for (;a<users.size();a++){
            System.out.println(users.get(a).toString());
        }
    }
}
class User{
    public User(String name,int age){
        this.name=name;
        this.age=age;
    }
    String name;
    int age;

    @Override
    public String toString() {
        return name;
    }
}

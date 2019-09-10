package cdflynn.android.sample.turn;

/**
 * Created by ${YangJunJin}
 * on 2019/9/10
 */
public class Entity {
    private String name;
    private int age;

    public Entity(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Entity setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Entity setAge(int age) {
        this.age = age;
        return this;
    }
}

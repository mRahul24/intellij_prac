package oct28;

public class Employee<Type1, Type2> {
    Type1 id;
    Type2 email;

    public Employee(Type1 name, Type2 email) {
        this.id = name;
        this.email = email;
    }

    public Type1 getId() {
        return id;
    }

    public void setId(Type1 id) {
        this.id = id;
    }

    public Type2 getEmail() {
        return email;
    }

    public void setEmail(Type2 email) {
        this.email = email;
    }
}

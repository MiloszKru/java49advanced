package library;

import java.util.Objects;

public abstract class Human {

    protected String name;
    protected String surname;


    public Human(String name, String surname) {
        String str = surname;
        char value = str.charAt(0);

        if (surname == null || (value >= 97 && value <= 122)) {
            throw new IllegalSurnameException(surname);
        }

        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return Objects.equals(name, human.name) &&
                Objects.equals(surname, human.surname);
    }
}

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

@Getter
@Setter
@ToString

public class Person {

       static int id = 0;

        private String name;
        private String surname;
        private int index;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.index = id;
        id++;
    }

    @Override
        public boolean equals( Object o ) {
            if (this == o) return true;
            if (!(o instanceof Person)) return false;
            Person person = (Person) o;
            return Objects.equals(name, person.name) &&
                    Objects.equals(surname, person.surname);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, surname);
        }


}


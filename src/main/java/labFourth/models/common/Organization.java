package labFourth.models.common;

import labFourth.models.human.Human;
import labFourth.models.human.Sex;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public abstract class Organization<T> {
    protected Human head;
    protected String name;
    protected List<T> structure = new ArrayList<>();

    protected Organization(String name) {
        this.name = name;
    }

    public void setHead(String firstName, String lastName, String patronymic, Sex sex) {
        this.head = new Human(firstName, lastName, patronymic, sex);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Organization)) return false;
        Organization<?> that = (Organization<?>) o;
        return Objects.equals(head, that.head) &&
                Objects.equals(name, that.name) &&
                Objects.equals(structure, that.structure);
    }

    @Override
    public int hashCode() {
        return Objects.hash(head, name, structure);
    }

    public void append(T entity) {
        structure.add(entity);
    }
}
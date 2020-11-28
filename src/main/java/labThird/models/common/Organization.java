package labThird.models.common;

import labThird.models.human.Human;
import labThird.models.human.Sex;

import java.util.ArrayList;
import java.util.List;


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

    public void append(T entity) {
        structure.add(entity);
    }
}
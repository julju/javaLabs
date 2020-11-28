package labThird.controllers;

import labThird.models.group.Group;

public class GroupCreator {
    public Group group;

    public GroupCreator(String name) {
        this.group = new Group(name);
    }
}

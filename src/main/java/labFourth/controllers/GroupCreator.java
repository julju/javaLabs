package labFourth.controllers;

import labFourth.models.group.Group;

public class GroupCreator {
    public Group group;

    public GroupCreator(String name) {
        this.group = new Group(name);
    }
}

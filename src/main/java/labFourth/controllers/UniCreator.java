package labFourth.controllers;

import labFourth.models.uni.Uni;

public class UniCreator {
    public Uni uni;

    public UniCreator(String name) {
        this.uni = new Uni(name);
    }
}

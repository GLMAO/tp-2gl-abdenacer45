package com.polytech.tp;

public class CoursEnLigne extends CoursDecorator {
    
    public CoursEnLigne(ICours cours) {
        super(cours);
    }

    @Override
    public String getDescription() {
        return coursDecorated.getDescription() + " (En ligne)";
    }

    @Override
    public double getDuree() {
        return coursDecorated.getDuree();
    }
}

class CoursEnAnglais extends CoursDecorator {
    
    public CoursEnAnglais(ICours cours) {
        super(cours);
    }

    @Override
    public String getDescription() {
        return coursDecorated.getDescription() + " (En anglais)";
    }

    @Override
    public double getDuree() {
        return coursDecorated.getDuree();
    }
}

class CoursMagistral extends CoursDecorator {
    
    public CoursMagistral(ICours cours) {
        super(cours);
    }

    @Override
    public String getDescription() {
        return coursDecorated.getDescription() + " (Magistral)";
    }

    @Override
    public double getDuree() {
        return coursDecorated.getDuree();
    }
}
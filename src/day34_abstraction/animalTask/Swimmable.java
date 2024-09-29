package day34_abstraction.animalTask;

public interface Swimmable {
    boolean canSwim = true;
    void swim(); // if any animal that can swim had the same impl. then I could make this as default method (right now it's public and abstract)
}

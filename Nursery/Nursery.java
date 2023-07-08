import java.util.ArrayList;

public class Nursery {
    String name;

    ArrayList<Animal> list_of_animals = new ArrayList<>();

    public ArrayList<Animal> getList_of_animals() {
        return list_of_animals;
    }

    public void setList_of_animals(ArrayList<Animal> list_of_animals) {
        this.list_of_animals = list_of_animals;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }


    public Nursery(String name, ArrayList<Animal> list_of_animals){
        this.name = name;
        this.list_of_animals = list_of_animals;
    }

    public Nursery(String name){
        this(name, new ArrayList<Animal>());
    }


    public void add_animal(Animal a){
        this.list_of_animals.add(a);
    }
}

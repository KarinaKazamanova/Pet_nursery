
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Create extends Menu {

    
    
    String[] pets = {"кот", "собака", "хомяк"};
    String [] pack_animals = {"лошадь","осел","верблюд"};

    public String description() {
        return "завести животное";
    }

    public void execute(Nursery n){
        List<Animal> animals = new ArrayList<>();
        animals.add(new Cat());
        animals.add(new Dog());
        animals.add(new Hamster());
        animals.add(new Horse());
        animals.add(new Camel());
        animals.add(new Donkey());

        System.out.println("Кого Вы хотите создать?");
        for (int i = 0; i < animals.size(); i ++){
            System.out.println(i + ": "+ animals.get(i).description());}

        Scanner scan = new Scanner(System.in);
        View view = new View();
        while (true){
            int int_animal = Integer.parseInt(scan.nextLine());
            if(0 <= int_animal || int_animal < animals.size()){
                for (int i = 0; i < pets.length; i++ ){
                    if(animals.get(int_animal).description().equals(pets[i])){
                    
                    List<String> info = view.get_pet_info();
                    Animal a = animals.get(int_animal).create(info);
                   
                    n.add_animal(a);
                    

                }}

                for (int i = 0; i < pack_animals.length; i++ ){
                    if(animals.get(int_animal).description().equals(pack_animals[i])){
                    
                    List<String> info = view.get_Pack_animal_info();
                    Animal a = animals.get(int_animal).create(info);
                
                    n.add_animal(a);
                    

               }}
            }
            else{
                System.out.println("Попробуйте заново");
               }

            

        }
        
    }
    }





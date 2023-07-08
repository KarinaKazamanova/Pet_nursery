import java.util.ArrayList;
import java.util.Arrays;

public class Pet extends Animal implements Creatable{
    private int id;
    private String name;
    private double weight;
    private String gender;
    private String  birth_day;
    private ArrayList<String> commands;
    private String speach = "звуки животного";
    private ArrayList<String> aceptable_commands = new ArrayList<>(Arrays.asList("голос", "бежать", "сидеть"));

    public void set_weight(float weight){
        this.weight = weight;
    }

    public double get_weight(){
        return weight;
    }

    public void set_gender(String gender){
        this.gender = gender;
    }

    public String get_gender(){
        return gender;
    }

    public void set_birth_day(String  b_day){
        this.birth_day = b_day;
    }

    public String  get_birth_day(){
        return birth_day;
    }

    public void set_id(int animal_id){
        this.id = animal_id;
    }

    public int get_id(){
        return id;
    }

    public void set_name(String animal_name){
        this.name = animal_name;
    }

    public String get_name(){
        return name;
    }

    public ArrayList<String> get_commands(){
        return commands;
    }

    public void set_commands(ArrayList<String> commands){
        this.commands = commands;
    }


    public Pet(int id, String name, 
                  double weight, String gender, 
                  String  birth_day, ArrayList<String> commands){
        
        this.id = id;
        this.name = name;
        this.weight = weight;
        this.gender = gender;
        this.birth_day = birth_day;
        this.commands = commands;

    }

    public Pet(int id, String name, double weight, String gender, String  birth_day){
        
        this(id, name, weight, gender, birth_day, new ArrayList<>());
        
    }

    public Pet(){
        this(0, "", 0.0,"","",new ArrayList<>());
    }

    public void new_command( String command){
        
        
            this.commands.add(command);
        
    }
    
    public String speak() {
        if (this.commands.contains("голос")){
            return speach;
        }
        else{
            return "...";
        }
    }

    public String run() {
        if (this.commands.contains("бежать")){
            return "убежал, теперь ищи";
        }
        else{
            return "стоит на месте";
        }
    }

    public String sit() {
        if (this.commands.contains("сидеть")){
            return "сел";
        }
        else{
            return "я так не умею";
        }
    }

    @Override
    public String description() {
        return "домашнее животное";
    }

    @Override
    public Pet create(ArrayList<String> list) {
        return new Pet(Integer.parseInt(list.get(0)) ,
            list.get(1), Double.parseDouble(list.get(2)),list.get(3), list.get(4));
    }

    public String toString(){
        return String.format("Имя: %s\nПол: %s\nДата рождения: %ы", name, gender, birth_day);
    }
}

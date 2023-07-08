import java.util.ArrayList;

public class Pack_animal extends Animal {
    private int id;
    private String name;
    private double weight;
    private String gender;
    private String  birth_day;
    private ArrayList<String> commands;
    private String speach = "звуки животного";
    private double load_capacity;

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

    public double getLoad_capacity() {
        return load_capacity;
    }

    public void setLoad_capacity(double load_capacity) {
        this.load_capacity = load_capacity;
    }

     public ArrayList<String> get_commands(){
        return commands;
    }

    public void set_commands(ArrayList<String> commands){
        this.commands = commands;
    }

    public void new_command( String command){
        
        
            this.commands.add(command);
        
    }

    public Pack_animal(int id, String name, 
                       double weight, String gender, String birth_day, 
                       ArrayList<String> commands, double load_capacity) {
        this.id = id;
        this.name = name;
        this.weight = weight;
        this.gender = gender;
        this.birth_day = birth_day;
        this.commands = commands;
        this.load_capacity = load_capacity;
    }
    public Pack_animal(int id, String name, 
                       double weight, String gender, String birth_day, 
                       double load_capacity){
            this(id, name, weight, gender, birth_day, new ArrayList<>(), load_capacity);
                       }

    public Pack_animal(){
        this(0, "", 0.0, "", "", 0.0);
    }

   
    public String speak() {
        if (this.commands.contains("голос")){
            return this.speach;
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

    
    public String description() {
        return "вьючное животное";
    }

    
    public Pack_animal create(ArrayList<String> list) {
        return new Pack_animal(Integer.parseInt(list.get(0)), 
        list.get(1), Double.parseDouble(list.get(2)), list.get(3), list.get(4), 
        Double.parseDouble(list.get(5)));
    }


    @Override

    public String toString(){
        return String.format("Имя: %s\nПол: %s\nДата рождения: %s\n Грузоподъемность: %d", name, gender, birth_day, load_capacity);
    }

}

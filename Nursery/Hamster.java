import java.util.ArrayList;

public class Hamster extends Pet {
    
    private String speach = "хрум-хрум";
    
    public Hamster(int id, String name, double weight, String gender, String birth_day, ArrayList<String> commands) {
        super(id, name, weight, gender, birth_day, commands);
        
    }
    public Hamster(int id, String name, double weight, String gender, String birth_day) {
        super(id, name, weight, gender, birth_day);
        
    }
    public Hamster(){
        super();
    }
    @Override
    public String speak() {
        if (this.get_commands().contains("голос")){
            return speach;
        }
        else{
            return "...";
        }
    }

    @Override
    public String description() {
       return "хомяк";
    }

    @Override
    public Hamster create(ArrayList<String> list) {
        return new Hamster(Integer.parseInt(list.get(0)) ,
            list.get(1), Double.parseDouble(list.get(2)),list.get(3), list.get(4));
    
    }
}

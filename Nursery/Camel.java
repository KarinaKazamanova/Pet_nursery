import java.util.ArrayList;

public class Camel extends Pack_animal {
    private String speach = "пф-р-р";

    public Camel(int id, String name, double weight, String gender, String birth_day, ArrayList<String> commands,
            double load_capacity) {
        super(id, name, weight, gender, birth_day, commands, load_capacity);
        
    }

    public Camel(int id, String name, double weight, String gender, String birth_day,
            double load_capacity) {
                this(id, name, weight, gender, birth_day, new ArrayList(), load_capacity);
            }

    public Camel(){
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
       return "верблюд";
    }
    
    @Override
    public Camel create(ArrayList<String> list) {
        return new Camel(Integer.parseInt(list.get(0)) ,
            list.get(1), Double.parseDouble(list.get(2)),list.get(3), list.get(4), Double.parseDouble(list.get(5)));
      
    }

    
}

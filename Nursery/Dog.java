import java.util.ArrayList;

public class Dog extends Pet{
    
    private String speach = "гав-гав";
    
    public Dog(int id, String name, double weight, String gender, String birth_day, ArrayList<String> commands) {
        super(id, name, weight, gender, birth_day, commands);
        
    }
    public Dog(int id, String name, double weight, String gender, String birth_day) {
        super(id, name, weight, gender, birth_day);
        
    }
    
    public Dog(){
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
       return "собака";
    }
    
    @Override
    public Dog create(ArrayList<String> list) {
        return new Dog(Integer.parseInt(list.get(0)) ,
            list.get(1), Double.parseDouble(list.get(2)),list.get(3), list.get(4));
      
    }
}

import java.util.Scanner;

public class Teach extends Menu {

    String[] availablle_commannds = {"голос", "бежать", "сидеть"};

    public String description() {
        return "обучить новой команде";
    }
 
    public void execute(Nursery n){
            

            System.out.println("Кого вы хотите обучить?");
            for (int i = 0; i < n.list_of_animals.size(); i ++){
                System.out.println(i + ": "+ n.list_of_animals.get(i).description());}

            Scanner scan = new Scanner(System.in);
            
            while (true){
                int int_animal = Integer.parseInt(scan.nextLine());
                if(0 <= int_animal || int_animal < n.list_of_animals.size()){
                    System.out.println("Какой команде вы хотите обучить?");
                    while (true){
                        String new_command = scan.nextLine();
                        for (int i = 0; i < n.list_of_animals.size(); i ++){
                            if (new_command.equals(availablle_commannds[i])){
                                n.list_of_animals.get(i).new_command(new_command);
                                break;
                            }
                            else{
                                System.out.println("Такую команду они выучить не могут, попробуйте снова");
                            }
                        } 

                    }

                }
                else{
                    System.out.println("Попробуйте заново");
                }

                

            }
            
        }
    
}

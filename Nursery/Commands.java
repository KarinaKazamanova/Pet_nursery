import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Commands extends Menu {
   

   public String description() {
        return "список команд";
    }
 
    public void execute(Nursery n){
            

            System.out.println("У какого животного вы хотите увидетть список команд?");
            for (int i = 0; i < n.list_of_animals.size(); i ++){
                System.out.println(i + ": "+ n.list_of_animals.get(i).description());}

            Scanner scan = new Scanner(System.in);
            
            while (true){
                int int_animal = Integer.parseInt(scan.nextLine());
                if(0 <= int_animal || int_animal < n.list_of_animals.size()){
                    System.out.println(n.list_of_animals.get(int_animal).get_commands());
                   
                }
                else{
                    System.out.println("Попробуйте заново");
                }

                

            }
            
        }
    }


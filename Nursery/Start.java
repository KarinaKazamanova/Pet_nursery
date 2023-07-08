import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;




public class Start {
    
        
    public void Button_click(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Назовите свой питомник");
        String nursery_name = scan.nextLine();
        Nursery nursery = new Nursery(nursery_name);

        List<Menu> menu = new ArrayList<>();
        menu.add(new Create());
        menu.add(new Teach());
        menu.add(new Create());
        System.out.println("Что Вы хотите сделать?");
            for (int i = 0; i < menu.size(); i ++){
                System.out.println(i + ": " + menu.get(i).description());}

            
            
            while (true){
                int int_command = Integer.parseInt(scan.nextLine());
                if(0 <= int_command || int_command < menu.size()){
                    
                    menu.get(int_command).execute(nursery);


                }
        




    
}

    }

}
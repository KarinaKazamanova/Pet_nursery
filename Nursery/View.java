import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class View {
    

    public ArrayList<String> get_pet_info(){

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите имя животного");
        String name = new String(scan.nextLine());
        System.out.println("Введите вес животного");
        String weight = new String(scan.nextLine());
        System.out.println("Введите пол животного");
        String gender = new String(scan.nextLine());
        System.out.println("Введите дату рождения животного");
        String b_day = new String(scan.nextLine());
        
        ArrayList<String> input_info = new ArrayList<>();
        Random r = new Random();
        input_info.add(Integer.toString(r.nextInt(100000)));
        input_info.add(name);
        input_info.add(weight);
        input_info.add(gender);
        input_info.add(b_day);


        return input_info;

    }

    public ArrayList<String> get_Pack_animal_info(){

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите имя животного");
        String name = new String(scan.nextLine());
        System.out.println("Введите вес животного");
        String weight = new String(scan.nextLine());
        System.out.println("Введите пол животного");
        String gender = new String(scan.nextLine());
        System.out.println("Введите грузоподъемонсть животного");
        String load_capacity = new String(scan.nextLine());
        System.out.println("Введите дату рождения животного");
        String b_day = new String(scan.nextLine());
        
        ArrayList<String> input_info = new ArrayList<>();
        Random r = new Random();
        input_info.add(Integer.toString(r.nextInt(100000)));
        input_info.add(name);
        input_info.add(weight);
        input_info.add(gender);
        input_info.add(load_capacity);
        input_info.add(b_day);


        return input_info;

    }
}


import entity.Category;
import repository.CategoryRepository;
import java.sql.SQLException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws SQLException {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Name ni kiriting :");
        String name=scanner.nextLine();
        scanner=new Scanner(System.in);
        System.out.print("Type ni kiriting :");
        String type = scanner.nextLine();
        System.out.print("N_name ni kiriting :");
        String n_name=scanner.nextLine();
        CategoryRepository.callFunction(name,type,n_name);
        System.out.println("Update qilindi");


//        System.out.println(CategoryRepository.addCategory(id,name));
//        System.out.println("Category qo'shildi");

        for (Category category : CategoryRepository.getCategories()) {
            System.out.println(category);
        }


    }
}

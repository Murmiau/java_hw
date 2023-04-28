import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class les2ex3 {
    public static void main(String[] args) {
        Scanner my_sc = new Scanner(System.in);
        System.out.print("Введите число строк в книге: ");
        int num_str = my_sc.nextInt();
        List<String> recipes = new ArrayList<>();
        my_sc.nextLine();
        for (int i = 0; i < num_str; i++) {
            System.out.print("Введите строку:  ");
            String my_str = my_sc.nextLine();
            recipes.add(my_str.toLowerCase());
        }
        System.out.print("Введите число продуктов, на которые аллергия: ");
        int allerg = my_sc.nextInt();
        my_sc.nextLine();
        List<String> recipe = new ArrayList<>();
        List<String> change = new ArrayList<>();
        for (int i = 0; i < allerg; i++) {
            System.out.print("Введите продукт и его замену через дефис: ");
            String products = my_sc.nextLine();
            String[] prods = products.split("-");
            recipe.add(prods[0].trim());
            change.add(prods[1].trim());
        }
        my_sc.close();
        for (int i = 0, n = recipe.size(); i < n; i++) {
            recipe.add(recipe.get(i).substring(0, 1).toLowerCase() + recipe.get(i).substring(1));
            change.add(change.get(i).substring(0, 1).toLowerCase() + change.get(i).substring(1));
        }
        List<String> new_recipes = new ArrayList<>();
        for (int i = 0; i < recipes.size(); i++) {
            String new_recipe = recipes.get(i);
            for (int j = 0; j < recipe.size(); j++)
                new_recipe = new_recipe.replaceAll(recipe.get(j), change.get(j));
            new_recipes.add(new_recipe);
        }
        for (String new_recipe : new_recipes)
            System.out.println(new_recipe);
    }
}

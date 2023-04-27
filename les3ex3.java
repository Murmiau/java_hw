import java.util.*;

public class les3ex3 {
    public static void main(String[] args) {
        Scanner my_sc = new Scanner(System.in);
        System.out.print("Введите размер списка: ");
        int capacity = my_sc.nextInt();
        List<String> planets = new ArrayList<>(Arrays.asList("Земля", "Сатурн", "Уран",
                "Нептун", "Венера", "Меркурий", "Марс", "Юпитер"));
        List<String> result_list = CreateNewList(capacity, planets);
        System.out.println("Список планет:" + result_list);
        System.out.println("Земля: " + Collections.frequency(result_list, "Земля")
                + "\nСатурн: " + Collections.frequency(result_list, "Сатурн")
                + "\nУран: " + Collections.frequency(result_list, "Уран")
                + "\nНептун: " + Collections.frequency(result_list, "Нептун")
                + "\nВенера: " + Collections.frequency(result_list, "Венера")
                + "\nМеркурий: " + Collections.frequency(result_list, "Меркурий")
                + "\nМарс: " + Collections.frequency(result_list, "Марс")
                + "\nЮпитер: " + Collections.frequency(result_list, "Юпитер"));
    }
    public static List<String>CreateNewList(int capacity, List<String>planets){
        List<String>my_list = new ArrayList<>(capacity);
        Random random = new Random();
        for (int i = 0; i < capacity; i++) {
            int index = random.nextInt(planets.size());
            my_list.add(planets.get(index));
        }
        return my_list;
    }
}
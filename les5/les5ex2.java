package les5;
import java.util.*;
import java.util.stream.Collectors;

public class les5ex2 {
    public static void main(String[] args) {
        String[] personnel = { "Иван Иванов", "Светлана Петрова", "Кристина Белова", "Анна Мусина",
                "Анна Крутова", "Иван Юрин", "Петр Лыков", "Павел Чернов", "Петр Чернышов",
                "Мария Федорова", "Марина Светлова", "Мария Савина", "Мария Рыкова", "Марина Лугова",
                "Анна Владимирова", "Иван Мечников", "Петр Петин", "Иван Ежов" };
        System.out.println("Список имен: \n" + Arrays.toString(personnel));
        Map<String, Integer> fullnames = new TreeMap<>();
        count(personnel, fullnames);
        sorted_personell(fullnames);
    }

    public static void count(String[] person, Map<String, Integer> fullnames) {
        for (String person_name : person) {
            String name = person_name.split(" ")[0];
            if (fullnames.containsKey(name)) {
                fullnames.put(name, fullnames.getOrDefault(name, 0) + 1);
            } else {
                fullnames.put(name, 1);
            }
        }
    }

    public static void sorted_personell(Map<String, Integer> fullnames) {
        Map<String, Integer> sort_people = fullnames.entrySet().stream()
                .sorted(Comparator.comparingInt(e -> -e.getValue()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> {
                            throw new AssertionError();
                        },
                        LinkedHashMap::new));
        System.out.println("Имена встречаются со следующей частотой:\n" + sort_people);
    }
}
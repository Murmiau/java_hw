package hw6;

import java.util.*;

public class Laptop {
    private List<Brand> brands;
    private String model;
    private int operativeMemory;
    private int hardDisk;
    private String operationSystem;
    private String color;

    public Laptop() {
    }

    public Laptop(String model, int operativeMemory, int hardDisk, String operationSystem, String color) {
        this.brands = new ArrayList<>();
        this.model = model;
        this.operativeMemory = operativeMemory;
        this.hardDisk = hardDisk;
        this.operationSystem = operationSystem;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public int getOperativeMemory() {
        return operativeMemory;
    }

    public int getHardDisk() {
        return hardDisk;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public String getColor() {
        return color;
    }

    public void addBrand(Brand brand) {
        brands.add(brand);
    }

    public Set<Laptop> newFilter(Set<Laptop> laptop) {
        Scanner scan = new Scanner(System.in);
        Set<Laptop> listLaptop = new HashSet<>(laptop);

        System.out.println("""
                Выберите по какому критерию будете производить поиск ноутбука и укажите цифру:
                1. Размер жёсткого диска
                2. Оперативная память
                3. Операционная система
                4. Цвет
                5. Показать все ноутбуки""");
        String userRequest = scan.nextLine();
        int intuserRequest = Integer.parseInt(userRequest);
        if (intuserRequest < 6) {
            for (int i = 0; i < userRequest.length(); i++) {
                if (1 == Character.getNumericValue(userRequest.charAt(i))) {
                    System.out.println("Укажите размер жёсткого диска: 256, 512, 1024 (гб)");
                    String enterHardDisk = scan.nextLine();
                    int intParseEnterHardDisk = Integer.parseInt(enterHardDisk);
                    for (Laptop tempLaptop : laptop) {
                        if (intParseEnterHardDisk != tempLaptop.hardDisk) {
                            listLaptop.remove(tempLaptop);
                        }
                    }
                }
                if (2 == Character.getNumericValue(userRequest.charAt(i))) {
                    System.out.println("Укажите желаемое количество оперативной памяти: 4, 8, 16 (гб)");
                    String enterOperativeMemory = scan.nextLine();
                    int intParseEnterOperativeMemory = Integer.parseInt(enterOperativeMemory);
                    for (Laptop tempLaptop : laptop) {
                        if (intParseEnterOperativeMemory != tempLaptop.operativeMemory) {
                            listLaptop.remove(tempLaptop);
                        }
                    }
                }
                if (3 == Character.getNumericValue(userRequest.charAt(i))) {
                    System.out.println(
                            "Укажите желаемую операционную систему: Windows 10, Windows 11, Linux, MacOS, нет");
                    String enterOperationSystem = scan.nextLine();
                    for (Laptop tempLaptop : laptop) {
                        if ((!enterOperationSystem.equals(tempLaptop.operationSystem))) {
                            listLaptop.remove(tempLaptop);
                        }
                    }
                }
                if (4 == Character.getNumericValue(userRequest.charAt(i))) {
                    System.out.println("Укажите желаемый цвет ноутбука: серый, черный, серебристый, белый, золотой");
                    String enterColor = scan.nextLine();
                    for (Laptop tempLaptop : laptop) {
                        if (!(enterColor.equals(tempLaptop.color))) {
                            listLaptop.remove(tempLaptop);
                        }
                    }
                }
            }
            return listLaptop;
        } else {
            System.out.println("Ошибка, вы ввели неверное значение!");
        }
        return null;
    }

    @Override
    public String toString() {
        return "\nМодель ноутбука: " + model +
                "\nБренд: " + brands +
                "\nОперативная память: " + operativeMemory + " гб" +
                "\nЖёсткий диск: " + hardDisk + " гб" +
                "\nОперационная система: " + operationSystem +
                "\nЦвет: " + color +
                "\n";
    }
}

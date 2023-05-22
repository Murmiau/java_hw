package hw6;

import java.util.HashSet;
import java.util.Set;

public class Laptop_main {
    public static void main(String[] args) {
        Laptop MSI_Pulse_GL66 = new Laptop("MSI Pulse GL66", 8, 512,
                "нет", "серый");
        Brand brandMSI = new Brand("MSI");
        MSI_Pulse_GL66.addBrand(brandMSI);
        Laptop ASUS_X415EA = new Laptop("ASUS X415EA", 4, 256,
                "Windows 11", "серый");
        Brand brandASUS = new Brand("ASUS");
        ASUS_X415EA.addBrand(brandASUS);
        Laptop LG_Gram_17Z90P = new Laptop("LG Gram 17Z90P", 16, 1024,
                "Windows 11", "черный");
        Brand brandLG = new Brand("LG");
        LG_Gram_17Z90P.addBrand(brandLG);
        Laptop MSI_A12UC = new Laptop("MSI A12UC", 16, 512,
                "Windows 10", "черный");
        MSI_A12UC.addBrand(brandMSI);
        Laptop HP_Laptop_15 = new Laptop("HP Laptop 15", 8, 1024,
                "Windows 10", "серебристый");
        Brand brandHP = new Brand("HP");
        HP_Laptop_15.addBrand(brandHP);
        Laptop HP_Pavilion_Aero = new Laptop("HP Pavilion Aero", 16, 512,
                "Windows 11", "белый");
        HP_Pavilion_Aero.addBrand(brandHP);
        Laptop Maibenben_P615 = new Laptop("Maibenben P615", 8, 256,
                "Linux", "серебристый");
        Brand brandMaibenben = new Brand("Maibenben");
        Maibenben_P615.addBrand(brandMaibenben);
        Laptop Maibenben_X525 = new Laptop("Maibenben X525", 8, 512,
                "Linux", "черный");
        Maibenben_X525.addBrand(brandMaibenben);
        Laptop Apple_MacBook_Air_13 = new Laptop("Apple MacBook Air 13", 8, 256,
                "MacOS", "золотой");
        Brand brandApple = new Brand("Apple");
        Apple_MacBook_Air_13.addBrand(brandApple);
        Laptop Apple_MacBook_Pro_14 = new Laptop("Apple MacBook Pro 14", 16, 512,
                "MacOS", "серый");
        Apple_MacBook_Pro_14.addBrand(brandApple);

        Set<Laptop> laptop = new HashSet<>();
        laptop.add(MSI_Pulse_GL66);
        laptop.add(ASUS_X415EA);
        laptop.add(LG_Gram_17Z90P);
        laptop.add(MSI_A12UC);
        laptop.add(HP_Laptop_15);
        laptop.add(HP_Pavilion_Aero);
        laptop.add(Maibenben_P615);
        laptop.add(Maibenben_X525);
        laptop.add(Apple_MacBook_Air_13);
        laptop.add(Apple_MacBook_Pro_14);

        Laptop FilterLaptop = new Laptop();
        System.out.println(FilterLaptop.newFilter(laptop));
    }
}

package treeSetLinkedListSuitcase;

import java.util.*;

public class DemoSuitcase {
    public static void main(String[] args) {
        Set<Suitcase> suitcaseSet = new TreeSet<>();
        List<Suitcase> suitcaseList = new LinkedList<>();

        Suitcase suitcase1 = new Suitcase("aluminium","XL", "silver");
        Suitcase suitcase2 = new Suitcase("plastic","M", "black");
        Suitcase suitcase3 = new Suitcase("cordoba","XL", "grey");
        Suitcase suitcase4 = new Suitcase("plastic","XL", "blue");
        Suitcase suitcase5 = new Suitcase("aluminium","L", "silver");
        Suitcase suitcase6 = new Suitcase("cordoba","S", "black");

        suitcaseSet.add(suitcase1);
        suitcaseSet.add(suitcase2);
        suitcaseSet.add(suitcase3);
        suitcaseSet.add(suitcase4);
        suitcaseSet.add(suitcase5);
        suitcaseSet.add(suitcase6);

        suitcaseList.add(suitcase1);
        suitcaseList.add(suitcase2);
        suitcaseList.add(suitcase3);
        suitcaseList.add(suitcase4);
        suitcaseList.add(suitcase5);
        suitcaseList.add(suitcase6);

        System.out.println("Чемоданы до сортировки: ");
        System.out.println();
        for (Suitcase suitcase : suitcaseSet)
        System.out.println(suitcase);
        System.out.println("-".repeat(63));

        System.out.println("Чемоданы после сортировки: ");
        System.out.println();
        Collections.sort(suitcaseList);
        for (Suitcase suitcase : suitcaseList){
            System.out.println(suitcase);
        }
        System.out.println("=".repeat(63));
    }
}

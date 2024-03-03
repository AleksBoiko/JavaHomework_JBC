package treeSetFlat;

import java.util.Comparator;
import java.util.TreeSet;

public class DemoFlat {
    public static void main(String[] args) {
        TreeSet<Flat> flatTreeSet = new TreeSet<>(Comparator.comparing(Flat::getBedrooms).thenComparing(Flat::getArea));

        flatTreeSet.add(new Flat(120, 3));
        flatTreeSet.add(new Flat(80, 3));
        flatTreeSet.add(new Flat(150, 4));
        flatTreeSet.add(new Flat(100, 3));
        flatTreeSet.add(new Flat(65, 2));

        for (Flat flat : flatTreeSet){
            System.out.println(flat);
        }
    }
}

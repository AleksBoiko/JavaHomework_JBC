package treeSetLinkedListSuitcase;

public class Suitcase implements Comparable<Suitcase>{
    String material;
    String size;
    String color;

    public Suitcase(String material, String size, String color) {
        this.material = material;
        this.size = size;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Чемодан " + " материал: = " + material + " / размер: = " + size + " / цвет: = " + color;
    }

    @Override
    public int compareTo(Suitcase other) {
        if (!this.size.equals(other.size)){
            return this.size.compareTo(other.size);
        } else if (!this.material.equals(other.material)) {
            return this.material.compareTo(other.material);
        } else {
            return this.color.compareTo(other.color);
        }

    }
}

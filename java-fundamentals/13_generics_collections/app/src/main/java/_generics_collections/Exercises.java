
package _generics_collections;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Exercises {
    private static class Dinosaur implements Comparable<Dinosaur> {
        private String species;
        private int weight;
        private int height;

        public int getWeight() {
            return this.weight;
        }

        private boolean predator;

        public boolean isPredator() {
            return predator;
        }

        public void setPredator(boolean predator) {
            this.predator = predator;
        }

        Dinosaur(String species, int weight, int height, boolean predator) {
            this.species = species;
            this.weight = weight;
            this.height = height;
            this.predator = predator;
        }

        @Override
        public int compareTo(Dinosaur otherDino) {
            if (otherDino.isPredator()) {
                if (this.predator) {
                    return Integer.compare(this.weight, otherDino.getWeight());
                }
                return -1;
            }

            if (this.predator) {
                return 1;
            }

            return Integer.compare(this.weight, otherDino.getWeight());
        }

        public String getSpecies() {
            return species;
        }

        public void setSpecies(String species) {
            this.species = species;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }

    }

    private static class Crate<T> {
        private T content;

        public T getContent() {
            return content;
        }

        public void setContent(T content) {
            this.content = content;
        }

        Crate(T content) {
            this.content = content;
        }
    }

    public static void main(String[] args) {
        Print("Exercises for generics");

        List<Dinosaur> myDinos = new ArrayList<Dinosaur>();

        PriorityQueue<Dinosaur> myDinoQue = new PriorityQueue<Dinosaur>();

        Dinosaur trex = new Dinosaur("trex", 2000, 20, true);
        Dinosaur velociraptor = new Dinosaur("velociraptor", 500, 7, true);
        Dinosaur brachiosaurus = new Dinosaur("brahciosaurus", 2500, 25, false);
        Dinosaur stegosaurus = new Dinosaur("stegosaurus", 1500, 15, false);

        myDinoQue.add(trex);
        myDinoQue.add(velociraptor);
        myDinoQue.add(brachiosaurus);
        myDinoQue.add(stegosaurus);

        while (!myDinoQue.isEmpty()) {
            Dinosaur dinosaur = myDinoQue.poll();
            System.out.println("Dequeued: " + dinosaur.getSpecies());
        }
    }

    public static void Print(Object obj) {
        System.out.println(obj);
    }
}

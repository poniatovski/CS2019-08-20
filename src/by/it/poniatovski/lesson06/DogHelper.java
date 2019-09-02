package by.it.poniatovski.lesson06;

public class DogHelper {
    static void printAllNames(Dog[] dogs) {
        for ( Dog dog : dogs) {
            System.out.print(dog.getName()+" ");

        }
        System.out.println();



    }

    static double averageAge(Dog[] dogs){
        double s=0;
        for (Dog dog : dogs) {
            s=s+dog.getAge();
        }

        return s/dogs.length;

    }
}

package by.it.pmaryshev.lesson06;

public class DogHelper {
    static void printAllNames(Dog[] dogs){
        for (Dog dog : dogs) {
            System.out.print(dog.getName()+" ");
        }
        System.out.println();
    }
    static double averageAge(Dog[] dogs){
        double res=0;
        for (Dog dog : dogs) {
            res+=dog.getAge();
        }

        return res/ dogs.length;
    }
}

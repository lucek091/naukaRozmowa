import java.lang.reflect.Array;
import java.util.*;


public class Solution {

    public static void main(String[] args) {

    //FabrykaPracownikow fabryka =new FabrykaPracownikow();
        Pracownik Adam=FabrykaPracownikow.stworzPracownika("Adam","Kowalski",7);
        //Pracownik Tomasz=fabryka.stworzPracownika("Tomasz","Nowak",2);
        System.out.println(Adam.getImie()+" "+Adam.getNazwisko()+" "+ Adam.getStazPracy()+" "+Adam.getInfo());
        //System.out.println(Tomasz.getImie()+" "+Tomasz.getNazwisko()+" "+ Tomasz.getStazPracy()+" "+Tomasz.getInfo());


//       Car samochod=new Car.Builder(240).carColor("czerwony").carName("seat").carModel(120).build();
//        System.out.print(samochod);

//        Map<String, Integer> mojaMapa=new HashMap<String,Integer>();
//
//        mojaMapa.put("Michał", 10000);
//        mojaMapa.put("Lukasz", 2500);
//        mojaMapa.put("Artur", 2000);
//        mojaMapa.put("Kasia", 5000);
//
//        Set set=mojaMapa.entrySet();
//
//        Iterator iterator=set.iterator();
//
//        while (iterator.hasNext()){
//            Map.Entry entry=(Map.Entry)iterator.next();
//
//            System.out.println("Key: "+entry.getKey()+" value: "+entry.getValue());
//        }

//        Integer[] unsorted = {1, 2,3,4,5,6,7,8,9};
//        Collection<Integer> kolekcja=new ArrayList<Integer>();
//
//        String[] unsorted2={"mama", "tata","siostra","brat"};
//        ArrayList<String> kolekcja2=new ArrayList<String>();
//
//
//        fromArrayToCollection(unsorted2, kolekcja2);
//        System.out.print(Arrays.toString(kolekcja2.toArray()));

        //bubbleSort(unsorted);
        //System.out.print(Arrays.toString(unsorted));

    }

    public static int Fibonacci(int x) {

        if (x == 0) return 0;
        if (x == 1 || x == 2) return 1;

        else {
            return Fibonacci(x - 1) + Fibonacci(x - 2);
        }
    }

    public static boolean primeNumber(int x) {
        if (x == 0 || x == 1 || x == 3) return false;
        else {
            int y = (x / 2) + 1;
            for (int i = 2; i < y; i++) {
                if (x % i == 0) return false;
            }
        }
        return true;
    }

    public static boolean isPalindrone(String s1) {
        int n = s1.length();
        for (int i = 0; i < n / 2; i++) {
            if (s1.charAt(i) != s1.charAt(n - 1 - i)) return false;
        }
        return true;
    }

    public static int factorialNumber(int x) {
        if (x == 0) return 1;
        else return ((x) * factorialNumber(x - 1));
    }

    public static void selectionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                int smallerNumber = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = smallerNumber;
                i = 0;
            }
        }
    }

    public static String reverseWord(String word) {
        if (word == null || word.length() <= 0) return word;
        else {
            return reverseWord(word.substring(1)) + word.charAt(0);
        }

    }

    public static void fizzBuzz(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % (5 * 3) == 0) System.out.println(i + ": FizzBuzz");
            else if (i % 5 == 0) System.out.println(i + ": Buzz");
            else if (i % 3 == 0) System.out.println(i + ": Fizz");
            else System.out.println(i);
        }
    }


    public static void bubbleSort(int[] arr) {

        boolean swap = true;
        int temp;
        int range = arr.length - 1;
        int count=0;

        while (swap) {
            swap = false;
            for (int i = 0; i < range; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    count++;
                    swap = true;
                }
            }

        }

        System.out.println("Array is sorted in "+count+" swaps");
        System.out.println("First element "+arr[0]);
        System.out.println("Last element "+arr[range]);

    }

   public static <T extends Comparable<T>> int counterGreaterThan (T[] anArray, T elem){
       int count=0;
       for (T e: anArray){
           if (e.compareTo(elem)>0){
               count++;
           }
       }
       return count;
    }


    public static <T> void fromArrayToCollection (T [] anArray, Collection<T> anCollection){
        for (T elem: anArray){
            anCollection.add(elem);
        }
    }


}


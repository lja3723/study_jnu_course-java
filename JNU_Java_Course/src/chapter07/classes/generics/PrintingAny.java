package chapter07.classes.generics;

public class PrintingAny {
    public <T> void printArray(T[] arr){
        System.out.println();
        for(T i: arr)
             System.out.print(i + " ");
    }
}

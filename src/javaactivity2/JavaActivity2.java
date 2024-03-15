package javaactivity2;
public class JavaActivity2 {

    public static void main(String[] args) {
        int[] array = {50, 30, 40, 10, 230};
        
        System.out.println("Firt Array Element: " + array[0]);
        System.out.println("Second Array Element is: " + array[1]);
        System.out.println("Third Array Element is: " + array[2]);
        System.out.println("Fourth Array Element is: " + array[3]);
        System.out.println("Fifth Array Element is: " + array[4]); 
       
        
        int sum = array[0] + array[1] + array[2] + array[3] + array[4];
        System.out.println("\nThe Sum of all Arrays: " + sum);
        
        int max = Math.max(array[0], Math.max(array[1], Math.max(array[2], Math.max(array[3], array[4]))));
        System.out.println("The Maximum Value is: " + max);
        
        
        
    }
    
}

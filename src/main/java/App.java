import java.util.Random;

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class App {
    public String getGreeting() {
        return "Hello world.";
    }


    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        float f1 = (float) 3.14;
        System.out.println(f1);
        long i1 = 2000000007204545454L;
        System.out.println(i1);
        Random r;
        r = new Random();
        System.out.println(r.nextLong());

        int count = 0;

        for (int i = 1; i < 20; i = i + 1) {
            int i2 = r.nextInt();
            if (i2 % 2 == 1) {
                System.out.print("1");
            } else {
                count = count + 1;
                System.out.print("0");
                if (count == 10)
                    break;

            }
        }

        int i2 = r.nextInt();
        if (i2 % 2 == 1) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }

        String s = new String("hello");
        System.out.println(s);
        char[] charArray = s.toCharArray();
        int size = s.length();
        for (int i = 0; i < size / 2; i++) {
            int x = size - i - 1;
            swap(charArray, i, x);

        }
        System.out.println(charArray);

        int[] a = {0, 1, 2, 3, 4, 5};
        for (int i = 0; i < a.length / 2; i++) {
            int x = i + a.length / 2;
            swap(a, i, x);
        }
        printArray(a);


        int [] m = new int[20];
        m [0] = 1;
        m [1] = 2;

        /* variant 1*/
        /* for (int i = 2; i < 20; i++){
            int x = m[i-1] + m[i-2];
            m[i] = x;
        } */

        /* varinat 2*/
        /* int i = 2;
        while (i<20){
            int x = m[i-1] + m[i-2];
            m[i] = x;
            i++;
        }*/

        /*variant 3*/
        int  i=2;
        do{
            int x = m[i-1] + m[i-2];
            m[i] = x;
            i++;
        }
        while (i<20);
        printArray(m);


        int x=1,y=2;
        for (i = 2; i < 20; i++){
            int z = y+x;
        System.out.print(z +" ");
         x = y;
         y = z;
        }




    }

    private static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }


    private static void swap(int[] charArray, int i, int x) {
        int buffer = charArray[i];
        charArray[i] = charArray[x];
        charArray[x] = buffer;


    }


    private static void swap(char[] charArray, int i, int x) {
        char buffer = charArray[i];
        charArray[i] = charArray[x];
        charArray[x] = buffer;


    }


}

class App2 {
    int kvadrat(int valuekvadrat) {
        int resultat = valuekvadrat * valuekvadrat;
        return resultat;
    }
}
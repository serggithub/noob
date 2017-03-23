/**
 * Created by ProVM on 23.03.2017.
 */
public class Prime {
    void main(int x,int y){
        for (int i=x; i<=y; i++) {
        int h = (int) Math.sqrt(i);
            boolean isPrime = true;

            for (int  v=2; v<=h; v++){
                if (i%v == 0) {
                    isPrime = false;
                    break;
                }

            }
            if (isPrime == true)
            System.out.print(i+",");

        }
    }
}

// already know recursion
// its just a question i am solving here 

// x to the power N using recursion in O(logn) complexity  or Stack height = logn 
public class R1_XtoPowerN_logn {

    public static int fact(int x, int n) {

        // Base condition // N/(2^$) = 1 -> N = 2^$ -> $ = log(base 2)N
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }

        // in every recursion the power N will be N/2
        // if even power : N = N/2 * N/2
        if (n % 2 == 0) {
            return fact(x, n / 2) * fact(x, n / 2);
        }

        // if odd power : N = N/2 * N/2 * N
        else {
            return fact(x, n / 2) * fact(x, n / 2) * x;
        }
    }

    public static void main(String[] args) {
        System.out.println(fact(4, 6)); // 4 to the power 6
    }
}

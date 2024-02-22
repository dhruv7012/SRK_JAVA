package Assignment_8;

interface Squareroot {
    abstract double findSquareRoot(int n);
}

public class Third {
    public static void main(String[] args) {
        Squareroot squareRoot = (n) -> (Math.sqrt(n));
        System.out.println(squareRoot.findSquareRoot(16));
    }
}

package Lecture49_Apr22_GreedyQuestions;

public class Codeforces_ComeTogether {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int xa = sc.nextInt();
            int ya = sc.nextInt();
            int xb = sc.nextInt();
            int yb = sc.nextInt();
            int xc = sc.nextInt();
            int yc = sc.nextInt();

            int ans = 1;

            if ((xa < xb && xa < xc) || (xa > xb && xa > xc)) {
                ans += Math.min(Math.abs(xa - xb), Math.abs(xa - xc));
            }
            if ((ya < yb && ya < yc) || (ya > yb && ya > yc)) {
                ans += Math.min(Math.abs(ya - yb), Math.abs(ya - yc));
            }
            System.out.println(ans);
        }
    }
}

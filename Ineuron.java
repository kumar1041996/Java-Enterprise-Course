public class Ineuron {
    public static void main(String[] args) {
        int n=4;
        for (int i = 0; i <=n ; i++) {   //i
            for (int j = 0; j <=n ; j++) {
                if (i==0 || i==n | j==n/2)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.print("  ");
            for (int j = 0; j <=n ; j++) {  //n
                if (j==0 || j==n | i==j)
                    System.out.print("* ");
                else
                    System.out.print("  ");

            }
            System.out.print("  ");
            for (int j = 0; j <=n ; j++) { //e
                if (i==0 || i==n | i==n/2 || j==0)
                    System.out.print("* ");
                else
                    System.out.print("  ");

            }
            System.out.print("  ");
            for (int j = 0; j <=n ; j++) {  //u
                if (j==0 && i < n || j==n && i <n || i==n && j !=0 && j!=n)
                    System.out.print("* ");
                else
                    System.out.print("  ");

            }
            System.out.print("  ");
            for (int j = 0; j <=n ; j++) { //r
                if (i==0 && j < n || i==n/2 && j!=n || j==0 || i==j && i > n/2 || j == n && i < n/2 && i!=0)
                    System.out.print("* ");
                else
                    System.out.print("  ");

            }
            System.out.print("  ");
            for (int j = 0; j <=n ; j++) { //o
                if (i==0 && j > 0 && j < n || j==0 && i < n && i > 0 || j==n && i <n && i !=0 || i==n && j !=0 && j!=n)
                    System.out.print("* ");
                else
                    System.out.print("  ");

            }
            System.out.print("  ");
            for (int j = 0; j <=n ; j++) { //n
                if (j==0 || j==n | i==j)
                    System.out.print("* ");
                else
                    System.out.print("  ");

            }
            System.out.println(" ");
        }
    }
}
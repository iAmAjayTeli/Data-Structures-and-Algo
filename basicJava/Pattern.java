package basicJava;

public class Pattern {
    public static void main(String[] args) {
        pattern9(4);
    }

    private static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    private static void pattern2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    private static void pattern3(int n) {
        int colSize=n;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=colSize; j++){
                System.out.print("* ");
        }
        colSize--;
        System.out.println();
        }
       
    }

    private static void pattern4(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(" "+j);
            }
            System.out.println();
        }
    }

    private static void pattern5(int n){
        for(int i=1; i<=n*2-1; i++){
           int colSize=i;
            for(int j=1; j<=colSize; j++){
              if(colSize>n){
                colSize--;
              }
              else{
                System.out.print("* ");
              }
              
            }
            System.out.println();
        }
    }

    private static void pattern6(int n){
        for(int i=1; i<=2*n; i++){
            int colSize= i;
            int noOfSpace= (colSize>n)? colSize-n :  n-colSize;

            for(int k=1; k<=noOfSpace; k++){
                System.out.print(" ");
            }

            for(int j=1; j<=colSize; j++){
                if(colSize>n){
                    colSize--;
                }
                else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    private static void pattern7(int n){
        for(int row=1; row<=n; row++){
            for(int space=01; space<=n-row; space++){
                System.out.print("  ");
            }
            for(int col=row; col>=1; col--){
                System.out.print(col+" ");
            }
            for(int col=2; col<=row; col++){
                System.out.print(col+" ");
            }

            System.out.println();
        }
    }

    private static void pattern8(int n){
        int newRow=n;
        for(int row=1; row<=2*n-1; row++){
            int colSize= (row>=n) ? newRow-- : row;
            int noOfSpace= (row>=n) ? row-n : n-row;
            for(int space=1; space<=noOfSpace; space++){
                System.out.print("  ");
            }

            for(int col=colSize; col>=1; col--){
                System.out.print(col+" ");
            }
            for(int col=2; col<=colSize; col++){
                System.out.print(col+" ");
            }

            System.out.println();
        }
    }

    private static void pattern9(int n){
        int originalN= n;
        n= 2*n;
      for(int i=0; i<=n; i++){
        for(int j=0; j<=n; j++){
            int atEveryIndex= originalN-Math.min(Math.min(i, j), Math.min(n-i, n-j));
            System.out.print(atEveryIndex+" ");
        }
        System.out.println();
      }
    }
}

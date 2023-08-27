public class Pattern3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 4; j >=i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (i * 2) - 1; j++) {
                // if(j==i){
                // System.out.print("*");
                // }
                // else{
                System.out.print("*");
                // }
            }
            System.out.println();
        }
    }
}

//     *
//    ***
//   *****
//  *******
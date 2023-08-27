public class Pattern2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            int temp = i;
            if (i > 5) {
                temp = 9 - (i - 1);
            }
            for (int j = 4; j >= temp; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= temp; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}   


//    *
//    **
//   ***
//  ****
// *****
//  ****
//   ***
//    **
//     *
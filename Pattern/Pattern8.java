public class Pattern8 {
    public static void main(String[] args) {
        for (int i = 1; i <=(4*2)-1; i++) {
            //  for (int j = 5; j>i; j--) {
            //     System.out.print(" ");
            // }
            for (int j = (4*2)-1; j>=1; j--) {
                if(j==i || j==((4*2)-i)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}


// *     *
//  *   * 
//   * *  
//    *   
//   * *  
//  *   * 
// *     *
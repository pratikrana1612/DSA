public class Pattern11 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j<=(i*2)-1; j++) {
                if(j>i)
                {
                    System.out.print(((i*2)-1)-(j-1));
                }
                else{
                    System.out.print(j);

                }
            }
            System.out.println();
        }
    }
} 


// 1
// 121
// 12321
// 1234321
// 123454321
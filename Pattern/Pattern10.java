public class Pattern10 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j<=(i*2)-1; j++) {
                if(j>i)
                {
                    System.out.print(j-i);
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
// 12312
// 1234123
// 123451234
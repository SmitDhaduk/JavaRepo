public class Pattern3 {

    public static void main(String[] args) {
        int line = 10;
        int i,j;
    
        for(i=1;i<=line;i++)
        {
            for(j=1;j<=i;j++){

                System.out.print(i*j+" ");
            }
            System.out.println(" ");
        }   
    }

}

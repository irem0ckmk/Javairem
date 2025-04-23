import java.util.Arrays;
import java.util.Scanner;

public class Arraays {

    public static void main(String[] args){
        /*
        int A[] = {3,9,7,8,12,6,15,5,4,10};
        int total=0;

        for(int i=0;i<A.length;i++ ){
            total += A[i];
        }
        System.out.println("Total = "+total);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Aranacak sayıyı gir: ");
        int aranan = scanner.nextInt();
        for (int i=0; i<A.length;i++){
            if (A[i] == aranan){
                System.out.println("Bulunduğu index: "+i);
                System.exit(0);
            }
            System.out.println("Böyle bir sayı yok.");

        }

        Arrays.sort(A);
        System.out.println("Sıralanmış dizi: "+ Arrays.toString(A));
        int max = A[0];
        int max2 = A[0];
        for(int i=1; i<A.length;i++){
            if (A[i]>max ){
                max = A[i];

            } else if (A[i]>max2){
                max2=A[i];
            }
        }
        System.out.println("Maximum number is "+max);
        System.out.println("Second maximum is "+max2);



        int B[]= {5,9,6,10,12,7,3,5,4,2};

        for (int x:B)
            System.out.print(x+",");
        System.out.print(" ");
        int temp = B[0];
        for (int i=1;i<B.length;i++){
            B[i-1]=B[i];
        }
        B[B.length-1] = temp;



        int B[] = new int[10];
        B[0]=3;B[1]=9;B[2]=7;B[3]=8;B[4]=12;B[5]=6;
        int n=6;
        for (int i =0;i<n;i++)
            System.out.print(B[i]+",");
        System.out.println("");
        int x=20;
        int index=2;
        for(int i=n;i>index;i--)
            B[i]=B[i-1];
        B[index]=x;
        n++;
        for (int i =0;i<n;i++)
            System.out.print(B[i]+",");
        System.out.println("");

         */
        /*
        int B[] = new int[10];
        B[0]=3;B[1]=9;B[2]=7;B[3]=8;B[4]=12;B[5]=6;
        int n = 6;
        System.out.println("Silinecek index (0 ile " +(n-1)+" arasında)= ");
        Scanner scanner = new Scanner(System.in);

        int index = scanner.nextInt();
        for(int i = index;i<n-1;i++){
            B[i]=B[i+1];
        }
        if (index >= 0 && index < n) {
            for (int i = index; i < n - 1; i++) {
                B[i] = B[i + 1];
            }
            n--;

            System.out.print("Yeni dizi: ");
            for (int i = 0; i < n; i++) {
                System.out.print(B[i] + ", ");
            }
        } else {
            System.out.println("Hatalı indeks girdin dostum. ");
        }
        n--;

         */
        int C[] = {8,6,10,9,2,15,7,13,14,11};
        int D[]= new int[10];
        /*
        for (int i=0; i<C.length;i++)
            System.out.print(C[i]+",");
        System.out.println("");
        for (int a=0;a<C.length;a++) {
            D[a] = C[a];

            System.out.print(D[a] + ",");
        }

         */

        for (int i=C.length-1; i>=0;i--){
            System.out.print(C[i]+ ",");

        }
















    }
}

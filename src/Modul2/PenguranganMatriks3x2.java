package Modul2;
public class PenguranganMatriks3x2 {
    public static void main(String[] args){
        int [][] A = {
            {100,75},
            {75,65},
            {200,150}
        };
        int [][] B = {
            {50,50},
            {25,50},
            {175,100}
        };
        
        if((A.length == B.length) && (A[0].length == B[0].length)){
            int [][] C = new int[A.length][A[0].length];
            for(int i=0; i<A.length; i++){
                for(int j=0; j<A[0].length; j++){
                    C[i][j] = A[i][j]-B[i][j];
                }
            }
            for(int[] c: C){
                for(int q: c){
                System.out.print(q+" ");
                }
                System.out.println();
            }
            System.out.println(C[1][1]);
        }
        else{
            System.out.println("Ukuran matrix tidak sama");
        }
        System.out.println("Muhammad Farid Baehaqi");
    }
}
public class factoriel_and_square {
    import java.util.*;

class Main {
  public static void main(String[] args) {
        // int fatt;
        for (int i=1  ; i <= 5 ; i++ ) {
             int factori = Operazione.myfattoriale(i);
              int quadrato = Operazione.myquadrato(i);
             System.out.println(i+" / " +"Fattoriale: "+ factori +  "  "+ "Quadrato: "+ quadrato);
     }
  }
}


class Operazione {
     public static int myfattoriale (int k) {
         int fattoriale = 1;
         for ( int i=1 ; i<= k; i++) fattoriale = fattoriale * i;
       return (fattoriale);
     }
  
    public static int myquadrato(int p) {
       int quadrato =1;
        quadrato = p*p;
     return (quadrato);
    }
}
}

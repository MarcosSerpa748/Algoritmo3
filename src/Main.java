
public class Main {
    public static void main(String[] args) {
        int[] numeros = new int[]{20,1,7,2,12,39};
        int maiorNumero = 0;
        int segundoMaior = 1;

        for (int i = 0; i <= numeros.length-1;i++){

            if (maiorNumero <=numeros[i]){
                segundoMaior = maiorNumero;
                maiorNumero = numeros[i];
            }
        }
        System.out.println("O  maior valor é:"+maiorNumero+" e o segundo é "+segundoMaior);
    }

}
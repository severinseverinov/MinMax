import java.util.Scanner;

public class MinAndMax {
    public static void main(String[] args) {
        int nbr,nbrMin=0,nbrMax=0,nbrTemp=0;

        Scanner input=new Scanner(System.in);

        System.out.print("Kaç sayı girilecek : ");
        nbr=input.nextInt();

        for(int i=1;i<=nbr;i++){
            System.out.print(i+". sayıyı giriniz : ");
            nbrTemp=input.nextInt();
            if(nbrTemp<nbrMin){nbrMin=nbrTemp;}
            if(nbrTemp>nbrMax){nbrMax=nbrTemp;}
        }

        System.out.println("En büyük sayı : "+nbrMax);
        System.out.println("En küçük sayı : "+nbrMin);
    }
}

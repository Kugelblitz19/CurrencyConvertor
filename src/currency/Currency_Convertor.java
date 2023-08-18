package currency;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Currency_Convertor {
    public static void main(String[]args){
        double rupee,dollar,pound,code,euro,KWD;
        DecimalFormat f=new DecimalFormat("##.###");
        Scanner scanner=new Scanner(System.in);
        System.out.println("*** Welcome to Kunal Currency Conversion Project *** \nEnter the Currency code \n : ");
        code=scanner.nextInt();
        if (code==1){
            System.out.println("Enter Amount in rupees: ");
            rupee= scanner.nextDouble();
            dollar=rupee / 83.11;
            System.out.println("Dollar : " + f.format(dollar));
            pound=rupee/105.69;
            System.out.println("Pound : " + f.format(pound));
            euro=rupee/90.37;
            System.out.println("Euro : " + f.format(euro));
            KWD =rupee/269.95;
            System.out.println("Dinar : " + f.format(KWD));
        } else if (code == 2) {
            System.out.println("Enter Amount in dollar: ");
            dollar = scanner.nextDouble();
            rupee=dollar*83.11;
            System.out.println("Rupees : " + f.format(rupee));
            pound=dollar*1.27;
            System.out.println("Pound : " + f.format(pound));
            euro=dollar*1.09;
            System.out.println("Euro : " + f.format(euro));
            KWD=dollar*3.25;
            System.out.println("Dinar : " + f.format(KWD));

        } else if (code == 3) {
            System.out.println("Enter Amount in Pound : ");
            pound=scanner.nextDouble();
            rupee=pound*105.69;
            System.out.println("Rupee : " + f.format(rupee));
            dollar=pound*1.27;
            System.out.println("Dollar : " + f.format(dollar));
            euro=pound*1.09;
            System.out.println("Euro : " + f.format(euro));
            KWD=pound*0.39;
            System.out.println("Dinar : " + f.format(KWD));
        }
        else if (code==4){
            System.out.println("Enter Amount in Euro : ");
            euro=scanner.nextDouble();
            rupee=euro*90.37;
            System.out.println("Rupee : " + f.format(rupee));
            dollar=euro*1.09;
            System.out.println("Dollar : " + f.format(dollar));
            pound=euro*0.86;
            System.out.println("Pound : " + f.format(pound));
            KWD=euro*0.33;
            System.out.println("Dinar : " + f.format(KWD));
        } else if (code == 5) {
            System.out.println("Enter Amount in Dinar : ");
            KWD=scanner.nextDouble();
            rupee=KWD*269.95;
            System.out.println("Rupee : " + f.format(rupee));
            dollar= KWD*3.25;
            System.out.println("Dollar : " + f.format(dollar));
            pound=KWD*2.55;
            System.out.println("Pound : " + f.format(pound));
            euro =KWD*2.99;
            System.out.println("Euro : " + f.format(euro));





        }else {
            System.out.println("Invalid Codes : ");
        }
    }
}

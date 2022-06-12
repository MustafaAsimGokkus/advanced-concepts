public class EuroRueckgeldRechner {
    static int zwei,ein,fuenfzig,zwanzig,zehn,fuenf,zweiCent,einCent;
    public static void main(String[] args) {
        double euro = 1; int cents = (int) (euro * 100);
        while(cents>0){
            if(cents>=200){
                cents -= 200;
                zwei ++;}
          else if(cents>=100){
                cents -= 100;
                ein++;}
            else if(cents>=50){
                cents -= 50;
                fuenfzig++;}
            else if(cents>=20){
                cents -= 20;
                zwanzig++;}
            else if(cents>=10){
                cents -= 10;
                zehn++;}
            else if(cents>=5){
                cents -= 5;
                fuenf++;}
            else if(cents>=2){
                cents -= 2;
                zweiCent++;}
            else if(cents >= 1){
                cents -= 1;
                einCent++;}}
        System.out.println(euro +" Euros können mit "+
                (zwei+ein+fuenfzig+zwanzig+zehn+fuenf+zweiCent+einCent) +
                " Münze(n) ausgegeben werden: " + zwei +("*2 Euro, ") + ein
                + ("*Ein Euro, ")+ fuenfzig + ("*50 Cents, ") + zwanzig + ("*20 Cents, ")
                +  zehn + ("*10 Cents, ")+fuenf + ("*5 Cents, ")+zweiCent + ("*2 Cents, ")
                +einCent+("*1 Cent."));}}


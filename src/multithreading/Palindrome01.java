package multithreading;

public class Palindrome01 {



    public static void main(String[] args) {
        String s="";
        String s1 = "Nitelikli is iletin nitel isi ilk iletin";
        String s2 = s1.replaceAll(" ","");

        for(int i=s2.length()-1; i>=0; i--){
           s =s.concat(String.valueOf(s2.charAt(i)));
        }

        System.out.println(s.equalsIgnoreCase(s2));

    }
}

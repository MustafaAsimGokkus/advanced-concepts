package advancedconcepts;

public class Enum01Class<browserName> {
    public static void main(String[] args) {
        Enum01 browserName = Enum01.IE;

        switch(browserName){
            case CHROME:
                System.out.println("Chrome running");
                break;
            case SAFARI:
                System.out.println("Safari running");
                break;
            default:
                System.out.println("Select browser");
        }

    }


}

public class StringModifying {
    public static void main(String[] args) {
        /*
        1.toUpperCase(): converting stringinto Uppercase letters
        2.toLowerCase(): converting string into LowerCase letters
        3.trim(): used to cut beginning/ending space
        */

        //uppercase()
        String value1 = "javaprogram";
        System.out.println("upper case: "+value1.toUpperCase());

        //lowercase()
        String value2 = "HELLOJAVAPROGRAM";
        System.out.println("Lower case: "+value2.toLowerCase());

        //trim()
        String value3 = "                Audisankara               ";
        System.out.println("Before trim: "+value3);
        System.out.println("After trim: "+value3.trim());

    }
}

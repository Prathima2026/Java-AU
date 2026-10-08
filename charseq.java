public class charseq {
    public static void main(String[] args) {
        
        CharSequence val = "hellojava program";
        //length(): used to return length of the text or value
        //System.out.println("length of the string: "+val.length());

        //charAt(): used to get the character according to index
        String a = "Audisankara";
        //0 1 2 3 4 5 6 7 8 9 10
        //A u d i s a n k a r a
        //System.out.println("characher: "+a.charAt(9));
        System.out.println("Characters: ");
        for(int i=0; i<a.length(); i++){
            System.out.print(a.charAt(i)+" ");
        }

        System.out.println("characher: "+a.charAt(9));








       
    }
    
}

package ModuloUtillidades;

import java.util.Random;

public class GeneradorIDs {
    private static final String LOWERCASE = "abcdefghijkmnlopqrstuvwxyz";
    private static final String UPPERCASE= "ABCDEFGHIJKMNLOPQRSTUVWXYZ";
    private static final String DIGITS = "0123456789";

    public static String generateID(int length) {
        String characters= LOWERCASE + UPPERCASE + DIGITS;
        char[] id = new char[length];
        int pos;
        Random r= new Random();
        for (int i = 0; i < length; i++) {
            pos= r.nextInt(characters.length());
            id[i] = characters.charAt((pos));
        }
        return new String(id);
    }
}

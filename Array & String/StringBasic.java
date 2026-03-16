
import java.util.ArrayList;

class StringBasic {

    public static void main(String[] args) {
        String a = "saur";
        String b = "saurabh";
        String name = "   fly me   to   the moon  ";

        // indexOf
        int idx = b.indexOf(a);
        System.out.println(idx);

        for (int i = 0; i < b.length(); i++) {
            System.out.print(b.charAt(i) + " | ");
        }

        System.out.println(b.concat(a));

        // compareTo() :
        // Compares alphabetically (lexicographically).
        // if   0	equal
        // if < 0	first string smaller
        // if > 0	first string greater
        System.out.println(a.compareTo(b));

        System.out.println(name.contains(" "));

        int lastSpace = name.lastIndexOf(" ");
        System.out.println(name.substring(lastSpace + 1));

        ArrayList<String> list = new ArrayList<>();
        String skl = "";
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) != ' ') {
                Character sh = name.charAt(i);
                skl = skl + sh;
            } else {

                if (!skl.isEmpty()) {   // add only words with characters
                    list.add(skl);
                    skl = "";
                }
            }
        }

        // add last word
        if (!skl.isEmpty()) {
            list.add(skl);
        }
        System.out.println("list" + list);

    }
}


import java.util.Stack;

class StackBasic {

    public static void main(String[] args) {

        String b = "";   // Try also "()[]{}"

        if (b.length() % 2 != 0) {
            System.out.println("Not Valid");
            return;
        }

        Stack<Character> brackets = new Stack<>();

        for (int i = 0; i < b.length(); i++) {
            char ch = b.charAt(i);
            // Opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                brackets.push(ch);
            } // Closing brackets
            else {
                if (brackets.isEmpty()) {
                    System.out.println("Not Valid");
                    return;
                }
                char top = brackets.pop();
                if (ch == ')' && top != '('
                        || ch == '}' && top != '{'
                        || ch == ']' && top != '[') {

                    System.out.println("Not Valid");
                    return;
                }
            }
        }

        if (brackets.isEmpty()) {
            System.out.println("Valid");
        } else {
            System.out.println("Not Valid");
        }
    }
}

package stack;

public class Validator {

    public boolean validateBrackets(String expression) {

        NodeStack stack = new NodeStack();

        if (expression.isEmpty()) {
            return true;
        }

        for (char chr : expression.toCharArray()) {

            if (chr == '(' || chr == '{' || chr == '[') {
                stack.push(chr);
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    char top = (Character) stack.peek();
                    if (    chr == ')' && top == '(' ||
                            chr == '}' && top == '{' ||
                            chr == ']' && top == '[') {
                        stack.pop();
                    }
                }
            }
        }

        return stack.isEmpty();
    }
}

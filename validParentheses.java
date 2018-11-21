class Solution {
    public boolean isValid(String input) {
        Stack<Character> stck = new Stack<Character>();
		if(input.isEmpty())
            return true;
        char[] inputInCharArray = input.toCharArray();
        char firstChar = inputInCharArray[0];
		if(firstChar=='}' || firstChar==')' || firstChar==']')
			return false;
        for (char inputChar : inputInCharArray) {
            if (inputChar == '{' || inputChar == '(' || inputChar == '[')
				stck.push(inputChar);
			else if (inputChar == '}')
				if (stck.isEmpty())
					return false;
				else if (stck.peek() == '{')
					stck.pop();
				else
					return false;
			else if (inputChar == ']')
				if (stck.isEmpty())
					return false;
				else if (stck.peek() == '[')
					stck.pop();
				else
					return false;
			else if (inputChar == ')')
				if (stck.isEmpty())
					return false;
				else if (stck.peek() == '(')
					stck.pop();
				else
					return false;
		}
		return stck.empty() ? true : false;
    }
}


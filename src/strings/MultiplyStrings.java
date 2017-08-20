package strings;

public class MultiplyStrings {
    public static void main(String[] args) {
        System.out.println((new MultiplyStrings()).multiply("123", "456"));
    }

    public String multiply(String num1, String num2) {
        StringBuilder result = new StringBuilder("0");

        if (num1.equals("0") || num2.equals("0")) return "0";
        for (int i = num1.length() - 1, offset = 0; i >= 0; i--, offset++) {
            int curSum = 0;
            int carry = 0;

            StringBuilder rowResult = new StringBuilder();
            for (int j = num2.length() - 1; j >= 0; j--) {
                int val = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                curSum = (val + carry) % 10;
                carry = (val + carry) / 10;
                rowResult.insert(0, Integer.toString(curSum));
            }
            if (carry != 0) rowResult.insert(0, Integer.toString(carry));


            result = add(result, rowResult, offset);

        }

        return result.toString();
    }

    public StringBuilder add(StringBuilder result, StringBuilder rowResult, int offest) {

        int i = result.length() - 1 - offest;
        int j = rowResult.length() - 1;
        int carry = 0;


        while (j >= 0) {
            if (i >= 0) {
                int tempSum = (result.charAt(i) - '0') + (rowResult.charAt(j) - '0') + carry;
                carry = (tempSum) / 10;
                result.setCharAt(i, (char) ('0' + (tempSum % 10)));

            } else {
                int tempSum = (rowResult.charAt(j) - '0') + carry;
                carry = (tempSum) / 10;
                result.insert(0, Integer.toString(tempSum % 10));
            }

            j--;
            i--;
        }
        if (carry != 0) result.insert(0, Integer.toString(carry));


        return result;
    }
}

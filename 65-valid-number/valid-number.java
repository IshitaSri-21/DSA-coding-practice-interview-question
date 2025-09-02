class Solution {
    public boolean isNumber(String s) {
        if (s == null) return false;
        s = s.trim();
        if (s.isEmpty()) return false;

        boolean isDigit = false; 
        boolean isDot = false;    
        boolean isExp = false;      
        boolean digitAfterExp = true; 

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                isDigit = true;
                if (isExp) digitAfterExp = true;
            } else if (c == '+' || c == '-') {
                if (i != 0 && !(s.charAt(i - 1) == 'e' || s.charAt(i - 1) == 'E')) {
                    return false;
                }
            } else if (c == '.') {
                if (isDot || isExp) return false;
                isDot = true;
            } else if (c == 'e' || c == 'E') {
                if (isExp || !isDigit) return false;
                isExp = true;
                digitAfterExp = false; 
            } else {
                return false;
            }
        }
        return isDigit && (!isExp || digitAfterExp);
    }
}

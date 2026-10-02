class Solution {
    public String convertToTitle(int cn) {
        StringBuilder result = new StringBuilder();
        while(cn>0){
            cn--;
            char ch = (char) ('A'+(cn%26));
            result.append(ch);
            cn/=26;
        }
        return result.reverse().toString();
    }
}
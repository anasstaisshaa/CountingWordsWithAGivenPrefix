class Solution {
    public int prefixCount(String[] words, String pref) {
        StringBuilder sb = new StringBuilder();
        int ans = 0;

        for(String str : words){
            for (int i = 0; i < pref.length() && i < str.length(); i++){
                if(str.charAt(i) != pref.charAt(i))
                    break;
                else{
                    sb.append(str.charAt(i));
                }
            }
            if(sb.toString().equals(pref))
                ans++;
            sb.setLength(0);
        }
        return ans;
    }
}
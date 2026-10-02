class Solution {
    public boolean isAnagram(String s, String t) {
     int[] count = new int[26];

     if(s.length() != t.length()){ return false; }

     for(int i = 0; i <= s.length()-1; i++){ 
        char c = s.charAt(i);
        count[c - 'a']++;
     }  
     for(int i = 0; i <= t.length()-1; i++){
        char c = t.charAt(i);
        count[c - 'a']--;
     }
     for(int i = 0; i <= count.length-1; i++){
        if(count[i] != 0){
            return false;
        }
     }
      return true;
    }
}

class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map1 = new HashMap<>();
        HashMap<Character,Character> map2 = new HashMap<>();
        if(s.length() != t.length()) return false;
        for(int i=0;i<s.length();i++){
            char org = s.charAt(i);
            char rep = t.charAt(i);
            if(map1.containsKey(org) && map1.get(org) != rep) return false;
            if(map2.containsKey(rep) && map2.get(rep) != org) return false;
            map1.put(org,rep);
            map2.put(rep,org);
        }
        return true;
    }
}
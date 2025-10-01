class Solution {
    public boolean isAnagram(String s, String t) {
        int s1=s.length();
        int t1=t.length();
        while(t1>0 && s1>0){
            t=t.replace(String.valueOf(s.charAt(0)),"");
            s=s.replace(String.valueOf(s.charAt(0)),"");
            if(t.length()==t1){
                return false;
            }
            else if(t.length()==0 && s.length()==0 && t1-t.length()==s1-s.length()){
                return true;
            } else if(t1-t.length()!=s1-s.length()){
                return false;
            }
            s1=s.length();
            t1=t.length();
        }
        if(t1==0 && s1==0){
            return true;
        }
        return false;
    }
}

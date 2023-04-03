public class IsIsomorphic {
    public boolean isIsomorphic(String s, String t) {

        int[] s1 = new int[256];
        int[] t1 = new int[256];

        if(s.length() != t.length()){
            return false;
        }

        for(int i=0;i<s.length();i++)
        {
            if(s1[s.charAt(i)]!=t1[t.charAt(i)])
                return false;

            s1[s.charAt(i)]=i+1;
            t1[t.charAt(i)]=i+1;
        }
        return true;
    }

    public static void main(String[] args){
        System.out.println(new IsIsomorphic().isIsomorphic("paper", "title"));
        System.out.println(new IsIsomorphic().isIsomorphic("egg", "add"));
        System.out.println(new IsIsomorphic().isIsomorphic("foo", "bar"));
    }
}

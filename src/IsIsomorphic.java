public class IsIsomorphic {
    public boolean isIsomorphic(String s, String t) {

        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();

        if(s1.length != t1.length || s1.length < 1 || s1.length > 5 * Math.pow(10, 4)){
            return false;
        }

        for(int i = 0; i < s1.length; i++){
            if(s1[i] <= t1[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        System.out.println(new IsIsomorphic().isIsomorphic("egg", "add"));
        System.out.println(new IsIsomorphic().isIsomorphic("foo", "bar"));
    }
}

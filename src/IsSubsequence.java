public class IsSubsequence {
  public boolean isSubsequence(String s, String t) {

    if (s.length() < 1) {
      return true;
    }

    int count = 0;

    for (char c : t.toCharArray()) {
      if (count == s.length())
        return true;

      if (c == s.charAt(count)) {
        count++;
      }
    }

    return count == s.length();
  }

  public static void main(String[] args) {
    System.out.println(new IsSubsequence().isSubsequence("abc", "ahbgdc"));
    System.out.println(new IsSubsequence().isSubsequence("axc", "ahbgdc"));
  }
}

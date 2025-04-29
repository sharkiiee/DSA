public class StringConcat {
    public static void main(String[] args) {
        String str = "Harsh loves";
        String str2 = "Nandini";
        int s1 = 0;
        int s2 = 0;
        char[] result = new char[str.length() + str2.length() + 1];

        while (true) {
            try {
                result[s1] = str.charAt(s1);
                s1++;
            } catch (Exception e) {
                break;






















                
            }
        }
        result[s1] = ' ';
        s1++;
        while (true) {
            try {
                result[s1] = str2.charAt(s2);
                s1++;
                s2++;
            } catch (Exception e) {
                break;
            }
        }
        System.out.println(result);
    }
}
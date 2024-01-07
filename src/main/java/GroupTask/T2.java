package GroupTask;
/*
Find out how many alpha characters are present in a string?
 */
public class T2 {
    public static void main(String[] args) {
        String str1 = "Java is simple";
        int alphcnt = 0;
        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c <= 'A' && c <= 'Z')) ;
            alphcnt++;

        }
        System.out.println(alphcnt);
    }
}


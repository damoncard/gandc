
package book_res.functions;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class Comma {
    public static String removeComma(String s) {
        if (!s.equals("")) {
            int num = 0;
            try {
                NumberFormat format = NumberFormat.getInstance(Locale.getDefault());
                Number number = format.parse(s);
                num = number.intValue();
            } catch (ParseException e) {
            }
            return num + "";
        } return "";
    }

    public static String putComma(String s) {
        String res = "";
        System.out.println(s + " " + s.length());
        if (s.length() <= 3) {
            return s + ".00-";
        } else {
            int cnt = 0;
            for (int i = s.length() - 1; i >= 0; i--) {
                cnt++;
                res = s.charAt(i) + res;
                if (cnt == 3 && i > 0) {
                    res = "," + res;
                    cnt = 0;
                }
            }
            return res + ".00-";
        }
    }
}

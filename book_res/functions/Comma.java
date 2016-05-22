
package book_res.functions;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;


/**
* Cut out comma from number
*<p>
*@param s  symbor or comma sign that want to cut out.
*@return number  string of number that cut comma out.
*/
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

    /**
    * add comma sign to number and .00- after number.
    *<p>
    *@param s number that input as string.
    *@return number with comma in string format.
    */
    public static String putComma(String s) {
        String res = "";
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

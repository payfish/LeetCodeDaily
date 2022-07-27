package leetcode;


/**
 * 592.分数加减运算
 * 一步错，步步错
 */


public class FranctionAddition_592 {

    public static String fractionAddition(String expression) {
        int n = expression.length();
        String pre = "";
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < n; i += 1) {
            char c = expression.charAt(i);
            if(c == '-' || c == '+') {
                String cur = sb.toString();
                pre = addString(pre, cur);
                sb = new StringBuffer();
            }
            sb.append(c);
        }
        return addString(pre, sb.toString());
    }

    public static String addString(String pre, String cur) {

        int n1 = pre.length();
        int n2 = cur.length();
        if(n1 < 3 || pre.charAt(0) == 0) {
            return cur;
        }
        int pz = 0;

        if(pre.charAt(0) != '-' && pre.charAt(0) != '+' ){
            pz = pre.charAt(0) - '0';
        }else {
            pz = pre.charAt(0) == '-' ? -(pre.charAt(1) - '0') : pre.charAt(1) - '0';
        }

        int cz = cur.charAt(0) == '-' ? -(cur.charAt(1) - '0') : cur.charAt(1) - '0';
        int pm = pre.charAt(n1-1) - '0';
        int cm = cur.charAt(3) - '0';

        int newfm = pm * cm;
        int newfz = pm*cz + cm*pz;

        StringBuilder SB = new StringBuilder();

        if(newfz == 0) {
            newfm = 1;
        }else if(newfz < 0) {
            if(newfz % newfm == 0){
                newfz = newfz / newfm;
                newfm = 1;
            }
        }else if(newfz > 0 && newfz % newfm == 0) {
            newfz = newfz / newfm;
            newfm = 1;
        }

        SB.append(newfz);
        SB.append('/');
        SB.append(newfm);

        return  SB.toString();
    }

}




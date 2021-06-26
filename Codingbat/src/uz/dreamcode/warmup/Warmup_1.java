package uz.dreamcode.warmup;

import uz.dreamcode.interfaces.WarmupInterface1;

public class Warmup_1 implements WarmupInterface1 {

    @Override
    public boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }

    @Override
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return aSmile && bSmile || !(aSmile) && !(bSmile);
    }

    @Override
    public int sumDouble(int a, int b) {
        return a != b ? a + b : (a + b) * 2;
    }

    @Override
    public int diff21(int n) {
        return n <= 21 ? 21 - n : (n - 21) * 2;
    }

    @Override
    public boolean parrotTrouble(boolean talking, int hour) {
        return talking && (hour < 7 || hour > 20);
    }

    @Override
    public boolean makes10(int a, int b) {
        return (a == 10 || b == 10 || a + b == 10);
    }

    @Override
    public boolean nearHundred(int n) {
        return (Math.abs(100 - n) <= 10 || Math.abs(200 - n) <= 10);
    }

    @Override
    public boolean posNeg(int a, int b, boolean negative) {
        return (!negative && ((a < 0 && b > 0) || (a > 0 && b < 0))) || (negative && (a < 0 && b < 0));
    }

    @Override
    public String notString(String str) {
        return (str.length() > 2 && str.startsWith("not") ? str : "not " + str);
    }

    @Override
    public String missingChar(String str, int n) {
        return str.substring(0, n) + str.substring(n + 1);
    }

    @Override
    public String frontBack(String str) {
        return str.length() > 1 ? str.charAt(str.length() - 1) + str.substring(1, str.length() - 1) + str.charAt(0) : str;
    }

    @Override
    public String front3(String str) {
        return ((str.length() < 3) ? (str.concat(str).concat(str)) : str.substring(0, 3) + str.substring(0, 3) + str.substring(0, 3));
    }

    @Override
    public String backAround(String str) {
        return str.length() > 1 ? str.charAt(str.length() - 1) + str + str.charAt(str.length() - 1) : str + str + str;
    }

    @Override
    public boolean or35(int n) {
        return n % 3 == 0 || n % 5 == 0;
    }

    @Override
    public String front22(String str) {
        return (str.length() == 2 || str.length() == 1) ? (str + str + str) : str.length() > 2 ? str.substring(0, 2) + str + str.substring(0, 2) : str;
    }

    @Override
    public boolean startHi(String str) {
        return str.startsWith("hi");
    }

    @Override
    public boolean icyHot(int temp1, int temp2) {
        return (temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0);
    }

    @Override
    public boolean in1020(int a, int b) {
        return ((a >= 10 && a <= 20) || (b >= 10 && b <= 20));
    }

    @Override
    public boolean hasTeen(int a, int b, int c) {
        return (a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19);
    }

    @Override
    public String delDel(String str) {
        return str.length() >= 4 && str.indexOf("del", 1) == 1 ? str.charAt(0) + str.substring(str.indexOf("del", 1) + 3) : str;
    }

    @Override
    public boolean mixStart(String str) {
        return (str.trim().indexOf("ix") >= 1);
    }

    @Override
    public String startOz(String str) {
        String result = "";
        if (str.length() >= 1 && str.toLowerCase().charAt(0) == 'o') {
            result = result.concat(String.valueOf(str.charAt(0)));
        }
        if (str.length() > 1 && str.toLowerCase().charAt(1) == 'z') {
            result = result.concat(String.valueOf(str.charAt(1)));
        }
        return result;
    }

    @Override
    public int intMax(int a, int b, int c) {
        return ((a > b) ? Math.max(a, c) : Math.max(b, c));
    }

    @Override
    public int close10(int a, int b) {
        return Math.abs(a - 10) == Math.abs(b - 10) ? 0 : Math.abs(a - 10) > Math.abs(b - 10) ? b : a;
    }

    @Override
    public boolean in3050(int a, int b) {
        return ((a >= 30 && a <= 40 && b >= 30 && b <= 40) || (a >= 40 && a <= 50 && b >= 40 && b <= 50));
    }

    @Override
    public int max1020(int a, int b) {
        if (a >= 10 && a <= 20 && b >= 10 && b <= 20) {
            return Math.max(a, b);
        } else if (b >= 10 && b <= 20) {
            return b;
        } else if (a >= 10 && a <= 20) {
            return a;
        } else {
            return 0;
        }
    }

    @Override
    public boolean stringE(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') count++;
        }
        return (count >= 1 && count <= 3);
    }

    @Override
    public boolean lastDigit(int a, int b) {
        return (a % 10 == b % 10);
    }

    @Override
    public String endUp(String str) {
        return (str.length() > 3) ? (str.substring(0, (str.length() - 3)) + str.substring(str.length() - 3).toUpperCase()) : str.toUpperCase();
    }

    @Override
    public String everyNth(String str, int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i += n) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }
}

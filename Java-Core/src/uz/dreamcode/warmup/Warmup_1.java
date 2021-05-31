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
        return str.length()>1? str.charAt(str.length()-1)+str.substring(1, str.length()-1)+str.charAt(0):str;
    }
}

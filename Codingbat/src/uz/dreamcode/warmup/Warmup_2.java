package uz.dreamcode.warmup;

import uz.dreamcode.interfaces.WarmupInterface_2;

public class Warmup_2 implements WarmupInterface_2 {
    @Override
    public String stringTimes(String str, int n) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < n; i++) {
            s.append(str);
        }
        return s.toString();
    }

    @Override
    public String frontTimes(String str, int n) {
        int len = 3;
        if (len > str.length()) {
            len = str.length();
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(str, 0, len);
        }
        return result.toString();
    }

    @Override
    public int countXX(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.startsWith("xx", i)) count++;
        }
        return count;
    }

    @Override
    public boolean doubleX(String str) {
        int i = str.indexOf("x");
        return !(i == -1 || (i + 1 >= str.length())) && str.charAt(i + 1) == 'x';
    }

    @Override
    public String stringBits(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i += 2) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }

    @Override
    public String stringSplosion(String str) {
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            string.append(str, 0, i + 1);
        }
        return string.toString();
    }

    @Override
    public int last2(String str) {
        if (str.length() < 2) return 0;
        int count = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 2).equals(str.substring(str.length() - 2))) {
                count++;
            }
        }
        return count;
    }

    @Override
    public int arrayCount9(int[] nums) {
        int count = 0;
        for (int i : nums) {
            if (i == 9) count++;
        }
        return count;
    }

    @Override
    public boolean arrayFront9(int[] nums) {
        for (int i = 0; i < (Math.min(nums.length, 4)); i++) {
            if (nums[i] == 9) return true;
        }
        return false;
    }

    @Override
    public boolean array123(int[] nums) {
        for (int i = 0; i < (nums.length - 2); i++) {
            if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) return true;
        }
        return false;
    }

    @Override
    public int stringMatch(String a, String b) {
        int count = 0;

        for (int i = 0; i < Math.min(a.length(), b.length()) - 1; i++) {
            if (a.substring(i, i + 2).equals(b.substring(i, i + 2))) {
                count++;
            }
        }
        return count;
    }

    @Override
    public String stringX(String str) {
        char[] chars = str.toCharArray();

        if (str.length() > 1) {
            StringBuilder strBuilder = new StringBuilder();
            for (int i = 1; i < chars.length - 1; i++) {
                strBuilder.append((chars[i] == 'x' || chars[i] == 'X') ? "" : chars[i]);
            }
            str = strBuilder.toString();
            return chars[0] + str + chars[chars.length - 1];
        }
        return str;
    }

    @Override
    public String altPairs(String str) {
        String string = "";
        for (int i = 0; i < str.length(); i += 4) {
            if (str.length() > 1) {
                if (i + 2 < str.length()) {
                    string += str.substring(i, i + 2);
                } else {
                    string += str.substring(i);
                }
            } else {
                return str;
            }
        }
        return string;
    }

    @Override
    public String stringYak(String str) {
        return null;
    }

    @Override
    public int array667(int[] nums) {
        return 0;
    }

    @Override
    public boolean noTriples(int[] nums) {
        for (int i = 0; i < (nums.length - 2); i++) {
            if (nums[i + 1] == nums[i] && nums[i + 2] == nums[i]) return false;
        }
        return true;
    }

    @Override
    public boolean has271(int[] nums) {
        return false;
    }
}

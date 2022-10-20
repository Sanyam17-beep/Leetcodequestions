class Solution {
    public  String intToRoman(int num) {
        int iterar = (String.valueOf(num)).length();
        int pos = iterar - 1;
        String[] numero = String.valueOf(num).split("");
        String res = "";
        String[][] arrayRomanos = { { "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X" },
                { "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC", "C" },
                { "", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM", "M" },
                { "", "M", "MM", "MMM" } };

        for (int i = 0; i < iterar; i++) {
            res += arrayRomanos[pos][Integer.parseInt(numero[i])];
            pos--;
        }
        return res;
    }
}
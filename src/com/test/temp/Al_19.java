package com.test.temp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
输出字符串中的年份

 */
public class Al_19 {
    static int flag;
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String line;
        while((line=bf.readLine())!=null) {
            flag=1;
            for (int i = 0; i < line.length(); i++) {
                if (line.charAt(i) > '0' && line.charAt(i) < '4') {
                    int j = i;
                    int tem = 0;
                    StringBuilder sb = new StringBuilder();
                    for (; j < i + 4 && j < line.length(); j++, i++) {
                        if (!Character.isDigit(line.charAt(j))) break;
                        else {
                            sb.append(line.charAt(j));
                            tem++;
                        }
                    }
                    if (j == line.length()) {
                        if (tem == 4) {
                            if (flag == 0) System.out.print(" ");
                            System.out.print(sb);
                            flag = 0;
                        }
                        break;
                    } else {
                        if (Character.isDigit(line.charAt(j))) continue;
                        if (tem == 4) {
                            if (flag == 0) System.out.print(" ");
                            System.out.print(sb);
                            flag = 0;
                        }
                    }


                }

            }
        }
    }
}

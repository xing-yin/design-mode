package com.headfirst.decorator.io;

import java.io.*;

public class InputTest {
    public static void main(String[] args) throws IOException {
        int c;

        try {
            //设置FileInputStream，先用BufferedInputStream装饰它，
            // 再用崭新的LowerCaseInputStream过滤器装饰它
            InputStream in =
                    new LowerCaseInputStream(
                            new BufferedInputStream(
                                    new FileInputStream("/Users/yinxing/03workspace/self/design-mode/src/com/headfirst/test.txt")));

            //只用流来读取字符，一直到文件尾端。每读一个字符，就马上显示出来
            while ((c = in.read()) >= 0) {
                System.out.print((char) c);
            }

            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

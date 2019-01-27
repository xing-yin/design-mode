package com.headfirst.decorator.io;

import java.io.*;

/**
 * 编写自己的I/O装饰类
 * 扩展FilterInputStream
 */
public class LowerCaseInputStream extends FilterInputStream {

    public LowerCaseInputStream(InputStream in) {
        super(in);
    }

    /**
     * 针对字节
     *
     * @return
     * @throws IOException
     */
    public int read() throws IOException {
        int c = in.read();
        return (c == -1 ? c : Character.toLowerCase((char) c));
    }

    /**
     * 针对字节数组，把大写字符的字节转成小写
     *
     * @param b
     * @param offset
     * @param len
     * @return
     * @throws IOException
     */
    public int read(byte[] b, int offset, int len) throws IOException {
        int result = in.read(b, offset, len);
        for (int i = offset; i < offset + result; i++) {
            b[i] = (byte) Character.toLowerCase((char) b[i]);
        }
        return result;
    }
}

package com.beauty_design_mode.lecture58.demo2;

import java.io.IOException;

/**
 * Java IO 类库中，有很多类的设计用到了模板模式，比如 InputStream、OutputStream、Reader、Writer。
 * 我们拿 InputStream 来举例说明一下。
 *
 * @author Alan Yin
 * @date 2020/3/23
 */

public abstract class InputStreamDemo {

    /**
     * 在代码中，read() 函数是一个模板方法，定义了读取数据的整个流程，
     * 并且暴露了一个可以由子类来定制的抽象方法
     * 。不过这个方法也被命名为了 read()，只是参数跟模板方法不同。
     */
    public int read(byte b[], int off, int len) throws IOException {
        if (b == null) {
            throw new NullPointerException();
        } else if (off < 0 || len < 0 || len > b.length - off) {
            throw new IndexOutOfBoundsException();
        } else if (len == 0) {
            return 0;
        }

        int c = read();
        if (c == -1) {
            return -1;
        }
        b[off] = (byte) c;

        int i = 1;
        try {
            for (; i < len; i++) {
                c = read();
                if (c == -1) {
                    break;
                }
                b[off + i] = (byte) c;
            }
        } catch (IOException ee) {
        }
        return i;
    }

    public abstract int read() throws IOException;

    /**
     * 如子类 ByteArrayInputStream 实现了模板方法
     * public class ByteArrayInputStream extends InputStream {
     *
     *      //...省略其他代码...
     *      @Override
     *      public synchronized int read() {
     *      return (pos < count) ? (buf[pos++] & 0xff) : -1;
     *      }
     *
     *      }
     */
}

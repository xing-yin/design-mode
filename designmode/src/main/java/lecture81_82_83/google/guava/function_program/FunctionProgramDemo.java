package lecture81_82_83.google.guava.function_program;


import java.util.Optional;
import java.util.stream.Stream;

/**
 * @author Alan Yin
 * @date 2020/10/20
 */

public class FunctionProgramDemo {

    /**
     * 函数式编程无状态
     */
    int add(int a, int b) {
        return a + b;
    }

    private int a;

    /**
     * 非函数式编程有状态:输出依赖于外部变量 a
     */
    int add(int b) {
        return a + b;
    }

    public static void main(String[] args) {
        // 从一组字符串中，过滤出长度小于 3 的字符串，并输出其中的最大值
        Optional<Integer> result = Stream.of("f", "ba", "hello")
                .map(s -> s.length())
                .filter(l -> l <= 3)
                .max((o1, o2) -> o1 - o2);
        System.out.println(result.get()); // 输出2
    }

}

package com.beauty_design_mode.lecture36;

/**
 * 函数出错返回方式1-返回错误码
 * <p>
 * 如果你熟悉的编程语言中有异常这种语法机制，那就尽量不要使用错误码。
 * 异常相对于错误码，有诸多方面的优势，比如可以携带更多的错误信息（exception 中可以有 message、stack trace 等信息）等
 *
 * @author Alan Yin
 * @date 2020/10/16
 */

public class ErrorCodeDemo {

//    // 错误码的返回方式一：pathname/flags/mode为入参；fd为出参，存储打开的文件句柄。
//    int open(const char *pathname, int flags, mode_t mode, int* fd) {
//        if (/*文件不存在*/) {
//            return EEXIST;
//        }
//
//        if (/*没有访问权限*/) {
//            return EACCESS;
//        }
//
//        if (/*打开文件成功*/) {
//            return SUCCESS; // C语言中的宏定义：#define SUCCESS 0
//        }
//        // ...
//    }
//    //使用举例
//    int fd;
//    int result = open(“c:\test.txt”, O_RDWR, S_IRWXU|S_IRWXG|S_IRWXO, &fd);
//    if (result == SUCCESS) {
//        // 取出fd使用
//    } else if (result == EEXIST) {
//        //...
//    } else if (result == EACESS) {
//        //...
//    }
//
//    // 错误码的返回方式二：函数返回打开的文件句柄，错误码放到errno中。
//    int errno; // 线程安全的全局变量
//    int open(const char *pathname, int flags, mode_t mode）{
//        if (/*文件不存在*/) {
//            errno = EEXIST;
//            return -1;
//        }
//
//        if (/*没有访问权限*/) {
//            errno = EACCESS;
//            return -1;
//        }
//
//        // ...
//    }
//    // 使用举例
//        int hFile = open(“c:\test.txt”, O_RDWR, S_IRWXU|S_IRWXG|S_IRWXO);
//        if (-1 == hFile) {
//        printf("Failed to open file, error no: %d.\n", errno);
//        if (errno == EEXIST ) {
//            // ...
//        } else if(errno == EACCESS) {
//            // ...
//        }
//        // ...
//    }
}

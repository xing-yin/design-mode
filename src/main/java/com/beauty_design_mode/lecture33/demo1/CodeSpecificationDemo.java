package com.beauty_design_mode.lecture33.demo1;

import com.beauty_design_mode.lecture29.demo1.bad.Transaction;
import com.beauty_design_mode.lecture36.support.User;
import org.apache.commons.lang3.StringUtils;

import java.util.*;

/**
 * 代码规范演示
 *
 * @author Alan Yin
 * @date 2021/9/3
 */

public class CodeSpecificationDemo {

    private Date date;

    /**
     * 规范1.把代码分割成更小的单元块
     */
    // 重构前的代码
    public void investV1(long userId, long financialProductId) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.DATE, (calendar.get(Calendar.DATE) + 1));
        if (calendar.get(Calendar.DAY_OF_MONTH) == 1) {
            return;
        }
        //...
    }

    // 重构后的代码：提炼函数之后逻辑更加清晰
    public void investV2(long userId, long financialProductId) {
        if (isLastDayOfMonth(new Date())) {
            return;
        }
        //...
    }

    public boolean isLastDayOfMonth(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.DATE, (calendar.get(Calendar.DATE) + 1));
        if (calendar.get(Calendar.DAY_OF_MONTH) == 1) {
            return true;
        }
        return false;
    }

    /**
     * 规范 2. 避免函数参数过多
     */
    public User getUser(String username, String telephone, String email) {
        return null;
    }

    // 2.1 函数职责单一，通过拆分成多个函数的方式来减少参数
    public User getUserByUsername(String username) {
        return null;
    }

    public User getUserByTelephone(String telephone) {
        return null;
    }

    public User getUserByEmail(String email) {
        return null;
    }

    // 2.2 将函数的参数封装成对象
    // 如果函数是对外暴露的远程接口，将参数封装成对象，还可以提高接口的兼容性。
    // 在往接口中添加新的参数的时候，老的远程接口调用者有可能就不需要修改代码来兼容新的接口了
    public void postBlog(String title, String summary, String keywords, String content, String category, long authorId) {
    }

    public void postBlog(Blog blog) {
    }

    public class Blog {
        private String title;
        private String summary;
        private String keywords;
        private String content;
        private String category;
        private long authorId;
    }

    /**
     * 规范 3. 勿用函数参数来控制逻辑
     * 违背了单一职责原则和接口隔离原则
     */
    public void buyCourse(long userId, long courseId, boolean isVip) {
    }

    // 3.1 将其拆分成两个函数
    public void buyCourse(long userId, long courseId) {
    }

    public void buyCourseForVip(long userId, long courseId) {
    }

    // 3.2 根据参数是否为 null”来控制逻辑的情况。这种情况也应该将其拆分成多个函数。拆分之后的函数职责更明确，不容易用错。
    public List<Transaction> selectTransactionsV1(Long userId, Date startDate, Date endDate) {
        if (startDate != null && endDate != null) {
            // 查询两个时间区间的transactions
        }
        if (startDate != null && endDate == null) {
            // 查询startDate之后的所有transactions
        }
        if (startDate == null && endDate != null) {
            // 查询endDate之前的所有transactions
        }
        if (startDate == null && endDate == null) {
            // 查询所有的transactions
        }
        return null;
    }

    // 拆分成多个public函数，更加清晰、易用
    public List<Transaction> selectTransactionsBetween(Long userId, Date startDate, Date endDate) {
        return selectTransactionsV2(userId, startDate, endDate);
    }

    public List<Transaction> selectTransactionsStartWith(Long userId, Date startDate) {
        return selectTransactionsV2(userId, startDate, null);
    }

    public List<Transaction> selectTransactionsEndWith(Long userId, Date endDate) {
        return selectTransactionsV2(userId, null, endDate);
    }

    public List<Transaction> selectAllTransactions(Long userId) {
        return selectTransactionsV2(userId, null, null);
    }

    private List<Transaction> selectTransactionsV2(Long userId, Date startDate, Date endDate) {
        // ...
        return null;
    }


    /**
     * 规范 4. 函数设计要职责单一
     */
    private UserRepo userRepo;

    public boolean checkUserIfExisting(String telephone, String username, String email) {
        if (!StringUtils.isBlank(telephone)) {
            User user = userRepo.selectUserByTelephone(telephone);
            return user != null;
        }

        if (!StringUtils.isBlank(username)) {
            User user = userRepo.selectUserByUsername(username);
            return user != null;
        }

        if (!StringUtils.isBlank(email)) {
            User user = userRepo.selectUserByEmail(email);
            return user != null;
        }

        return false;
    }

    // 拆分成三个函数
    public boolean checkUserIfExistingByTelephone(String telephone) {
        return true;
    }

    public boolean checkUserIfExistingByUsername(String username) {
        return true;
    }

    public boolean checkUserIfExistingByEmail(String email) {
        return true;
    }

    /**
     * 规范 5. 移除过深的嵌套层次
     */
    // 5.1 去掉多余的 if 或 else 语句。
    // 示例一
    public double caculateTotalAmount(List<Order> orders) {
        if (orders == null || orders.isEmpty()) {
            return 0.0;
        } else { // 此处的else可以去掉
            double amount = 0.0;
            for (Order order : orders) {
                if (order != null) {
                    amount += (order.getCount() * order.getPrice());
                }
            }
            return amount;
        }
    }

    // 示例二
    public List<String> matchStrings(List<String> strList, String substr) {
        List<String> matchedStrings = new ArrayList<>();
        if (strList != null && substr != null) {
            for (String str : strList) {
                if (str != null) { // 跟下面的if语句可以合并在一起
                    if (str.contains(substr)) {
                        matchedStrings.add(str);
                    }
                }
            }
        }
        return matchedStrings;
    }

    // 5.2 使用编程语言提供的 continue、break、return 关键字，提前退出嵌套。
    // 重构前的代码
    public List<String> matchStringsV1(List<String> strList, String substr) {
        List<String> matchedStrings = new ArrayList<>();
        if (strList != null && substr != null) {
            for (String str : strList) {
                if (str != null && str.contains(substr)) {
                    matchedStrings.add(str);
                    // 此处还有10行代码...
                }
            }
        }
        return matchedStrings;
    }

    // 重构后的代码：使用continue提前退出
    public List<String> matchStringsV2(List<String> strList, String substr) {
        List<String> matchedStrings = new ArrayList<>();
        if (strList != null && substr != null) {
            for (String str : strList) {
                if (str == null || !str.contains(substr)) {
                    continue;
                }
                matchedStrings.add(str);
                // 此处还有10行代码...
            }
        }
        return matchedStrings;
    }

    // 5.3 调整执行顺序来减少嵌套
    // 重构前的代码
    public List<String> matchStringsV01(List<String> strList, String substr) {
        List<String> matchedStrings = new ArrayList<>();
        if (strList != null && substr != null) {
            for (String str : strList) {
                if (str != null) {
                    if (str.contains(substr)) {
                        matchedStrings.add(str);
                    }
                }
            }
        }
        return matchedStrings;
    }

    // 重构后的代码：先执行判空逻辑，再执行正常逻辑
    public List<String> matchStringsV02(List<String> strList, String substr) {
        if (strList == null || substr == null) { //先判空
            return Collections.emptyList();
        }

        List<String> matchedStrings = new ArrayList<>();
        for (String str : strList) {
            if (str != null) {
                if (str.contains(substr)) {
                    matchedStrings.add(str);
                }
            }
        }
        return matchedStrings;
    }

    // 5.4 将部分嵌套逻辑封装成函数调用，以此来减少嵌套。
    // 重构前的代码
    public List<String> appendSalts(List<String> passwords) {
        if (passwords == null || passwords.isEmpty()) {
            return Collections.emptyList();
        }

        List<String> passwordsWithSalt = new ArrayList<>();
        for (String password : passwords) {
            if (password == null) {
                continue;
            }
            if (password.length() < 8) {
                // ...
            } else {
                // ...
            }
        }
        return passwordsWithSalt;
    }

    // 重构后的代码：将部分逻辑抽成函数
    public List<String> appendSaltsV1(List<String> passwords) {
        if (passwords == null || passwords.isEmpty()) {
            return Collections.emptyList();
        }

        List<String> passwordsWithSalt = new ArrayList<>();
        for (String password : passwords) {
            if (password == null) {
                continue;
            }
            passwordsWithSalt.add(appendSaltV2(password));
        }
        return passwordsWithSalt;
    }

    private String appendSaltV2(String password) {
        String passwordWithSalt = password;
        if (password.length() < 8) {
            // ...
        } else {
            // ...
        }
        return passwordWithSalt;
    }

    /**
     * 规范 6. 学会使用解释性变量
     */
    // 6.1 常量取代魔法数字。
    public double CalculateCircularAreaV1(double radius) {
        return (3.1415) * radius * radius;
    }

    public static final Double PI = 3.1415;

    public double CalculateCircularAreaV2(double radius) {
        return PI * radius * radius;
    }

    // 6.2 使用解释性变量来解释复杂表达式。
    public static Date SUMMER_START;
    public static Date SUMMER_END;

    public void methodV1() {
        if (date.after(SUMMER_START) && date.before(SUMMER_END)) {
            // ...
        } else {
            // ...
        }
    }

    // 引入解释性变量后逻辑更加清晰
    public void methodV2() {
        boolean isSummer = date.after(SUMMER_START) && date.before(SUMMER_END);
        if (isSummer) {
            // ...
        } else {
            // ...
        }
    }

}

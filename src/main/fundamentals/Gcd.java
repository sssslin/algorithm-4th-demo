package main.fundamentals;

/**
 * @author linjunfeng
 * @version V1.0.0
 * Description 欧几里得算法
 * @date 2019/4/17 13:43
 */
public class Gcd {

    /**
     * 计算两个非负整数p和q的最大公约数：若q是0，则最大公约数为p.
     * 否则，将p除以q得到余数r,p和q的最大公约数即为q和r的最大公约数
     *
     */
    public static int gcd(int p, int q) {

        if (q == 0) {
            return p;
        }
        int r = p % q;
        // 递归
        return gcd(q, r);
    }
}

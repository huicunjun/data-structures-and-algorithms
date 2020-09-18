package algorithm;

/**
 * 概率统计
 *
 * @author yclimb
 * @date 2020/9/18
 */
public class ProbabilityStatistics {
    public static void main(String[] args) {
        /**
         * https://time.geekbang.org/column/article/77142
         * 概率统计：如何利用朴素贝叶斯算法过滤垃圾短信？
         *
         * 1. 基于黑名单的过滤器
         * 收集黑名单手机号，再使用布隆过滤器来存储x个号码，查找时可以根据手机号快速查询。
         * PS：可能会出现误判的情况，为避免投诉，可以使用友情提示等方式。
         *
         * 2. 基于规则的过滤器
         * 预先设定一组规则，通过对于短信内容分析，然后将满足规则的短信视为垃圾短信；
         * 难点在于规则的制定，数据的分析筛选，分词等等，
         *
         * 3. 基于概率统计的过滤器
         * 基于概率统计的过滤方式，基础理论是基于朴素贝叶斯算法。
         * 预先设定概率统计方向，比如垃圾短信例子：
         * 3.1.某个字符出现在x+y条短信中
         * 3.2.某个字符出现在x条短信中，并且是垃圾短信
         * 3.3.某个字符出现在y条短信中，并且不是垃圾短信
         *
         * 然后算出字符是垃圾短信的概率，最后求解，如果x>y并且是y的很多倍，则我们可以认为是垃圾短信。
         *
         */
    }
}

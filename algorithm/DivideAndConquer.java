package algorithm;

/**
 * 分治算法
 *
 * @author yclimb
 * @date 2020/9/17
 */
public class DivideAndConquer {
    public static void main(String[] args) {
        /**
         * https://time.geekbang.org/column/article/73503
         * 分治算法（divide and conquer）
         * 分治算法的核心思想其实就是四个字，分而治之 ，也就是将原问题划分成 n 个规模较小，并且结构与原问题相似的子问题，递归地解决这些子问题，然后再合并其结果，就得到原问题的解
         *
         * 分治算法是一种处理问题的思想，递归是一种编程技巧。
         * 实际上，分治算法一般都比较适合用递归来实现。分治算法的递归实现中，每一层递归都会涉及这样三个操作：
         * 1.分解：将原问题分解成一系列子问题；
         * 2.解决：递归地求解各个子问题，若子问题足够小，则直接求解；
         * 3.合并：将子问题的结果合并成原问题。
         *
         * 分治算法能解决的问题，一般需要满足下面这几个条件：
         * 1.原问题与分解成的小问题具有相同的模式；
         * 2.原问题分解成的子问题可以独立求解，子问题之间没有相关性，这一点是分治算法跟动态规划的明显区别，等我们讲到动态规划的时候，会详细对比这两种算法；
         * 3.具有分解终止条件，也就是说，当问题足够小时，可以直接求解；
         * 4.可以将子问题合并成原问题，而这个合并操作的复杂度不能太高，否则就起不到减小算法总体复杂度的效果了。
         *
         */
    }
}

package algorithm;

/**
 * 动态规划
 *
 * @author yclimb
 * @date 2020/9/17
 */
public class DynamicProgramming {
    public static void main(String[] args) {
        /**
         * https://time.geekbang.org/column/article/74788
         * 动态规划（Dynamic Programming）
         * 动态规划比较适合用来求解最优问题，比如求最大值、最小值等等。它可以非常显著地降低时间复杂度，提高代码的执行效率。
         *
         * 动态规划的思路：
         * 我们把问题分解为多个阶段，每个阶段对应一个决策。
         * 我们记录每一个阶段可达的状态集合（去掉重复的），然后通过当前阶段的状态集合，来推导下一个阶段的状态集合，动态地往前推进。
         *
         * 什么样的问题适合用动态规划解决。
         * 这些问题可以总结概括为“一个模型三个特征”。其中，“一个模型”指的是，问题可以抽象成分阶段决策最优解模型。“三个特征”指的是最优子结构、无后效性和重复子问题。
         *
         * 两种动态规划的解题思路：状态转移表法和状态转移方程法
         * 1.状态转移表法解题思路大致可以概括为，回溯算法实现 - 定义状态 - 画递归树 - 找重复子问题 - 画状态转移表 - 根据递推关系填表 - 将填表过程翻译成代码。
         * 2.状态转移方程法的大致思路可以概括为，找最优子结构 - 写状态转移方程 - 将状态转移方程翻译成代码。
         *
         *
         * 简单理解：
         * 贪心：一条路走到黑，就一次机会，只能哪边看着顺眼走哪边
         * 回溯：一条路走到黑，无数次重来的机会，还怕我走不出来 (Snapshot View)
         * 动态规划：拥有上帝视角，手握无数平行宇宙的历史存档， 同时发展出无数个未来 (Versioned Archive View)
         *
         */
    }
}

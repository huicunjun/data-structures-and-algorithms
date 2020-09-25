package algorithm;

/**
 * 并行算法：分治思想多线程并行处理
 *
 * @author yclimb
 * @date 2020/9/25
 */
public class ParallelAlgorithm {
    /**
     * https://time.geekbang.org/column/article/78795
     * 并行算法：如何利用并行处理提高算法的执行效率？
     *
     * 1.并行排序(大数据数据如何排序)
     * 1.1.归并排序：将 N 大数据分为 M 个平均小数据，使用 M 个线程归并排序每个小数据，排序后再将 M 个小数据合并。
     * 1.2.快速排序：循环一遍 N 大数据，根据大数据范围将其划为 M 个区间，排序大数据，依次插入 M 小区间并排序，结果就是有序的。
     *
     * 对比这两种处理思路，它们利用的都是分治的思想，对数据进行分片，然后并行处理。它们的区别在于：
     * 第一种处理思路是，先随意地对数据分片，排序之后再合并。
     * 第二种处理思路是，先对数据按照大小划分区间，然后再排序，排完序就不需要再处理了。
     * 这个跟归并和快排的区别如出一辙。
     *
     * 2.并行查找(大数据散列表存储查询)
     * 2.1.散列表：将 N 个数据的大散列表分为 M 个小散列表，每次扩容时都是小散列表扩容，每次插入时，选择当前 M 小散列表中装载因子最小的插入。查询时，使用 M 个线程同时查询M个小散列表即可。
     *
     * 3.并行字符串匹配(大文本快速查询)
     * 3.1.分治思想切割大文本为 M 个小文本，并发执行M线程，最终结果就是提高 M 倍效率。
     * 3.2.如果分割后刚好将关键词一分为二，需要在每个小文本的结尾和开始各取 m 个字符串。前一个小文本的末尾 m 个字符和后一个小文本的开头 m 个字符，组成一个长度是 2m 的字符串。我们再拿关键词，在这个长度为 2m 的字符串中再重新查找一遍，就可以补上刚才的漏洞了。
     *
     * 4.并行搜索
     * 4.1.广度优先搜索：广度优先搜索是一种逐层搜索的搜索策略。基于当前这一层顶点，我们可以启动多个线程，并行地搜索下一层的顶点。
     *
     * 思考：假设我们有 n 个任务，为了提高执行的效率，我们希望能并行执行任务，但是各个任务之间又有一定的依赖关系，如何根据依赖关系找出可以并行执行的任务？
     * 解答：多任务依赖，有向图存储依赖关系，使用拓扑排序 Kahn 算法。
     *
     */
}

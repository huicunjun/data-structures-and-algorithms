package sort;

/**
 * 堆排序
 *
 * @author yclimb
 * @date 2020/9/10
 */
public class HeapSort {
    public static void main(String[] args) {
        /**
         * https://time.geekbang.org/column/article/69913
         * https://github.com/wangzheng0822/algo/tree/master/java/28_sorts
         * 我们借助于堆这种数据结构实现的排序算法，就叫做堆排序。
         * 这种排序方法的时间复杂度非常稳定，是 O(nlogn)，并且它还是原地排序算法。所谓“原地”就是，不借助另一个数组，就在原数组上操作。
         *
         * 排序:
         * 数组中的第一个元素就是堆顶，也就是最大的元素。我们把它跟最后一个元素交换，那最大元素就放到了下标为 n 的位置。
         * 这个过程有点类似上面讲的“删除堆顶元素”的操作，当堆顶元素移除之后，我们把下标为 n 的元素放到堆顶，然后再通过堆化的方法，将剩下的 n−1 个元素重新构建成堆。
         * 堆化完成之后，我们再取堆顶的元素，放到下标是 n−1 的位置，一直重复这个过程，直到最后堆中只剩下标为 1 的一个元素，排序工作就完成了。
         *
         * 简单解释：堆顶元素是最大的，每次取堆顶的元素，并将数组中最后一个元素放于堆顶，进行堆化树结构，之后堆顶元素又变成最大的值，
         * 再次重复取堆顶元素这个过程，直到剩余最后一个值排序就完成了。
         */
    }
}

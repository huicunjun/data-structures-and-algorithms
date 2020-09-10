package tree;

/**
 * 堆
 *
 * @author yclimb
 * @date 2020/9/10
 */
public class Heap {
    public static void main(String[] args) {
        /**
         * https://time.geekbang.org/column/article/69913
         * https://github.com/wangzheng0822/algo/tree/master/java/28_sorts
         * 堆是一种特殊的树
         * 堆这种数据结构的应用场景非常多，最经典的莫过于堆排序了。堆排序是一种原地的、时间复杂度为 O(nlogn) 的排序算法。
         *
         * 什么样的树才是堆。我罗列了两点要求，只要满足这两点，它就是一个堆。
         * 1.堆是一个完全二叉树；
         * 2.堆中每一个节点的值都必须大于等于（或小于等于）其子树中每个节点的值。
         * 对于每个节点的值都大于等于子树中每个节点值的堆，我们叫做“大顶堆”。对于每个节点的值都小于等于子树中每个节点值的堆，我们叫做“小顶堆”。
         *
         * 如何实现一个堆？
         * 1.因为堆是一个完全二叉树，完全二叉树比较适合用数组来存储。用数组来存储完全二叉树是非常节省存储空间的。因为我们不需要存储左右子节点的指针，单纯地通过数组的下标，就可以找到一个节点的左右子节点和父节点。
         * 2.数组从下标1开始存储，数组中下标为 i 的节点的左子节点，就是下标为 i*2 的节点，右子节点就是下标为 i*2+1 的节点，父节点就是下标为 2/i​ 的节点。
         *
         * 插入数据和删除堆顶元素的主要逻辑就是堆化（heapify），所以，往堆中插入一个元素和删除堆顶元素的时间复杂度都是 O(logn)。
         * 堆化实际上有两种，从下往上和从上往下。
         * 堆化非常简单，就是顺着节点所在的路径，向上或者向下，对比，然后交换。
         *
         */

        /**
         * 堆结构：
         * 1.堆是一个完全二叉树；
         * 2.堆中每一个节点的值都必须大于等于（或小于等于）其子树中每个节点的值。
         *
         * 堆实现：
         * 1.因为堆是一个完全二叉树，完全二叉树比较适合用数组来存储。
         * 2.数组从下标1开始存储，数组中下标为 i 的节点的左子节点，就是下标为 i*2 的节点，右子节点就是下标为 i*2+1 的节点，父节点就是下标为 2/i​ 的节点。
         *
         * 堆排序
         * 1.堆顶元素是最大的，每次取堆顶的元素，并将数组中最后一个元素放于堆顶，进行堆化树结构，之后堆顶元素又变成最大的值；
         * 2.再次重复取堆顶元素这个过程，直到剩余最后一个值排序就完成了。
         *
         */
    }
}

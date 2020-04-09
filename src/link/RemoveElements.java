package link;

/**
 * @description: 除链表中等于给定值 val 的所有节点。
 * <p>
 * 示例:
 * <p>
 * 输入: 1->2->6->3->4->5->6, val = 6
 * 输出: 1->2->3->4->5
 * @author: Seldom
 * @time: 2020/1/21 8:59
 */
public class RemoveElements {
    public static ListNode removeElements(ListNode head, int val) {
        ListNode current = head;
        ListNode prev = null;
        while (current != null) {
            if (current.val == val) {
                if (prev == null) {
                    current = current.next;
                    head = current;
                } else {
                    prev.next = current.next;
                    current = current.next;
                }
            } else {
                prev = current;
                current = current.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode l = new ListNode(2);
        ListNode listNode = removeElements(l, 2);
        System.out.println(listNode.val);
    }
}

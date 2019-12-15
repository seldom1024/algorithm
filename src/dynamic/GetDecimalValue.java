package dynamic;

import java.util.HashMap;

/**
 * @description:
 * @author: Seldom
 * @time: 2019/12/15 10:31
 */
public class GetDecimalValue {
    public static int getDecimalValue(ListNode head) {
        if (head == null){
            return 0;
        }
        StringBuilder sb = new StringBuilder();
        while (head.next != null) {
            sb.append(head.val);
            head = head.next;
        }
        sb.append(head.val);
        return Integer.parseInt(sb.toString(), 2);
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(0);
        head.next.next = new ListNode(1);
        System.out.println(getDecimalValue(head));
    }
}

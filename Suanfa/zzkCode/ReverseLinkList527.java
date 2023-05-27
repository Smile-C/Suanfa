package zzkCode;




public class ReverseLinkList527 {
    public static ListNode ReverseList(ListNode head){
        // 处理空链表
        if(head == null){
            return null;
        }
        ListNode cur = head; //当前位置为头节点
        ListNode pre = null; //上一个为空
        while (cur!=null){
            // 断开链接，记录后续
            ListNode temp = cur.next;
            cur.next = pre; // 指向前一个
            pre = cur;  // 前一个更新为当前
            cur = temp;  // 当前更新为后一个
        }
        return pre;

    }

    public static void main(String[] args) {
        // 创建一个链表 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode newHead = ReverseLinkList527.ReverseList(head);

        // 输出翻转后的链表
        while (newHead != null) {
            System.out.print(newHead.val + " ");
            newHead = newHead.next;
        }

    }
}

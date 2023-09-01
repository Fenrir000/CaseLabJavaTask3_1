class CaseLabJavaTask3_1 {
    public static void main(String[] args) {
        Node node=new Node(1,new Node(2,new Node(3,new Node(4))));
        Node.printLinkedList(node);
        Node reversedNode= Node.reverseList(node);
        Node.printLinkedList(reversedNode);

        Node node2=null;
        Node.printLinkedList(node2);
        Node reversedNode2 =Node.reverseList(node2);
        Node.printLinkedList(reversedNode2);
    }
}
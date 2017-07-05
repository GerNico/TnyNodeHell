package nodes;

class ListNode {
    private int val;
    private ListNode next;

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
//    ListNode(int x) {
//        val = x;
//    }

    private int getVal() {
        return val;
    }

    private ListNode getNext() {
        return next;
    }
    private boolean hasNext() {
        return next!=null;
    }

//    ListNode addFirst(int n, ListNode node){
//        return new ListNode(n,this);
//    }

    void addLast (int n, ListNode node){
        ListNode currentNode=this;
        while (currentNode.hasNext())currentNode=currentNode.getNext();
        currentNode.next=new ListNode(n,node);
    }

    void printlnMe(){
        ListNode currenNode=this;int i=1;
        do {
            System.out.print("V"+i+"="+currenNode.getVal());
            if (currenNode.hasNext())System.out.print(" --> ");
            i++;
            currenNode=currenNode.getNext();
        }while (currenNode!=null);
        System.out.println();
    }

    static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        final int maxVal=10;
        if (l1 == null&&l2==null) {System.out.print("both lists are empty");return null;}
        if (l1 == null) {return l2;}
        if (l2 == null) {return l1;}
        int valDiv=0,valMod=0;
        ListNode result=null;
        do {
            if (l1!=null&&l2!=null){
                valMod=(l1.getVal()+l2.getVal()+valDiv)%maxVal;
                valDiv=(l1.getVal()+l2.getVal()+valDiv)/maxVal;

                if(result==null){result=new ListNode(valMod,null);}
                else{result.addLast(valMod,null);}

                l1=l1.getNext();
                l2=l2.getNext();
            }
            if (l1!=null&&l2==null){
                valMod=(l1.getVal()+valDiv)%maxVal;
                valDiv=(l1.getVal()+valDiv)/maxVal;
                result.addLast(valMod,null);
                l1 = l1.getNext();
            }
            if (l1==null&&l2!=null){
                valMod=(l2.getVal()+valDiv)%maxVal;
                valDiv=(l2.getVal()+valDiv)/maxVal;
                result.addLast(valMod,null);
                l2 = l2.getNext();
            }
            if (l1==null&&l2==null){
                if (valDiv!=0)result.addLast(valMod,null);
                break;
            }
        } while (true);
        return result;
    }
}


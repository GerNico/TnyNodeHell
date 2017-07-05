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
        ListNode currentNodeL1,currentNodeL2;
        if (l1 == null&&l2==null) {System.out.print("both lists are empty");return null;}
        if (l1 == null) {return l2;}
        if (l2 == null) {return l1;}
        currentNodeL1=l1;currentNodeL2=l2;int valDiv=0,valMod=0;//todo: make cloning
        ListNode result=null;
        do {
            if (currentNodeL1!=null&&currentNodeL2!=null){
                valMod=(currentNodeL1.getVal()+currentNodeL2.getVal()+valDiv)%maxVal;
                valDiv=(currentNodeL1.getVal()+currentNodeL2.getVal()+valDiv)/maxVal;

                if(result==null){result=new ListNode(valMod,null);}
                else{result.addLast(valMod,null);}

                currentNodeL1=currentNodeL1.getNext();
                currentNodeL2=currentNodeL2.getNext();
            }
            if (currentNodeL1!=null&&currentNodeL2==null){
                valMod=(currentNodeL1.getVal()+valDiv)%maxVal;
                valDiv=(currentNodeL1.getVal()+valDiv)/maxVal;
                result.addLast(valMod,null);
                currentNodeL1 = currentNodeL1.getNext();
            }
            if (currentNodeL1==null&&currentNodeL2!=null){
                valMod=(currentNodeL2.getVal()+valDiv)%maxVal;
                valDiv=(currentNodeL2.getVal()+valDiv)/maxVal;
                result.addLast(valMod,null);
                currentNodeL2 = currentNodeL2.getNext();
            }
            if (currentNodeL1==null&&currentNodeL2==null){
                if (valDiv!=0)result.addLast(valMod,null);
                break;
            }
        } while (true);
        return result;
    }
}


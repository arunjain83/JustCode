public class BinarySearch {
    public static void main(String[] arg){
        BSTNode node = new BSTNode(10);
        int num=3;
        binarySearch(node, num);
    }

    public static BSTNode binarySearch(BSTNode root, int num){
        if(root == null){
            return null;
        }
        while(root !=null ){
            if (num>root.getData()){
                root=root.getRight();
            }else if(num< root.getData()){
                root=root.getLeft();
            }else{
                return root;
            }
        }
        return null;
    }
}

 class BSTNode {

    private int data;
    private BSTNode left;
    private BSTNode right;

    public BSTNode(int data){
        this.data = data;
    }

     public int getData() {
         return data;
     }

     public void setData(int data) {
         this.data = data;
     }

     public void setLeft(BSTNode left) {
        this.left = left;
    }

    public void setRight(BSTNode right) {
        this.right = right;
    }

    public BSTNode getLeft() {
        return left;
    }

    public BSTNode getRight() {
        return right;
    }
}

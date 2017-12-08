package algorithm;

//import java.util.Stack;

public class FlattenTreeLinkedList114 {
	TreeNode pre=null;
    public void flatten(TreeNode root) {
    	if(root==null) return;
    	
    	flatten(root.right);
    	flatten(root.left);
    	root.right=pre;
    	root.left=null;
    	pre=root;
    	
    	
    	
    	
//    	Stack<TreeNode> stack=new Stack<>();
//    	while(!stack.isEmpty()||root.right!=null||root.left!=null){
//    		if(root.right!=null)
//    		stack.push(root.right);
//    		if(root.left!=null)
//    		stack.push(root.left);
//    		if(stack.isEmpty()) break;
//    		root.left=null;
//    		root.right=stack.pop();
//    		root=root.right;
//    	}
    }
}

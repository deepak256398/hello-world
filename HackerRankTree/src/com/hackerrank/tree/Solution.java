package com.hackerrank.tree;

import java.util.ArrayList;

public class Solution {
	public static void main(String[] args) {
		Node h=new Node();
		Node b=new Node();
		Node c=new Node();
		Node d=new Node();
		Node e=new Node();
		Node f=new Node();
		Node g=new Node();
		h.data=3;
		h.left=b;
		h.right=e;
		b.data=5;
		b.left=c;
		b.right=d;
		c.data=1;
		c.left=null;
		c.right=null;
		d.data=4;
		d.left=null;
		d.right=null;
		e.data=2;
		e.left=f;
		e.right=null;
		f.data=6;
		f.left=g;
		f.right=null;
		g.data=7;
		g.left=null;
		g.right=null;
		LevelOrder(h);
	}
	
	void decode(String S ,Node root)
    {
		Node start=root;
		Node temp;
		int val=0;
		Character t=null;
		int i=0;
		while(i<S.length()){
			start=root;
			for(int j=i;;j++){
				val=t.getNumericValue(S.charAt(j));
				if(val==0){
					if(start.left!=null){
						start=start.left;
						if(start.left==null && start.right==null){
							System.out.println(start.data);
							i=j+1;
							break;
						}else{
							continue;
						}
					}
					
				}else{
					if(start.right!=null){
						start=start.right;
						if(start.right==null && start.left==null){
							System.out.println(start.data);
							i=j+1;
							break;
						}else{
							continue;
						}
					}
				}
			}
		}
    }
	
	void execute(Node root, String s, int i){
		int val=s.charAt(i);
	}
	
	

	void Preorder(Node root) {
	    Node left=root.left;
	    Node right=root.right;
	    int data=root.data;
	    System.out.print(data+" ");
	    if(left==null){
	        if(right==null){
	            return;
	        }else{
	            Preorder(root.right);
	        }
	    }else {
	        Preorder(root.left);
	    }if(right==null){
	        return;
	    }else{
	        Preorder(root.right);
	    }
	    
	}

	void Postorder(Node root) {
	    Node left=root.left;
	    Node right=root.right;
	    int data=root.data;
	    //System.out.print(data+" ");
	    if(left==null){
	        if(right==null){
                System.out.print(data+" ");
	            return;
	        }else{
	            Postorder(root.right);
                System.out.print(data+" ");
	        }
	    }else {
	        Postorder(root.left);
	    }
        if(right==null){
            System.out.print(data+" ");
	        return;
	    }else{
	        Postorder(root.right);
            System.out.print(data+" ");
	    }
	    
	}
	
	void Inorder(Node root) {
	    Node left=root.left;
	    Node right=root.right;
	    int data=root.data;
	    //System.out.print(data+" ");
	    if(left==null){
            System.out.print(data+" ");
	        if(right==null){
	            return;
	        }else{
	            Inorder(root.right);
	        }
	    }else {
	        Inorder(root.left);
            System.out.print(data+" ");
	    }
        if(right==null){
	        return;
	    }else{
	        Inorder(root.right);
	    }
	    
}

	static int height(Node root)
    {
       Node left;
       Node right;
       int lev=0;
       int leftChildLevel=0;
       int rightChildLevel=0;
       if(root.left==null){
           
       }else{
           leftChildLevel=height(root.left);
       }
       if(root.right==null){
    	   if(leftChildLevel!=0){
    		   return leftChildLevel+1;
    	   }else{
    		   return 1;
    	   }
           
       }else{
           rightChildLevel=height(root.right);
           if(rightChildLevel<leftChildLevel){
               return leftChildLevel+1;
           }else{
               return rightChildLevel+1;
           }
       }
    }
	
	static void LevelOrder(Node root)
    { 
       ArrayList<Node> a=new ArrayList<Node>();
       Node temp;
       a.add(root);
       while(a.size()!=0){
           System.out.print(a.get(0).data+" ");
           temp=a.get(0);
           a.remove(0);
           if(temp.left!=null){
               a.add(temp.left);
           }if(temp.right!=null){
               a.add(temp.right);
           }
       }
    }

}
class Node{
	int data;
	Node left;
	Node right;
}
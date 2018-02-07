package rmuti.Tree;

import rmuti.ds.Node;
import rmuti.ds.TreeDraw;

public class App2 
{
    public static void main( String[] args )
    {	
    	Node h = new Node("h",null,null);
       	Node i = new Node("i",null,null);
       	Node e = new Node("e",h,i);
       	Node f = new Node("f",null,null);
    	Node g = new Node("g",null,null);
       	Node ff = new Node("f",null,null);
       
       	
       	Node b = new Node("b",e,f);
       	Node c = new Node("c",g,ff);
       
       	
       	
       	Node root = new Node("a",b,c);
       	TreeDraw drawTree = new TreeDraw(root);
       	drawTree.binaryTreeDraw();
    }
}

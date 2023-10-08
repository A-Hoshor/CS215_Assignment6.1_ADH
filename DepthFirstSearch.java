import java.util.*;
/*
 * A class that traverses a tree and prints out the node it has traversed.
 * @author Alyssa H
 */

public class DepthFirstSearch {       
       Node root;
       private int traverse;
       private int height;
       private int leftHeight;
       private int rightHeight;
       
       /*
        * Constructor to conduct the depth first search and print out nodes in the appropriate order.
        */
       public DepthFirstSearch()
       {               
                   System.out.println("Call DFS with root node to do a Depth First Search.");
       }
        public void DFS(Node node)        {
                   System.out.println(node.getData()); 
                   if (node.getlChild()==null) {
                	   return;
                   } else {
                	   traverse++;
                	   DFS(node.getlChild());
                	   traverse++; 
                	   DFS(node.getrChild());
                
                   }
                  
        }//end DFS
        
        /*
         * A method to get the total number of nodes traversed.
         * @return traversed nodes
         */
        public int traverseTotal() {
        	return traverse;
        }//end traverseTotal

}
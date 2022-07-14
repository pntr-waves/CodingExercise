package truong.e1000.binarytree.service;

import truong.e1000.binarytree.model.Node;

public class BinaryTreeService {
    public int countOneChildNode (Node root) {
        if (root == null) return 0;
        
        int temp = 0;
        if ((root.left == null && root.right != null) || (root.left != null && root.right == null)) {
            temp = 1;
        }
        
        return temp + countOneChildNode(root.left) + countOneChildNode(root.right);
    }
    
    public int countTwoChildNode (Node root) {
        if (root == null) return 0;
        
        int temp = 0;
        if (root.left != null && root.right != null) temp = 1;
        
        return temp + countTwoChildNode(root.left) + countTwoChildNode(root.right);
    }
    
    public int countEvenNode (Node root) {
        if (root == null) return 0;
        
        int temp = 0;
        if (root.getData() % 2 == 0) temp = 1;
        
        return temp + countEvenNode(root.left) + countEvenNode(root.right);
    }
    
    public int countEvenLeafNode (Node root) {
        if (root == null) return 0;
        
        if (root.left == null && root.right == null && root.getData() % 2 == 0) return 1;
        
        return countEvenLeafNode(root.left) + countEvenLeafNode(root.right);
    }
    
    public int countOneChildPrimeNode (Node root) {
        if (root == null) return 0;
        
        int temp = 0;
        if ((root.left != null && root.right == null) || (root.left == null && root.right != null)) {
            if (isPrime(root.getData())) temp = 1;
        }
        
        return temp + countOneChildPrimeNode(root.left) + countOneChildPrimeNode(root.right);
    }
    
    private boolean isPrime (int number) {
        if (number <= 1) return false;
        
        if (number == 2) return true;
        
        for (int i = 3; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        
        return true;
    }
    
    private boolean isPerfectSquare (int number) {
        if (number >= 0) {
            int n = (int) Math.sqrt(number);
            
            return n * n == number;
        }
        
        return false;
    }
    
    public int countTwoChildPerfectSquareNode (Node root) {
        if (root == null) return 0;
        
        int temp = 0;
        if (root.left != null && root.right != null) {
            if (isPerfectSquare(root.getData())) temp = 1;
        }
        
        return temp + countTwoChildPerfectSquareNode(root.left) + countTwoChildPerfectSquareNode(root.right);
    }
    
    public int countNodeWithLevel (Node root, int level) {
        return countNodeWithLevel(root, level, 0);
    }
    
    private int countNodeWithLevel (Node root, int level, int temp) {
        if (root == null) return 0;
        
        int c = 0;
        if (temp == level) c = 1;
        
        return c + countNodeWithLevel(root.left, level, temp + 1) + countNodeWithLevel(root.right, level, temp + 1);
    }
    
    public int countNodeLowerThanLevel (Node root, int level) {
        return countNodeLowerThanLevel(root, level, 0);
    }
    
    private int countNodeLowerThanLevel (Node root, int level, int temp) {
        if (root == null) return 0;
        
        int c = 0;
        if (temp > level) c = 1;
        
        return c + countNodeLowerThanLevel(root.left, level, temp + 1) + countNodeLowerThanLevel(root.right, level, temp + 1);
    }
    
    public int countNodeHigherThanLevel (Node root, int level) {
        return countNodeHigherThanLevel(root, level, 0);
    }
    
    private int countNodeHigherThanLevel (Node root, int level, int temp) {
        if (root == null) return 0;
        
        int c = 0;
        if (temp < level) c = 1;
        
        return c + countNodeHigherThanLevel(root.left, level, temp + 1) + countNodeHigherThanLevel(root.right, level, temp + 1);
    }
    
    public int getTotalData (Node root) {
        if (root == null) return 0;
        
        return root.getData() + getTotalData(root.left) + getTotalData(root.right);
    }
    
    public int getTotalLeafNodeData (Node root) {
        if (root == null) return 0;
        
        int temp = 0;
        if (root.left == null && root.right == null) temp = root.getData();
        
        return temp + getTotalLeafNodeData(root.left) + getTotalLeafNodeData(root.right);
    }
    
    public int getTotalOneChildNodeData (Node root) {
        if (root == null) return 0;
        
        int temp = 0;
        if ((root.left == null && root.right != null) || (root.left != null && root.right == null)) temp = root.getData();
        
        return temp + getTotalOneChildNodeData(root.left) + getTotalOneChildNodeData(root.right);
    }
    
    public int getTotalTwoChildNodeData (Node root) {
        if (root == null) return 0;
        
        int temp = 0;
        if (root.left != null && root.right != null) temp = root.getData();
        
        return temp + getTotalTwoChildNodeData(root.left) + getTotalTwoChildNodeData(root.right);
    }
    
    public int getTotalOddData (Node root) {
        if (root == null) return 0;
        
        int temp = 0;
        if (root.getData() % 2 != 0) temp = root.getData();
        
        return temp + getTotalOddData(root.left) + getTotalOddData(root.right);
    }
    
    public int getTotalEvenDataOfLeaf (Node root) {
        if (root == null) return 0;
        
        if (root.left == null && root.right == null) {
            if (root.getData() % 2 == 0) return root.getData();
        }
        
        return getTotalEvenDataOfLeaf(root.left) + getTotalEvenDataOfLeaf(root.right);
    }
    
    public int getTotalPrimeDataOfOneChildNode (Node root) {
        if (root == null) return 0;
        
        int temp = 0;
        if ((root.left != null && root.right == null) || (root.left == null && root.right != null)) {
            if (isPrime(root.getData())) {
                temp = root.getData();
            }
        }
        
        return temp + getTotalPrimeDataOfOneChildNode(root.left) + getTotalPrimeDataOfOneChildNode(root.right);
    }
    
    public int getTotalPerfectSquareDataOfTwoChildNode (Node root) {
        if (root == null) return 0;
        
        int temp = 0;
        if (root.left != null && root.right != null) {
            if (isPerfectSquare(root.getData())) {
                return temp = root.getData();
            }
        }
        
        return temp + getTotalPerfectSquareDataOfTwoChildNode(root.left) + getTotalPerfectSquareDataOfTwoChildNode(root.right);
    }
    
    public int findMaxValue (Node root) {
        Node temp = root;
        while (temp.right != null) {
            temp = temp.right;
        }
        
        return temp.getData();
    }
    
    public int findMinValue (Node root) {
        Node temp = root;
        while (temp.left != null) {
            temp = temp.left;
        }
        
        return temp.getData();
    }
    
    public Node getMaxValueNode (Node root) {
        Node temp = root;
        while (temp.right != null) {
            temp = temp.right;
        }
        
        return temp;
    }
    
    public Node getNodeByValue (Node root, int x) {
        if (root == null) return null;
        
        if (root.getData() == x) {
            return root;
        }
        
        if (root.getData() < x) {
            return getNodeByValue(root.right, x);
        }    
        
        return getNodeByValue(root.left, x);
    }
    
}

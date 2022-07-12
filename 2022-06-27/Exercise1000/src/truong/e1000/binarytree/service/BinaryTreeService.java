package truong.e1000.binarytree.service;

import truong.e1000.binarytree.model.BinaryTree;
import truong.e1000.binarytree.model.Node;

public class BinaryTreeService {
    public int getMaxData (BinaryTree tree) {
        return getMaxData(tree.root);
    }
    
    private int getMaxData (Node root) {
        if (root != null) {
            int max = root.getData();
            int leftMax = getMaxData(root.left);
            int rightMax = getMaxData(root.right);
            
            if (max < leftMax) {
                max = leftMax;
            }
            
            if (max < rightMax) {
                max = rightMax;
            }
            
            return max;
        }
        
        return Integer.MIN_VALUE;
    }
    
    public int countData (BinaryTree tree, int limitedData) {
        return countData(tree.root, limitedData);
    }
    
    private int countData (Node root, int limitedData) {
        if (root != null && root.getData() > limitedData) {
            return 1 + countData(root.left, limitedData) + countData(root.right, limitedData);
        } 
        
        return 0;
    }
    
    public int getTotalData (BinaryTree tree, int limitedData) {
        return getTotalData(tree.root, limitedData);
    }
    
    private int getTotalData (Node root, int limitedData) {
        if (root != null) {
            return (root.getData() < limitedData ? root.getData() : 0) + getTotalData(root.left, limitedData) + getTotalData(root.left, limitedData);
        } else {
            return 0;
        }
        
    }
    
    public boolean checkDataExist (BinaryTree tree, int data) {
        return checkDataExist(tree.root, data);
    }
    
    private boolean checkDataExist (Node root, int data) {
        if (root != null) {
            if (root.getData() == data) return true;
            
            boolean leftCheck = checkDataExist(root.left, data);
            if (leftCheck) return leftCheck;
            
            boolean rightCheck = checkDataExist(root.right, data);
            return rightCheck;
        }
        
        return false;
    }
    
    public Node findData (BinaryTree tree, int data) {
        return findData(tree.root, data);
    }
    
    private Node findData (Node root, int data) {
        if (root == null) {
            return null;
        }
        
        if (root.getData() == data) {
            return root;
        }
        
        Node leftNode = findData(root.left, data);
        if (leftNode != null) return leftNode;
        
        return findData(root.right, data);
    }
    
    public Node deleteNode (BinaryTree tree, int data) {
        return deleteNode(tree.root, data);
    }
    
    private Node deleteNode (Node root, int data) {
        if (root == null) {
            return null;
        }
        
        if (root.getData() < data) {
            root.right = deleteNode(root.right, data);
        } else if (root.getData() > data) {
            root.left = deleteNode(root.left, data);
        } else {
            if (root.left == null || root.right == null) {
                Node temp = root.left == null ? root.right : root.left;
                return temp;
            } else {
                Node temp = root.right;
                while (temp.left != null) {
                    temp = temp.left;
                }
                root.setData(temp.getData());
                root.right = deleteNode(root.right, temp.getData());
                return root;
            }
        }
        
        return root;
    }
}

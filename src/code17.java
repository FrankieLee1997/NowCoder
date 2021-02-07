class binaryTree{
    int value = 0;
    binaryTree left = null;
    binaryTree right = null;

    public binaryTree(int value){
        this.value = value;
    }
}

//判断B子树不是A的子结构
public class code17 {
    public boolean check(binaryTree tree1, binaryTree tree2){
        if (tree1 == null) return true;
        if (tree2 == null) return false;
        if (tree1.value != tree2.value) return false;
        return check(tree1.left, tree2.left) && check(tree1.left, tree2.right)
                && check(tree1.right, tree2.left) && check(tree1.right, tree2.right);
    }

    public boolean isNotSubTree(binaryTree aTree, binaryTree bTree){
        boolean result = false;
        if (aTree == null || bTree == null)
            return false;
        if (aTree.value == bTree.value){
            result = check(aTree, bTree);
        }
        if (!result){
            result = isNotSubTree(aTree.left, bTree);
        }
        if (!result){
            result = isNotSubTree(aTree.right, bTree);
        }

        return result;
    }
}
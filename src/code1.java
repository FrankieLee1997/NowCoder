public class code1 {
    public boolean FindNum(int [][] array, int target){
        // 初始化行,第一行
        int row = 0;
        // 定义列，最后一列，永远能表示每行的最大值
        int col = array[0].length - 1;
        while(row < array.length && col >= 0){
            // 某行最大值大于目标值，目标值只有可能在该值左侧
            if(array[row][col] > target)
                col --;
            else if(array[row][col] < target)
                row ++;
            else
                return true;
        }
        return false;
    }

    public static void main(String[] args){
        code1 code1 = new code1();
        int[][] array = {{1,2,3},{4,5,6}};
        System.out.println(code1.FindNum(array, 4));
    }
}

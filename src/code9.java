public class code9 {
    public int jump(int n){
        int count = 0;
        if (n == 1) {
            count = 1;
        }
        else if (n >= 2) {
            // 直接一步跳上n级，默认设置为步数从1开始计算
            int temp = 1;
            for(int i = 1; i < n; i++) {
                temp = temp + jump(i);
            }
            count = temp;
        }
        return count;
    }

    public static void main(String args[]) throws Exception {
        code9 code9 = new code9();
        System.out.println(code9.jump(5));
    }
}

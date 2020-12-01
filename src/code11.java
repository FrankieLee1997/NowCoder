public class code11 {
    public int NumOfOne(int n){
        int count = 0;
        while (n != 0){
            count ++;
            n = n & (n - 1);
        }
        System.out.println(count);
        return count;
    }

    public static void main(String[] args){
        code11 code11 = new code11();
        code11.NumOfOne(31);
    }
}

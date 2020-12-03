public class code12 {
    public float expo(double base, int exponent){
        float num = 1;
        if(base == 0){
            return 0;
        }
        int ex = Math.abs(exponent);
        for(int i = 1; i <= ex; i++){
            num = (float) (num * base);
        }
        if(exponent > 0)
            return num;
        else
            return 1/num;
    }

    public static void main(String[] args){
        code12 code12 = new code12();
        float result;
        result = (float)(code12.expo(2,-3));
        System.out.println(result);
    }
}

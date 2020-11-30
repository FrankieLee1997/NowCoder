public class code10 {
    public int Cover(int n) throws Exception {
        if(n <= 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        if(n == 2){
            return 2;
        }
        if(n >= 3){
            return Cover(n-1) + Cover(n-2);
        }
        else throw new Exception("...");
    }
    public static void main(String args[]) throws Exception {
        code10 code10 = new code10();
        System.out.println(code10.Cover(5));
    }
}

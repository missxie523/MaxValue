public class MaxValue {
    public static void main(String[] args) {
        int[] array = new int[]{2,13,5,6,7};
        int max = Integer.MIN_VALUE;
        for(int i: array){
            //max = (max > i) ? max : i; //ternary operator
            if(max < i){
                max = i;
            }
        }
        System.out.println(max);
    }
}

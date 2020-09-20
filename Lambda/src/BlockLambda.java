class Block{
    interface StrFunc{
        String func(String n);
    }
}
class   BlockLambda{
    public static void main(String[] args) {
        Block.StrFunc strFunc;
        strFunc=(what)->{
            String result ="";
            for(int i=what.length()-1;i>=0;i--){
                result+=what.charAt(i);
            }
            return result;
        };
        System.out.println("lambda reversed is "+strFunc.func("lambda"));
    }
}
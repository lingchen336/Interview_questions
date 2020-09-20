
class GenericInterface{
    interface GenericFunctional<T>{
        T func(T t);
    }
}

public class GenericFunctionalInterfaceDemo {
    public static void main(String[] args) {

        GenericInterface.GenericFunctional<String> genericFunctional=(str)->{
            String result="";
            for(int i=str.length()-1;i>=0;i--){
                result+=str.charAt(i);
            }
            return result;
        };
        System.out.println("lambda reversed is"+genericFunctional.func("lambda"));

        GenericInterface.GenericFunctional<Integer> genericFunctional1=(fac)->{
            Integer s=1;
            for(int i=1;i<=fac;i++){
                s=i*s;
            }
            return s;
        };
        System.out.println("the factoral of 5 is " +genericFunctional1.func(5));
    }
}

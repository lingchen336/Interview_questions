package  com.test.temp;

import java.util.*;

public class Al_22{
    public static void main(String[] args) {

    }
    public  class solution{
        public List<List<Integer>> combination(int []can,int target){
            int len=can.length;
            List<List<Integer>>res=new ArrayList<>();
            if(len==0){
                return res;
            }
            Arrays.sort(can);
            Deque<Integer> path=new ArrayDeque<>();
            dfs(can,0,len,target,path,res);
            return res;
        }
        public void dfs(int can[],int begin,int len,int target,Deque path,List<List<Integer>> res){
            if(target==0){
                res.add(new ArrayList<>(path));
                return;
            }
            for (int i = begin; i <len ; i++) {
                if(target-can[i]<0)
                    break;
                path.addLast(can[i]);
                dfs(can,i,len,target-can[i],path,res);
                path.removeLast();
            }
        }
    }
}

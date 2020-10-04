package com.test.algorithm.jianzhi;

/*
输入一个字符串，打印出该字符串中字符的所有排列。

你可以以任意顺序返回这个字符串数组，但里面不能有重复元素。
 */

        import java.util.HashSet;
        import java.util.Set;

class O_38 {
    Set<String > set=new HashSet<>();
    public String[] permutation(String s) {
        if(s==null)return new String []{};
        boolean[]visited=new boolean[s.length()];
        process(s,"",visited);
        return set.toArray(new String[set.size()]);
    }

    void process(String s,String letter,boolean[]visited){
        if(s.length()==letter.length()){
            set.add(letter);
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            char temp=s.charAt(i);
            if(visited[i])continue;
            visited[i]=true;
            process(s,letter+temp,visited);
            visited[i]=false;
        }
    }
}
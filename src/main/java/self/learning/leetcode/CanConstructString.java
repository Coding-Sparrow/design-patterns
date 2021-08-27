package self.learning.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class CanConstructString {

    static Set<String> set = new HashSet<>();
    public static void main(String[] args) {
        boolean canConstruct = canConstruct("abcdef",new String[]{"ab","abc","cd","def","abcd"});
        System.out.println("result : " + canConstruct);
        boolean canConstruct2 = canConstruct("enterapotentpot",new String[]{"a","p","ent","enter","ot","o","t"});
        System.out.println("result : " + canConstruct2);
        boolean canConstruct3 = canConstruct("skateboard",new String[]{"bo","rd","ate","t","ska","sk","boar"});
        System.out.println("result : " + canConstruct3);
    }

    private static boolean canConstruct(String target, String[] strings) {
        if(set.contains(target)) return true;
        if(target.equals("")) return true;
        for(String str: strings){
            if(target.indexOf(str) == 0){
                String suffix = target.substring(str.length());
                if(canConstruct(suffix,strings)) {
                    set.add(suffix);
                    return true;
                }
            }
        }
        return false;
    }
}

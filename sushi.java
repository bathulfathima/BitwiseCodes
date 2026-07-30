import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        HashMap<Integer,Integer> m = new HashMap<>();
        m.put(0,-1);
        int sum=0,max=0;

        for(int i=0;i<s.length();i++){
            sum += "aeiou".indexOf(s.charAt(i))!=-1 ? 1 : -1;
            if(m.containsKey(sum))
                max=Math.max(max,i-m.get(sum));
            else
                m.put(sum,i);
        }
        System.out.println(max);
    }
}

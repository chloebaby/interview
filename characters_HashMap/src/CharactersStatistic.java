import java.util.HashMap;

public class CharactersStatistic {
    public static void main(String[] args){
        String str="aaddfff";
        char[] arrays = new char[str.toCharArray().length];
        arrays = str.toCharArray();
        HashMap<Character,Integer> map = new HashMap<>();
        for(Character c: arrays){
            if(map.containsKey(c))
            {
                map.put(c,map.get(c)+1);
            }
            else{
                map.put(c,1);
            }
        }
        for(Character key : map.keySet()){
            Integer value = map.get(key);
            System.out.println(key+"  "+value);
        }
    }

}

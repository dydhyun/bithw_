package hw_05woal._10;

import java.util.*;

public class Middle10 {
    public static void main(String[] args) {
        stuInfo();
        System.out.println("====================");
        Map<Integer, Integer>  mulMap = new HashMap<Integer, Integer>();
        mulMap.put(2, 2);
        mulMap.put(30, 4);
        mulMap.put(6, 5);
        mulMap.put(5, 1);
        System.out.println("key * value 의 최고값을 구합니다." + '\n' + getMaxMul(mulMap));
        System.out.println("====================");
        Map<Integer, Integer> result = printKVDesc(mulMap);
        for (Map.Entry<Integer, Integer> entry : result.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }


    //1. 학생이름을 key로 시험점수를 value로 가지는 Map<String, Integer>를 생성하고
    //  4명의 학생 데이터를 입력한 후 4명 중 최고 점을 맞은 학생의 이름과 점수을 출력하세요.(이름 : 90)
    public static void stuInfo() {
        Map<String, Integer> stuInfo = new HashMap<String, Integer>();
        Scanner sc = new Scanner(System.in);

        System.out.println("실행하려면 숫자를 입력하세요. (종료: 0)");
        int menu = sc.nextInt();
        sc.nextLine();
        if (menu == 0) {
            System.out.println("종료합니다.");
        }
        else {
                for (int i = 0; i < 4; i++) {
                    System.out.println("학생" + (i + 1) + "이름 입력:");
                    String sName = sc.nextLine();
                    System.out.println("점수 입력:");
                    int sScore = sc.nextInt();
                    sc.nextLine();

                    stuInfo.put(sName, sScore);
                }
                String topStudent = Collections.max(stuInfo.entrySet(), Map.Entry.comparingByValue()).getKey();
                int topScore = stuInfo.get(topStudent);

                System.out.println("최고점의 학생은 " + topStudent + ", " + topScore + " 점" + "입니다.");

        }
    }


    //2. 매개변수로 Map<Integer, Integer>이 주어졌을 때
    // key, value의 곱이 가장 큰 Entry를 리턴하는 메소드 getMaxMul을 구현하세요.
    public static Map.Entry getMaxMul(Map<Integer, Integer> mulMap){
        Iterator<Integer> kIter = mulMap.keySet().iterator();
        //Iterator<Integer> vIter = mulMap.values().iterator();
        Map.Entry maxMap = null;
        int preMul = 0;
        for (Map.Entry<Integer, Integer> entry : mulMap.entrySet()) {
            System.out.println("key : " + entry.getKey());
            System.out.println("value : " + entry.getValue());
            System.out.println(entry.getKey() * entry.getValue());
            if(entry.getKey() * entry.getValue() >= preMul){
                maxMap = entry;
                preMul = entry.getKey() * entry.getValue();
            }
        }

        return maxMap;
    }


    //3. Map<Integer, Integer>을 매개변수로 받아서 key는 정순 출력,
    //value는 역순 출력하는 printKVDesc라는 메소드를 구현하세요.
    //{1: 3, 2: 4, 3: 5}
    //1 : 5
    //2 : 4
    //3 : 3
    public static LinkedHashMap<Integer, Integer> printKVDesc(Map<Integer, Integer> map) {
            List<Integer> keys = new ArrayList<>(map.keySet());
            List<Integer> values = new ArrayList<>(map.values());

            Collections.sort(keys);
            values.sort(Collections.reverseOrder());

            LinkedHashMap<Integer, Integer> sortedMap = new LinkedHashMap<>();
            for (int i = 0; i < keys.size(); i++) {
                sortedMap.put(keys.get(i), values.get(i));
            }
            return sortedMap;
        }


}
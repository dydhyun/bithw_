package hw_05woal._14;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BasicPractCollec {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Map<String, String> dMap = new HashMap<String, String>();
        Map<String, Integer> fdMap = new HashMap<String, Integer>();
        dMap.put("aa","ss");
        dMap.put("bb","dd");
        dMap.put("cc","ff");


        checkDiction(dMap, sc);

        foodMenuChoice(fdMap, sc);

    }


    //**********************Dictionary****************************
    public static void checkDiction(Map<String, String> dMap, Scanner sc){
        System.out.println(dMap.keySet());
        System.out.println("=============");
        System.out.println(dMap.values());
        System.out.println("=============");
        System.out.println(dMap.entrySet());
        System.out.println("=============");
        System.out.print("검색단어 입력:");
        String str = sc.nextLine();
//        if(dMap.containsKey(str)){
//            System.out.println(dMap.get(str));
//        }
//        else{
//            System.out.println("sss");
//        }
        System.out.println(dMap.getOrDefault(str, "havent"));
    }

    //**********************FoodStore****************************
    public static void foodMenuChoice(Map<String, Integer> fdMap, Scanner sc){
        boolean exit = false;
        while(!exit){
            System.out.println("---1:메뉴 등록---2:메뉴 불러오기---3:종료---4:주문---");
            int menu = sc.nextInt();
            sc.nextLine();

            if(menu == 1){
                addFood(fdMap, sc);
            } else if (menu == 2) {
                showFood(fdMap);
            } else if (menu == 3) {
                exit = true;
                System.out.println("종료합니다.");
            } else if (menu == 4) {
                orderFood(fdMap, sc);
            }
        }
    }

    public static Map addFood(Map<String, Integer> fdMap, Scanner sc){
        System.out.print("음식 이름: ");
        String fdName = sc.nextLine();
        System.out.print("음식 가격: ");
        Integer fdPrice = sc.nextInt();
        sc.nextLine();
        fdMap.put(fdName, fdPrice);
        return fdMap;
    }
    public static void showFood(Map<String, Integer> fdMap){
        System.out.println("--등록된 음식--");
        for (Map.Entry<String, Integer> entry : fdMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue() + " 원");
        }
    }
    public static void orderFood(Map<String, Integer> fdMap, Scanner sc){
        boolean order = true;
        int totalCost = 0;

        if(!fdMap.isEmpty()){
            while(order) {
                System.out.println("주문을 더 하겠습니까?(true/false)");
                order = sc.nextBoolean();
                sc.nextLine();

                if(!order){
                    System.out.println("총 금액은 " + totalCost + "원 입니다.");
                    break;
                }else {
                    totalCost += payFd(fdMap, sc);
                }
            }
        }else {
            System.out.println("메뉴가 비어있습니다.");
        }
    }
    public static int payFd(Map<String, Integer> fdMap, Scanner sc){
        System.out.println("주문할 메뉴를 입력하세요.");
        String fdInput = sc.nextLine();

        if(fdMap.containsKey(fdInput)){
            System.out.println("수량을 입력하세요.");
            int count = sc.nextInt();
            return fdMap.get(fdInput) * count;
        }else {
            System.out.println("등록되지 않은 메뉴 입니다.");
            return 0;
        }
    }
    //**********************StudentClass****************************

}

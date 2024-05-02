package _02_;

import _01_.UserBook;

public class UseUB {
    public static void main(String[] args) {
        UserBook ub = new UserBook();
        ub.saveUserInfo("kk","kk");
        ub.saveUserInfo("zz","zz");
        for(int i = 0; i < ub.index; ++i){
            System.out.println(ub.arr[i].getId());
            System.out.println(ub.arr[i].getUserName());
            System.out.println(ub.arr[i].getPassword());
        }

    }
}

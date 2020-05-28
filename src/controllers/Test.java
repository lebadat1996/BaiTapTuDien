package controllers;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        String name = "hello";
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("hello", "Xin chao");
        hashMap.put("class", "lop hoc");
        hashMap.put("home", "ngoi nha");
        hashMap.put("student", "hoc sinh");
        Set<String> keySet = hashMap.keySet();
        for (String key : keySet) {
            if (name.equals(key)) {
                System.out.println(hashMap.get(key));
            }
            return;
        }
        System.out.println("khong co");

    }
}

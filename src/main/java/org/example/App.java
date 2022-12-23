package org.example;
import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class App {
    private static final String REGEX = "[a-zA-ZА-Яа-я]+";

    public static void main(String[] args) {
        //1)  Подсчитать количество вхождения каждого слова
//        Map<String, Integer> map = new HashMap<>();
//        String str = "Россия идет вперед всей планеты. Планета — это не Россия.Идет Россия своим путем. Россия - это мы.";
//        Pattern p = Pattern.compile(REGEX);
//        List<String> allMatches = new ArrayList<String>();
//        Matcher m = p.matcher(str);
//        while(m.find()){
//            allMatches.add(m.group().toLowerCase());
//        }
//        System.out.println(allMatches);
//        for (int i = 0; i < allMatches.size(); i++) {
//            if (map.containsKey(allMatches.get(i))) {
//                map.put(allMatches.get(i), map.get(allMatches.get(i)) + 1);
//            } else {
//                map.put(allMatches.get(i),1);
//            }
//        }
//        for (Map.Entry<String, Integer> entry :map.entrySet()) {
//            System.out.println("Слово - " + entry.getKey() + "  , встретилось : " + entry.getValue());
//        }
//
    // 2) Подсчитать количество искомого слова, через map (наполнением значение, где искомое слово будет являться ключом
//        String str_1 = "Россия идет вперед всей планеты. Планета — это не Россия. Идет Россия своим путем. Россия - это мы.";
//        Map<String, Integer> map_1 = new HashMap<>();
//        Pattern p1 = Pattern.compile(REGEX);
//        List<String> allMatches_2 = new ArrayList<String>();
//        Matcher m1 = p1.matcher(str_1);
//        while(m1.find()){
//            allMatches_2.add(m1.group().toLowerCase());
//        }
//        System.out.println(allMatches_2);
//        for (int i = 0; i < allMatches_2.size(); i++) {
//            if (map_1.containsKey(allMatches_2.get(i))) {
//                map_1.put(allMatches_2.get(i), map_1.get(allMatches_2.get(i)) + 1);
//            } else {
//                map_1.put(allMatches_2.get(i), 1);
//            }
//        }
//        System.out.println("Введите слово, искомое количество которого желаете найти: ");
//        Scanner scanner21 = new Scanner(System.in);
//        String k = scanner21.nextLine();
//        if (allMatches_2.contains(k)){
//            int element1 = map_1.get(k);
//            System.out.println(element1);
//        } else {
//            System.out.println("Такого слова нет");
//        }
//
        // 3) Найти пересечения слов в массивах и указать их общее количество.
        //Пример:
         //mas1= [“qwe”,”asd”,”qwe”,”x”]
         //mas2=[“qwe”,”v”]
         //Результат:
         //qwe=3
        Map<String, Integer> map_3 = new HashMap<>();
        int count = 1;

        String[] mas1= {"Pop","asd","pol","x"};
        String[] mas2= {"pop", "v", "Pop", "pom"};

        String[] mas1_n=new String[mas1.length];
        String[] mas2_n=new String[mas2.length];
        int k_n = 0;
        int k_n_2 = 0;

        for (String i1: mas1){
            mas1_n[k_n] = i1.toLowerCase();
            k_n++;
        }

        //System.out.println(mas1_n);
        for (String i2: mas2){
            mas2_n[k_n_2] = i2.toLowerCase();
            k_n_2++;
        }
        //System.out.println(mas2_n);
        for (int i = 0; i < mas1.length; i++) {
            if (map_3.containsKey(mas1[i])) {
                map_3.put(mas1[i], map_3.get(mas1[i] + 1));
                count++;
            } else{
                map_3.put(mas1[i],1);
            }
        }

        Set<String> set = new HashSet<>();
        for (int i = 0; i < mas1_n.length; i++) {
            set.add(mas1_n[i]);
        }
        for (int i = 0; i < mas2_n.length; i++) {
            if (set.contains(mas2_n[i])) {
                System.out.println("пересекающееся значение: " + mas2_n[i]);
                count++;
            }
        }
        if (count >=2) {
            System.out.println("Количество пересечений: " + count);
        } else {
            System.out.println("Пересечений нет");
        }
        }
    }




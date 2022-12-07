package com.lesson.first.HW_4;



import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> indexList = new LinkedList<>();

        List<String> dateFirstName = createDataNames();
        System.out.println(dateFirstName);

        List<String> dataLastName = createDataNames();
        System.out.println(dataLastName);

        List<Integer> dataAge = createDataAge();
        System.out.println(dataAge);


        List<Boolean> dateSex = createDataSex();
        System.out.println(dateSex);

        List sortFirstName = new ArrayList();
        List sortLastName = new ArrayList();
        List sortAge = new ArrayList();
        List sortSex = new ArrayList();




        for (int i = 0; i < dataAge.size(); i++) {
            indexList.add(i);
        }


        int cnt = dataAge.size() - 1;
        while (cnt > -1) {
            int maxAge = dataAge.get(indexList.get(cnt));
            int index = cnt;
            for (int i = 0; i < cnt; i++) {
                if (maxAge < dataAge.get(indexList.get(i))) {
                    maxAge = dataAge.get(indexList.get(i));
                    index = i;
                }
            }
            int tmp = indexList.get(cnt);
            indexList.set(cnt, indexList.get(index));
            indexList.set(index, tmp);
            cnt--;
        }

        for (Integer x:indexList) {
            sortFirstName.add(dateFirstName.get(x));
            sortLastName.add(dataLastName.get(x));
            sortAge.add(dataAge.get(x));
            sortSex.add(dateSex.get(x));
        }

        System.out.println(sortFirstName);
        System.out.println(sortLastName);
        System.out.println(sortAge);
        System.out.println(sortSex);



    }

    public static ArrayList<String> createDataNames() {
        ArrayList<String> x = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String name = "";
        while (!name.equals("end")) {
            System.out.println("Input name");
            name = scanner.nextLine();
            if (!name.equals("end")) {
                x.add(name);
            }
        }
        return x;
    }

    public static ArrayList<Integer> createDataAge() {
        ArrayList<Integer> x = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int age = 0;
        while (age != -1) {
            System.out.println("Input age");
            age = scanner.nextInt();
            if (age != -1) {
                x.add(age);
            }
        }
        return x;
    }

    public static ArrayList<Boolean> createDataSex() {
        ArrayList<Boolean> x = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String sex = "";
        Boolean sexB = true;
        while (sex != "o") {
            System.out.println("Input sex m/w, exit - 'o' ");
            sex = scanner.nextLine();
            if (sex.equals("m") || sex.equals("w") || sex.equals("o")) {
                if (sex.equals("m")) {
                    sexB = false;
                    x.add(sexB);
                } else if (sex.equals("w")) {
                    sexB = true;
                    x.add(sexB);
                } else if (sex.equals("o")) {
                    sex = "o";
                }
            } else {
                System.out.println("Input sex m/w, exit - 'o' ");
                sex = scanner.nextLine();
            }
        }
        return x;

    }


}

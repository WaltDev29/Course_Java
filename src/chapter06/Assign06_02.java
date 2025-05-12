package chapter06;

public class Assign06_02 {
    public static void main(String[] args) {
        String[][] teams = { {"김나현", "김예진", "김재영", "김지혁"}, {"김해민", "김호석", "도경진"}, {"박경구", "박성준", "박준범", "박찬웅"}};
        for (int i=0; i<teams.length; i++) {
                System.out.printf("%d팀 : ", i+1);
            for (int j=0; j<teams[i].length; j++) {
                System.out.printf("%s ", teams[i][j]);
            }
            System.out.println();
        }
    }
}

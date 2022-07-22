package Week7;

import java.util.Scanner;

public class MyerrBriggs {
        private static Scanner input = new Scanner(System.in);
        private static char userInput;
        private static char[] correct;
        private static int aCount;
        private static int bCount;
        private static String[][] extrovertIntrovert;


        public static void main(String[] args) {
              processedOutput();
        }
        public static void processedOutput(){
                System.out.printf("%n");
                pt1();
                System.out.println("=====================================================");
                pt2();
                System.out.println("=====================================================");
                pt3();
                System.out.println("=====================================================");
                pt4();

                System.out.println("-----------------------------------------------------------------");
                System.out.printf("%s%2s%5s%2s%5s%2s%5s%2s%n", "E", "I", "S", "N", "T", "F", "J", "P");
                System.out.print("--------------------------------------------------------------------");
        }
        public static void checkInput(){
                correct = new char[5];
                aCount = 0;
                bCount = 0;
                for(int count = 0; count < 5; count++){
                        System.out.printf("%s%n", extrovertIntrovert[count][0]);
                        System.out.printf("%s%n", extrovertIntrovert[count][1]);
                        System.out.println();
                        userInput = input.nextLine().toCharArray()[0];
                        if(userInput == 'A' || userInput == 'a'){
                                correct[count] = 'A';
                                aCount++;

                        } else if (userInput == 'B' || userInput == 'b') {
                                correct[count] = 'B';
                                bCount++;
                        } else{
                                System.out.println("Wrong input!!!");
                        }
                        System.out.println(correct);
                }
        }
        public static void pt1(){
                extrovertIntrovert = new String[5][2];
                extrovertIntrovert[0][0] = "A. Expend energy, enjoy groups";
                extrovertIntrovert[0][1] = "B.  Conserve energy, enjoy one on one";
                extrovertIntrovert[1][0] = "A. More outgoing, think out loud";
                extrovertIntrovert[1][1] = "B. More reserved, think to yourself";
                extrovertIntrovert[2][0] = "A. Seek many tasks, public activities, Interaction with others";
                extrovertIntrovert[2][1] = "B. Seek private, solitary activities with quit to concentrate";
                extrovertIntrovert[3][0] = "A. External, communicative, express yourself";
                extrovertIntrovert[3][1] = "B. Internal, reticent, keep to yourself";
                extrovertIntrovert[4][0] = "A. Active, initiate";
                extrovertIntrovert[4][1] = "B. Reflective, deliberate";
                checkInput();
                if(aCount > bCount){
                        System.out.println("Extrovert(E)");
                }
                if(bCount > aCount){
                        System.out.println("Introvert(I)");
                }
             }

                public static void pt2(){
                        extrovertIntrovert = new String[5][2];
                        extrovertIntrovert[0][0]  = "A. Interpret literally";
                        extrovertIntrovert[0][1] = "B. look for meaning and possibilities";
                        extrovertIntrovert[1][0] = "A. Practical, realistic, experiential";
                        extrovertIntrovert[1][1] = "B. Imaginative, innovative, theoretical";
                        extrovertIntrovert[2][0] = "A. Standard, usual, conventional";
                        extrovertIntrovert[2][1] = "B. Different, novel, unique";
                        extrovertIntrovert[3][0] = "A. focus on here-and-now";
                        extrovertIntrovert[3][1] = "B. look to the future, global perspective, 'big picture' ";
                        extrovertIntrovert[4][0] = "A. facts, things, 'what is' ";
                        extrovertIntrovert[4][1] = "B. ideas, dreams, 'what could be,' philosophical";
                        checkInput();
                        if(aCount > bCount){
                                System.out.println("Sensing(S)");
                        }
                        if(bCount > aCount){
                                System.out.println("Intuitive(N)");
                        }
                }

                public static void pt3(){
                        extrovertIntrovert = new String[5][2];
                        extrovertIntrovert[0][0]  = "A. logical, thinking, questioning";
                        extrovertIntrovert[0][1] = "B. empathic, feeling, accommodating";
                        extrovertIntrovert[1][0] = "A. Candid, straight forward, frank";
                        extrovertIntrovert[1][1] = "B. tactful, kind, encouraging";
                        extrovertIntrovert[2][0] = "A. firm, tend to criticize, hold the line";
                        extrovertIntrovert[2][1] = "B. gentle, tend to appreciate, conciliate";
                        extrovertIntrovert[3][0] = "A. tough-minded, just";
                        extrovertIntrovert[3][1] = "B. tender-hearted, merciful";
                        extrovertIntrovert[4][0] = "A. matter of fact, issue-oriented ";
                        extrovertIntrovert[4][1] = "B. sensitive, people-oriented, compassionate";
                        checkInput();
                        if(aCount > bCount){
                                System.out.println("Thinking(T)");
                        }
                        if(bCount > aCount){
                                System.out.println("Feeling(F)");
                        }
                }
        public static void pt4(){
                extrovertIntrovert = new String[5][2];
                extrovertIntrovert[0][0]  = "A. Organized, orderly";
                extrovertIntrovert[0][1] = "B. flexible, adaptable";
                extrovertIntrovert[1][0] = "A. plan, schedule";
                extrovertIntrovert[1][1] = "B. unplanned, spontaneous";
                extrovertIntrovert[2][0] = "A. regulated, structured";
                extrovertIntrovert[2][1] = "B. easygoing, 'live' and 'let live'";
                extrovertIntrovert[3][0] = "A. preparation, plan ahead";
                extrovertIntrovert[3][1] = "B. go with the flow, adapt as you go";
                extrovertIntrovert[4][0] = "A. control, govern";
                extrovertIntrovert[4][1] = "B. latitude, freedom";
                checkInput();
                if(aCount > bCount){
                        System.out.println("Judgement(J)");
                }
                if(bCount > aCount){
                        System.out.println("Perception(P)");
                }
        }

}




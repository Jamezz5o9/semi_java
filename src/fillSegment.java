public class fillSegment {
    private static int[][] tictac = new int[20][20];

    public static void fillA(){
        tictac[0][0] = 1;
        tictac[0][1] = 2;
        tictac[0][2] = 0;
        tictac[0][3] = 2;
        tictac[0][4] = 1;
    }
    public static void fillB(){
        tictac[1][0] = 0;
        tictac[1][1] = 1;
        tictac[1][2] = 2;
    }
    public static void fillC(){
        tictac[2][0] = 1;
        tictac[2][1] = 2;
        tictac[2][2] = 1;
        tictac[2][3] = 2;
        tictac[2][4] = 0;
    }
    public static void fillD(){
        tictac[0][0] = 1;
        tictac[1][0] = 0;
        tictac[2][0] = 1;
    }

    public static void fillE(){
        tictac[1][0] = 1;
        tictac[1][1] = 2;
        tictac[1][2] = 1;
        tictac[1][3] = 2;
        tictac[1][4] = 0;

    }

    public static void newInput(String input) throws IllegalAccessException {
        char[] fill = input.toCharArray();

        if(input.length() > 5){
            input = input.substring(0, 5);
        }
        for (char i : fill){
            if((i != '1')){
                throw new IllegalAccessException("Only 1's is accepted");
            }
        }


        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i) == '1'){
                switch(i){
                    case 0 -> fillA();
                    case 1 -> fillB();
                    case 2 -> fillC();
                    case 3 -> fillD();
                    case 4 -> fillE();
                }

            }
        }
    }

    public static void display() throws InterruptedException {
        System.out.println();

        for(int[] i : tictac){
            for(int j : i){
                if(j == 1){
                    System.out.print("X ");
                } else if (j == 2) {
                    System.out.print("| ");
                } else if (j == 0) {
                    System.out.print("0 ");
                } else{
                    System.out.print(" ");
                    Thread.sleep(300);
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws IllegalAccessException, InterruptedException {
        newInput("11111");
        display();

    }

}

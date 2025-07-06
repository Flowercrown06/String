package mentor_lesson2;

public class Task3 {
    //*
    //**
    //***
    //****
    //*****
    //******

    public static void main(String[] args) {
//        for (int i = 0; i < 7; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }




//        for(int k=17; k>0;k--){
//            for(int j=0; j<k; j++){
//                System.out.print("-");
//            }
//            System.out.print(">");
//            System.out.println();
//        }


        for(int i=0; i<15;i++){
            for(int j=i;j>0;j--){
                System.out.print(" ");
                for(int k=15;k>0;k--){
                    System.out.print("*");
                }
            }
            System.out.println(">");
        }

    }

}

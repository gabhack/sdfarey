


public class Farey {


    public static void main(String[] args) {
        secuenciaFarey(5);
    }

    private static void secuenciaFarey(int limite)
    {
        for (int i = 1; i <= limite; i++) {
            System.out.print("\n" + i + "/1");
            for (int j = 2; j <= limite; j++) {
                System.out.print(", " + i + "/" +j);
            }
        }


    }



}
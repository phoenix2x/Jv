package fundamentals;

public class TsrMet {
    public static void main(String[] args) {
        String x = "321";

        char[] arrayCh = x.toCharArray();
        int [] intArray = new int[x.length()];




        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = Character.getNumericValue(arrayCh[i]);
            System.out.println(intArray[i]);

//            if(intArray[i] > intArray[i-1]){
//
//                System.out.println(intArray.toString());
//
//           }else {
//                System.out.println("по убыванию");
//            }

        }


        for (int i: intArray) {

            if(intArray[i] > intArray[i-1]){

                System.out.println(intArray[i]);
;

           }else {
                System.out.println("по убыванию");
            }

        }



    }











//    public static int []  convert(String str, char charArray[]) {
//        char [] chArray = str.toCharArray();
//        int [] intArray = new int[str.length()];
//        for (int i = 0; i < intArray.length; i++) {
//            intArray[i] = Character.getNumericValue(chArray[i]);
//        }
//        return intArray;
//
//    }





}
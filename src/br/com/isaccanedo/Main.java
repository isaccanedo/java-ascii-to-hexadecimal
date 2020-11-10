package br.com.isaccanedo;

/**
 * @author Isac Canedo
 */

public class Main {

    public static void main(String[] args) {
        String ascii = "Isac Canedo";

        /**
         * Step 1 - Convert ASCII String to char array
         * Step 1 - Converte String ASCII para array de char
         */

        char[] ch = ascii.toCharArray();

        /**
         *  Step 2 - Iterate over char array and cast each element to Integer
         *  Step 2 - Iterar sobre o array char e converter cada elemento em Integer
         */

        StringBuilder builder = new StringBuilder();
        for (char c : ch) {
            int i = (int) c;

            /**
             * Step 3 - Convert Integer value to Hex using toHexString() method
             * Step 3 - Converte o valor inteiro para Hexadecimal usando o método toHexString()
             */

            builder.append(Integer.toHexString(i).toUpperCase());
        }

        System.out.println("ASCII - " + ascii);
        System.out.println("Hexadecimal - " + builder.toString());

    }
}

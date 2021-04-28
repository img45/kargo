public class Kargo {

    public static void main (String[] args) {
        String completeBoy = "";
        for (int p = 0; p < args.length; p++){ 
            String total = "";    
            int first = Integer.parseInt(args[p]);
            int checker = first;
            int j = 1;
            while (checker/10 > 0) {
                j++;
                checker = checker/10;
            } 
            String k = "k";
            for (int i = j; i > 0; i--) {
                int digit = first % 10;
                if (digit == 0) {
                    k = "Zero";
                } 
                if (digit == 1) {
                    k = "One";
                }
                if (digit == 2) {
                    k = "Two";
                }
                if (digit == 3) {
                    k = "Three";
                }
                if (digit == 4) {
                    k = "Four";
                }
                if (digit == 5) {
                    k = "Five";
                }
                if (digit == 6) {
                    k = "Six";
                }
                if (digit == 7) {
                    k = "Seven";
                }
                if (digit == 8) {
                    k = "Eight";
                }
                if (digit == 9) {
                    k = "Nine";
                }
                total = k + total;
                first = first/10;
            }
            if (p == 0) {
                completeBoy = total;
            } else {
                completeBoy = completeBoy + "," + total;
            }
        }
        System.out.println(completeBoy);
    }
}

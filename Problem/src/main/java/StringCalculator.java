public class StringCalculator {
    public int Add(String numbers){
        if(numbers.equals("")){
            return 0;
        }
        else {
            int sum = 0;
            String[] s = numbers.split(",");
            for (int i = 0; i < s.length; i++) {
                sum += Integer.parseInt(s[i]);
            }
            return sum;
        }
    }

}

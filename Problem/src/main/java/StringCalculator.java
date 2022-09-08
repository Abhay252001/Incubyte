public class StringCalculator {
    public int Add(String numbers){
        if(numbers.equals("")){
            return 0;
        }
        else {
            int sum = 0;
            String[] str = numbers.split(",");
            for (int i = 0; i < str.length; i++) {
                if(str[i].length() == 1){
                    char c = str[i].charAt(0);
                    if (Character.isAlphabetic(c)) {
                        sum += (c-'a')+1;
                    }
                    else{
                        sum += Integer.parseInt(str[i]);
                    }
                }
                else {
                    sum += Integer.parseInt(str[i]);
                }
            }
            return sum;
        }
    }

}

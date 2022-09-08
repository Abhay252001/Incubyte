class MyException extends Exception
{
    public MyException(String str)
    {
        System.out.println(str);
    }
}

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
                    try {
                        int x = Integer.parseInt(str[i]);
                        if(x<0)
                            throw new MyException("Negatives not allowed");
                        sum += x;
                    }
                    catch (MyException m) {
                    }
                }
            }
            return sum;
        }
    }

}

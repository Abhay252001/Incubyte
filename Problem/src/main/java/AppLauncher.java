public class AppLauncher {
    public static void main(String[] args) {
        StringCalculator s = new StringCalculator();
        int ans = s.Add("1,2,a,b");
        System.out.println(ans);
    }
}

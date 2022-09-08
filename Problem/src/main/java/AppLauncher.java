public class AppLauncher {
    public static void main(String[] args) {
        StringCalculator s = new StringCalculator();
        int ans = s.Add("-1,1000,1001,a,b");
        System.out.println(ans);
    }
}

package get_Prime;

public class normal {
    final static int N = (int) (1e6 + 5);
    int n = 0;
    int ans = 0;
    static boolean[] vis = new boolean[N];
    static int[] prime = new int[N];

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int ret = getOLAPrime(1000000);
        long end = System.currentTimeMillis();
        System.out.println(ret);
        System.out.println(end - start);
    }

    public static int getPrime(int n) {
        int ans = 0;
        for (int i = 2; i < n; i++) {
            if (!vis[i]) {
                prime[ans++] = i;
                System.out.println(i);

                for (int j = 2 * i; j <= n; j += i) {
                    vis[j] = true;
                }
            }
        }
        return ans;
    }

    public static int getOLAPrime(int n) {
        int ans = 0;
        for (int i = 2; i < n; i++) {
            if (!vis[i]) {
                prime[ans++] = i;
                System.out.println(i);

                for (int j = 2 * i; j <= n; j += i) {
                    int count = 0;
                    vis[j] = true;
                    if (i % prime[count++] == 0) {
                        break;
                    }
                }

            }
        }
        return ans;
    }
}

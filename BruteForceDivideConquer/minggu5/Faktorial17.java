package minggu5;

public class Faktorial17 {
    public int nilai;
    public int FaktorialBF(int n) {
        
        int Fakto = 1;
        for (int i = 1; i <= n; i++) {
            Fakto = Fakto * i;
        }
        return Fakto;
    }
    public int FaktorialDC(int n) {
        if (n==1) {
            return 1;
        }
        else
        {
            int fakto = n * FaktorialDC(n-1);
            return fakto;
        }
    }
}
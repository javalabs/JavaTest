
/**
 * Created by AdminPC on 27.01.14.
 */
public class Main {
    public static void main(String args[])
    {
        System.out.println("Hello java 7!");

        int ip = Integer.MAX_VALUE;
        long i = 0xFFFFFFFFL;//4278190080L;
        System.out.println(ipToString(i));
    }
    public static String ipToString(long ip) {
        short[] partIp = new short[4];
        StringBuilder stringIp = new StringBuilder();
        for(int i = 0; i < 4; ++i) {
            partIp[i] = (short) ip;
            partIp[i] = (short) (0xFF & partIp[i]);
            ip = ip >> 8;
        }
        stringIp.append(partIp[3]+"."+partIp[2]+"."+partIp[1]+"."+partIp[0]);
        return stringIp.toString();
    }
}

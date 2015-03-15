import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Task {
    static long a;

    public static void main(String []args) throws IOException {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.valueOf(br.readLine());
            while(t>0){
                long k=Long.valueOf(br.readLine());
                long a=192+((k-1)*250l);
                System.out.println(a);

                t--;
            }

        }
        catch(Exception e){
            e.printStackTrace();
        }
    }




}


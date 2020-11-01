import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class p47 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("請輸入5個人的分數");
        Integer test[] = new Integer[5];

        for(int i=0; i<test.length; i++){
            String str = br.readLine();
            test[i] = Integer.parseInt(str);
        }

        // for(int s=0; s<test.length; s++){
        //     for(int t=s+1;t<test.length;t++){
        //         if(test[t]>test[s]){
        //             int temp = test[t];
        //             test[t] = test[s];
        //             test[s] = temp;
        //         }
        //     }
        // }
        Arrays.sort(test,Collections.reverseOrder());

        for(int i=0; i<test.length; i++){
            System.out.println("第"+(i+1)+"名的分數是"+test[i]);
        }
    }
}

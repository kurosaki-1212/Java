import java.util.*;

public class Practice7 {
   public static void main(String[] args) {

        Map<String, String> medalMap =  new HashMap<>();

        medalMap.put("競泳", "金");
        medalMap.put("アーチェリー", "銅");
        medalMap.put("ウエイトリフティング", "銅");
        medalMap.put("フェンシング", "金");
        medalMap.put("レスリング", "銀");

        // 柔道があるか確認
        boolean isExists = medalMap.containsKey("柔道");
        if (isExists == false) {
            System.out.println("結果はまだ出ていません");
        }

        isExists = medalMap.containsKey("フェンシング");
        if (isExists == true) {
            System.out.println("フェンシングの結果：" + medalMap.get("フェンシング"));
        } else {
            System.out.println("結果はまだ出ていません");
        }

        // メダル数カウント
        int cnt = 0;
        // 拡張for
        for (String key : medalMap.keySet()) {
            String val = medalMap.get(key);

            if (val == "金") {
                cnt++;
            }
        }
        System.out.println("金メダルの数：" + cnt);
   }
} 
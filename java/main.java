import oreoreiterator.DTUIterator;
import oreorecollection.DTUCollection;
import dtumember.DTUMember;

public class main {
    public static void main(String[] arg) {
        // DTU組織を定義
        DTUCollection dtuCollection = new DTUCollection();
        // DTU組織にメンバーを追加
        dtuCollection.addMember(new DTUMember("はすみ"));
        dtuCollection.addMember(new DTUMember("たくや"));

        // DTU組織のイテレータを取得
        DTUIterator iterator = dtuCollection.getIterator();

        // 次のメンバーがいたらメンバーの名前を取得
        while (iterator.hasNext()) {
            DTUMember member = iterator.next();
            System.out.println(member.getName());
        }
    }
}
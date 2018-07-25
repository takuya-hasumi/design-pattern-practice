package oreorecollection;

import oreoreiterator.DTUIterator;
import member.DTUMember;
import java.util.ArrayList;

/**
 * DTUCollection
 */
public class DTUCollection implements Collection{
    private ArrayList<DTUMember> members = new ArrayList<DTUMember>();
    public int scale = 0;

    /**
     * フィールドにメンバーオブジェクトを追加
     * 
     * @param  DTUMember member 
     */
    public void addMember(DTUMember member) {
        this.members.add(member);
        this.scale++;
    }

    /**
     * 組織規模を返す
     * 
     * @return int scale
     */
    public int getScale() {
        return this.scale;
    }

    /**
     * 現在の順番のメンバーを返す
     * 
     * @return DTUMember
     */
    public DTUMember getMember(int index) {
        return this.members.get(index);
    }

    /**
     * DTUIteratorを返す
     * 
     * @return DTUIterator
     */
    public DTUIterator getIterator()
    {
        return new DTUIterator(this);
    }
}
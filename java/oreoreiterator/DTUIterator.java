package oreoreiterator;

import oreorecollection.DTUCollection;
import dtumember.DTUMember;

/**
 * DTUIterator
 */
public class DTUIterator implements AreIterator {

    private DTUCollection collection;
    private int index = 0;

    /**
     * コンストラクタでDTU組織を数え上げの対象に指定
     */
    public DTUIterator(DTUCollection collection) {
        this.collection = collection;
    }

    /**
     * 次があるか判定する
     * 
     * @return boolean 
     */
    public boolean hasNext()
    {
        if (this.index < this.collection.getScale()) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 次があったらオブジェクトを返す
     * 
     * @return 
     */
    public DTUMember next()
    {
        DTUMember member = this.collection.getMember(this.index);
        this.index++;
        return member;
    }
}
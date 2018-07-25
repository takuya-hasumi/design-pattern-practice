package dtumember;

/**
 * DTUMember
 */
public class DTUMember {

    public String name;

    /**
     * コンストラクタでフィールドに代入
     */
    public DTUMember(String name)
    {
        this.name = name;
    }

    /**
     * メンバーの名前を返す
     */
    public String getName()
    {
        return this.name;
    }

}
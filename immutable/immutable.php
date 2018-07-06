<?php
/**
 * 要件
 * 1. 最初一回だけ値セット
 * 2. 変えられない
 * 3. 変えようとしたらコピーされる（ディープコピー）
 * Immutableってどういうときに使うの？
 * → Serviceとか
 */
class Immutable
{
    private $property;
    private $object;

    public function __construct($object)
    {
        // オブジェクトのときの判定
        if ($object instanceof Immutable) {
            // echo "ver. object\n";
            $this->object = $object;
        } else {
            // プロパティのセット
            if (!isset($this->property)) {
                $this->property = $object;
            }
        }
    }

    public function getProperty()
    {
        return $this->property;
    }

    // 名前ちゃんとつけよう
    // 複雑　もっとシンプルに
    public function setProperty($setter)
    {
        if (isset($this->property)) {
            // echo $this->property . "がセット済みなので新しくオブジェクトを生成します\n";
            // 引数がオブジェクトで、セットされてたらclone
            if ($setter instanceof Immutable && isset($this->object)) {
                // echo "オブジェクトをクローン\n";
                $clone_object = clone $this->object;
                $clone_object->object = $setter;
                return $clone_object;
            } else {
                echo "cloneして新しいインスタンス生成\n";
                // cloneの順番がおかしい
                $this->property = $setter;
                return clone $this;
            }
        } else {
            // echo "プロパティのセット\n";
            $this->property = $setter;
        }

    }
}
<?php

class Immutable
{
    private $value;

    public function __construct($arg)
    {
        // ①の条件
        if (!isset($this->value)) {
            $this->value = $arg;
        }
    }

    public function __set($name, $value)
    {   
        // ②の条件
        if (isset($this->value)) {
            echo "プロパティ" . $name . "は" . $value . "に変更不能なプロパティです。代わりにコピーしてセットします。\n";
            // ③の条件
            $object = new Immutable($value);
            var_dump($object);
        }
        return $object;
    }
}

// オブジェクトにセット
$test = new Immutable("test");
// 変えられない
$test->value = "変えちゃうよ？";
// var_dump($object);
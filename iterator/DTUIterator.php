<?php
/**
 * イテレータパターン：反復子
 * 繰り返しがあるときに、次があったときに返す役割を担ってくれるもの
 * コレクションクラス（配列）とかのときに、共通処理として取れる（色んな型や注文にも応えられる）
 */

interface DTUIterator
{
    // 次があるかチェックする抽象メソッド
    public function hasNext();
    
    // 次を返す抽象メソッド
    public function next();
}
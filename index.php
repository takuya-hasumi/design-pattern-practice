<?php

require_once("./immutable.php");
// オブジェクトにセット
$immutable = new Immutable("test");
$value = $immutable->getProperty(); // test
// 新しいオブジェクトの生成
$immutable->setProperty("変えちゃうよ？");

// オブジェクトのパターン
$setObject = new Immutable($immutable);
$setObject->setProperty("clone version");
$setObject->setProperty("re: property");
$clone_immutable = $setObject->setProperty($immutable);
$clone_setObject = $setObject->setProperty($setObject);

// 余談
// object->object->object->...
// $clone_setObject = $setObject->setProperty($clone_setObject);
// $clone_setObject = $setObject->setProperty($clone_setObject);
// $clone_setObject = $setObject->setProperty($clone_setObject);
// $clone_setObject = $setObject->setProperty($clone_setObject);
// var_dump($clone_setObject)

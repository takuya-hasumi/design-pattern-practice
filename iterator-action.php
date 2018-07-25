<?php
require_once("./iterator/DTUMemberCollection.php");
require_once("./iterator/DTUMember.php");

// DTU組織という箱を作成
$dtu_member_collection = new DTUMemberCollection();
// DTU組織という箱に、メンバーを追加
$dtu_member_collection->addMember(new DTUMember("やがーさん"));
$dtu_member_collection->addMember(new DTUMember("ちゃんあみ"));
$dtu_member_collection->addMember(new DTUMember("ちゃんおば"));
$dtu_member_collection->addMember(new DTUMember("すもってぃー"));
$dtu_member_collection->addMember(new DTUMember("ぱぱみん"));

// DTU組織という箱に対して数え上げ（iterator）できるようにする
$iterator = $dtu_member_collection->getIterator();

// DTU組織を数え上げられるようになったオブジェクトに対して、
// 次のメンバーが存在するならメンバーオブジェクトを取得し、
// 処理をできるようにする（今回は名前）
while ($iterator->hasNext()) {
    $member = $iterator->next();
    echo $member->getName() . "\n";
}

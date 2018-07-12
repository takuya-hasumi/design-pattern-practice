<?php
require_once("./iterator/DTUCollection.php");
require_once("./iterator/DTUMemberCollection.php");
require_once("./iterator/DTUIterator.php");
require_once("./iterator/DTUMemberIterator.php");
require_once("./iterator/DTUMember.php");

$dtu_member_collection = new DTUMemberCollection();
$dtu_member_collection->addMember(new DTUMember("やがーさん"));
$dtu_member_collection->addMember(new DTUMember("ちゃんあみ"));
$dtu_member_collection->addMember(new DTUMember("ちゃんおば"));
$dtu_member_collection->addMember(new DTUMember("すもってぃー"));
$dtu_member_collection->addMember(new DTUMember("ぱぱみん"));

$iterator = $dtu_member_collection->getIterator();
while ($iterator->hasNext()) {
    $member = $iterator->next();
    echo $member->getName() . "\n";
}
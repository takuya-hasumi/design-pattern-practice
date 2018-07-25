<?php

class DTUMemberCollection implements DTUCollection 
{
    private $members = [];
    private $scale = 0;

    // メンバーを追加
    public function addMember(DTUMember $member)
    {
        $this->members[] = $member;
        $this->scale++;
    }

    // 組織規模を取得
    public function getScale()
    {
        return $this->scale;
    }

    // メンバーを取得
    public function getMember($index)
    {
        return $this->members[$index];
    }
    
    // DTU組織を数えあげられるイテレータを呼び出す
    public function getIterator()
    {
        return new DTUMemberIterator($this);
    }
}
<?php

class DTUMemberIterator implements DTUIterator
{
    private $dtu_member;
    private $index = 0;

    public function __construct($dtu_member)
    {
        $this->dtu_member = $dtu_member;
    }

    // 次のオブジェクトがあるか判定
    public function hasNext()
    {
        if ($this->index < $this->dtu_member->getScale()) {
            return true;
        } else {
            return false;
        }
    }

    // 次のオブジェクトを取得
    public function next()
    {
        $next_member = $this->dtu_member->getMember($this->index);
        $this->index++;
        return $next_member;
    }
}
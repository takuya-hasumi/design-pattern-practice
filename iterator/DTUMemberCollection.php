<?php

class DTUMemberCollection implements DTUCollection 
{
    private $members = [];
    private $length = 0;

    public function addMember(DTUMember $member)
    {
        $this->members[] = $member;
        $this->length++;
    }

    public function getLength()
    {
        return $this->length;
    }

    public function getMember($index)
    {
        return $this->members[$index];
    }
    
    public function getIterator()
    {
        return new DTUMemberIterator($this);
    }
}
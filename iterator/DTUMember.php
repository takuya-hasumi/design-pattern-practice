<?php

class DTUMember
{
    protected $name;
    
    public function __construct($name)
    {
        $this->name = $name;
    }

    // 名前を返却
    public function getName()
    {
        return $this->name;
    }
}
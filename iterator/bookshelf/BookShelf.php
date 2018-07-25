<?php

class BookShelf implements Aggregate
{
    private $books = [];
    private $last = 0;

    public function getBookAt(int $index)
    {
        return $this->books[$index];
    }

    public function appendBook(Book $book)
    {
        $this->books[$this->last] = $book;
        $this->last++;
    }

    public function getLength()
    {
        return $this->last;
    }

    public function iterator()
    {
        return new BookShelfIterator($this);
    }
}
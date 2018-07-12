<?php
require_once("./Aggregate.php");
require_once("./Book.php");
require_once("./BookShelf.php");
require_once("./BookShelfIterator.php");
require_once("./Iterator.php");

$bookShelf = new BookShelf();
$bookShelf->appendBook(new Book("aaa"));
$bookShelf->appendBook(new Book("bbb"));
$bookShelf->appendBook(new Book("ccc"));
$it = $bookShelf->iterator();

while ($it->hasNext()) {
    $book = $it->next();
    print($book->getName());
}

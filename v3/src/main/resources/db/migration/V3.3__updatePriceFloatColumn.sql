UPDATE book SET book.price_float = book.price;

ALTER TABLE book MODIFY COLUMN price int NULL DEFAULT NULL;

commit;
ALTER TABLE book ADD price_float float(24);

UPDATE book SET book.price_float = book.price;

commit;
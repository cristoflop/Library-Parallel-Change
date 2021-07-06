ALTER TABLE book DROP price;

ALTER TABLE book CHANGE price_float price float(24);

commit;
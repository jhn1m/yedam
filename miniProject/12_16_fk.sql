alter table payment 
add CONSTRAINT payment_shop_id_fk FOREIGN KEY(shop_id) 
REFERENCES shop(shop_id);

desc menu;

alter table payment 
add CONSTRAINT payment_menu_price_fk FOREIGN KEY(menu_price) 
REFERENCES menu(menu_price);

ALTER TABLE payment
ADD CONSTRAINT payment_customer_id_fk FOREIGN KEY(customer_id)
REFERENCES customer(customer_id);